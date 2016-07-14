package by.cromvel.servicebeld.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the tblPayments2 database table.
 * 
 */
@Entity
@Table(name = "tblPayments2")
public class Payments2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "AmountPlat")
	private double amountPlat;

	@Column(name = "DatePlat")
	private Timestamp datePlat;

	@Column(name = "DocPlat")
	private String docPlat;

	@Column(name = "DogPlat")
	private String dogPlat;

	@Column(name = "FioP")
	private String fioP;

	@Column(name = "PlatelPlat")
	private String platelPlat;

	@Column(name = "RaSchet")
	private String raSchet;

	@Column(name = "SpPlat")
	private String spPlat;

	@Column(name = "StPlat")
	private String stPlat;

	@Column(name = "UserName")
	private String userName;

	@Column(name = "ValSchet")
	private String valSchet;

	@Column(name = "ZajPlat")
	private String zajPlat;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmountPlat() {
		return this.amountPlat;
	}

	public void setAmountPlat(double amountPlat) {
		this.amountPlat = amountPlat;
	}

	public Timestamp getDatePlat() {
		return this.datePlat;
	}

	public void setDatePlat(Timestamp datePlat) {
		this.datePlat = datePlat;
	}

	public String getDocPlat() {
		return this.docPlat;
	}

	public void setDocPlat(String docPlat) {
		this.docPlat = docPlat;
	}

	public String getDogPlat() {
		return this.dogPlat;
	}

	public void setDogPlat(String dogPlat) {
		this.dogPlat = dogPlat;
	}

	public String getFioP() {
		return this.fioP;
	}

	public void setFioP(String fioP) {
		this.fioP = fioP;
	}

	public String getPlatelPlat() {
		return this.platelPlat;
	}

	public void setPlatelPlat(String platelPlat) {
		this.platelPlat = platelPlat;
	}

	public String getRaSchet() {
		return this.raSchet;
	}

	public void setRaSchet(String raSchet) {
		this.raSchet = raSchet;
	}

	public String getSpPlat() {
		return this.spPlat;
	}

	public void setSpPlat(String spPlat) {
		this.spPlat = spPlat;
	}

	public String getStPlat() {
		return this.stPlat;
	}

	public void setStPlat(String stPlat) {
		this.stPlat = stPlat;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getValSchet() {
		return this.valSchet;
	}

	public void setValSchet(String valSchet) {
		this.valSchet = valSchet;
	}

	public String getZajPlat() {
		return this.zajPlat;
	}

	public void setZajPlat(String zajPlat) {
		this.zajPlat = zajPlat;
	}

}