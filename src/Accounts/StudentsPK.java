/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accounts;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author vardha
 */
@Embeddable
public class StudentsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ROOM_NO")
    private int roomNo;
    @Basic(optional = false)
    @Column(name = "ROOm_ID")
    private String rOOmID;

    public StudentsPK() {
    }

    public StudentsPK(int roomNo, String rOOmID) {
        this.roomNo = roomNo;
        this.rOOmID = rOOmID;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getROOmID() {
        return rOOmID;
    }

    public void setROOmID(String rOOmID) {
        this.rOOmID = rOOmID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) roomNo;
        hash += (rOOmID != null ? rOOmID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentsPK)) {
            return false;
        }
        StudentsPK other = (StudentsPK) object;
        if (this.roomNo != other.roomNo) {
            return false;
        }
        if ((this.rOOmID == null && other.rOOmID != null) || (this.rOOmID != null && !this.rOOmID.equals(other.rOOmID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Accounts.StudentsPK[ roomNo=" + roomNo + ", rOOmID=" + rOOmID + " ]";
    }
    
}
