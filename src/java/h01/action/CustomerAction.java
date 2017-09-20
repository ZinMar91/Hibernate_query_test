package h01.action;

import java.util.HashMap;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import h01.entity.Count;
import h01.entity.Customer;
import h01.service.DBOperation;

public class CustomerAction extends ActionSupport {

    private String address;
    private String name;
    private String email;
    DBOperation dbo = new DBOperation();
    private List<Customer> clist;
    private List<Count> custcount;
    private HashMap<Object, Object> countmap;

    public HashMap<Object, Object> getCountmap() {
        return countmap;
    }

    public void setCountmap(HashMap<Object, Object> countmap) {
        this.countmap = countmap;
    }
    private Customer c;

    public Customer getC() {
        return c;
    }

    public void setC(Customer c) {
        this.c = c;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Customer> getClist() {
        return clist;
    }

    public void setClist(List<Customer> clist) {
        this.clist = clist;
    }

    public List<Count> getCustcount() {
        return custcount;
    }

    public void setCustcount(List<Count> custcount) {
        this.custcount = custcount;
    }

    public String insertcustomer() {
        dbo.insertcustomer(c);
        return SUCCESS;
    }

    public String searchAddress() {
        clist = dbo.searchAddress(address);
        return SUCCESS;
    }

    public String searchName() {
        clist = dbo.searchName(name);
        return SUCCESS;
    }

    public String searchEmail() {
        clist = dbo.searchEmail(email);
        return SUCCESS;
    }

    public String countCustomer() {
        custcount = dbo.countCustomer();
        return SUCCESS;
    }

    public String countCustomer1() {
        countmap = dbo.countCustomer1();
        //System.out.println(countmap.size());
        return SUCCESS;
    }

}
