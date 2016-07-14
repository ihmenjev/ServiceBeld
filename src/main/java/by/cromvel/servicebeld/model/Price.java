package by.cromvel.servicebeld.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the tblPrice database table.
 * 
 */
@Entity
@Table(name = "tblPrice")
public class Price {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "CenaItog")
	private double cenaItog;

	@Column(name = "CenaKM")
	private double cenaKM;

	@Column(name = "Massa")
	private String massa;

	@Column(name = "Ordinal")
	private int ordinal;

	@Column(name = "VidUslug")
	private String vidUslug;

	@Column(name = "Volume")
	private String volume;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCenaItog() {
		return this.cenaItog;
	}

	public void setCenaItog(double cenaItog) {
		this.cenaItog = cenaItog;
	}

	public double getCenaKM() {
		return this.cenaKM;
	}

	public void setCenaKM(double cenaKM) {
		this.cenaKM = cenaKM;
	}

	public String getMassa() {
		return this.massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public int getOrdinal() {
		return this.ordinal;
	}

	public void setOrdinal(int ordinal) {
		this.ordinal = ordinal;
	}

	public String getVidUslug() {
		return this.vidUslug;
	}

	public void setVidUslug(String vidUslug) {
		this.vidUslug = vidUslug;
	}

	public String getVolume() {
		return this.volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

}