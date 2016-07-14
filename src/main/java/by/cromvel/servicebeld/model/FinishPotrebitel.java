package by.cromvel.servicebeld.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the tblFinishPotrebitel database table.
 * 
 */
@Entity
@Table(name = "tblFinishPotrebitel")
public class FinishPotrebitel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "AddrP")
	private String addrP;

	@Column(name = "AddTimePotr")
	private Timestamp addTimePotr;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JoinColumn(name = "ClientId")
	private Contragent contragent;

	@Column(name = "ContactNotesPotr")
	private String contactNotesPotr;

	@Column(name = "EmailPotr")
	private String emailPotr;

	@Column(name = "PhonePotr")
	private String phonePotr;

	@Column(name = "PotrID")
	private String potrID;

	@Column(name = "SkypePotr")
	private String skypePotr;

	@Column(name = "WorkPhonePotr")
	private String workPhonePotr;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddrP() {
		return this.addrP;
	}

	public void setAddrP(String addrP) {
		this.addrP = addrP;
	}

	public Timestamp getAddTimePotr() {
		return this.addTimePotr;
	}

	public void setAddTimePotr(Timestamp addTimePotr) {
		this.addTimePotr = addTimePotr;
	}

	public Contragent getContragent() {
		return contragent;
	}

	public void setContragent(Contragent contragent) {
		this.contragent = contragent;
	}

	public String getContactNotesPotr() {
		return this.contactNotesPotr;
	}

	public void setContactNotesPotr(String contactNotesPotr) {
		this.contactNotesPotr = contactNotesPotr;
	}

	public String getEmailPotr() {
		return this.emailPotr;
	}

	public void setEmailPotr(String emailPotr) {
		this.emailPotr = emailPotr;
	}

	public String getPhonePotr() {
		return this.phonePotr;
	}

	public void setPhonePotr(String phonePotr) {
		this.phonePotr = phonePotr;
	}

	public String getPotrID() {
		return this.potrID;
	}

	public void setPotrID(String potrID) {
		this.potrID = potrID;
	}

	public String getSkypePotr() {
		return this.skypePotr;
	}

	public void setSkypePotr(String skypePotr) {
		this.skypePotr = skypePotr;
	}

	public String getWorkPhonePotr() {
		return this.workPhonePotr;
	}

	public void setWorkPhonePotr(String workPhonePotr) {
		this.workPhonePotr = workPhonePotr;
	}

}