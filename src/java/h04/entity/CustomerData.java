package h04.entity;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CustomerData implements Serializable {

    private int cid;
    private String cname;
    private int age;
    private String nrc;

    private String gender;

    private PhoneType p;
    private CustomerDetail cdetail;

    @Embedded
    public CustomerDetail getCdetail() {
        return cdetail;
    }

    public void setCdetail(CustomerDetail cdetail) {
        this.cdetail = cdetail;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @ManyToOne
    public PhoneType getP() {
        return p;
    }

    public void setP(PhoneType p) {
        this.p = p;
    }

    @Id
    @GeneratedValue
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
