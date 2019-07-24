/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mealmanagement;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author adittachakraborty
 */
@Entity
@Table(name = "MEMBER", catalog = "", schema = "ROOT")
@NamedQueries({
    @NamedQuery(name = "Member1.findAll", query = "SELECT m FROM Member1 m")
    , @NamedQuery(name = "Member1.findById", query = "SELECT m FROM Member1 m WHERE m.id = :id")
    , @NamedQuery(name = "Member1.findByUsername", query = "SELECT m FROM Member1 m WHERE m.username = :username")
    , @NamedQuery(name = "Member1.findByEmail", query = "SELECT m FROM Member1 m WHERE m.email = :email")
    , @NamedQuery(name = "Member1.findByGenderid", query = "SELECT m FROM Member1 m WHERE m.genderid = :genderid")
    , @NamedQuery(name = "Member1.findByPassword", query = "SELECT m FROM Member1 m WHERE m.password = :password")
    , @NamedQuery(name = "Member1.findByJoindate", query = "SELECT m FROM Member1 m WHERE m.joindate = :joindate")})
public class Member1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "GENDERID")
    private Integer genderid;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "JOINDATE")
    @Temporal(TemporalType.DATE)
    private Date joindate;

    public Member1() {
    }

    public Member1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public Integer getGenderid() {
        return genderid;
    }

    public void setGenderid(Integer genderid) {
        Integer oldGenderid = this.genderid;
        this.genderid = genderid;
        changeSupport.firePropertyChange("genderid", oldGenderid, genderid);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        Date oldJoindate = this.joindate;
        this.joindate = joindate;
        changeSupport.firePropertyChange("joindate", oldJoindate, joindate);
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
        if (!(object instanceof Member1)) {
            return false;
        }
        Member1 other = (Member1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mealmanagement.Member1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
