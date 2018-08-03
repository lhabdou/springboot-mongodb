package com.lhabdou.mongo.entities;

public class Racine {
	
	private String identifiant;
	
	private Integer circonference; 
	
	private Boolean vivante;

	/**
	 * @return the identifiant
	 */
	public String getIdentifiant() {
		return identifiant;
	}

	/**
	 * @param identifiant the identifiant to set
	 */
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	/**
	 * @return the circonference
	 */
	public Integer getCirconference() {
		return circonference;
	}

	/**
	 * @param circonference the circonference to set
	 */
	public void setCirconference(Integer circonference) {
		this.circonference = circonference;
	}

	/**
	 * @return the vivante
	 */
	public Boolean getVivante() {
		return vivante;
	}

	/**
	 * @param vivante the vivante to set
	 */
	public void setVivante(Boolean vivante) {
		this.vivante = vivante;
	}

	public Racine(String identifiant, Integer circonference, Boolean vivante) {
		super();
		this.identifiant = identifiant;
		this.circonference = circonference;
		this.vivante = vivante;
	}



}
