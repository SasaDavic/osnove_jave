package p22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Film koja ima:
//			naziv filma
//			iz koje godine je film 
//			reziser
//			konstruktore, gettere i settere koji su potrebni
//			metodu print koja stampa podatke u formatu
//			naziv filma, godina
//			Rezirao je: Ime prezime, starost.god
//
//
//			Kreirati klasu Reziser koja ima:
//			ime i prezime rezisera
//			starost
//			konstruktore, gettere i settere koji su potrebni
//			metodu print koja stampa podatke u formatu
//			ime prezime, starost.god
//
//			U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda

		Reziser reziser1 = new Reziser();
		reziser1.setIme("Paul Thomas Anderson");
		reziser1.setStarost(1970);
		
		Film film1 = new Film("Magnolia", 1999); //ili napravis konstrukor sa reziserom i povezes ih,
		Film film2 = new Film("Boogie Nights", 1997);  //u tom slucaju ne treba seter za rezisera
		Film film3 = new Film("Hard Eight", 1996);
		
		film1.setReziser(reziser1);               //// <<= ovaj seter
		film1.print();
		
		film2.setReziser(reziser1);
		film2.print();
		
		film3.setReziser(reziser1);
		film3.print();
	}

}
