package p22_08_2022;

public class YoutubePlayer {
//	Kreirati klasu YoutubePlayer koja ima:
//		svi atributi su private
//		objekat video
//		kvalitet videa (moze da bude 144, 240, 360, 480, 720, 1080)
//		rezim koji moze da bude - mini player , bioskopski rezim , preko celog ekrana
//		jacinu zvuka
//		trenutno vreme videa u reprodukciji
//		gettere za sve atribute
	
	
	private Video video;
	private int kvalitetVidea; ///144, 240, 360, 480, 720, 1080
	private String rezim;  ///mini player , bioskopski rezim , preko celog ekrana
	private int jacinaZvuka;
	private int trenutnoVremeReprodukcije;
	
	
	public void setVideo(Video video) {
		this.video = video;
	}
	public Video getVideo() {
		return video;
	}
	public int getKvalitetVidea() {
		return kvalitetVidea;
	}
	public String getRezim() {
		return rezim;
	}
	public int getJacinaZvuka() {
		return jacinaZvuka;
	}
	public int getTrenutnoVremeReprodukcije() {
		return trenutnoVremeReprodukcije;
	}
//	samo difoltni konstuktor, i njemu se svuk postavlja na 75 i
//	kvalitet po difoltu na 144 kao i rezim na mini player.
	public YoutubePlayer() {
		this.jacinaZvuka = 75;
		this.kvalitetVidea = 144;
		this.rezim = "mini player";
	}
////	metodu ucitajVideo kojoj se prosledjuje referenca do videa koji se pusta. 
//	Trenutno vreme kada se ucita video se postavlja na nulu. Treba videu da povecamo broj pregleda!
	
	public void ucitajVideo() {
		this.trenutnoVremeReprodukcije = 0;
		this.video.pogledaj();
	}
//	metodu pojacaj- koja povecava jacinu zvuka za 10. Znate da morate da vodite racuna da ne predje 100.
//	metodu smanji - koja smanjuje jacinu zvuka za 10 (da ne padne ispod nule)
	public void pojacaj() {
		this.jacinaZvuka += 10;
		if (this.jacinaZvuka > 100) {
			this.jacinaZvuka = 100;
		}
	}
	public void smanji() {
		this.jacinaZvuka -= 10;
		if (this.jacinaZvuka < 0) {
			this.jacinaZvuka = 0;
		}
	}
//	metodu postaviKvalitet - metoda kao parametar prima brzinu interneta u megbajtima.
//	Ako je brzina interneta ispod 2Mb -> kvalitet je 144
//	Ako je brzina interneta do 4Mb -> kvalitet je 240
//	Ako je brzina interneta do 6Mb -> kvalitet je 360
//	Ako je brzina interneta do 8Mb -> kvalitet je 720
//	Ako je brzina interneta preko 8Mb -> kvalitet je 1080
	public void postaviKvalitet (int brzinaInterneta) {
		if (brzinaInterneta < 2) {
			this.kvalitetVidea = 144;
		} else if (brzinaInterneta < 4) {
			this.kvalitetVidea = 240;
		} else if (brzinaInterneta < 6) {
			this.kvalitetVidea = 360;
		} else if (brzinaInterneta < 8) {
			this.kvalitetVidea = 720;
		} else {
			this.kvalitetVidea = 1080;
		}
	}
	
//		metodu aktivirajMiniPlayerMod - koja postavlja rezim na mini player
	public void aktivirajMiniPlayerMod() {
		this.rezim = "mini player";
	}
		
//		metodu aktivirajBioskopskiMod -  koja postavlja bioskopski rezim
	public void aktivirajBioskopskiMod() {
		this.rezim = "bioskopski rezim";
	}
	
//		metodu aktivirajPrekoCelogEkranaMod -  koja postavlja rezim preko celog ekrana
	public void aktivirajPrekoCelogEkranaMod() {
		this.rezim = "rezim preko celog ekrana";
	}	
//		metodu premotajUnapred - metoda koja premotava trenutno vreme videa za 10s. 
//	Vodite racuna da ne predjete duzinu videa.
	public void premotajUnapred() {
		this.trenutnoVremeReprodukcije += 10;
		if (this.trenutnoVremeReprodukcije > this.video.getDuzinaVideaS()) {
			this.trenutnoVremeReprodukcije = this.video.getDuzinaVideaS();
		}
	}
	
//		metodu premotajUnazad - metoda vraca trenutno vreme videa za 10s. Vodite racuna da ne padnete ispod nule
	public void remotajUnazad() {
		this.trenutnoVremeReprodukcije -= 10;
		if (this.trenutnoVremeReprodukcije < 0) {
			this.trenutnoVremeReprodukcije = 0;
		}
	}
	
//		iscrtajZvuk - metoda koja ispisuje tekst koji simulira jacinu zvuka. Svaka crtica predstavlja jecinu od 10.
//		Pa ako je jacina zvuka 75 - crtamo 7 crtica
//		Primer stampe je:   <: |||||||
//		Ako je jecina zvuka 32
//		Primer stampe je: <: |||
//		Ako je jacina nula
//		Onda stampamo </
//		[HELP] Broj crtica mozete da dobijete kao brCrtica = jacina zvuka / 10;

	
	public void iscrtajZvuk() {
		int n = this.jacinaZvuka / 10;
		if (n == 0) {
			System.out.print("</");
		} else if (n > 0) {
			System.out.print("<:");
			for (int i = 0; i < n; i++) {
				System.out.print("|");
			}
		}
	}
//	Metodu iscrtaj rezim koja iscrtava rezim po izgledu:
//	Ako je mini player stampa [ ]
//	Ako je bioskopski stampa se  [ ..]
//	Ako je preko celog ekrana  se [||||]
	
