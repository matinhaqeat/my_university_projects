package com.bank.app.main;

import com.bank.app.accounts.VadesizHesap;
import com.bank.app.cards.KrediKarti;
import com.bank.app.people.Musteri;
import com.bank.app.service.BankaService;
import com.bank.app.people.BankaPersoneli;

public class Test {

	public static void main(String[] args) {
		BankaService service = new BankaService();
		//creating Musteri: 
		System.out.println("Creating User...");
		Musteri musteri1 = service.musteriOlustur("Abdul Matin", "DEMIR", "demirabdulmatin@gmail.com", 5514812);
		System.out.println(musteri1);
		
		//Creating personal and adding users to them: 
		System.out.println("\n\n\nBanka Personeli olusturmaktadir...");
		BankaPersoneli personel1 = new BankaPersoneli("Ali", "YILMAZ", "yilmazali123@gmail.com", 5518929);
		System.out.println(personel1);
		personel1.getMusteri().add(musteri1);
		
		//opening account:
		System.out.println("\n\n\nHesap acilmaktadir...");
		service.hesapAc(musteri1, "vadesiz");
		
		//adding money:
		System.out.println("Para yatirilmaktadir...");
		VadesizHesap hesap1 = (VadesizHesap) musteri1.getHesaplar().get(0);
		service.paraYatir(hesap1, 1000);
		System.out.print(hesap1);
		
		//transferring Money: 
		System.out.println("Para transferi gerceklestirilmektedir!");
		service.hesapAc(musteri1, "vadesiz");
		VadesizHesap hesap2 = (VadesizHesap) musteri1.getHesaplar().get(1);
		service.paraTransferi(hesap1, hesap2, 1000);
		System.out.println("\n\n\nPara Gonderme:");
		System.out.println("\nGonderen Hesap:");
		System.out.println(hesap1);
		System.out.println("\nAlinan Hesap:");
		System.out.println(hesap2);
		System.out.println("\nGonderilen Miktar: " + 1000);
		
		//tasks related to credit card:
		System.out.println("\n\n\nKredi Kart tanimlanmaktadir...");
		service.krediKartTanimla(musteri1, 10000);
		KrediKarti kart = musteri1.getKrediKartlari().get(0);
		
		//paying the lent money:
		System.out.println("\n\n\nalinan borc odenmektedir...");
		kart.setGuncelBorc(500);
		service.borcOde(hesap1, kart, 100);
		System.out.println(kart);
		
		//deleting the account: 
		System.out.println("\n\n\nAcilan hesap silinmektedir...");
		service.hesapSil(musteri1, hesap2);
		
		
		
	}

}
