package com.bank.app.accounts;
import java.util.Random;

public class BankaHesabi {
	//data fields: 
	private String iban; 
	private double bakiye;
	
	//constructor: 
	public BankaHesabi(double bakiye) {
		this.bakiye = bakiye;
		
		//creating random IBAN:
		iban = "TR";
		Random rand = new Random();
		
		for(int i=0; i<24; i++) {
			char temp = (char) ('0' + rand.nextInt(10));
			iban += temp;
		}
		
	}
	//methods: 
	@Override
	public String toString() {
		return "IBAN: " + iban + "\n" + "Bakiye: " + bakiye; 	 
	}
	//Getters and Setters:
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public double getBakiye() {
		return bakiye;
	}
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	
	
}
