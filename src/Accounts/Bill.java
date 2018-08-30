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
@Table(name = "bill", catalog = "hostelmess", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bill.findAll", query = "SELECT b FROM Bill b"),
    @NamedQuery(name = "Bill.findById", query = "SELECT b FROM Bill b WHERE b.id = :id"),
    @NamedQuery(name = "Bill.findByRoomNo", query = "SELECT b FROM Bill b WHERE b.roomNo = :roomNo"),
    @NamedQuery(name = "Bill.findByRoomId", query = "SELECT b FROM Bill b WHERE b.roomId = :roomId"),
    @NamedQuery(name = "Bill.findByDinnerdiets", query = "SELECT b FROM Bill b WHERE b.dinnerdiets = :dinnerdiets"),
    @NamedQuery(name = "Bill.findByLunchdiets", query = "SELECT b FROM Bill b WHERE b.lunchdiets = :lunchdiets"),
    @NamedQuery(name = "Bill.findByDietscost", query = "SELECT b FROM Bill b WHERE b.dietscost = :dietscost"),
    @NamedQuery(name = "Bill.findByExtrascost", query = "SELECT b FROM Bill b WHERE b.extrascost = :extrascost"),
    @NamedQuery(name = "Bill.findByTotal", query = "SELECT b FROM Bill b WHERE b.total = :total")})
public class Bill implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ROOM_NO")
    private int roomNo;
    @Basic(optional = false)
    @Column(name = "ROOM_ID")
    private String roomId;
    @Column(name = "Dinner_diets")
    private Integer dinnerdiets;
    @Column(name = "Lunch_diets")
    private Integer lunchdiets;
    @Column(name = "Diets_cost")
    private Long dietscost;
    @Column(name = "Extras_cost")
    private Long extrascost;
    @Column(name = "Total")
    private Long total;

    public Bill() {
    }

    public Bill(Integer id) {
        this.id = id;
    }

    public Bill(Integer id, int roomNo, String roomId) {
        this.id = id;
        this.roomNo = roomNo;
        this.roomId = roomId;
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

    public Integer getDinnerdiets() {
        return dinnerdiets;
    }

    public void setDinnerdiets(Integer dinnerdiets) {
        Integer oldDinnerdiets = this.dinnerdiets;
        this.dinnerdiets = dinnerdiets;
        changeSupport.firePropertyChange("dinnerdiets", oldDinnerdiets, dinnerdiets);
    }

    public Integer getLunchdiets() {
        return lunchdiets;
    }

    public void setLunchdiets(Integer lunchdiets) {
        Integer oldLunchdiets = this.lunchdiets;
        this.lunchdiets = lunchdiets;
        changeSupport.firePropertyChange("lunchdiets", oldLunchdiets, lunchdiets);
    }

    public Long getDietscost() {
        return dietscost;
    }

    public void setDietscost(Long dietscost) {
        Long oldDietscost = this.dietscost;
        this.dietscost = dietscost;
        changeSupport.firePropertyChange("dietscost", oldDietscost, dietscost);
    }

    public Long getExtrascost() {
        return extrascost;
    }

    public void setExtrascost(Long extrascost) {
        Long oldExtrascost = this.extrascost;
        this.extrascost = extrascost;
        changeSupport.firePropertyChange("extrascost", oldExtrascost, extrascost);
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
        if (!(object instanceof Bill)) {
            return false;
        }
        Bill other = (Bill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Accounts.Bill[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
