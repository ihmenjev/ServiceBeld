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
 * The persistent class for the tblInvoicesProducts database table.
 * 
 */
@Entity
@Table(name = "tblInvoicesProducts")
public class InvoicesProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "AddTime")
	private Timestamp addTime;

	@Column(name = "Akziz")
	private double akziz;

	@Column(name = "Amount")
	private BigDecimal amount;

	@Column(name = "AmountWithNds")
	private double amountWithNds;

	@Column(name = "CenaEdSk")
	private double cenaEdSk;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JoinColumn(name = "InvoiceID")
	private Invoice invoice;

	@Column(name = "NdsAmount")
	private double ndsAmount;

	@Column(name = "NdsRate")
	private double ndsRate;

	@Column(name = "Ordinal")
	private int ordinal;

	@Column(name = "Price")
	private BigDecimal price;

	@Column(name = "Product")
	private String product;

	@Column(name = "Quantity")
	private double quantity;

	@Column(name = "SkidPr")
	private double skidPr;

	@Column(name = "Unit")
	private String unit;

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

	public double getAkziz() {
		return this.akziz;
	}

	public void setAkziz(double akziz) {
		this.akziz = akziz;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public double getAmountWithNds() {
		return this.amountWithNds;
	}

	public void setAmountWithNds(double amountWithNds) {
		this.amountWithNds = amountWithNds;
	}

	public double getCenaEdSk() {
		return this.cenaEdSk;
	}

	public void setCenaEdSk(double cenaEdSk) {
		this.cenaEdSk = cenaEdSk;
	}

	
	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public double getNdsAmount() {
		return this.ndsAmount;
	}

	public void setNdsAmount(double ndsAmount) {
		this.ndsAmount = ndsAmount;
	}

	public double getNdsRate() {
		return this.ndsRate;
	}

	public void setNdsRate(double ndsRate) {
		this.ndsRate = ndsRate;
	}

	public int getOrdinal() {
		return this.ordinal;
	}

	public void setOrdinal(int ordinal) {
		this.ordinal = ordinal;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
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

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}