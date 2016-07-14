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
 * The persistent class for the tblPayments database table.
 * 
 */
@Entity
@Table(name = "tblPayments")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "Act")
	private String act;

	@Column(name = "AddTime")
	private Timestamp addTime;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JoinColumn(name = "ClientID")
	private Contragent contragent;

	@Column(name = "ConfirmedBy")
	private String confirmedBy;

	@Column(name = "ConfirmedDate")
	private Timestamp confirmedDate;

	@Column(name = "ContractID")
	private int contractID;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JoinColumn(name = "InvoiceID")
	private Invoice invoice;

	@Column(name = "InvoiceNumber")
	private int invoiceNumber;

	@Column(name = "OrderID")
	private int orderID;

	@Column(name = "PaymentAmount")
	private BigDecimal paymentAmount;

	@Column(name = "PaymentCurrency")
	private String paymentCurrency;

	@Column(name = "PaymentDate")
	private Timestamp paymentDate;

	@Column(name = "PaymentDocument")
	private String paymentDocument;

	@Column(name = "PaymentNotes")
	private String paymentNotes;

	@Column(name = "PaymentState")
	private String paymentState;

	@Column(name = "PaymentType")
	private String paymentType;

	@Column(name = "PaySystem")
	private String paySystem;

	@Column(name = "Periodical")
	private String periodical;

	@Column(name = "SellerID")
	private int sellerID;

	@Column(name = "UserName")
	private String userName;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAct() {
		return this.act;
	}

	public void setAct(String act) {
		this.act = act;
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

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public String getConfirmedBy() {
		return this.confirmedBy;
	}

	public void setConfirmedBy(String confirmedBy) {
		this.confirmedBy = confirmedBy;
	}

	public Timestamp getConfirmedDate() {
		return this.confirmedDate;
	}

	public void setConfirmedDate(Timestamp confirmedDate) {
		this.confirmedDate = confirmedDate;
	}

	public int getContractID() {
		return this.contractID;
	}

	public void setContractID(int contractID) {
		this.contractID = contractID;
	}

	public int getInvoiceNumber() {
		return this.invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public int getOrderID() {
		return this.orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public BigDecimal getPaymentAmount() {
		return this.paymentAmount;
	}

	public void setPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentCurrency() {
		return this.paymentCurrency;
	}

	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	public Timestamp getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Timestamp paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentDocument() {
		return this.paymentDocument;
	}

	public void setPaymentDocument(String paymentDocument) {
		this.paymentDocument = paymentDocument;
	}

	public String getPaymentNotes() {
		return this.paymentNotes;
	}

	public void setPaymentNotes(String paymentNotes) {
		this.paymentNotes = paymentNotes;
	}

	public String getPaymentState() {
		return this.paymentState;
	}

	public void setPaymentState(String paymentState) {
		this.paymentState = paymentState;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPaySystem() {
		return this.paySystem;
	}

	public void setPaySystem(String paySystem) {
		this.paySystem = paySystem;
	}

	public String getPeriodical() {
		return this.periodical;
	}

	public void setPeriodical(String periodical) {
		this.periodical = periodical;
	}

	public int getSellerID() {
		return this.sellerID;
	}

	public void setSellerID(int sellerID) {
		this.sellerID = sellerID;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}