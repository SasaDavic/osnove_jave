package d22_08_2022;

public class Knjiga {
//	Kreirati klasu Knjiga koji ima:
//	-ISBN
//	-naziv
//	-godina izdanja
//	-autor
//	-konstuktore koje mislite da su vam potrebni
//	-gettere i settere za atribute
//	-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//	(ISBN)
//	(naziv) - (godina izdanja)
//	autor: (ime autora) (prezime autora) 
	private String isbn;
	private String naziv;
	private int godIzdanja;
	private Autor autor;
	
	public Knjiga(String isbn, String naziv, int godIzdanja, Autor autor) {
		
		this.isbn = isbn;
		this.naziv = naziv;
		this.godIzdanja = godIzdanja;
		this.autor = autor;
		
		
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodIzdanja() {
		return godIzdanja;
	}

	public void setGodIzdanja(int godIzdanja) {
		this.godIzdanja = godIzdanja;
	}

	public Autor getAutor() {
		return autor;
	}
	
//	(ISBN)
//	(naziv) - (godina izdanja)
//	autor: (ime autora) (prezime autora) 
	public void print() {
		System.out.println(this.isbn);
		System.out.println(this.naziv + " - " + this.godIzdanja);
		System.out.println("autor: " + this.autor.getIme() + " " + this.autor.getPrezime());
		autor.print(); //drugi nacin za prethodni red
	}
	
}
