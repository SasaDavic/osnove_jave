package d15_08_2022;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//		Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//		/ / / / /
//		Napomena: Metoda nista ne vraca.
		
		printNiz(6, "/");

	}
	public static void printNiz(int n, String karakter) {
		for (int i = 0; i < n; i++) {
			System.out.print(karakter + " ");
		}
	}
}
