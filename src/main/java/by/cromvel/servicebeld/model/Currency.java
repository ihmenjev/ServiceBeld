package by.cromvel.servicebeld.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the tblCurrency database table.
 * 
 */
@Entity
@Table(name = "tblCurrency")
public class Currency {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "CurCode")
	private int curCode;

	@Column(name = "CurrencyName")
	private String currencyName;

	@Column(name = "Initials")
	private String initials;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCurCode() {
		return this.curCode;
	}

	public void setCurCode(int curCode) {
		this.curCode = curCode;
	}

	public String getCurrencyName() {
		return this.currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getInitials() {
		return this.initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

}