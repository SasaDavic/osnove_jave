package p26_08_2022;

public class VisaKartica extends PlatnaKartica{


//	Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
//	 ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.
//	getter i setter za ovlasceno lice
//	konstruktor sa parametrima
//	  implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume. 
//	  Najmanja provizija moze biti $4.
//	  implementira metodu koja stampa podatke o kartici u formatu:
//		  Visa Card: 4012-1239-1221-3381, 11/2019, $212
	
	private String ovlascenoLice;
		
	
	public VisaKartica(double suma, String brKartice, int godinaIsteka, int mesecIsteka, String ovlascenoLice) {
		super(suma, brKartice, godinaIsteka, mesecIsteka);
		this.ovlascenoLice = ovlascenoLice;
	}

	public String getOvlascenoLice() {
		return ovlascenoLice;
	}

	public void setOvlascenoLice(String ovlascenoLice) {
		this.ovlascenoLice = ovlascenoLice;
	}
	
//	  implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume. 
//	  Najmanja provizija moze biti $4.
//	  implementira metodu koja stampa podatke o kartici u formatu:
//		  Visa Card: 4012-1239-1221-3381, 11/2019, $212
	
	public void izvrsiTransakcijuProvizija(double sumaProvizija) {
		if (sumaProvizija * 0.018 < 4) {
			sumaProvizija = sumaProvizija + 4;
		} else {
			sumaProvizija = sumaProvizija * 1.018;
		}
		
	}
//	  implementira metodu koja stampa podatke o kartici u formatu:
//	  Visa Card: 4012-1239-1221-3381, 11/2019, $212
	public void stampaj() {
		System.out.print("Visa Card: ");
		super.stampaj();
	}
	
}
