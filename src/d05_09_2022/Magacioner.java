package d05_09_2022;

public class Magacioner extends Radnik{
//	Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//	 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//	 suma plata svih sektor / broj sektora * 0.5
//	 override uje metodu za platu, tako da se plata racuna po formuli:
//	(prosecna plata za sve sektore u kojima radi) * (broj sektora).
	
	
	
	private double prosecnaPlata() {
		double s = 0.0;
		int n = this.niz.size();
		for (int i = 0; i < this.niz.size(); i++) {
			s += this.niz.get(i).getPlata();
		}
		return 1.0*s / n * 0.5;
	}

	public Magacioner(String imeRadnika) {
		super(imeRadnika);
		// TODO Auto-generated constructor stub
	}
	
	public double plata() {
		double x = this.prosecnaPlata() / this.niz.size();
		return x;
	}
	
	
}
