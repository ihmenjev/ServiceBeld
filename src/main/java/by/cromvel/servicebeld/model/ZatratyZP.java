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
 * The persistent class for the tblZatratyZP database table.
 * 
 */
@Entity
@Table(name = "tblZatratyZP")

public class ZatratyZP {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "DateVidZP")
	private Timestamp dateVidZP;

	@Column(name = "PeriodZPD")
	private Timestamp periodZPD;

	@Column(name = "PeriodZPS")
	private Timestamp periodZPS;

	@Column(name = "PrimechZP")
	private String primechZP;

	@Column(name = "SummZPItog")
	private double summZPItog;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JoinColumn(name = "UserName")
	private Employee userName;

	@Column(name = "VidannZPBN")
	private double vidannZPBN;

	@Column(name = "VidannZPN")
	private double vidannZPN;

	@Column(name = "VidZatrZP")
	private String vidZatrZP;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDateVidZP() {
		return this.dateVidZP;
	}

	public void setDateVidZP(Timestamp dateVidZP) {
		this.dateVidZP = dateVidZP;
	}

	public Timestamp getPeriodZPD() {
		return this.periodZPD;
	}

	public void setPeriodZPD(Timestamp periodZPD) {
		this.periodZPD = periodZPD;
	}

	public Timestamp getPeriodZPS() {
		return this.periodZPS;
	}

	public void setPeriodZPS(Timestamp periodZPS) {
		this.periodZPS = periodZPS;
	}

	public String getPrimechZP() {
		return this.primechZP;
	}

	public void setPrimechZP(String primechZP) {
		this.primechZP = primechZP;
	}

	public double getSummZPItog() {
		return this.summZPItog;
	}

	public void setSummZPItog(double summZPItog) {
		this.summZPItog = summZPItog;
	}

	
	
	public Employee getUserName() {
		return userName;
	}

	public void setUserName(Employee userName) {
		this.userName = userName;
	}

	public double getVidannZPBN() {
		return this.vidannZPBN;
	}

	public void setVidannZPBN(double vidannZPBN) {
		this.vidannZPBN = vidannZPBN;
	}

	public double getVidannZPN() {
		return this.vidannZPN;
	}

	public void setVidannZPN(double vidannZPN) {
		this.vidannZPN = vidannZPN;
	}

	public String getVidZatrZP() {
		return this.vidZatrZP;
	}

	public void setVidZatrZP(String vidZatrZP) {
		this.vidZatrZP = vidZatrZP;
	}

}