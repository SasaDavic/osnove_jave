package p23_08_2022;

public class ZoomCall {
//	Kreirati klasu ZoomCall koja ima:
//link za poziv
//password
//korisnika koji je host
//korisnika koji je guest
//gettere za sve atribute
//setter samo za guest-a

	private String linkPoziva;
	private String password;
	private Korisnik host;
	private Korisnik guest;
		
	public ZoomCall(String linkPoziva, String password, Korisnik host, Korisnik guest) {
		this.linkPoziva = linkPoziva;
		this.password = password;
		this.host = host;
		this.guest = guest;
	}
	public void setHost(Korisnik host) {
		this.host = host;
	}
	public String getLinkPoziva() {
		return linkPoziva;
	}
	public String getPassword() {
		return password;
	}
	public Korisnik getHost() {
		return host;
	}
	public Korisnik getGuest() {
		return guest;
	}
	
	//metodu pokreni poziv koja stampa podatke u formatu:
//	Zoom Call: url
//	Password: password
//	Host: ime i prezime
//	Guest: ime i prezime
//	Maksimalno trajanje poziva je (broj minuta)min
//	
//	Maksimalno trajanje poziva se cita od korisnika koji je host!
	public void pokreniPoziv() {
		System.out.println("Zoom Call: " + this.linkPoziva);
		System.out.println("Password: " + this.password);
		System.out.println("Host: " + this.host);
		System.out.println("Guest: " + this.guest);
		System.out.println("Maksimalno trajanje poziva je " + this.host.maxDuzinaVidea() + " min");
	}
	
}
