package p05_09_2022;

public class StudentOsnovnih extends Student{

//	Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
//koja za cenu skolarine vraca 90000
//za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija
	
	
	public StudentOsnovnih(String imeStudenta, int brIndexa, int godStudija) {
		super(imeStudenta, brIndexa, godStudija);
	}
	
	public double skolarina() {
		return 90000;		
	}
	public boolean budzet() {
		return (this.godStudija < 5) ? true : false;
	}
	
	public void stampaj() {
		System.out.println(this.imeStudenta + ", " + this.brIndexa + ", " + this.godStudija);
		System.out.println("Finansiranje: " + this.budzet());
		System.out.println("Cena skolarine: " + this.skolarina());
	}
}
