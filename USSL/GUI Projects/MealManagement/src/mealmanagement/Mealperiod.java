/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mealmanagement;

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
 * @author adittachakraborty
 */
@Entity
@Table(name = "MEALPERIOD", catalog = "", schema = "ROOT")
@NamedQueries({
    @NamedQuery(name = "Mealperiod.findAll", query = "SELECT m FROM Mealperiod m")
    , @NamedQuery(name = "Mealperiod.findById", query = "SELECT m FROM Mealperiod m WHERE m.id = :id")
    , @NamedQuery(name = "Mealperiod.findByBreakfast", query = "SELECT m FROM Mealperiod m WHERE m.breakfast = :breakfast")
    , @NamedQuery(name = "Mealperiod.findByLunch", query = "SELECT m FROM Mealperiod m WHERE m.lunch = :lunch")
    , @NamedQuery(name = "Mealperiod.findByDinner", query = "SELECT m FROM Mealperiod m WHERE m.dinner = :dinner")})
public class Mealperiod implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "BREAKFAST")
    private Integer breakfast;
    @Column(name = "LUNCH")
    private Integer lunch;
    @Column(name = "DINNER")
    private Integer dinner;

    public Mealperiod() {
    }

    public Mealperiod(Integer id) {
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

    public Integer getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Integer breakfast) {
        Integer oldBreakfast = this.breakfast;
        this.breakfast = breakfast;
        changeSupport.firePropertyChange("breakfast", oldBreakfast, breakfast);
    }

    public Integer getLunch() {
        return lunch;
    }

    public void setLunch(Integer lunch) {
        Integer oldLunch = this.lunch;
        this.lunch = lunch;
        changeSupport.firePropertyChange("lunch", oldLunch, lunch);
    }

    public Integer getDinner() {
        return dinner;
    }

    public void setDinner(Integer dinner) {
        Integer oldDinner = this.dinner;
        this.dinner = dinner;
        changeSupport.firePropertyChange("dinner", oldDinner, dinner);
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
        if (!(object instanceof Mealperiod)) {
            return false;
        }
        Mealperiod other = (Mealperiod) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mealmanagement.Mealperiod[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
