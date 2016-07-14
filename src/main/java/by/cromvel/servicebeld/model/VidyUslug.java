package by.cromvel.servicebeld.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the tblVidyUslug database table.
 * 
 */
@Entity
@Table(name = "tblVidyUslug")
public class VidyUslug {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "EdIzm")
	private String edIzm;

	@Column(name = "Ordinal")
	private int ordinal;

	@Column(name = "ProductP")
	private String productP;

	@Column(name = "ProductS")
	private String productS;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEdIzm() {
		return this.edIzm;
	}

	public void setEdIzm(String edIzm) {
		this.edIzm = edIzm;
	}

	public int getOrdinal() {
		return this.ordinal;
	}

	public void setOrdinal(int ordinal) {
		this.ordinal = ordinal;
	}

	public String getProductP() {
		return this.productP;
	}

	public void setProductP(String productP) {
		this.productP = productP;
	}

	public String getProductS() {
		return this.productS;
	}

	public void setProductS(String productS) {
		this.productS = productS;
	}

}