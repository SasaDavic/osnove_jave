package d16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za izabranu temperaturu 
//			atribut za mod (hladi/greje) - string
//			metodu za stampu (proizvoljno)
//			metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena.
//			Metoda kao parametar prima temperaturu koja je napolju.
//
//
//			U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih 
//			pozvati metode

		SmartAirConditioning klima1 = new SmartAirConditioning();
		SmartAirConditioning klima2 = new SmartAirConditioning();
		klima1.marka = "Samsung";
		klima1.temperatura = 25.0;
		klima1.mod = "hladi";
		klima1.stampaj();
		System.out.println(klima1.temp(30));
		
		klima2.marka = "Gree";
		klima2.temperatura = 35.0;
		klima2.mod = "greje";
		klima2.stampaj();
		System.out.println(klima2.temp(30));
		
		
		
		
		
	}

}
