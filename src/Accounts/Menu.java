/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accounts;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author vardha
 */
@Entity
@Table(name = "menu", catalog = "hostelmess", schema = "")
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m"),
    @NamedQuery(name = "Menu.findByProductid", query = "SELECT m FROM Menu m WHERE m.productid = :productid"),
    @NamedQuery(name = "Menu.findByProductname", query = "SELECT m FROM Menu m WHERE m.productname = :productname"),
    @NamedQuery(name = "Menu.findByProductprice", query = "SELECT m FROM Menu m WHERE m.productprice = :productprice")})
public class Menu implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Product_id")
    private Integer productid;
    @Basic(optional = false)
    @Column(name = "Product_name")
    private String productname;
    @Basic(optional = false)
    @Column(name = "Product_price")
    private long productprice;

    public Menu() {
    }

    public Menu(Integer productid) {
        this.productid = productid;
    }

    public Menu(Integer productid, String productname, long productprice) {
        this.productid = productid;
        this.productname = productname;
        this.productprice = productprice;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        Integer oldProductid = this.productid;
        this.productid = productid;
        changeSupport.firePropertyChange("productid", oldProductid, productid);
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        String oldProductname = this.productname;
        this.productname = productname;
        changeSupport.firePropertyChange("productname", oldProductname, productname);
    }

    public long getProductprice() {
        return productprice;
    }

    public void setProductprice(long productprice) {
        long oldProductprice = this.productprice;
        this.productprice = productprice;
        changeSupport.firePropertyChange("productprice", oldProductprice, productprice);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productid != null ? productid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.productid == null && other.productid != null) || (this.productid != null && !this.productid.equals(other.productid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Accounts.Menu[ productid=" + productid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
