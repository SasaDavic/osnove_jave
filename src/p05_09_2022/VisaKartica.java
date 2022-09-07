package p05_09_2022;

public class VisaKartica extends PlatnaKartica{
//	  Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
//	 ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.
//	getter i setter za ovlasceno lice
//	konstruktor sa parametrima

	
	private String ovlascenoLice;

public VisaKartica(double sumaDolari, String brKartice, int godinaIsteka, int mesecIsteka, String ovlascenoLice) {
	super(sumaDolari, brKartice, godinaIsteka, mesecIsteka);
	this.ovlascenoLice = ovlascenoLice;
}

public String getOvlascenoLice() {
	return ovlascenoLice;
}

public void setOvlascenoLice(String ovlascenoLice) {
	this.ovlascenoLice = ovlascenoLice;
}
	
//implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume. 
//Najmanja provizija moze biti $4.


public void izvrsiTransakciju(double isplata) {
	int x = 0;
	if (isplata * 0.018 < 4) {
		x = 4;
		this.sumaDolari -= (4 + isplata);
	} else {
		this.sumaDolari -= (isplata * 0.018 + isplata);
	}
}
//implementira metodu koja stampa podatke o kartici u formatu:
//Visa Card: 4012-1239-1221-3381, 11/2019, $212

public void stampaj() {
	System.out.println("Visa Card: " + this.brKartice + ", " + this.mesecIsteka + "/" + this.godinaIsteka + ", $" + this.sumaDolari);
}






	
}
