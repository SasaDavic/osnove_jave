package p22_08_2022;

public class Video {
//	4.Zadatak (ZA VEZBANJE)
//	Kreirati klasu Video koja ima:
//	svi atributi su private
//	id videa - koji je string i na primer izgleda v6tuOipj5mk
//	naziv videa
//	duzinu videa u sekundama (npr: ako je video 2min i 10s, duzina je 130)
//	broj lajkova
//	broj dislajkova
//	broj pregleda

//	gettere za sve atribute
//	settere nemamo
	
	private String id;
	private String naziv;
	private int duzinaVideaS;
	private int brLajkova;
	private int brDislajkova;
	private int brPregleda;
	
	public Video(String id, String naziv, int duzinaVideaS, int brLajkova, int brDislajkova, int brPregleda) {
		
		this.id = id;
		this.naziv = naziv;
		this.duzinaVideaS = duzinaVideaS;
		this.brLajkova = brLajkova;
		this.brDislajkova = brDislajkova;
		this.brPregleda = brPregleda;
	}

	public String getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getDuzinaVideaS() {
		return duzinaVideaS;
	}

	public int getBrLajkova() {
		return brLajkova;
	}

	public int getBrDislajkova() {
		return brDislajkova;
	}

	public int getBrPregleda() {
		return brPregleda;
	}
//	metodu lajkuj - koja povecava broj lajkova za jedan
//	metodu dislajkuj - koja povecava broj dislajkova za jedan
//	metodu pogledaj - koja povecava broj pregleda za jedan
	
	public void like() {
		this.brLajkova++;
	}
	public void dislike() {
		this.brDislajkova++;
	}
	public void pogledaj() {
		this.brPregleda++;
	}
	
	
	
}
