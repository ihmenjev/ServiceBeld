package by.cromvel.servicebeld.model;

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
 * The persistent class for the tblActUslugi database table.
 * 
 */
@Entity
@Table(name = "tblActUslugi")
public class ActsProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JoinColumn(name = "ActID")
	private Act act;

	@Column(name = "CenaEd")
	private double cenaEd;

	@Column(name = "CenaEdSk")
	private double cenaEdSk;

	@Column(name = "EdIzm")
	private String edIzm;

	@Column(name = "ObStsNDS")
	private double obStsNDS;

	@Column(name = "Ordinal")
	private int ordinal;

	@Column(name = "OtpStoim")
	private double otpStoim;

	@Column(name = "ProductId")
	private int productId;

	@Column(name = "Quantity")
	private double quantity;

	@Column(name = "SkidPr")
	private double skidPr;

	@Column(name = "StNDS")
	private double stNDS;

	@Column(name = "SumNDS")
	private double sumNDS;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCenaEd() {
		return this.cenaEd;
	}

	public void setCenaEd(double cenaEd) {
		this.cenaEd = cenaEd;
	}

	public double getCenaEdSk() {
		return this.cenaEdSk;
	}

	public void setCenaEdSk(double cenaEdSk) {
		this.cenaEdSk = cenaEdSk;
	}

	public String getEdIzm() {
		return this.edIzm;
	}

	public void setEdIzm(String edIzm) {
		this.edIzm = edIzm;
	}

	public double getObStsNDS() {
		return this.obStsNDS;
	}

	public void setObStsNDS(double obStsNDS) {
		this.obStsNDS = obStsNDS;
	}

	public int getOrdinal() {
		return this.ordinal;
	}

	public void setOrdinal(int ordinal) {
		this.ordinal = ordinal;
	}

	public double getOtpStoim() {
		return this.otpStoim;
	}

	public void setOtpStoim(double otpStoim) {
		this.otpStoim = otpStoim;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getSkidPr() {
		return this.skidPr;
	}

	public void setSkidPr(double skidPr) {
		this.skidPr = skidPr;
	}

	public double getStNDS() {
		return this.stNDS;
	}

	public void setStNDS(double stNDS) {
		this.stNDS = stNDS;
	}

	public double getSumNDS() {
		return this.sumNDS;
	}

	public void setSumNDS(double sumNDS) {
		this.sumNDS = sumNDS;
	}

}