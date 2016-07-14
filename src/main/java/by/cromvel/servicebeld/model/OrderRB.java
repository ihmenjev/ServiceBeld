package by.cromvel.servicebeld.model;

import java.math.BigDecimal;
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
 * The persistent class for the tblOrders database table.
 * 
 */
@Entity
@Table(name = "tblOrders")
public class OrderRB {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "AddTime")
	private Timestamp addTime;

	@Column(name = "AdrDost")
	private String adrDost;

	@Column(name = "AdrZagr")
	private String adrZagr;

	@Column(name = "Carier")
	private String carier;

	@Column(name = "CarrierID")
	private int carrierID;

	@Column(name = "Cena")
	private double cena;

	@Column(name = "Check1")
	private boolean check1;

	@Column(name = "CheckGain")
	private boolean checkGain;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JoinColumn(name = "ClientID")
	private Contragent contragent;

	@Column(name = "Contact")
	private String contact;

	@Column(name = "CostGruz")
	private double costGruz;

	@Column(name = "CourierCalc")
	private String courierName;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JoinColumn(name = "CourierID")
	private Employee courier;

	@Column(name = "DateZajavkComplete")
	private Timestamp dateZajavkComplete;

	@Column(name = "Distance")
	private double distance;

	@Column(name = "Driver")
	private String driver;

	@Column(name = "FactSumm")
	private double factSumm;

	@Column(name = "GrObr")
	private boolean grObr;

	@Column(name = "Gruz")
	private String gruz;

	@Column(name = "OplataZakaz")
	private String oplataZakaz;

	@Column(name = "OrderAmount")
	private BigDecimal orderAmount;

	@Column(name = "OrderDate")
	private Timestamp orderDate;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JoinColumn(name = "PaymentID")
	private Payment payment;

	@Column(name = "PaymentStatus")
	private String paymentStatus;

	@Column(name = "Primech")
	private String primech;

	@Column(name = "RegionZakaz")
	private String regionZakaz;

	@Column(name = "Status")
	private String status;

	@Column(name = "Transport")
	private String transport;

	@Column(name = "TSID")
	private int tsid;

	@Column(name = "UserName")
	private String userName;

	@Column(name = "Volume")
	private double volume;

	@Column(name = "VremZagr")
	private Timestamp vremZagr;

	@Column(name = "Weight")
	private double weight;

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

	public String getAdrDost() {
		return this.adrDost;
	}

	public void setAdrDost(String adrDost) {
		this.adrDost = adrDost;
	}

	public String getAdrZagr() {
		return this.adrZagr;
	}

	public void setAdrZagr(String adrZagr) {
		this.adrZagr = adrZagr;
	}

	public String getCarier() {
		return this.carier;
	}

	public void setCarier(String carier) {
		this.carier = carier;
	}

	public int getCarrierID() {
		return this.carrierID;
	}

	public void setCarrierID(int carrierID) {
		this.carrierID = carrierID;
	}

	public double getCena() {
		return this.cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public boolean getCheck1() {
		return this.check1;
	}

	public void setCheck1(boolean check1) {
		this.check1 = check1;
	}

	public boolean getCheckGain() {
		return this.checkGain;
	}

	public void setCheckGain(boolean checkGain) {
		this.checkGain = checkGain;
	}

	public Contragent getContragent() {
		return contragent;
	}

	public void setContragent(Contragent contragent) {
		this.contragent = contragent;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public double getCostGruz() {
		return this.costGruz;
	}

	public void setCostGruz(double costGruz) {
		this.costGruz = costGruz;
	}

	public String getCourierName() {
		return courierName;
	}

	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	public Employee getCourier() {
		return courier;
	}

	public void setCourier(Employee courier) {
		this.courier = courier;
	}

	public Timestamp getDateZajavkComplete() {
		return this.dateZajavkComplete;
	}

	public void setDateZajavkComplete(Timestamp dateZajavkComplete) {
		this.dateZajavkComplete = dateZajavkComplete;
	}

	public double getDistance() {
		return this.distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getDriver() {
		return this.driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public double getFactSumm() {
		return this.factSumm;
	}

	public void setFactSumm(double factSumm) {
		this.factSumm = factSumm;
	}

	public boolean getGrObr() {
		return this.grObr;
	}

	public void setGrObr(boolean grObr) {
		this.grObr = grObr;
	}

	public String getGruz() {
		return this.gruz;
	}

	public void setGruz(String gruz) {
		this.gruz = gruz;
	}

	public String getOplataZakaz() {
		return this.oplataZakaz;
	}

	public void setOplataZakaz(String oplataZakaz) {
		this.oplataZakaz = oplataZakaz;
	}

	public BigDecimal getOrderAmount() {
		return this.orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Timestamp getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public String getPaymentStatus() {
		return this.paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPrimech() {
		return this.primech;
	}

	public void setPrimech(String primech) {
		this.primech = primech;
	}

	public String getRegionZakaz() {
		return this.regionZakaz;
	}

	public void setRegionZakaz(String regionZakaz) {
		this.regionZakaz = regionZakaz;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransport() {
		return this.transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public int getTsid() {
		return this.tsid;
	}

	public void setTsid(int tsid) {
		this.tsid = tsid;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getVolume() {
		return this.volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public Timestamp getVremZagr() {
		return this.vremZagr;
	}

	public void setVremZagr(Timestamp vremZagr) {
		this.vremZagr = vremZagr;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}