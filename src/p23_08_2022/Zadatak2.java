package p23_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		FizickoLice kupac = new FizickoLice("Pera Peric", 62398, "789456123963", true);
		FizickoLice prodavac = new FizickoLice("Mitar Miric", 41258, "789456321456", false);
		
		Ugovor ugovor = new Ugovor(2022, 7, 25, prodavac, kupac, 38000, "Strahinjica Bana 2");
		
		ugovor.stampajUgovor();
		
		
		
	}

}
