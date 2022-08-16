package p16_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kreirati klasu Racun koja ima
////		broj racuna (npr: 840-23932-323)
////		ime i prezime vlasnika
////		stanje na racunu
////		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.
		
//		Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun. Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
//
//		Primer izvrsenja:
//		Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//		Primalac: Marko Markovic, 840-23932-334, stanje: 200
//		Unesite sumu za transakciju: 500
//		Stanje nakon stransakcije
//		Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//		Primalac: Marko Markovic, 840-23932-334, stanje: 700

		Scanner s = new Scanner(System.in); 
		
		Racun prvi = new Racun();
		prvi.brojRacuna = "840-23932-323";
		prvi.imeIPrezime = "Milan Jovanovic";
		prvi.stanjeNaRacunu = 1000;
		
		Racun drugi = new Racun();
		drugi.brojRacuna = "840-23932-334";
		drugi.imeIPrezime = "Marko Markovic";
		drugi.stanjeNaRacunu = 200;
		
		System.out.println("Posaljilac: " + prvi.imeIPrezime + ", " + prvi.brojRacuna + ", " + prvi.stanjeNaRacunu);
		System.out.println("Primalac: " + drugi.imeIPrezime + ", " + drugi.brojRacuna + ", " + drugi.stanjeNaRacunu);
		System.out.println("Unesite sumu za transakciju: ");
		int suma = s.nextInt();
		prvi.stanjeNaRacunu = prvi.stanjeNaRacunu - suma;
		drugi.stanjeNaRacunu = drugi.stanjeNaRacunu + suma;
		
		System.out.println("Stanje nakon transakcije");
		System.out.println("Posaljilac: " + prvi.imeIPrezime + ", " + prvi.brojRacuna + ", " + prvi.stanjeNaRacunu);
		System.out.println("Primalac: " + drugi.imeIPrezime + ", " + drugi.brojRacuna + ", " + drugi.stanjeNaRacunu);
		
	}

}
