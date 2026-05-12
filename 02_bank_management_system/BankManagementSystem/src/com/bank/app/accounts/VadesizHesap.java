package com.bank.app.accounts;

import com.bank.app.cards.KrediKarti;

public class VadesizHesap extends BankaHesabi{
	//Data fields: 
	private String hesapTuru;
	
	//constructor: 
	public VadesizHesap(double bakiye) {
		super(bakiye);
		hesapTuru = "vadesiz"; 
	}
	
	//Getter Method: 
	public String getHesapTuru() {
		return hesapTuru;
	}
	
	//important methods: 
	public void paraTransferi(BankaHesabi aliciHesap, BankaHesabi gonderenHesap, double miktar) {
		gonderenHesap.setBakiye(gonderenHesap.getBakiye() - miktar);
		aliciHesap.setBakiye(aliciHesap.getBakiye() + miktar);
	}
	
	public void kredikartiBorcOdeme(KrediKarti kart, double miktar) {
		this.setBakiye(this.getBakiye() - miktar);
		kart.setGuncelBorc(kart.getGuncelBorc() - miktar);
		
	}
	
	
	
	
	//toString fth: 
	@Override
	public String toString() {
		return super.toString() + "\n" + "Hesap Turu: " + getHesapTuru();
	}
	
}
