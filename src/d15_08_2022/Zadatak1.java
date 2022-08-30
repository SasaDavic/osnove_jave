package d15_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//		Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
		
		//nacin1
//		int broj = 3;
//		int vrednost = vecaVrednost(broj);
//		System.out.println("Vrednost broja " + broj + " uvecana za 10 je " + vrednost);
		
		stampajVrednostZa10Vecu(20);
		
	}
	//nacin1
//	public static int vecaVrednost(int broj) {
//		return 10 + broj;
//	}
	
	public static void stampajVrednostZa10Vecu(int vrednost) {
		vrednost += 10;
		System.out.println("Vrednost veca za 10 je " + vrednost);
	}
}
