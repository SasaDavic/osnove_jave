package p16_08_2022;

public class Auto {
	
	public String vozac;
	public String marka;
	public int brojVrata;
	public double potrosnja;
	public int brzina;
	public int oldT;
	public int godProizvodnje;
	public int mesecRegistracije;
	public int kubikaza;
	public int trenutniMesec;
	public int mesecIsteka;
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	
	public void stampaj() {
		System.out.println(this.vozac);
		System.out.println("     " + this.marka + " - " + this.brojVrata + "-ro vrata");
		System.out.println("     " + "Sa potrosnjom od " + this.potrosnja + " l na 100km");
		System.out.println("     " + this.brzina + " km/h je trenutna brzina.");
		
	}
	
	public boolean prekoracenje(int dozvoljenaBrzina) {
		if (this.brzina > dozvoljenaBrzina) {
			return true;
		} else {
			return false;
		}
	}
	
	public int kazna(int dozvoljenaBrzina) {
		if (this.brzina > dozvoljenaBrzina) {
			return (this.brzina - dozvoljenaBrzina) * 1000;
		}
		return 0;
	}
	
	public boolean oldtimer(int godProizvodnje) {
		if (godProizvodnje < this.oldT) {
			return true;
		} else {
			return false;
		}
	}
	public boolean registracija(int trenutniMesec) {
		if (this.mesecIsteka < trenutniMesec) {
			return false;
		} else {
			return true;
		}
	}
	public double cenaRegistracije(int kubikaza) {
		if (this.kubikaza <= 2000) {
			return this.kubikaza * 100;
		} else {
			return this.kubikaza * 100 * 1.3;
		}
		
	}
	
}
