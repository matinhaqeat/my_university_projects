package com.bank.app.cards;
import java.util.Random; 

public class KrediKarti {
	//data Fields:
	private String kartNumarasi;
	private double limit;
	private double guncelBorc;
	private double kullanilabilirLimit;
	
	//Constructor:
	public KrediKarti (double limit, double guncelBorc) {
		kartNumarasi = String.valueOf(new Random().nextInt(90000000) + 10000000); 
		this.limit = limit;
		this.guncelBorc = guncelBorc;
	}
	//Getters and Setters:
	public String  getKartNumarasi() {
		return kartNumarasi;
	}
	public double getLimit() {
		return limit;
	}
	public double getGuncelBorc() {
		return guncelBorc;
	}
	public double getKullanilabilirLimit() {
		return kullanilabilirLimit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	public void setGuncelBorc(double guncelBorc) {
		this.guncelBorc = guncelBorc;
	}
	public void setKullanilabilirLimit(double kullanilabilirLimit) {
		this.kullanilabilirLimit = kullanilabilirLimit;
	}
	//toString method:
	public String toString() {
		return  "Kart Numarasi: " + kartNumarasi + "\n" +
			    "Limit: " + limit + "\n" + 
				"Guncel Borc: " + guncelBorc + "\n" + 
			    "Kullanilabilir Limit: " + (limit - guncelBorc);
	}
	
}
