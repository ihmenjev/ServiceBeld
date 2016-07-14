package by.cromvel.servicebeld.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the tblMain database table.
 * 
 */
@Entity
@Table(name = "tblMain")
public class Contragent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "Address")
	private String address;

	@Column(name = "AddressFact")
	private String addressFact;

	@Column(name = "AddressPost")
	private String addressPost;

	@Column(name = "AddTime")
	private Timestamp addTime;

	@Column(name = "Bank")
	private String bank;

	@Column(name = "Buhgalter")
	private String buhgalter;

	@Column(name = "City")
	private String city;

	@Column(name = "Client")
	private String client;

	@Column(name = "ClientType")
	private String clientType;

	@Column(name = "Country")
	private String country;

	@Column(name = "CreditHistory")
	private String creditHistory;

	@Column(name = "Dead")
	private boolean dead;

	@Column(name = "Director")
	private String director;

	@Column(name = "District")
	private String district;

	@Column(name = "Email")
	private String email;

	@Column(name = "Favorites")
	private boolean favorites;

	@Column(name = "Fax")
	private String fax;

	@Column(name = "FullName")
	private String fullName;

	@Column(name = "Holding")
	private String holding;

	@Column(name = "HouseCorp")
	private String houseCorp;

	@Column(name = "HouseNumber")
	private int houseNumber;

	@Column(name = "Icq")
	private String icq;

	@Column(name = "Industry")
	private String industry;

	@Column(name = "INN")
	private String inn;

	@Column(name = "KPP")
	private String kpp;

	@Column(name = "LegalForm")
	private String legalForm;

	@Column(name = "Loyalty")
	private String loyalty;

	@Column(name = "Metro")
	private String metro;

	@Column(name = "NaOsnov")
	private String naOsnov;

	@Column(name = "Notes")
	private String notes;

	@Column(name = "OKPO")
	private String okpo;

	@Column(name = "Phone")
	private String phone;

	@Column(name = "PostalCode")
	private String postalCode;

	@Column(name = "PredpVidOpl")
	private String predpVidOpl;

	@Column(name = "Rating")
	private String rating;

	@Column(name = "Region")
	private String region;

	@Column(name = "RoomNumber")
	private int roomNumber;

	@Column(name = "Source")
	private String source;

	@Column(name = "Status")
	private String status;

	@Column(name = "Street")
	private String street;

	@Column(name = "UserName")
	private String userName;

	@Column(name = "Vlitse")
	private String vlitse;

	@Column(name = "Website")
	private String website;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressFact() {
		return this.addressFact;
	}

	public void setAddressFact(String addressFact) {
		this.addressFact = addressFact;
	}

	public String getAddressPost() {
		return this.addressPost;
	}

	public void setAddressPost(String addressPost) {
		this.addressPost = addressPost;
	}

	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBuhgalter() {
		return this.buhgalter;
	}

	public void setBuhgalter(String buhgalter) {
		this.buhgalter = buhgalter;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getClientType() {
		return this.clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCreditHistory() {
		return this.creditHistory;
	}

	public void setCreditHistory(String creditHistory) {
		this.creditHistory = creditHistory;
	}

	public boolean getDead() {
		return this.dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}

	public String getDirector() {
		return this.director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
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

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getHolding() {
		return this.holding;
	}

	public void setHolding(String holding) {
		this.holding = holding;
	}

	public String getHouseCorp() {
		return this.houseCorp;
	}

	public void setHouseCorp(String houseCorp) {
		this.houseCorp = houseCorp;
	}

	public int getHouseNumber() {
		return this.houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getIcq() {
		return this.icq;
	}

	public void setIcq(String icq) {
		this.icq = icq;
	}

	public String getIndustry() {
		return this.industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getInn() {
		return this.inn;
	}

	public void setInn(String inn) {
		this.inn = inn;
	}

	public String getKpp() {
		return this.kpp;
	}

	public void setKpp(String kpp) {
		this.kpp = kpp;
	}

	public String getLegalForm() {
		return this.legalForm;
	}

	public void setLegalForm(String legalForm) {
		this.legalForm = legalForm;
	}

	public String getLoyalty() {
		return this.loyalty;
	}

	public void setLoyalty(String loyalty) {
		this.loyalty = loyalty;
	}

	public String getMetro() {
		return this.metro;
	}

	public void setMetro(String metro) {
		this.metro = metro;
	}

	public String getNaOsnov() {
		return this.naOsnov;
	}

	public void setNaOsnov(String naOsnov) {
		this.naOsnov = naOsnov;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getOkpo() {
		return this.okpo;
	}

	public void setOkpo(String okpo) {
		this.okpo = okpo;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPredpVidOpl() {
		return this.predpVidOpl;
	}

	public void setPredpVidOpl(String predpVidOpl) {
		this.predpVidOpl = predpVidOpl;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getVlitse() {
		return this.vlitse;
	}

	public void setVlitse(String vlitse) {
		this.vlitse = vlitse;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}