package d15_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//		Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
		
		int broj = 3;
		int vrednost = vecaVrednost(broj);
		System.out.println("Vrednost broja " + broj + " uvecana za 10 je " + vrednost);
		
		
	}
	public static int vecaVrednost(int broj) {
		return 10 + broj;
	}
}
