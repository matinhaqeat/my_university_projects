package com.bank.app.people;

public class Kisi {
	//the variables:
	private String ad; 
	private String soyad;
	private String email;
	private int telefonNumarasi;
	
	//constructors: 
	public Kisi(String ad, String soyad, String email, int telefonNumarasi) {
		this.ad = ad; 
		this.soyad = soyad;
		this.email = email;
		this.telefonNumarasi = telefonNumarasi;
	}
	//automatically generated Setters and Getters:
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefonNumarasi() {
		return telefonNumarasi;
	}

	public void setTelefonNumarasi(int telefonNumarasi) {
		this.telefonNumarasi = telefonNumarasi;
	}

	//override toString method:
	@Override
	public String toString() {
		String r = "";
		r = "Ad:" + ad +"\n" +
			"Soyad:" + soyad + "\n" +
			"Email: " + email + "\n" +
			"Telefon numarasi: " + telefonNumarasi;
		return r;
	}

	
}
