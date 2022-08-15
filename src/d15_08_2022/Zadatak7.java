package d15_08_2022;

public class Zadatak7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		(Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. 
//		U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
		
		int min = najmanji(60, -3, 5);
		System.out.println("Najmanji broj je " + min);

	}
	public static int najmanji(int a, int b, int c) {
		if (a <= b && a <= c) {
			return a;
		} else if (b <= a && b <= c) {
			return b;
		} else {
			return c;
		}
	}

}
