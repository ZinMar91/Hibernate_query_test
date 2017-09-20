package h03.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class VoterDetail implements Serializable{
	private String nrc;
	private String township;
	private String city;
	private String phno;
	public String getNrc() {
		return nrc;
	}
	public void setNrc(String nrc) {
		this.nrc = nrc;
	}
	public String getTownship() {
		return township;
	}
	public void setTownship(String township) {
		this.township = township;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	
}
