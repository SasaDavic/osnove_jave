package p16_08_2022_i_18_08_2022;

public class Auto {
//	Kreirati klasu Auto koja ima:
//	ime i prezime vozaca
//	marku automobila
//	broj vrata
//	potrosnju na 100km (npr: 10)
//	trenutnu brzinu kojom se auto krece
//	metodu za stampu koja stampa podatke u formatu:
//	[Vozac]
//		[Marka] - [br vrata]-ro vrata
//		Sa potrosnjom od [potrosnja] l na 100km
//		[Trenutna brzina auta] km/h je trenutna brzina.
//		Primer:
//		Milan Jovanovic
//		BMW - 5-ro vrata
//		Sa potrosnjom od 10 l na 100km
//		200 km/h je trenutna brzina
	
//	(Dopuna 2)
//	Dopuniti klasu Auto tako da ima:
//	atribut godinu proizvodnje
//	atribut mesec do kad je registrovan auto (int)
//	atribut kubikaza auta (npr: 1600 - 5000)

	
	public String vozac;
	public String marka;
	public int brVrata;
	public int potrosnjaNa100km;
	public int trenutnaBrzina;
	
	public int godProizvodnje;
	public int mesecIstekaReg;
	public int kubikaza;
	
	
	public void stampaj() {
		System.out.println(this.vozac);
		System.out.println(this.marka + " " + this.brVrata + "-ro vrata");
		System.out.println("sa potrosnjom od " + this.potrosnjaNa100km + "l na 100km.");
		System.out.println(this.trenutnaBrzina + " km/h je trenutna brzina.");
	}
	
//	(Dopuna)
//	U okviru klase Auto, implementirati jos 2 metode:
//	metoda koja vraca informaciju da li je vozac prekoracio brzinu. Kao parametar metode se prima ogranicenje 
//	(kao broj) a metoda vraca true ili false ako je trenutna brzina veca od ogranicenja.
//	metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu prekoracenja placa se 1000din.
//	Metoda od parametara prima ogranicenje brzine
	
	public boolean prekoracenje(int ogranicenje) {
		return (this.trenutnaBrzina > ogranicenje) ? true : false;
	}
	public int novcanaKazna(int ogranicenje) {
		int x = this.trenutnaBrzina - ogranicenje;
		return (this.trenutnaBrzina > ogranicenje) ? x*1000 : 0;
	}
	
//	metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
//	metodu koja vraca da li je istekla registracije. Metoda kao parametar prima trenutni mesec i na 
//	osnovu toga vraca true ili false.
//	metodu koja racuna i vraca cenu registracije za auto. Za automobile do 2000 kubika cena registracije 
//	kubikaza * 100din, za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.
	
	public String oldtimer() {
		return (this.godProizvodnje < 1950) ? "Jeste oldtimer" : "Nije oldtimer";
	}
	public boolean isteklaRegistracija(int trenutniMesec) {
		return (trenutniMesec >= this.mesecIstekaReg) ? true : false;
	}
	public double cenaRegistracije() {
		return (this.kubikaza < 2000) ? this.kubikaza*100 : this.kubikaza*100*1.3;
	}
//	(Dopuna 3)
//	Dopuniti klasu Auto tako da ima:
//	atribut broj registracije
//	da li je ukljucena klima u autu
//	metodu dodajGas, koja povecava trenutnu brzinu za 10.
//	metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
//	metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
//	faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
//	(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime
	
	public String brRegistracije;
	public boolean klima;
	
	public int maxBrzina;
	
	public void dodajGas() {
		this.trenutnaBrzina += 10;
		if (this.trenutnaBrzina > this.maxBrzina) {
			this.trenutnaBrzina = 240;
		}
	}
	public void koci() {
		this.trenutnaBrzina -= 10;
		if (this.trenutnaBrzina < 0) {
			this.trenutnaBrzina = 0;
		}
	}
	public double trenutnaPotrosnja() {
		double faktor;
		if (this.klima == true) {
			faktor = 1.2;
		} else {
			faktor = 1.0;
		}
//		(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime
		return (this.trenutnaBrzina / 100.0 * this.potrosnjaNa100km) * faktor;
	}
	
//	(Dopuna 4)
//	Dopuniti klasu Auto tako da ima:
//atribut za maksimalnu brzinu na auto (npr: 240)
//Promenite metodu dodajGas tako da povecanje brzine ne bude preko maksimalne brzine auta
//metodu stampajTablu koja stampa brzinomer sa table. Brzinomer uvek ima 100 jedinica za prikaz brzine.
//Ako je npr maksimalna brzina 240 i auto je u trenutnoj brzini 100, metoda stampa 
//|||||||||||||||||||||||||||||||||||||||||..................................................................... 100/240km/h
//(objasnjenje: ovde imamo 41 crticu koja oznacava brzinu 100km/h i imamo 59 tackica koje oznacavaju ostatak do maksimalne brzine)
//Broj crtica se racuna po formuli: (trenutna brzina * 100) / maksimalna brzina.
	public void stampajTablu() {
		int crtice = this.trenutnaBrzina * 100 / this.maxBrzina;
		for (int i = 0; i < crtice; i++) {
			System.out.print("|");
		}
		for (int i = 0; i < 100 - crtice; i++) {
			System.out.print(".");
		}
		System.out.println(this.trenutnaBrzina + "/" + this.maxBrzina + " km/h");
	}
//	(Dopuna 5)
//	Dopuniti klasu Auto tako da ima:
//	kapacitet rezervoara
//	trenutnu kolicinu goriva u rezervoaru (u litrima)
//	metodu natoci gorivo, metoda prima kao parametar litrazu goriva koja se toci a vraca novcanu vrednost goriva. 
//	Litar goriva je 170din. Vodite racuna da trenutna kolicina goriva ne predje kapacitet rezervoara, 
//	takodje ukoliko se unese kolicina koja prelazi kapacitet, tu kolicinu koja prelazi ne racunate u cenu.

	public int kapacitetRezervoara;
	public int trenutnoGoriva;
	
	public int natoci(int koliko) {
		int litara = 0;
		if (this.trenutnoGoriva + koliko > this.kapacitetRezervoara) {
			litara = this.kapacitetRezervoara - this.trenutnoGoriva;
			this.trenutnoGoriva = this.kapacitetRezervoara;
		} else {
			litara = koliko;
		}
		return litara * 170;
	}
	
}
