package d05_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
///Kreirati klasu Sektor koja ima:
//	 naziv sektora
//	 platu koja je za taj sektor
//
//	Kreirati abstraktnu klasu Radnik koja ima:
//	 ime i prezime
//	 niz sektora u kojima radi
//	 abstraktnu metodu koja vraca platu radnika
//	 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//	 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//	Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//	 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//	 suma plata svih sektor / broj sektora * 0.5
//	 override uje metodu za platu, tako da se plata racuna po formuli:
//	(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//	U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i 
//	ispisati platu za svakog
		
		Sektor s1 = new Sektor("1", 10000);
		Sektor s2 = new Sektor("2", 12000);
		Sektor s3 = new Sektor("3", 13000);
		Sektor s4 = new Sektor("4", 14000);
		Sektor s5 = new Sektor("5", 15000);
		Sektor s6 = new Sektor("6", 16000);
		
		
		
		Menadzer m1 = new Menadzer("Menadzer");
		m1.zaposliSeUSektor(s1);
		m1.zaposliSeUSektor(s2);
		
		System.out.println("Plata je " + m1.plata());
		
		Magacioner a1 = new Magacioner("Magacioner");
		a1.zaposliSeUSektor(s1);
		a1.zaposliSeUSektor(s2);

		System.out.println("Plata je " + a1.plata());
		
		
		

	}

}
