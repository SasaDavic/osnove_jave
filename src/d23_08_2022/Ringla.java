package d23_08_2022;

public class Ringla {
//	Kreirati klasu Ringla koja ima:
//	tip ringle (obicna ili ekspres)
//	jacinu 
//	za obicnu ringu jacina je u opsegu od 0 do 3
//	za ekspres ringlu jacina je u opsegu od 0 do 12
//	jacinu grejaca u kW (npr: 0.8, 1, 1.5, …)
//	konstruktor sa parametrima, postavljaju ce tip ringle i jacina grejaca (jacina atribut je po defaultu 0)
//	getter za jacinu
//	setteri ne postoje!!
	
	private String tip;
	private int jacina;
	private double jacinaGrejaca;
	public Ringla() {
		this.jacina = 0;
	}
	public Ringla(String tip, double jacinaGrejaca) {
		
		this.tip = tip;
		this.jacinaGrejaca = jacinaGrejaca;
	}
	public int getJacina() {
		return jacina;
	}
	
	
//	privatnu metodu koja vraca maksimalan broj pojacavanja
//	za obicnu je 3, za ekspres je 12
	
	private int maxPojacavanje() {
		if (this.tip.equals("obicna")) {
			return 3;
		} else if (this.tip.equals("ekspres")) {
			return 12;
		}
		return 0;
	}
//	metodu pojacaj ringlu - metoda povecava jacinu za 1 (pazite na opseg)
	
	public void pojacajRinglu() {
		if (this.tip.equals("obicna")) {
			this.jacina++;
			if(this.jacina > this.maxPojacavanje()) {
				this.jacina = this.maxPojacavanje();
			}
		} else if (this.tip.equals("ekspres")) {
			this.jacina++;
			if(this.jacina > this.maxPojacavanje()) {
				this.jacina = this.maxPojacavanje();
			}
		}
	}
//	metodu iskljuci ringlu - metoda postavlja jacinu na 0
	public void iskljuciRinglu() {
		this.jacina = 0;
	}
//	metodu koja vraca informaciju da li je ringla ukljucena ili iskljucena
	public boolean on_off() {
		if (this.jacina == 0) {
			return false;
		} else {
			return true;
		}
	}
//	metodu koja vraca potrosnju elektricne energije prema formuli 
//	100 / maksimalan broj pojacavanja * jacina * jacina grejaca * vremenski period koliko vec ringla radi 
	
	public double potrosnjaElektricneEnergije(int brSat) {
		return 100 / this.maxPojacavanje() * this.jacina * this.jacinaGrejaca * brSat;
	}
	
//	metoda prima broj sati kao parametar tj. vremenski period koliko ringla vec radi
//	metodu koja stampa podatke u formatu:
	
	public void stampaj() {
		if (this.on_off() == false) {
			System.out.println("Ringla je ugasena");
		} else {
			System.out.println("Ringla je ukljucena");
		}
		System.out.println("Tip ringle: " + this.tip);
		System.out.println("Jacina " + this.jacina);
		System.out.println("Grejac: " + this.jacinaGrejaca + " kW");
	}
	
//		Ringla je ukljucena ili iskljucena (iskoristite metodu koja vraca tu informaciju da biste 
//				odstampali poruku)
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW
}
