package h03.action;

import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import h03.entity.Party;
import h03.entity.Voter;
import h03.service.DBOperation;

public class VoteAction extends ActionSupport {

    private Voter v;
    DBOperation d = new DBOperation();
    private List<Party> partylist = new ArrayList<Party>();
    private List<String> partynamelist = new ArrayList();
    private String pname; //to get

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public List<Party> getPartylist() {
        return partylist;
    }

    public void setPartylist(List<Party> partylist) {
        this.partylist = partylist;
    }

    public List<String> getPartynamelist() {
        return partynamelist;
    }

    public void setPartynamelist(List<String> partynamelist) {
        this.partynamelist = partynamelist;
    }

    public Voter getV() {
        return v;
    }

    public void setV(Voter v) {
        this.v = v;
    }

    public String insertPeople() throws Exception {
        partylist = d.showParty();
        System.out.println("Size= " + partylist.size());

        System.out.println("PName is " + pname);

        for (int i = 0; i < partylist.size(); i++) {
            System.out.println("i is " + partylist.get(i).getPid());
            if (pname.equals(partylist.get(i).getPartyname())) {
                System.out.println("Equal " + partylist.get(i).getPid());
                v.setP(new Party());

                v.getP().setPid(partylist.get(i).getPid());
                System.out.println(v.getP().getPid());
            }
        }

        if (d.savePeople(v)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String readylist() throws Exception {
        partylist = d.showParty();
        for (int i = 0; i < partylist.size(); i++) {
            partynamelist.add(partylist.get(i).getPartyname());
            //partynamelist.add(new PartyList(partylist.get(i).getPid(),partylist.get(i).getPartyname()));
        }
        return SUCCESS;
    }
}
