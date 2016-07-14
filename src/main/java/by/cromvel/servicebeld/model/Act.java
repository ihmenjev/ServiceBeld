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
 * The persistent class for the tblActs database table.
 * 
 */
@Entity
@Table(name = "tblActs")
public class Act {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "ActAmount")
	private double actAmount;

	@Column(name = "ActDate")
	private Timestamp actDate;

	@Column(name = "ActNDS")
	private double actNDS;

	@Column(name = "ActNum")
	private String actNum;

	@Column(name = "ActWithNds")
	private double actWithNds;

	@Column(name = "Client")
	private String client;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JoinColumn(name = "ClientID")
	private Contragent contragent;

	@Column(name = "ContractID")
	private int contractID;

	@Column(name = "ContractNumber")
	private String contractNumber;

	@Column(name = "Invoice")
	private String invoiceN;

	@Column(name = "InvoiceDate")
	private Timestamp invoiceDate;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JoinColumn(name = "InvoiceID")
	private Invoice invoice;

	@Column(name = "NotesAct")
	private String notesAct;

	@Column(name = "SrokAct")
	private String srokAct;

	@Column(name = "ValAct")
	private String valAct;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getActAmount() {
		return this.actAmount;
	}

	public void setActAmount(double actAmount) {
		this.actAmount = actAmount;
	}

	public Timestamp getActDate() {
		return this.actDate;
	}

	public void setActDate(Timestamp actDate) {
		this.actDate = actDate;
	}

	public double getActNDS() {
		return this.actNDS;
	}

	public void setActNDS(double actNDS) {
		this.actNDS = actNDS;
	}

	public String getActNum() {
		return this.actNum;
	}

	public void setActNum(String actNum) {
		this.actNum = actNum;
	}

	public double getActWithNds() {
		return this.actWithNds;
	}

	public void setActWithNds(double actWithNds) {
		this.actWithNds = actWithNds;
	}

	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Contragent getContragent() {
		return contragent;
	}

	public void setContragent(Contragent contragent) {
		this.contragent = contragent;
	}

	public int getContractID() {
		return this.contractID;
	}

	public void setContractID(int contractID) {
		this.contractID = contractID;
	}

	public String getContractNumber() {
		return this.contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public Timestamp getInvoiceDate() {
		return this.invoiceDate;
	}

	public void setInvoiceDate(Timestamp invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getNotesAct() {
		return this.notesAct;
	}

	public void setNotesAct(String notesAct) {
		this.notesAct = notesAct;
	}

	public String getSrokAct() {
		return this.srokAct;
	}

	public void setSrokAct(String srokAct) {
		this.srokAct = srokAct;
	}

	public String getValAct() {
		return this.valAct;
	}

	public void setValAct(String valAct) {
		this.valAct = valAct;
	}

	public String getInvoiceN() {
		return invoiceN;
	}

	public void setInvoiceN(String invoiceN) {
		this.invoiceN = invoiceN;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

}