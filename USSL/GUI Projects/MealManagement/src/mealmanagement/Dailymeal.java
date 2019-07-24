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
@Table(name = "DAILYMEAL", catalog = "", schema = "ROOT")
@NamedQueries({
    @NamedQuery(name = "Dailymeal.findAll", query = "SELECT d FROM Dailymeal d")
    , @NamedQuery(name = "Dailymeal.findById", query = "SELECT d FROM Dailymeal d WHERE d.id = :id")
    , @NamedQuery(name = "Dailymeal.findByRegistrationId", query = "SELECT d FROM Dailymeal d WHERE d.registrationId = :registrationId")
    , @NamedQuery(name = "Dailymeal.findByBazarid", query = "SELECT d FROM Dailymeal d WHERE d.bazarid = :bazarid")
    , @NamedQuery(name = "Dailymeal.findByMealamount", query = "SELECT d FROM Dailymeal d WHERE d.mealamount = :mealamount")
    , @NamedQuery(name = "Dailymeal.findByDate", query = "SELECT d FROM Dailymeal d WHERE d.date = :date")})
public class Dailymeal implements Serializable {

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
    @Column(name = "BAZARID")
    private Integer bazarid;
    @Column(name = "MEALAMOUNT")
    private Integer mealamount;
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;

    public Dailymeal() {
    }

    public Dailymeal(Integer id) {
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

    public Integer getBazarid() {
        return bazarid;
    }

    public void setBazarid(Integer bazarid) {
        Integer oldBazarid = this.bazarid;
        this.bazarid = bazarid;
        changeSupport.firePropertyChange("bazarid", oldBazarid, bazarid);
    }

    public Integer getMealamount() {
        return mealamount;
    }

    public void setMealamount(Integer mealamount) {
        Integer oldMealamount = this.mealamount;
        this.mealamount = mealamount;
        changeSupport.firePropertyChange("mealamount", oldMealamount, mealamount);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
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
        if (!(object instanceof Dailymeal)) {
            return false;
        }
        Dailymeal other = (Dailymeal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mealmanagement.Dailymeal[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
