package d16_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		
		
//		konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, 
//		a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//		Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//		Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

		Proizvod proizvod1 = new Proizvod();
		proizvod1.naziv = "jogurt";
		proizvod1.cena = 150;
		proizvod1.gram = 100.10;
		
		Proizvod proizvod2 = new Proizvod();
		proizvod2.naziv = "mleko";
		proizvod2.cena = 200;
		proizvod2.gram = 150.95;
		
		proizvod1.stampaj();
		proizvod2.stampaj();
		
		System.out.print("ako proizvod ima " + proizvod1.gram + " grama i pozovemo metodu sa parametrom kg, metoda vraca ");
		System.out.println(proizvod1.konverzija("kg"));
		System.out.print("ako proizvod ima " + proizvod1.gram + " grama i pozovemo metodu sa parametrom t, metoda vraca ");
		System.out.println(proizvod1.konverzija("t"));
		System.out.print("ako proizvod ima " + proizvod2.gram + " grama i pozovemo metodu sa parametrom kg, metoda vraca ");
		System.out.println(proizvod2.konverzija("kg"));
		System.out.print("ako proizvod ima " + proizvod2.gram + " grama i pozovemo metodu sa parametrom t, metoda vraca ");
		System.out.println(proizvod2.konverzija("t"));
		

		
		
	}

}
