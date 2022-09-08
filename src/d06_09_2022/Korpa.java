package d06_09_2022;

import java.util.ArrayList;

public class Korpa {
//	Kreirati klasu Korpa koja ima:
//	niz ambalaza
//	metodu dodaj ambalazu
//	metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti

	
	private Ambalaza ambalaza;
	private SuperKartica kartica;
	private ArrayList<Ambalaza> niz = new ArrayList<Ambalaza>();
	
	public void dodajAmbalazu(Ambalaza ambalaza) {
		niz.add(ambalaza);
	}
	public void izbaciAmbalazu(String barkod1) {
		for (int i = 0; i < niz.size(); i++) {
			if(niz.get(i).barkod.equals(barkod1)) {
				niz.remove(i);
			}
		}
	}
//	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se 
//	prima Super karticu iz koje se cita popust.
	
	
	private double cenuSvihAmbalazaSaPopustom(double popust) {
		double s = 0;
		for (int i = 0; i < this.niz.size(); i++) {
			s += this.niz.get(i).cena();
		}
		return s - popust;
	}
	
	public double ukupnaCenuKorpe (SuperKartica superKartica) {
		double p = superKartica.getPopust();
		System.out.println("Racun: " + this.cenuSvihAmbalazaSaPopustom(p));
		return this.cenuSvihAmbalazaSaPopustom(p);
	}
	
	
	
	
	
	
}
