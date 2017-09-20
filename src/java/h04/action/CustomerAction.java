package h04.action;

import com.opensymphony.xwork2.ActionSupport;
import h04.entity.CustomerData;
import h04.service.DBOperation;

public class CustomerAction extends ActionSupport {

    private CustomerData cust;

    public CustomerData getCust() {
        return cust;
    }

    public void setCust(CustomerData cust) {
        this.cust = cust;
    }
    DBOperation db = new DBOperation();

    public String customersave() {
        if (db.savecustomer(cust)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
