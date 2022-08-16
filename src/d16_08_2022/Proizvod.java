package d16_08_2022;

public class Proizvod {
	
//	naziv proizvoda (String)
//	cenu proizvoda (double)
//	težinu proizvoda u gramima. (double)
	
	public String naziv;
	public double cena;
	public double gram;
	public Object konvertuj;
	
	public void stampaj() {
		System.out.println("Proizvod: " + this.naziv + ", " + this.cena + " din, " + this.gram + " g");
	}
	
	public double konverzija(String jedinica) {
		if (jedinica.equals("kg")) {
			return (this.gram / 1000);
		} else if (jedinica.equals("t")) {
			return (this.gram / 10000);
		}
		return 0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
