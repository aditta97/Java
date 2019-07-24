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
@Table(name = "MEALINPUT", catalog = "", schema = "ROOT")
@NamedQueries({
    @NamedQuery(name = "Mealinput.findAll", query = "SELECT m FROM Mealinput m")
    , @NamedQuery(name = "Mealinput.findById", query = "SELECT m FROM Mealinput m WHERE m.id = :id")
    , @NamedQuery(name = "Mealinput.findByRegistrationId", query = "SELECT m FROM Mealinput m WHERE m.registrationId = :registrationId")
    , @NamedQuery(name = "Mealinput.findByMealperiodid", query = "SELECT m FROM Mealinput m WHERE m.mealperiodid = :mealperiodid")
    , @NamedQuery(name = "Mealinput.findByMealcount", query = "SELECT m FROM Mealinput m WHERE m.mealcount = :mealcount")
    , @NamedQuery(name = "Mealinput.findByMealdate", query = "SELECT m FROM Mealinput m WHERE m.mealdate = :mealdate")})
public class Mealinput implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "REGISTRATION_ID")
    private Integer registrationId;
    @Column(name = "MEALPERIODID")
    private Integer mealperiodid;
    @Column(name = "MEALCOUNT")
    private Integer mealcount;
    @Column(name = "MEALDATE")
    @Temporal(TemporalType.DATE)
    private Date mealdate;

    public Mealinput() {
    }

    public Mealinput(Integer id) {
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

    public Integer getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Integer registrationId) {
        Integer oldRegistrationId = this.registrationId;
        this.registrationId = registrationId;
        changeSupport.firePropertyChange("registrationId", oldRegistrationId, registrationId);
    }

    public Integer getMealperiodid() {
        return mealperiodid;
    }

    public void setMealperiodid(Integer mealperiodid) {
        Integer oldMealperiodid = this.mealperiodid;
        this.mealperiodid = mealperiodid;
        changeSupport.firePropertyChange("mealperiodid", oldMealperiodid, mealperiodid);
    }

    public Integer getMealcount() {
        return mealcount;
    }

    public void setMealcount(Integer mealcount) {
        Integer oldMealcount = this.mealcount;
        this.mealcount = mealcount;
        changeSupport.firePropertyChange("mealcount", oldMealcount, mealcount);
    }

    public Date getMealdate() {
        return mealdate;
    }

    public void setMealdate(Date mealdate) {
        Date oldMealdate = this.mealdate;
        this.mealdate = mealdate;
        changeSupport.firePropertyChange("mealdate", oldMealdate, mealdate);
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
        if (!(object instanceof Mealinput)) {
            return false;
        }
        Mealinput other = (Mealinput) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mealmanagement.Mealinput[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
