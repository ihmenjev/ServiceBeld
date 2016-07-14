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
 * The persistent class for the tblInvoices database table.
 * 
 */
@Entity
@Table(name = "tblInvoices")
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "AddTime")
	private Timestamp addTime;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JoinColumn(name = "ClientID")
	private Contragent contragent;

	@Column(name = "ContractID")
	private int contractID;

	@Column(name = "DeliveryDate")
	private Timestamp deliveryDate;

	@Column(name = "InvoiceAmount")
	private BigDecimal invoiceAmount;

	@Column(name = "InvoiceCurrency")
	private String invoiceCurrency;

	@Column(name = "InvoiceDate")
	private Timestamp invoiceDate;

	@Column(name = "InvoiceNotes")
	private String invoiceNotes;

	@Column(name = "InvoiceNumber")
	private int invoiceNumber;

	@Column(name = "InvoicePath")
	private String invoicePath;

	@Column(name = "InvoiceState")
	private String invoiceState;

	@Column(name = "InvoiceType")
	private String invoiceType;

	@Column(name = "PaymentDate")
	private Timestamp paymentDate;

	@Column(name = "RecivingPerson")
	private String recivingPerson;

	@Column(name = "SellerID")
	private int sellerID;

	@Column(name = "SrokSchet")
	private String srokSchet;

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinColumn(name = "UserName")
	private Employee userName;

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

	public Contragent getContragent() {
		return contragent;
	}

	public void setContragent(Contragent contragent) {
		this.contragent = contragent;
	}

	public void setUserName(Employee userName) {
		this.userName = userName;
	}

	public int getContractID() {
		return this.contractID;
	}

	public void setContractID(int contractID) {
		this.contractID = contractID;
	}

	public Timestamp getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(Timestamp deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public BigDecimal getInvoiceAmount() {
		return this.invoiceAmount;
	}

	public void setInvoiceAmount(BigDecimal invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceCurrency() {
		return this.invoiceCurrency;
	}

	public void setInvoiceCurrency(String invoiceCurrency) {
		this.invoiceCurrency = invoiceCurrency;
	}

	public Timestamp getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceDate(Timestamp invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceNotes() {
		return this.invoiceNotes;
	}

	public void setInvoiceNotes(String invoiceNotes) {
		this.invoiceNotes = invoiceNotes;
	}

	public int getInvoiceNumber() {
		return this.invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getInvoicePath() {
		return this.invoicePath;
	}

	public void setInvoicePath(String invoicePath) {
		this.invoicePath = invoicePath;
	}

	public String getInvoiceState() {
		return this.invoiceState;
	}

	public void setInvoiceState(String invoiceState) {
		this.invoiceState = invoiceState;
	}

	public String getInvoiceType() {
		return this.invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public Timestamp getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Timestamp paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getRecivingPerson() {
		return this.recivingPerson;
	}

	public void setRecivingPerson(String recivingPerson) {
		this.recivingPerson = recivingPerson;
	}

	public int getSellerID() {
		return this.sellerID;
	}

	public void setSellerID(int sellerID) {
		this.sellerID = sellerID;
	}

	public String getSrokSchet() {
		return this.srokSchet;
	}

	public void setSrokSchet(String srokSchet) {
		this.srokSchet = srokSchet;
	}

}