/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accounts;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author vardha
 */
@Entity
@Table(name = "extras", catalog = "hostelmess", schema = "")
@NamedQueries({
    @NamedQuery(name = "Extras_1.findAll", query = "SELECT e FROM Extras_1 e"),
    @NamedQuery(name = "Extras_1.findById", query = "SELECT e FROM Extras_1 e WHERE e.id = :id"),
    @NamedQuery(name = "Extras_1.findByRoomNo", query = "SELECT e FROM Extras_1 e WHERE e.roomNo = :roomNo"),
    @NamedQuery(name = "Extras_1.findByRoomId", query = "SELECT e FROM Extras_1 e WHERE e.roomId = :roomId"),
    @NamedQuery(name = "Extras_1.findByProductId", query = "SELECT e FROM Extras_1 e WHERE e.productId = :productId"),
    @NamedQuery(name = "Extras_1.findByProductPrice", query = "SELECT e FROM Extras_1 e WHERE e.productPrice = :productPrice"),
    @NamedQuery(name = "Extras_1.findByQuantity", query = "SELECT e FROM Extras_1 e WHERE e.quantity = :quantity"),
    @NamedQuery(name = "Extras_1.findByDate", query = "SELECT e FROM Extras_1 e WHERE e.date = :date"),
    @NamedQuery(name = "Extras_1.findByTotal", query = "SELECT e FROM Extras_1 e WHERE e.total = :total")})
public class Extras_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ROOM_NO")
    private int roomNo;
    @Basic(optional = false)
    @Column(name = "ROOM_ID")
    private String roomId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private int productId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_PRICE")
    private int productPrice;
    @Basic(optional = false)
    @Column(name = "QUANTITY")
    private int quantity;
    @Basic(optional = false)
    @Column(name = "DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Column(name = "TOTAL")
    private Long total;

    public Extras_1() {
    }

    public Extras_1(Integer id) {
        this.id = id;
    }

    public Extras_1(Integer id, int roomNo, String roomId, int productId, int productPrice, int quantity, Date date) {
        this.id = id;
        this.roomNo = roomNo;
        this.roomId = roomId;
        this.productId = productId;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        int oldRoomNo = this.roomNo;
        this.roomNo = roomNo;
        changeSupport.firePropertyChange("roomNo", oldRoomNo, roomNo);
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        String oldRoomId = this.roomId;
        this.roomId = roomId;
        changeSupport.firePropertyChange("roomId", oldRoomId, roomId);
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        int oldProductId = this.productId;
        this.productId = productId;
        changeSupport.firePropertyChange("productId", oldProductId, productId);
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        int oldProductPrice = this.productPrice;
        this.productPrice = productPrice;
        changeSupport.firePropertyChange("productPrice", oldProductPrice, productPrice);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        int oldQuantity = this.quantity;
        this.quantity = quantity;
        changeSupport.firePropertyChange("quantity", oldQuantity, quantity);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        Long oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Extras_1)) {
            return false;
        }
        Extras_1 other = (Extras_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Accounts.Extras_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
