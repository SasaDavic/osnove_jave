package p25_08_2022;

import java.util.ArrayList;

public class FacebookPost {
//	Kreirati klasu FacebookPost koja ima:
//	ime i prezime korisnika koji je stavio oglas
//	tekst objave
//	niz reakcija
//	metodu reaguj, koja dodaje reakciju u niz
//	(modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post 
//	(tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
//	Primer: Milan - lajkuje
//		 Nemanja - lajkuje
//		 Milan - daje srce
//	Post ima lajk od Nemanje i srce od Milana.
//	privatnu metodu koja vraca broj reakcija odredjenog tipa 
//	(prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
	
	private Reakcija reakcija;
	private String textObjave;
	
	private ArrayList<Reakcija> reakcije = new ArrayList<Reakcija>();
	
	
	
	public FacebookPost(Reakcija reakcija, String textObjave) {
		this.textObjave = textObjave;
		this.reakcija = reakcija;
	}

	public void reaguj(Reakcija reakcija) {
		this.reakcije.add(reakcija);
	}
//	public void brisi(Reakcija imeKorisnika) {
//		for (int i = 0; i < this.reakcije.size(); i++) {
//			if (this.reakcije.get(i).getTipReakcije().equals(imeKorisnika)) {
//				this.reakcije.remove(i);
//				this.reakcija.set(i, this.reakcija.getTipReakcije(), imeKorisnika);
//			}
//		}
//	}
//	metodu stampaj koja stampa podatke u formatu:
//	ime i prezime
//	tekst objave
//	Smajli 10 | Like 15 | Srce 2
	
	
	public void stampaj() {
		System.out.println(this.reakcija.getImeKorisnika());
		System.out.println(this.textObjave);
		System.out.println("Smajli " + this.reakcija.getTipReakcije());
		
	}
	
}
