package h03.entity;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@SequenceGenerator(name="seqparty",sequenceName="seqParty",allocationSize=1)
public class Party implements Serializable{
	private int pid;
	private String partyname;
	private String acronym;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqparty")
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPartyname() {
		return partyname;
	}
	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}
	public String getAcronym() {
		return acronym;
	}
	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}
	
	
}
