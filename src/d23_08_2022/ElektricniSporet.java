package d23_08_2022;

public class ElektricniSporet {
//	Kreirati klasu ElektricniSporet koja ima:
//	marku storeta (npr: Beko, Bosh)
//	garanciju kao broj godina
//	maksimalan broj ukljucenih ringli u istom trenutku (1, 2, 3  ili 4)
//	4 ringle 
//	gore levo
//	gore desno
//	dole levo
//	dole desno
	
	private Ringla goreL;
	private Ringla goreD;
	private Ringla doleL;
	private Ringla doleD;
	private String marka;
	private int garancija;
	private int maxUkljucenihRingli;
	//4 ringle
	
	
	
	public ElektricniSporet() {	
	}

	public ElektricniSporet(String marka, int garancija, int maxUkljucenihRingli) {
		
		this.marka = marka;
		this.garancija = garancija;
		this.maxUkljucenihRingli = maxUkljucenihRingli;
		
	}

	public void setGoreL(Ringla goreL) {
		this.goreL = goreL;
	}

	public void setGoreD(Ringla goreD) {
		this.goreD = goreD;
	}

	public void setDoleL(Ringla doleL) {
		this.doleL = doleL;
	}

	public void setDoleD(Ringla doleD) {
		this.doleD = doleD;
	}

	public String getMarka() {
		return marka;
	}

	public int getGarancija() {
		return garancija;
	}

	public int getMaxUkljucenihRingli() {
		return maxUkljucenihRingli;
	}

	
//	konstruktor koji postavlja sve atribute
//	gettere za sve atribut
//	ne postoje setteri
	
	
//	metodu pojacaj kojoj se prosledjuje pozicija ringle
//	pozicija 1 je ringla gore levo 
//	pozicija 2 je ringla gore desno
//	pozicija 3 je ringla dole levo
//	pozicija 4 je ringla dole desno
//	Ako se prelazi maksimalan broj ukljucenih ringli u jednom trenutku, pogasite sve ringle sem 
//	one koja se pojacava u tom pozivu funkije 
	
	public void pojacaj (int pozicija) {
		if (pozicija == 1) {
			this.goreL.pojacajRinglu();
		} else if (pozicija == 2) {
			this.goreD.pojacajRinglu();
		} else if (pozicija == 3) {
			this.doleL.pojacajRinglu();
		} else if (pozicija == 4) {
			this.doleD.pojacajRinglu();
		}
		int brojac = 0;
		if (this.doleD.getJacina() > 0) {
			brojac++;
		}
		if (this.doleL.getJacina() > 0) {
			brojac++;
		}
		if (this.goreD.getJacina() > 0) {
			brojac++;
		}
		if (this.goreL.getJacina() > 0) {
			brojac++;
		}
		if (brojac > this.maxUkljucenihRingli) {
			if (pozicija == 1) {
				this.goreD.iskljuciRinglu();
				this.doleL.iskljuciRinglu();
				this.doleD.iskljuciRinglu();
			} else if (pozicija == 2) {
				this.goreL.iskljuciRinglu();
				this.doleL.iskljuciRinglu();
				this.doleD.iskljuciRinglu();
			} else if (pozicija == 3) {
				this.goreL.iskljuciRinglu();
				this.goreD.iskljuciRinglu();
				this.doleD.iskljuciRinglu();
			} else if (pozicija == 4) {
				this.goreL.iskljuciRinglu();
				this.goreD.iskljuciRinglu();
				this.doleL.iskljuciRinglu();
			}
		}
	}
	
//	Za gasenje ringli iskoristite metodu koja je definisana ispod 👇
//	metodu iskljuci ringlu kojoj se prosledjuje pozicija ringle
//	pozicija 1 je ringla gore levo
//	pozicija 2 je ringla gore desno
//	pozicija 3 je ringla dole levo
//	pozicija 4 je ringla dole desno
	
	
	public double ukupnaPotrosnja(int brSati) {
		return this.goreD.potrosnjaElektricneEnergije(brSati) + this.goreL.potrosnjaElektricneEnergije(brSati)
		+ this.doleD.potrosnjaElektricneEnergije(brSati) + this.doleL.potrosnjaElektricneEnergije(brSati);
	}
	
//	metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet, tako sto sabira potrosnju 
//	za sve ringle (kao parametar se unosi vreme koliko vec ringle rade)
	
	
	public void stampaj() {
		System.out.println(this.marka + " - " + this.garancija);
		System.out.println("Ringle:");
		System.out.println("Gore levo: ");
		this.goreL.stampaj();
		System.out.println("Gore desno: ");
		this.goreD.stampaj();
		System.out.println("Dole levo: ");
		this.doleL.stampaj();
		System.out.println("Dole desno: ");
		this.doleD.stampaj();
	}
	
//	metodu koja stampa podatke u formatu:
//	marka - garancija u godinama
//	Ringle:
//	Gore levo:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW
//	Gore desno:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW
//	Dole levo:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW
//	Dole desno:
//	Ringla je ukljucena/iskljucena
//	Tip ringle: tip ringle
//	Jacina: jacina
//	Grejac: jacina grejaca kW
}
