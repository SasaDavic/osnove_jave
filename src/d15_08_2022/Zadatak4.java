package d15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati metodu koja stampa podatke o korisniku u formatu:
//			JMBG: [jmbg]
//			Ime: [ime]
//			Prezime: [prezime]
//			God. rodjenja: [god]
//			Aktivan: [true/false]
//			Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.
		
		printPodaci(0124567, "Sasa", "Davic", 9874, true);
		

	}
	public static void printPodaci(int jmbg, String ime, String prezime, int gRodjenja, boolean aktivan) {
		System.out.println("JMBG: " + jmbg);
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("God. rodjenja: " + gRodjenja);
		System.out.println("Aktivan: " + aktivan);
	}
	

}
