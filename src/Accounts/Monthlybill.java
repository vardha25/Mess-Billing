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
@Table(name = "monthlybill", catalog = "hostelmess", schema = "")
@NamedQueries({
    @NamedQuery(name = "Monthlybill.findAll", query = "SELECT m FROM Monthlybill m"),
    @NamedQuery(name = "Monthlybill.findById", query = "SELECT m FROM Monthlybill m WHERE m.id = :id"),
    @NamedQuery(name = "Monthlybill.findByRoomNo", query = "SELECT m FROM Monthlybill m WHERE m.roomNo = :roomNo"),
    @NamedQuery(name = "Monthlybill.findByRoomId", query = "SELECT m FROM Monthlybill m WHERE m.roomId = :roomId"),
    @NamedQuery(name = "Monthlybill.findByName", query = "SELECT m FROM Monthlybill m WHERE m.name = :name"),
    @NamedQuery(name = "Monthlybill.findByTotalDiets", query = "SELECT m FROM Monthlybill m WHERE m.totalDiets = :totalDiets"),
    @NamedQuery(name = "Monthlybill.findByExtrascost", query = "SELECT m FROM Monthlybill m WHERE m.extrascost = :extrascost"),
    @NamedQuery(name = "Monthlybill.findByDietscost", query = "SELECT m FROM Monthlybill m WHERE m.dietscost = :dietscost"),
    @NamedQuery(name = "Monthlybill.findByTotalcost", query = "SELECT m FROM Monthlybill m WHERE m.totalcost = :totalcost")})
public class Monthlybill implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ROOM_NO")
    private int roomNo;
    @Basic(optional = false)
    @Column(name = "ROOM_ID")
    private String roomId;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(name = "Total_Diets")
    private Integer totalDiets;
    @Column(name = "Extras_cost")
    private Long extrascost;
    @Column(name = "Diets_cost")
    private Long dietscost;
    @Column(name = "Total_cost")
    private Long totalcost;

    public Monthlybill() {
    }

    public Monthlybill(Integer id) {
        this.id = id;
    }

    public Monthlybill(Integer id, int roomNo, String roomId, String name) {
        this.id = id;
        this.roomNo = roomNo;
        this.roomId = roomId;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public Integer getTotalDiets() {
        return totalDiets;
    }

    public void setTotalDiets(Integer totalDiets) {
        Integer oldTotalDiets = this.totalDiets;
        this.totalDiets = totalDiets;
        changeSupport.firePropertyChange("totalDiets", oldTotalDiets, totalDiets);
    }

    public Long getExtrascost() {
        return extrascost;
    }

    public void setExtrascost(Long extrascost) {
        Long oldExtrascost = this.extrascost;
        this.extrascost = extrascost;
        changeSupport.firePropertyChange("extrascost", oldExtrascost, extrascost);
    }

    public Long getDietscost() {
        return dietscost;
    }

    public void setDietscost(Long dietscost) {
        Long oldDietscost = this.dietscost;
        this.dietscost = dietscost;
        changeSupport.firePropertyChange("dietscost", oldDietscost, dietscost);
    }

    public Long getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(Long totalcost) {
        Long oldTotalcost = this.totalcost;
        this.totalcost = totalcost;
        changeSupport.firePropertyChange("totalcost", oldTotalcost, totalcost);
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
        if (!(object instanceof Monthlybill)) {
            return false;
        }
        Monthlybill other = (Monthlybill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Accounts.Monthlybill[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
