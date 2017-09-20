package h03.action;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import h03.service.DBOperation;
import h03.entity.Party;

public class PartyAction extends ActionSupport {

    private Party party;
    private List<Party> partylist;

    DBOperation d = new DBOperation();

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public List<Party> getPartylist() {
        return partylist;
    }

    public void setPartylist(List<Party> partylist) {
        this.partylist = partylist;
    }

    public String insertParty() throws Exception {
        partylist = d.saveParty(party);
        if (partylist.size() > 0) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
