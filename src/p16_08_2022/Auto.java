package p16_08_2022;

public class Auto {
	
	public String vozac;
	public String marka;
	public int brojVrata;
	public double potrosnja;
	public int brzina;
	
	

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
	
	
	
	
}
