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
	
	private String marka;
	private int garancija;
	private int maxUkljucenihRingli;
	//4 ringle
	private String goreL;
	private String goreD;
	private String doleL;
	private String doleD;
	
	public ElektricniSporet(String marka, int garancija, int maxUkljucenihRingli, String goreL, String goreD,
			String doleL, String doleD) {
		
		this.marka = marka;
		this.garancija = garancija;
		this.maxUkljucenihRingli = maxUkljucenihRingli;
		this.goreL = goreL;
		this.goreD = goreD;
		this.doleL = doleL;
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

	public String getGoreL() {
		return goreL;
	}

	public String getGoreD() {
		return goreD;
	}

	public String getDoleL() {
		return doleL;
	}

	public String getDoleD() {
		return doleD;
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
//	Za gasenje ringli iskoristite metodu koja je definisana ispod 👇
//	metodu iskljuci ringlu kojoj se prosledjuje pozicija ringle
//	pozicija 1 je ringla gore levo
//	pozicija 2 je ringla gore desno
//	pozicija 3 je ringla dole levo
//	pozicija 4 je ringla dole desno
//	metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet, tako sto sabira potrosnju 
//	za sve ringle (kao parametar se unosi vreme koliko vec ringle rade)
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
