/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accounts;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author vardha
 */
public class login extends javax.swing.JFrame {
     
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        getRootPane().setDefaultButton(loginbtn);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        paswrd = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 40, 210, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Admin");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 150, 50, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 210, 74, 22);

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid);
        txtid.setBounds(200, 140, 140, 30);
        jPanel1.add(paswrd);
        paswrd.setBounds(200, 200, 140, 30);

        loginbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loginbtn.setText("LOGIN");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginbtn);
        loginbtn.setBounds(80, 290, 90, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(220, 290, 100, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LoginRed.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(440, 40, 290, 290);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 810, 360);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 810, 390));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jLabel5.setText("MESS BILLING SYSTEM");
        jPanel2.add(jLabel5);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
        
           try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String path="jdbc:mysql://localhost/hostelmess";
            String user="root";
            String pass="login@mysql";
            Connection con=DriverManager.getConnection(path,user,pass);
            String query = "SELECT * FROM login";
             Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next())
            {
                stmt=con.createStatement();
        String ADMIN = rs.getString("admin");
        String Password = rs.getString("password");
        if(ADMIN.equals(txtid.getText())&&Password.equals(paswrd.getText()))
        {
            
            
            int flag=0;
          try
        {
            String query5="SELECT date(DATE) FROM diets";
            String query1="INSERT INTO diets(ROOM_NO,ROOM_ID,LUNCH,DINNER) SELECT ROOM_NO,ROOM_ID,1,1 from students";
            ResultSet rs1=stmt.executeQuery(query5);
            while(rs1.next())
            {
                stmt=con.createStatement();
              String date1=rs1.getDate("date(DATE)").toString();
              if(date1.equals(java.time.LocalDate.now().toString()))
              {
                  flag=1;
                 break; 
              }
            }
            if(flag==0)
            {
                stmt.executeUpdate(query1);
            }
            
             }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Error Found"+e);
        } 
        
        
        DashBoard db=new DashBoard();
        this.setVisible(false);
        db.setVisible(true);  
        }
        else
        {
          JOptionPane.showMessageDialog(this,"Invalid ID or PASSWORD");  
        }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Error Found"+e);
        } 
          
        
        
    }//GEN-LAST:event_loginbtnActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField paswrd;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables

    private boolean strcmp(String admin1, String admin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}