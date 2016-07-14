package by.cromvel.servicebeld.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the tblUsers database table.
 * 
 */
@Entity
@Table(name = "tblUsers")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "AddTime")
	private Timestamp addTime;

	@Column(name = "Dead")
	private boolean dead;

	@Column(name = "Dolgnost")
	private String dolgnost;

	@Column(name = "LastLoginTime")
	private Timestamp lastLoginTime;

	@Column(name = "LastLogoutTime")
	private Timestamp lastLogoutTime;

	@Column(name = "PhotoPic")
	private String photoPic;

	@Column(name = "Skype")
	private String skype;

	@Column(name = "Speciality")
	private String speciality;

	@Column(name = "UserEmail")
	private String userEmail;

	@Column(name = "UserFullName")
	private String userFullName;

	@Column(name = "UserMobilePhone")
	private String userMobilePhone;

	@Column(name = "UserName")
	private String userName;

	@Column(name = "UserPassword")
	private String userPassword;

	@Column(name = "UserRole")
	private String userRole;

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

	public boolean getDead() {
		return this.dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}

	public String getDolgnost() {
		return this.dolgnost;
	}

	public void setDolgnost(String dolgnost) {
		this.dolgnost = dolgnost;
	}

	public Timestamp getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Timestamp getLastLogoutTime() {
		return this.lastLogoutTime;
	}

	public void setLastLogoutTime(Timestamp lastLogoutTime) {
		this.lastLogoutTime = lastLogoutTime;
	}

	public String getPhotoPic() {
		return this.photoPic;
	}

	public void setPhotoPic(String photoPic) {
		this.photoPic = photoPic;
	}

	public String getSkype() {
		return this.skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getSpeciality() {
		return this.speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserFullName() {
		return this.userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserMobilePhone() {
		return this.userMobilePhone;
	}

	public void setUserMobilePhone(String userMobilePhone) {
		this.userMobilePhone = userMobilePhone;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserRole() {
		return this.userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

}