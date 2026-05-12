package com.bank.app.people; 

import java.util.Random;
import java.util.ArrayList;

public class BankaPersoneli extends Kisi{ 
	//Data fields: 
	Random rand = new Random(); 
	private String personelID;
	private ArrayList<Musteri> musteriler = new ArrayList<>();
	
	//Constructor: 
	public BankaPersoneli(String ad, String soyad, String email, int telefonNumarasi) {
		super(ad, soyad, email, telefonNumarasi);
		personelID = "ID" + (rand.nextInt(900000) + 100000);
	}
		
	//Getter function: 
	public ArrayList<Musteri> getMusteri() {
		return musteriler;
	}
	
	//toString method;
	@Override
	public String toString() {
		return super.toString() + "\n" + "Personel ID: " + personelID ;
	}

}
