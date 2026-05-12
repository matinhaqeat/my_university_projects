package com.bank.app.service;

import com.bank.app.accounts.BankaHesabi;
import com.bank.app.accounts.VadesizHesap;
import com.bank.app.cards.KrediKarti;
import com.bank.app.people.Musteri;

public class BankaService {
	//musteri olusturma:
	public Musteri musteriOlustur(String ad, String soyad, String email, int telefonNumarasi) {
		return new Musteri(ad,soyad,email,telefonNumarasi);
	}
	//yaratilan musteri icin hesap acma:
	public void hesapAc(Musteri musteri, String hesapTuru) {
		musteri.hesapEkle(hesapTuru);
	}
	//acilan hesapa para yatirma
	public void paraYatir(BankaHesabi hesap, double miktar) {
		hesap.setBakiye(hesap.getBakiye() + miktar);
	}
	//hesaplar icin para trasferi:
	public void paraTransferi(VadesizHesap gonderenHesap, BankaHesabi aliciHesap, double miktar) {
		gonderenHesap.paraTransferi(aliciHesap, gonderenHesap, miktar);
	}
	//kredikarti tanimlama:
	public void krediKartTanimla(Musteri musteri, double limit) {
		musteri.krediKartiEkle(limit);
	}
	//borc odeme:
	public void borcOde(VadesizHesap hesap, KrediKarti kart, double miktar) {
		hesap.kredikartiBorcOdeme(kart, miktar);
	}
	//hesapsilme:
	public void hesapSil(Musteri musteri, BankaHesabi hesap) {
		musteri.hesapSil(hesap);
	}
}
