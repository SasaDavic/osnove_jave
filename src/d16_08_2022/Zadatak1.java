package d16_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u 
//		koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//		Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//		Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

		Proizvod proizvod1 = new Proizvod();
		proizvod1.naziv = "Jogurt";
		proizvod1.cena = 150;
		proizvod1.tezinaG = 93.6;
		proizvod1.stampaj();
		
		Proizvod proizvod2 = new Proizvod();
		proizvod2.naziv = "Prase";
		proizvod2.cena = 16580;
		proizvod2.tezinaG = 30000;
		proizvod2.stampaj();
		
		System.out.print("Ako proizvod " + proizvod1.naziv + " ima " + proizvod1.tezinaG + " g, i pozovemo metodu sa parametrom kg");
		System.out.println(", metod vraca " + proizvod1.konvertuj("kg") + " kg");
		
		System.out.print("Ako proizvod " + proizvod1.naziv + " ima " + proizvod1.tezinaG + " g, i pozovemo metodu sa parametrom t");
		System.out.println(", metod vraca " + proizvod1.konvertuj("t") + " t");
		
		System.out.print("Ako proizvod " + proizvod2.naziv + " ima " + proizvod2.tezinaG + " g, i pozovemo metodu sa parametrom kg");
		System.out.println(", metod vraca " + proizvod2.konvertuj("kg") + " kg");
		
		System.out.print("Ako proizvod " + proizvod2.naziv + " ima " + proizvod2.tezinaG + " g, i pozovemo metodu sa parametrom t");
		System.out.println(", metod vraca " + proizvod2.konvertuj("t") + " t");
		
		
		
		
		
		
		
	}

}
