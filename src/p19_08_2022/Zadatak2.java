package p19_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Zad Kreirati klasu Radnik koja ima:
//			jmbg radnika
//			ime i prezime
//			broj dece (1,2,3,... ili 0 ako nema dece)
//			stepen strucne spreme (od 1 do 8)
//			godine radnog staza
//			konstuktor koji postavlja samo jmbg
//			konstuktor koji postavlja sve atribute
//			getere i setere
//			metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
//			metodu koja vraca koeficijent slozenosti (Ima ispod kako se racuna)
//			metodu koja racuna platu radnika, plata se racuna po formuli:
//			25000 + (koeficijent slozenosti + minuli rad) * 10000
//			metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)
//
//			Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
//			- do 10 godina 0.05
//			- od 10-20 godina 0.075
//			- preko 20 godina 0.1
//
//			Koeficijent slozenosti
//			- (I stepen) Nekvalifikan radnik, koeficijent: 1,03;
//			- (II stepen) Osnovno obrazovanje, koeficijent: 1,65;
//			- (III stepen) Srednje obrazovanje u trajanju od dvije do tri god., koeficijent: 2,00;
//			- (IV stepen) Kvalifikacija srednjeg opšteg i stručnog obrazovanja, koeficijent: 2,27;
//			- (V stepen) Kvalifikacija višeg stručnog obrazovanja, koeficijent: 2,88;
//			- (VI stepen) Visoko obrazovanje, koeficijent: 3,09;
//			- (VII stepen) Fakultetsko, odnosno visoko obrazovanje - Bechelor, koeficijent: 3,40;
//			- (VIII stepen) Doktorat nauka, koeficijent: 4,12.

		
		Radnik stefan = new Radnik("123654789", "Stefan Stefanovic", 5, "IV", 15);
		System.out.println("Minuli rad je " + stefan.minuliRad());
		System.out.println("KS je " + stefan.koeficijentSlozenosti());
		System.out.println("Stefanova plata je " + stefan.racunajPlatu() + 
				" din, pa na osnovu toga zakljucijemo da je on kreditno sposoban: " + stefan.kreditnoSposoban());
		
		Radnik milan = new Radnik("879456123", "Milan Milanovic", 2, "VII", 5);
		System.out.println("Minuli rad je " + milan.minuliRad());
		System.out.println("KS je " + milan.koeficijentSlozenosti());
		System.out.println("Stefanova plata je " + milan.racunajPlatu() + 
				" din, pa na osnovu toga zakljucijemo da je on kreditno sposoban: " + milan.kreditnoSposoban());
		
		
		

	}

}
