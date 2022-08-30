package p16_08_2022_i_18_08_2022;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
//		Kreirati klasu Auto koja ima:
//			ime i prezime vozaca
//			marku automobila
//			broj vrata
//			potrosnju na 100km (npr: 10)
//			trenutnu brzinu kojom se auto krece
//			metodu za stampu koja stampa podatke u formatu:
//			[Vozac]
//				[Marka] - [br vrata]-ro vrata
//				Sa potrosnjom od [potrosnja] l na 100km
//				[Trenutna brzina auta] km/h je trenutna brzina.
//				Primer:
//				Milan Jovanovic
//				BMW - 5-ro vrata
//				Sa potrosnjom od 10 l na 100km
//				200 km/h je trenutna brzina
		
//		(Dopuna)
//		U okviru klase Auto, implementirati jos 2 metode:
//		metoda koja vraca informaciju da li je vozac prekoracio brzinu. Kao parametar metode se prima ogranicenje 
//		(kao broj) a metoda vraca true ili false ako je trenutna brzina veca od ogranicenja.
//		metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu prekoracenja placa se 1000din.
//		Metoda od parametara prima ogranicenje brzine
//		U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu informacija koje dobijete od njih.
		
		Scanner s = new Scanner(System.in);
		
		Auto auto = new Auto();
		auto.vozac = "Sasa Davic";
		auto.marka = "Fiat Punto";
		auto.brVrata = 5;
		auto.potrosnjaNa100km = 7;
		auto.trenutnaBrzina = 80;
		
		auto.stampaj();
		System.out.print("Unesite dozvoljenu brzinu:");
		int dozvoljenaBrzina = s.nextInt();
		auto.prekoracenje(dozvoljenaBrzina);
		if (auto.prekoracenje(dozvoljenaBrzina) == true) {
			System.out.println("Prekoracili ste brzinu");
		} else {
			System.out.println("Niste prekoracili brzinu");
		}
		auto.novcanaKazna(dozvoljenaBrzina);
		System.out.println("Novcana kazna je " + auto.novcanaKazna(dozvoljenaBrzina) + "din");
		
//		(Dopuna 2)
//		Dopuniti klasu Auto tako da ima:
//		atribut godinu proizvodnje
//		atribut mesec do kad je registrovan auto (int)
//		atribut kubikaza auta (npr: 1600 - 5000)
//		metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
//		metodu koja vraca da li je istekla registracije. Metoda kao parametar prima trenutni mesec i na 
//		osnovu toga vraca true ili false.
//		metodu koja racuna i vraca cenu registracije za auto. Za automobile do 2000 kubika cena registracije 
//		kubikaza * 100din, za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.

		auto.kubikaza = 2500;
		auto.mesecIstekaReg = 10;
		auto.godProizvodnje = 1970;
		auto.maxBrzina = 240;
		
		auto.oldtimer(); /// ova komanda ne mora
		System.out.println(auto.oldtimer());
		
		if (auto.isteklaRegistracija(8) == false) {
			System.out.println("Registracija nije istekla");		
		} else {
			System.out.println("Registracija je istekla");
		}
		
		System.out.println("Cena registracije bice: " + auto.cenaRegistracije());
	
		auto.klima = true;
		auto.brRegistracije = "PO-45698PL";
		
		auto.dodajGas();
		auto.dodajGas();
		auto.koci();
		System.out.println("Trenutna brzina je " + auto.trenutnaBrzina);
		System.out.println("Trenutna potrosnja je " + auto.trenutnaPotrosnja());
		
		auto.stampajTablu();
		auto.kapacitetRezervoara = 20;
		auto.trenutnoGoriva = 15;
		auto.natoci(4);
		System.out.println("Cena za gorivo je " + auto.natoci(70));
		
	}

}
