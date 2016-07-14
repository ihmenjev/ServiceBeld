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
 * The persistent class for the tblContacts database table.
 * 
 */
@Entity
@Table(name = "tblContacts")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "AddTime")
	private Timestamp addTime;

	@Column(name = "BirthDate")
	private Timestamp birthDate;

	@Column(name = "City")
	private String city;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
	@JoinColumn(name = "ClientID")
	private Contragent contragent;

	@Column(name = "Contact")
	private String contact;

	@Column(name = "ContactNotes")
	private String contactNotes;

	@Column(name = "Country")
	private String country;

	@Column(name = "Dead")
	private boolean dead;

	@Column(name = "Email")
	private String email;

	@Column(name = "Favorites")
	private boolean favorites;

	@Column(name = "ICQ")
	private String icq;

	@Column(name = "Login")
	private String login;

	@Column(name = "OfficePhone")
	private String officePhone;

	@Column(name = "Pass")
	private String pass;

	@Column(name = "Phone")
	private String phone;

	@Column(name = "Sex")
	private String sex;

	@Column(name = "Skype")
	private String skype;

	@Column(name = "Title")
	private String title;

	@Column(name = "UserName")
	private String userName;

	@Column(name = "WorkPhone")
	private String workPhone;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	public Timestamp getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Timestamp birthDate) {
		this.birthDate = birthDate;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Contragent getContragent() {
		return contragent;
	}

	public void setContragent(Contragent contragent) {
		this.contragent = contragent;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContactNotes() {
		return this.contactNotes;
	}

	public void setContactNotes(String contactNotes) {
		this.contactNotes = contactNotes;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean getDead() {
		return this.dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getFavorites() {
		return this.favorites;
	}

	public void setFavorites(boolean favorites) {
		this.favorites = favorites;
	}

	public String getIcq() {
		return this.icq;
	}

	public void setIcq(String icq) {
		this.icq = icq;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getOfficePhone() {
		return this.officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSkype() {
		return this.skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getWorkPhone() {
		return this.workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

}