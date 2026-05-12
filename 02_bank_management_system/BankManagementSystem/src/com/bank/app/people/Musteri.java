package com.bank.app.people;


import java.util.ArrayList;
import java.util.Random;

//importing other pakages: 
import com.bank.app.accounts.VadesizHesap;
import com.bank.app.accounts.YatirimHesabi;
import com.bank.app.accounts.BankaHesabi;
import com.bank.app.cards.KrediKarti;



public class Musteri extends Kisi{
	//Data fields: 
	private String musteriNumarasi;
	private ArrayList<BankaHesabi> hesaplar; 
	private ArrayList<KrediKarti> krediKartlari; 
	
	//Constructor:
	public Musteri(String ad, String soyad, String email, int telefonNumarasi) {
		super(ad, soyad, email, telefonNumarasi);
		musteriNumarasi = "A" + (new Random().nextInt(90000000) + 10000000);
		hesaplar = new ArrayList<>();
		krediKartlari = new ArrayList<>();
	}
	//Methods:
	public void hesapEkle(String hesapTuru) {
		if(hesapTuru.equals("vadesiz")) {
			hesaplar.add(new VadesizHesap(0));
		}
		else {
			hesaplar.add(new YatirimHesabi(0));
		}
	}
	
	public void krediKartiEkle(double limit) {
		krediKartlari.add(new KrediKarti(limit , 0));
	}	
	
	public ArrayList<KrediKarti> getKrediKartlari() {
	    return this.krediKartlari;
	}
	
	public void hesapSil(BankaHesabi hesap) {
		if(hesap.getBakiye()<=0) {
			hesaplar.remove(hesap);
		}
		else {
			System.out.println("Lütfen öncelikle bakiyenizi başka bir hesaba aktarınız.");
		}
	}
	public void krediKartiSil(KrediKarti kart) {
		if(kart.getGuncelBorc()<=0) {
			krediKartlari.remove(kart);
		}
		else {
			System.out.println("Oncelikle borcunuzun odenmesi rica olunur!");
		}
	}	
	public ArrayList<BankaHesabi> getHesaplar() {
	    return hesaplar;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + "Musteri NO: " + musteriNumarasi; 
	}
	
	
		
	
	


}
