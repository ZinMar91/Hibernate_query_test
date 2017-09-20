package h04.action;

import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import h04.entity.CustomerData;
import h04.service.DBOperation;

public class SearchAction extends ActionSupport {

    private List<CustomerData> list = new ArrayList<CustomerData>();

    public List<CustomerData> getList() {
        return list;
    }

    public void setList(List<CustomerData> list) {
        this.list = list;
    }
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    private String city;
    DBOperation db = new DBOperation();

    public String cityphnosearch() {
        System.out.println(address + "Address(City)" + city);

        list = db.searchdata(address, city);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getCdetail().getAddress());
            System.out.println(list.get(i).getCname());
            //System.out.println(list.get(i).getP().getPhonetype());
        }
        return SUCCESS;
    }

}
