package p15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva 
//		prosledjena broja. Brojevi su ulazni parametri funkcije. U gravnom programu pozvati 
//		nekoliko puta funkciju sa razlicitim prosledjenim vrednostima. 
		
		printOperacije(10, 5);

	}
	
	public static void printOperacije(int a, int b) {
		int zbir = a + b;
		int razlika = a - b;
		int proizvod = a * b;
		int kolicnik = a / b;
		System.out.println("Zbir je " + zbir + ", " + "Razlika je " + razlika + ", " 
		+ "Proizvod je " + proizvod + ", " + "Kolicnik je " + kolicnik);
		
	}
	
}
