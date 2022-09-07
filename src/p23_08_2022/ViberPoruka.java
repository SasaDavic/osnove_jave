package p23_08_2022;

public class ViberPoruka {
//	Kreirati klasu ViberPoruka koja ima:
//	tekst poruke
//	vreme kad je poslata poruka
//	korisnika koji je poslao poruku
//	korisnika kome je poslata poruka
//	gettere i setere i konstuktore
//	rekaciju na poruku

//
	
	private String textPoruke;
	private String vremeSlanja;
	private ViberKorisnik poslao;
	private ViberKorisnik primio;
	private ViberReakcija korisnik;

	
	public ViberPoruka(String textPoruke, String vremeSlanja, ViberKorisnik poslao, ViberKorisnik primio) {
		
		this.textPoruke = textPoruke;
		this.vremeSlanja = vremeSlanja;
		this.poslao = poslao;
		this.primio = primio;
	}



	
	
	public ViberReakcija getKorisnik() {
		return korisnik;
	}





	public void setKorisnik(ViberReakcija korisnik) {
		this.korisnik = korisnik;
	}





	public ViberPoruka(ViberReakcija korisnik) {
		this.korisnik = korisnik;
	}

	public String getTextPoruke() {
		return textPoruke;
	}

	public void setTextPoruke(String textPoruke) {
		this.textPoruke = textPoruke;
	}

	public String getVremeSlanja() {
		return vremeSlanja;
	}

	public void setVremeSlanja(String vremeSlanja) {
		this.vremeSlanja = vremeSlanja;
	}

	public ViberKorisnik getPoslao() {
		return poslao;
	}

	public void setPoslao(ViberKorisnik poslao) {
		this.poslao = poslao;
	}

	public ViberKorisnik getPrimio() {
		return primio;
	}

	public void setPrimio(ViberKorisnik primio) {
		this.primio = primio;
	}


//	metodu prikazi koja stampa podatke o poruci u formatu:
//	From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
//	To: [Ime i prezime korisnika kome je poslata]
//	[Tekst poruke] : [reakcija] from [korisnik koji je reagovao]
	
	public void stampaj() {
		System.out.print("From: " + this.poslao.getIme() + " * ");
		if (this.poslao.isAktivan() == true) {
			System.out.print("Active Now");
		} else {
			System.out.print("Not Active");
		}
		System.out.println(" - at " + this.vremeSlanja);
		System.out.println("To: " + this.primio.getIme());
		if (this.korisnik != null) { //korisnik ne postoji
			System.out.println(this.textPoruke + " : " + this.korisnik.getEmoji() + " from " + this.korisnik.getReagovao().getIme());///korisnik koji je reagovao
		}
		
	}
	
	
	
	
}
