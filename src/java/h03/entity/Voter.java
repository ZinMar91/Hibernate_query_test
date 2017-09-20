package h03.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="seqvoter",sequenceName="seqVoter",allocationSize=1)
public class Voter implements Serializable{
	private int vid;
	private String name;
	private int age;
	private String gender;
	private VoterDetail vdetail;
	private String religion;
	private String nationality;
	private Party p;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqvoter")
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Embedded
	public VoterDetail getVdetail() {
		return vdetail;
	}
	public void setVdetail(VoterDetail vdetail) {
		this.vdetail = vdetail;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	@ManyToOne
	public Party getP() {
		return p;
	}
	public void setP(Party p) {
		this.p = p;
	}
	
	
	
	
}
