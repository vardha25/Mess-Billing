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
public class ColumnsPrivPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Host")
    private String host;
    @Basic(optional = false)
    @Column(name = "Db")
    private String db;
    @Basic(optional = false)
    @Column(name = "User")
    private String user;
    @Basic(optional = false)
    @Column(name = "Table_name")
    private String tablename;
    @Basic(optional = false)
    @Column(name = "Column_name")
    private String columnname;

    public ColumnsPrivPK() {
    }

    public ColumnsPrivPK(String host, String db, String user, String tablename, String columnname) {
        this.host = host;
        this.db = db;
        this.user = user;
        this.tablename = tablename;
        this.columnname = columnname;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (host != null ? host.hashCode() : 0);
        hash += (db != null ? db.hashCode() : 0);
        hash += (user != null ? user.hashCode() : 0);
        hash += (tablename != null ? tablename.hashCode() : 0);
        hash += (columnname != null ? columnname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ColumnsPrivPK)) {
            return false;
        }
        ColumnsPrivPK other = (ColumnsPrivPK) object;
        if ((this.host == null && other.host != null) || (this.host != null && !this.host.equals(other.host))) {
            return false;
        }
        if ((this.db == null && other.db != null) || (this.db != null && !this.db.equals(other.db))) {
            return false;
        }
        if ((this.user == null && other.user != null) || (this.user != null && !this.user.equals(other.user))) {
            return false;
        }
        if ((this.tablename == null && other.tablename != null) || (this.tablename != null && !this.tablename.equals(other.tablename))) {
            return false;
        }
        if ((this.columnname == null && other.columnname != null) || (this.columnname != null && !this.columnname.equals(other.columnname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Accounts.ColumnsPrivPK[ host=" + host + ", db=" + db + ", user=" + user + ", tablename=" + tablename + ", columnname=" + columnname + " ]";
    }
    
}
