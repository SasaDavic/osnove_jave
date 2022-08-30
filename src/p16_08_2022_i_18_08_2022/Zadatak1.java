package p16_08_2022_i_18_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.

//Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun. 
//Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
//
//Primer izvrsenja:
//Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//Primalac: Marko Markovic, 840-23932-334, stanje: 200
//Unesite sumu za transakciju: 500
//Stanje nakon stransakcije
//Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//Primalac: Marko Markovic, 840-23932-334, stanje: 700

		Scanner s = new Scanner(System.in);
		Racun posaljilac = new Racun();
		posaljilac.broj = "840-89650000-30";
		posaljilac.vlasnik = "Pera Peric";
		posaljilac.stanje = 100000;
		System.out.println("Posaljilac: " + ", " + posaljilac.vlasnik + ", " +
		posaljilac.broj + ", stanje: " + posaljilac.stanje);
		
		Racun primalac = new Racun();
		primalac.broj = "980-78500000-62";
		primalac.vlasnik = "Petar Petric";
		primalac.stanje = 560;
		System.out.println("Primalac: " + ", " + primalac.vlasnik + ", " +
				primalac.broj + ", stanje: " + primalac.stanje);
		
		System.out.print("Unesite sumu za transakciju: ");
		int suma = s.nextInt();
		primalac.stanje += suma;
		posaljilac.stanje -= suma;
		
		System.out.println("Posaljilac: " + ", " + posaljilac.vlasnik + ", " +
				posaljilac.broj + ", stanje: " + posaljilac.stanje);
		System.out.println("Primalac: " + ", " + primalac.vlasnik + ", " +
				primalac.broj + ", stanje: " + primalac.stanje);
	}

}
