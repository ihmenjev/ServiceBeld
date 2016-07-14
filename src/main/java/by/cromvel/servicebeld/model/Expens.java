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
 * The persistent class for the tblExpenses database table.
 * 
 */
@Entity
@Table(name = "tblExpenses")
public class Expens {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "Contract")
	private String contract;

	@Column(name = "ExpenseAmount")
	private double expenseAmount;

	@Column(name = "ExpenseNotes")
	private String expenseNotes;

	@Column(name = "Zajavka")
	private String zajavka;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JoinColumn(name = "ZajavRBID")
	private OrderRB orderRB;

	@ManyToOne(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JoinColumn(name = "ZajavSNGID")
	private OrderSNG orderSNG;

	@Column(name = "ZatrProch")
	private double zatrProch;

	@Column(name = "ZatrTip")
	private double zatrTip;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContract() {
		return this.contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public double getExpenseAmount() {
		return this.expenseAmount;
	}

	public void setExpenseAmount(double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}

	public String getExpenseNotes() {
		return this.expenseNotes;
	}

	public void setExpenseNotes(String expenseNotes) {
		this.expenseNotes = expenseNotes;
	}

	public String getZajavka() {
		return this.zajavka;
	}

	public void setZajavka(String zajavka) {
		this.zajavka = zajavka;
	}

	public OrderRB getOrderRB() {
		return orderRB;
	}

	public void setOrderRB(OrderRB orderRB) {
		this.orderRB = orderRB;
	}

	public OrderSNG getOrderSNG() {
		return orderSNG;
	}

	public void setOrderSNG(OrderSNG orderSNG) {
		this.orderSNG = orderSNG;
	}

	public double getZatrProch() {
		return this.zatrProch;
	}

	public void setZatrProch(double zatrProch) {
		this.zatrProch = zatrProch;
	}

	public double getZatrTip() {
		return this.zatrTip;
	}

	public void setZatrTip(double zatrTip) {
		this.zatrTip = zatrTip;
	}

}