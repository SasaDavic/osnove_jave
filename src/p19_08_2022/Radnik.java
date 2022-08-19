package p19_08_2022;

public class Radnik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private String jmbg;
	private String punoIme;
	private int deca;
	private int sss;
	private int radniStaz;
	private double koefS;
	private double minuliRad;
	private double plata;
	private boolean kreditnoSposoban;
	
	
	public Radnik(String jmbg) {
		this.jmbg = jmbg;
	}
	
	public Radnik(String punoIme, int deca, int sss, int radniStaz, double minuliRad, double koefS, 
			double plata, boolean kreditnoSposoban) {
		this.punoIme = punoIme;
		this.deca = deca;
		this.sss = sss;
		this.radniStaz = radniStaz;
		this.minuliRad = minuliRad;
		this.koefS = koefS;
		this.plata = plata;
		this.kreditnoSposoban = kreditnoSposoban;
		
		
		
		
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	public String getJmbg() {
		return this.jmbg;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public String GetpunoIme() {
		return this.punoIme;
	}		
	public void setDeca(int deca) {
		this.deca = deca;
	}
	public int getDeca() {
		return this.deca;
	}
	public void setSss(int sss) {
		this.sss = sss;
	}
	public int getSss() {
		return this.sss;
	}
	public void setRadniStaz(int radniStaz) {
		this.radniStaz = radniStaz;
	}
	public int getRadniStaz() {
		return this.radniStaz;
	}
	public double minuliRad() {
		double m = 0;
		if (this.radniStaz < 10) {
			m = 0.05;
		} else if (this.radniStaz >= 10 && this.radniStaz <20) {
			m = 0.075;
		} else {
			m= 0.1;
		}
		return m;
	}

	public double koefS(double k) {
		if (this.sss == 1) {
			k = 1.03;
		} else if (this.sss == 2) {
			k = 1.65;
		} else if (this.sss == 3) {
			k = 2;
		} else if (this.sss == 4) {
			k = 2.27;
		} else if (this.sss == 5) {
			k = 2.88;
		} else if (this.sss == 6) {
			k = 3.09;
		} else if (this.sss == 7) {
			k = 3.40;
		} else if (this.sss == 8) {
			k = 4.12;
		} else {
			k = 1.0;
		}
		
		return k;
		
	}
	public double plata () {
		return 25000 + (this.koefS + this.minuliRad) * 10000;
	}
	
	public boolean kreditnoSposoban () {
		return this.plata() > 50000;
	}
	
	public void print() {
		System.out.println("Godine radnog staza: " + this.radniStaz);
		System.out.println("SSS: " + this.sss);
		System.out.println("Ime i prezime: " + this.punoIme);
		System.out.println("JMBG" + this.jmbg);
		System.out.println("Broj dece je: " + this.deca);
		System.out.println("Minuli rad " + this.minuliRad);
		System.out.println("Koeficijent " + this.koefS);
		System.out.println(this.kreditnoSposoban);
		System.out.println(this.plata);
	}



}
