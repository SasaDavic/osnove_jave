package p05_09_2022;

public class StudentMaster extends Student{
//	Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
//	koja za cenu skolarine vraca 100000
//	za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
	
	
	
	public StudentMaster(String imeStudenta, int brIndexa, int godStudija) {
		super(imeStudenta, brIndexa, godStudija);		
	}

	public double skolarina() {
		return 100000;
	}
	
	public boolean budzet() {
		return (this.godStudija < 2) ? true : false;
		}
	
	public void stampaj() {
		System.out.println(this.imeStudenta + ", " + this.brIndexa + ", " + this.godStudija);
		System.out.println("Finansiranje: " + this.budzet());
		System.out.println("Cena skolarine: " + this.skolarina());
	}
}
