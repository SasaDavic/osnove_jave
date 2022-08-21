package d18_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. O
//		va funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//		vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je 
//		cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar 
//		popust u opsegu od 0 do 100.
//		racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//		Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//		za tezinu do 100g, postarina iznosi 200din
//		za tezinu od 101g do 500g, postarina iznosi 400din
//		za tezinu preko 500g, postarina iznosi 1000din
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.
		
		Proizvod jogurt = new Proizvod();
		jogurt.ime = "Balans";
		jogurt.cena = 102.50;
		jogurt.cenaSaPopustom = jogurt.cena;
		jogurt.tezina = 83.6;
	
		jogurt.stampaj();
		
		jogurt.povecajCenu(10);
		System.out.println("Nakon poskupljenja cena je " + jogurt.cena);
		
		jogurt.vratiCenuSaPopustom(15);
		System.out.println("Nakon popusta cena je "  + jogurt.cenaSaPopustom);
		jogurt.racunajPostarinu();
		System.out.println("Postarina je " + jogurt.postarina);
		
		
		
		Proizvod mleko = new Proizvod();
		mleko.ime = "Moja Kravica";
		mleko.cena = 200;
		mleko.cenaSaPopustom = mleko.cena;
		mleko.tezina = 150.02;
		
		mleko.stampaj();
		
		mleko.povecajCenu(15);
		System.out.println("Nakon poskupljenja cena je " + mleko.cena);
		
		mleko.vratiCenuSaPopustom(25);
		System.out.println("Nakon popusta cena je "  + mleko.cenaSaPopustom);
		mleko.racunajPostarinu();
		System.out.println("Postarina je " + mleko.postarina);
		
		
		

	}

	private static double vratiCenuSaPopustom(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
