package p05_09_2022;

public class MasterKartica extends PlatnaKartica{

		
//	Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
//	  konstruktor sa parametrima
//	  implementira metodu koja vrsi transakciju, tako da na prosledjenu sumu dodaje proviziju od 1.5 
//	  posto na sumu.
//	  metoda naplatiOdrzavanje, koja sa racuna skida $2.

	public MasterKartica(double sumaDolari, String brKartice, int godinaIsteka, int mesecIsteka) {
		super(sumaDolari, brKartice, godinaIsteka, mesecIsteka);
	}
	
	public void izvrsiTransakciju(double isplata) {
		this.sumaDolari -= (isplata * 1.015);
	}
	
	public void naplatiOdrzavanje() {
		this.sumaDolari -= 2;
	}
	
//	  implementira metodu koja stampa podatke o kartici u formatu:
//	  Master Card: 12/2019, 4012-1239-1221-3381, $232

	public void stampaj() {
		System.out.println("Master Card: " + this.mesecIsteka + "/" + this.godinaIsteka + ", " + this.brKartice + ", $" + this.sumaDolari);
	}
	
	
	
	
	
	
	
	
	
}
