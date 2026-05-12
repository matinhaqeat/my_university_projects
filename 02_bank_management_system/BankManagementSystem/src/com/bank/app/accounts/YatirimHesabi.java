package com.bank.app.accounts;

public class YatirimHesabi extends BankaHesabi{ 
	//data Fields:
	private String hesapTuru;
	
	//Constructors:
	public YatirimHesabi(double bakiye) {
		super(bakiye);
		hesapTuru = "yatirim";
	}
	
	public String getHesapTuru() {
		return hesapTuru;
	}
	public void paraEkle(double miktar) {
		this.setBakiye(this.getBakiye() + miktar);
	}
	public void paraCek(double miktar) {
		if(this.getBakiye()>=miktar) {
			this.setBakiye(this.getBakiye() - miktar);
		}
		else {
			System.out.println("YETERSIZ BAKIYE");
		}
	}

}
