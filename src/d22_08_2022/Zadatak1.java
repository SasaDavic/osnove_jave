package d22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga.

		Autor autor1 = new Autor("Nikola", "Malovic");
		Autor autor2 = new Autor("Enes", "Halilovic");
		Autor autor3 = new Autor("Dejan", "Aleksic");
		
		Knjiga knjiga1 = new Knjiga("978-86-521-1503-7", "Jedro nade", 2014, autor1);
		Knjiga knjiga2 = new Knjiga("978-86-521-4138-8", "Ako dugo gledas u ponor", 2021, autor2);
		Knjiga knjiga3 = new Knjiga("978-86-521-3924-8", "Petlja", 2021, autor3);
		
		knjiga1.print();
		knjiga2.print();
		knjiga3.print();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
