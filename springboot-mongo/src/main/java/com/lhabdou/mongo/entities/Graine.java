/**
 * 
 */
package com.lhabdou.mongo.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author asoilihi
 *
 */
@Document(collection="Graines")
public class Graine {
	
	@Id
	private String id; 
	
	private String nom; 
	
	private Date date; 
	
	private List<Racine> racines; 
	
	private Double prix; 
	
	private Emplacement emplacement;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the racines
	 */
	public List<Racine> getRacines() {
		return racines;
	}

	/**
	 * @param racines the racines to set
	 */
	public void setRacines(List<Racine> racines) {
		this.racines = racines;
	}

	/**
	 * @return the prix
	 */
	public Double getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(Double prix) {
		this.prix = prix;
	}

	/**
	 * @return the emplacement
	 */
	public Emplacement getEmplacement() {
		return emplacement;
	}

	/**
	 * @param emplacement the emplacement to set
	 */
	public void setEmplacement(Emplacement emplacement) {
		this.emplacement = emplacement;
	}

	public Graine(String nom, Date date, List<Racine> racines, Double prix, Emplacement emplacement) {
		super();
		this.nom = nom;
		this.date = date;
		this.racines = racines;
		this.prix = prix;
		this.emplacement = emplacement;
	}

}
