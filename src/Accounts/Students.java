/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accounts;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author vardha
 */
@Entity
@Table(name = "students", catalog = "hostelmess", schema = "")
@NamedQueries({
    @NamedQuery(name = "Students.findAll", query = "SELECT s FROM Students s"),
    @NamedQuery(name = "Students.findByRoomNo", query = "SELECT s FROM Students s WHERE s.studentsPK.roomNo = :roomNo"),
    @NamedQuery(name = "Students.findByROOmID", query = "SELECT s FROM Students s WHERE s.studentsPK.rOOmID = :rOOmID"),
    @NamedQuery(name = "Students.findByName", query = "SELECT s FROM Students s WHERE s.name = :name"),
    @NamedQuery(name = "Students.findByContactNo", query = "SELECT s FROM Students s WHERE s.contactNo = :contactNo"),
    @NamedQuery(name = "Students.findByEmailId", query = "SELECT s FROM Students s WHERE s.emailId = :emailId")})
public class Students implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StudentsPK studentsPK;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(name = "CONTACT_NO")
    private BigInteger contactNo;
    @Column(name = "EMAIL_ID")
    private String emailId;

    public Students() {
    }

    public Students(StudentsPK studentsPK) {
        this.studentsPK = studentsPK;
    }

    public Students(StudentsPK studentsPK, String name) {
        this.studentsPK = studentsPK;
        this.name = name;
    }

    public Students(int roomNo, String rOOmID) {
        this.studentsPK = new StudentsPK(roomNo, rOOmID);
    }

    public StudentsPK getStudentsPK() {
        return studentsPK;
    }

    public void setStudentsPK(StudentsPK studentsPK) {
        this.studentsPK = studentsPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public BigInteger getContactNo() {
        return contactNo;
    }

    public void setContactNo(BigInteger contactNo) {
        BigInteger oldContactNo = this.contactNo;
        this.contactNo = contactNo;
        changeSupport.firePropertyChange("contactNo", oldContactNo, contactNo);
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        String oldEmailId = this.emailId;
        this.emailId = emailId;
        changeSupport.firePropertyChange("emailId", oldEmailId, emailId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentsPK != null ? studentsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Students)) {
            return false;
        }
        Students other = (Students) object;
        if ((this.studentsPK == null && other.studentsPK != null) || (this.studentsPK != null && !this.studentsPK.equals(other.studentsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Accounts.Students[ studentsPK=" + studentsPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
