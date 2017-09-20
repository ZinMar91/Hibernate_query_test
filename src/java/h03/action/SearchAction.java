package h03.action;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import h03.entity.Voter;
import h03.service.DBOperation;

public class SearchAction extends ActionSupport {

    private Voter v;
    DBOperation d = new DBOperation();
    private String n;
    private List<Voter> list;

    public List<Voter> getList() {
        return list;
    }

    public void setList(List<Voter> list) {
        this.list = list;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public Voter getV() {
        return v;
    }

    public void setV(Voter v) {
        this.v = v;
    }

    public String search() throws Exception {
        list = d.searchvote(n);
        System.out.println(list.get(0));
        if (list.size() > 0) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

}
