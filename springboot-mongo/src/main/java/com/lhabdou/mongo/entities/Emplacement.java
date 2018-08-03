package com.lhabdou.mongo.entities;

public class Emplacement {
	
	private String pays; 
	
	private String country;

	
	
	public Emplacement(String pays, String country) {
		super();
		this.pays = pays;
		this.country = country;
	}



	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}



	/**
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}



	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}



	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	

}
