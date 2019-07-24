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
@Table(name = "MAIN", catalog = "", schema = "ROOT")
@NamedQueries({
    @NamedQuery(name = "Main.findAll", query = "SELECT m FROM Main m")
    , @NamedQuery(name = "Main.findById", query = "SELECT m FROM Main m WHERE m.id = :id")
    , @NamedQuery(name = "Main.findByJoindate", query = "SELECT m FROM Main m WHERE m.joindate = :joindate")
    , @NamedQuery(name = "Main.findByUsername", query = "SELECT m FROM Main m WHERE m.username = :username")
    , @NamedQuery(name = "Main.findByEmailaddress", query = "SELECT m FROM Main m WHERE m.emailaddress = :emailaddress")
    , @NamedQuery(name = "Main.findByPhonenumber", query = "SELECT m FROM Main m WHERE m.phonenumber = :phonenumber")
    , @NamedQuery(name = "Main.findByPassword", query = "SELECT m FROM Main m WHERE m.password = :password")
    , @NamedQuery(name = "Main.findByConfirmpassword", query = "SELECT m FROM Main m WHERE m.confirmpassword = :confirmpassword")
    , @NamedQuery(name = "Main.findByUsertype", query = "SELECT m FROM Main m WHERE m.usertype = :usertype")
    , @NamedQuery(name = "Main.findByBreakfast", query = "SELECT m FROM Main m WHERE m.breakfast = :breakfast")
    , @NamedQuery(name = "Main.findByLunch", query = "SELECT m FROM Main m WHERE m.lunch = :lunch")
    , @NamedQuery(name = "Main.findByDinner", query = "SELECT m FROM Main m WHERE m.dinner = :dinner")
    , @NamedQuery(name = "Main.findByTotalmeal", query = "SELECT m FROM Main m WHERE m.totalmeal = :totalmeal")
    , @NamedQuery(name = "Main.findByDaymeal", query = "SELECT m FROM Main m WHERE m.daymeal = :daymeal")
    , @NamedQuery(name = "Main.findByPerdaymealrate", query = "SELECT m FROM Main m WHERE m.perdaymealrate = :perdaymealrate")
    , @NamedQuery(name = "Main.findByCurrentmealrate", query = "SELECT m FROM Main m WHERE m.currentmealrate = :currentmealrate")
    , @NamedQuery(name = "Main.findByTotalcost", query = "SELECT m FROM Main m WHERE m.totalcost = :totalcost")
    , @NamedQuery(name = "Main.findByPayment", query = "SELECT m FROM Main m WHERE m.payment = :payment")
    , @NamedQuery(name = "Main.findByPaymentdate", query = "SELECT m FROM Main m WHERE m.paymentdate = :paymentdate")
    , @NamedQuery(name = "Main.findByDeposite", query = "SELECT m FROM Main m WHERE m.deposite = :deposite")
    , @NamedQuery(name = "Main.findByBalance", query = "SELECT m FROM Main m WHERE m.balance = :balance")})
public class Main implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "JOINDATE")
    @Temporal(TemporalType.DATE)
    private Date joindate;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "EMAILADDRESS")
    private String emailaddress;
    @Column(name = "PHONENUMBER")
    private Integer phonenumber;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "CONFIRMPASSWORD")
    private String confirmpassword;
    @Column(name = "USERTYPE")
    private String usertype;
    @Column(name = "BREAKFAST")
    private Integer breakfast;
    @Column(name = "LUNCH")
    private Integer lunch;
    @Column(name = "DINNER")
    private Integer dinner;
    @Column(name = "TOTALMEAL")
    private Integer totalmeal;
    @Column(name = "DAYMEAL")
    @Temporal(TemporalType.DATE)
    private Date daymeal;
    @Column(name = "PERDAYMEALRATE")
    private Integer perdaymealrate;
    @Column(name = "CURRENTMEALRATE")
    private Integer currentmealrate;
    @Column(name = "TOTALCOST")
    private Integer totalcost;
    @Column(name = "PAYMENT")
    private Integer payment;
    @Column(name = "PAYMENTDATE")
    @Temporal(TemporalType.DATE)
    private Date paymentdate;
    @Column(name = "DEPOSITE")
    private Integer deposite;
    @Column(name = "BALANCE")
    private Integer balance;

    public Main() {
    }

    public Main(Integer id) {
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

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        Date oldJoindate = this.joindate;
        this.joindate = joindate;
        changeSupport.firePropertyChange("joindate", oldJoindate, joindate);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        String oldEmailaddress = this.emailaddress;
        this.emailaddress = emailaddress;
        changeSupport.firePropertyChange("emailaddress", oldEmailaddress, emailaddress);
    }

    public Integer getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Integer phonenumber) {
        Integer oldPhonenumber = this.phonenumber;
        this.phonenumber = phonenumber;
        changeSupport.firePropertyChange("phonenumber", oldPhonenumber, phonenumber);
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

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        String oldUsertype = this.usertype;
        this.usertype = usertype;
        changeSupport.firePropertyChange("usertype", oldUsertype, usertype);
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

    public Integer getTotalmeal() {
        return totalmeal;
    }

    public void setTotalmeal(Integer totalmeal) {
        Integer oldTotalmeal = this.totalmeal;
        this.totalmeal = totalmeal;
        changeSupport.firePropertyChange("totalmeal", oldTotalmeal, totalmeal);
    }

    public Date getDaymeal() {
        return daymeal;
    }

    public void setDaymeal(Date daymeal) {
        Date oldDaymeal = this.daymeal;
        this.daymeal = daymeal;
        changeSupport.firePropertyChange("daymeal", oldDaymeal, daymeal);
    }

    public Integer getPerdaymealrate() {
        return perdaymealrate;
    }

    public void setPerdaymealrate(Integer perdaymealrate) {
        Integer oldPerdaymealrate = this.perdaymealrate;
        this.perdaymealrate = perdaymealrate;
        changeSupport.firePropertyChange("perdaymealrate", oldPerdaymealrate, perdaymealrate);
    }

    public Integer getCurrentmealrate() {
        return currentmealrate;
    }

    public void setCurrentmealrate(Integer currentmealrate) {
        Integer oldCurrentmealrate = this.currentmealrate;
        this.currentmealrate = currentmealrate;
        changeSupport.firePropertyChange("currentmealrate", oldCurrentmealrate, currentmealrate);
    }

    public Integer getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(Integer totalcost) {
        Integer oldTotalcost = this.totalcost;
        this.totalcost = totalcost;
        changeSupport.firePropertyChange("totalcost", oldTotalcost, totalcost);
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        Integer oldPayment = this.payment;
        this.payment = payment;
        changeSupport.firePropertyChange("payment", oldPayment, payment);
    }

    public Date getPaymentdate() {
        return paymentdate;
    }

    public void setPaymentdate(Date paymentdate) {
        Date oldPaymentdate = this.paymentdate;
        this.paymentdate = paymentdate;
        changeSupport.firePropertyChange("paymentdate", oldPaymentdate, paymentdate);
    }

    public Integer getDeposite() {
        return deposite;
    }

    public void setDeposite(Integer deposite) {
        Integer oldDeposite = this.deposite;
        this.deposite = deposite;
        changeSupport.firePropertyChange("deposite", oldDeposite, deposite);
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        Integer oldBalance = this.balance;
        this.balance = balance;
        changeSupport.firePropertyChange("balance", oldBalance, balance);
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
        if (!(object instanceof Main)) {
            return false;
        }
        Main other = (Main) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mealmanagement.Main[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