	public void iscrtajRezim() {
		if (this.rezim.equals("mini player")) {
			System.out.println("[ ]");
		} else if (this.rezim.equals("bioskopski rezim")) {
			System.out.println("[ ..]");
		} else if (this.rezim.equals("rezim preko celog ekrana")) {
			System.out.println("[||||]");
		}
	}
	
	
//		Metodu iscrtajTrenutnoVreme - metoda ispisuje vreme video u formatu
//		minut:sekund / minutUkupnogVideo:sekundUkupnogVidea
//		minut - se racuna kao trenutno vreme / 60
//		sekund - se racuna kao trenutno vreme % 60
//		minutUkupnogVideo - racuna se kao ukupna duzina video u sekundama / 60
//		sekundUkupnogVidea - racuna se kao ukupna duzina video u sekundama % 60
	
	public void iscrtajTrenutnoVreme() {
		int min = this.trenutnoVremeReprodukcije / 60;
		int sec = this.trenutnoVremeReprodukcije % 60;
		System.out.print(min + ":" + sec);
	}
	
	
//		metodu iscrtaj timeline - metoda simulira iscrtavanje timelin-a.
//		Koristicemo zvezdice i tackice. idu 100 zvezdice/tackica. Zvezdice za ono sto je pogledano.
//		******************************......................................................................
//		broj zvezdica = trenutno vreme * 100 / ukupno vreme videa
//		A stackice su 100 - broj zvezdica 
//		
	
	public void iscrtajTimeline() {
		int brZvezda = this.trenutnoVremeReprodukcije * 100 / this.video.getDuzinaVideaS();
		for (int i = 1; i <= brZvezda; i++) {
			System.out.print("*");
		}
		for (int i = 1; i <= 100 - brZvezda; i++) {
			System.out.print(".");
		}
	}
//	metodu iscitaj - metoda simulira iscrtavanje celog playera
//	  1:03 / 2:05  Zvuk <: |||||| 
//	 Timeline: ******************************.....................................................................  
//	Kvalitet: 720p  
//	Rezim: [||||]
//	 Ariana Grande - positions (official video)
//	Likes  23 | Dislikes 32
//	34893483 Pregleda 
	
	public void iscitaj() {
		int min = this.video.getDuzinaVideaS() / 60;
		int sec = this.video.getDuzinaVideaS() % 60;
		System.out.print(min + ":" + sec + " / "); 
		this.iscrtajTrenutnoVreme();
		this.iscrtajZvuk();
		System.out.println();
		System.out.print("Timeline: ");
		this.iscrtajTimeline();
		System.out.println();
		System.out.println("Kvalitet: " + this.kvalitetVidea + "p");
		System.out.print("Rezim: ");
		this.iscrtajRezim();
		System.out.println(this.video.getNaziv());
		System.out.println("Likes " + this.video.getBrLajkova() + " | " + "Dislikes " + this.video.getBrDislajkova());
		System.out.println(this.video.getBrPregleda() + " Pregleda");
		
	}
	
	public String sherovanje() {
		return this.video.getId();
	}
//
//		metodu za sherovanje videa, metoda generise i vraca link do videa tako da link izgleda:
//		https://youtu.be/v6tuOipj5mk
//		Objasnjenje v6tuOipj5mk je id videa.

}
