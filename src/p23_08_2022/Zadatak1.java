package p23_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		
//U glavnom programu kreirati objekte definisanih klasa i testirati rad definisanih funkcija 
//
		Korisnik host = new Korisnik();
		host.setImeIPrezime("Korisnik HOST");
		host.pretplatiSe(150);
		
		Korisnik guest = new Korisnik();
		guest.setImeIPrezime("Korisnik GUEST");
		
		ZoomCall call = new ZoomCall("wwww.gjgadskdhasjkd", "hkadUhad69", host, guest);
		
		host.stampaj();
		guest.stampaj();
		
		call.pokreniPoziv();
		

		
		
		
	}

}
