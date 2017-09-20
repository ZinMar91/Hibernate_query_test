package h04.action;

import com.opensymphony.xwork2.ActionSupport;
import h04.entity.PhoneType;
import h04.service.DBOperation;

public class PhoneAction extends ActionSupport {

    private PhoneType p;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PhoneType getP() {
        return p;
    }

    public void setP(PhoneType p) {
        this.p = p;
    }
    DBOperation db = new DBOperation();

    public String phoneinsert() {
        System.out.println(p.getPhonetype());
        id = db.savePhone(p);
        //System.out.println(newp.getPhonetype());
        if (id != 0) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
