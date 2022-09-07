package d05_09_2022;

public class Menadzer extends Radnik{
//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//	 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
	
	
	
	public double plata() {
		double s = 0.0;
		for (int i = 0; i < this.niz.size(); i++) {
			s += this.niz.get(i).getPlata();
		}
		return s;
	}

	public Menadzer(String imeRadnika) {
		super(imeRadnika);
		// TODO Auto-generated constructor stub
	}

	

	
	
	
	
	
}
