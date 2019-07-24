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
 * @author adittachakraborty
 */
@Entity
@Table(name = "REGISTRATION", catalog = "", schema = "ROOT")
@NamedQueries({
    @NamedQuery(name = "Registration.findAll", query = "SELECT r FROM Registration r")
    , @NamedQuery(name = "Registration.findById", query = "SELECT r FROM Registration r WHERE r.id = :id")
    , @NamedQuery(name = "Registration.findByUsername", query = "SELECT r FROM Registration r WHERE r.username = :username")
    , @NamedQuery(name = "Registration.findByEmail", query = "SELECT r FROM Registration r WHERE r.email = :email")
    , @NamedQuery(name = "Registration.findByPassword", query = "SELECT r FROM Registration r WHERE r.password = :password")
    , @NamedQuery(name = "Registration.findByConfirmpassword", query = "SELECT r FROM Registration r WHERE r.confirmpassword = :confirmpassword")
    , @NamedQuery(name = "Registration.findByJoindate", query = "SELECT r FROM Registration r WHERE r.joindate = :joindate")
    , @NamedQuery(name = "Registration.findByPhonenumber", query = "SELECT r FROM Registration r WHERE r.phonenumber = :phonenumber")})
public class Registration implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "CONFIRMPASSWORD")
    private String confirmpassword;
    @Column(name = "JOINDATE")
    @Temporal(TemporalType.DATE)
    private Date joindate;
    @Column(name = "PHONENUMBER")
    private Integer phonenumber;

    public Registration() {
    }

    public Registration(Integer id) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        String oldConfirmpassword = this.confirmpassword;
        this.confirmpassword = confirmpassword;
        changeSupport.firePropertyChange("confirmpassword", oldConfirmpassword, confirmpassword);
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        Date oldJoindate = this.joindate;
        this.joindate = joindate;
        changeSupport.firePropertyChange("joindate", oldJoindate, joindate);
    }

    public Integer getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Integer phonenumber) {
        Integer oldPhonenumber = this.phonenumber;
        this.phonenumber = phonenumber;
        changeSupport.firePropertyChange("phonenumber", oldPhonenumber, phonenumber);
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
        if (!(object instanceof Registration)) {
            return false;
        }
        Registration other = (Registration) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mealmanagement.Registration[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
