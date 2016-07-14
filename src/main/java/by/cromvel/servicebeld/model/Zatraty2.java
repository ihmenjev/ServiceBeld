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
 * The persistent class for the tblZatraty2 database table.
 * 
 */
@Entity
@Table(name = "tblZatraty2")
public class Zatraty2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "DateSpis")
	private Timestamp dateSpis;

	@Column(name = "DateVidach")
	private Timestamp dateVidach;

	@Column(name = "PrimZatr2")
	private String primZatr2;

	@Column(name = "SumVidann")
	private double sumVidann;

	@Column(name = "SumVozvr")
	private double sumVozvr;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JoinColumn(name = "UserName")
	private Employee userName;

	@Column(name = "VidZatr2")
	private String vidZatr2;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDateSpis() {
		return this.dateSpis;
	}

	public void setDateSpis(Timestamp dateSpis) {
		this.dateSpis = dateSpis;
	}

	public Timestamp getDateVidach() {
		return this.dateVidach;
	}

	public void setDateVidach(Timestamp dateVidach) {
		this.dateVidach = dateVidach;
	}

	public String getPrimZatr2() {
		return this.primZatr2;
	}

	public void setPrimZatr2(String primZatr2) {
		this.primZatr2 = primZatr2;
	}

	public double getSumVidann() {
		return this.sumVidann;
	}

	public void setSumVidann(double sumVidann) {
		this.sumVidann = sumVidann;
	}

	public double getSumVozvr() {
		return this.sumVozvr;
	}

	public void setSumVozvr(double sumVozvr) {
		this.sumVozvr = sumVozvr;
	}

	

	public Employee getUserName() {
		return userName;
	}

	public void setUserName(Employee userName) {
		this.userName = userName;
	}

	public String getVidZatr2() {
		return this.vidZatr2;
	}

	public void setVidZatr2(String vidZatr2) {
		this.vidZatr2 = vidZatr2;
	}

}