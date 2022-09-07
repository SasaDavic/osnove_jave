package p06_09_2022;

import java.util.ArrayList;

public class Disciplina {
//	Kreirati i klasu Disciplina čiji su privatni atributi: 
//	ime discipline
//	tip discipline (Trkacka ili Skakacka)
//	niz atletičara koji učestvuju u toj disciplini. 
//	U javnom delu klase definisati: 
//	konstuktore, gettere i settere
//	konstruktor koji postavlja ime discipline i tip

	
	private String imeDiscipline;
	private String tipDiscipline;
	private ArrayList<Atleticar> atleticar = new ArrayList<>();
	
	public Disciplina(String imeDiscipline, String tipDiscipline) {
		this.imeDiscipline = imeDiscipline;
		this.tipDiscipline = tipDiscipline;
	}

	public String getImeDiscipline() {
		return imeDiscipline;
	}

	public void setImeDiscipline(String imeDiscipline) {
		this.imeDiscipline = imeDiscipline;
	}

	public String getTipDiscipline() {
		return tipDiscipline;
	}

	public void setTipDiscipline(String tipDiscipline) {
		this.tipDiscipline = tipDiscipline;
	}
	
//	metodu dodaj atleticara u disciplinu
//	metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
	
	public void dodajAtleticara(Atleticar atlet) {
		atleticar.add(atlet);
	}
	
	public void diskvalifikujAtleticara(String imeAtlete) {
		for (int i = 0; i < atleticar.size(); i++) {
			if(atleticar.get(i).getImeIPrezime().equals(imeAtlete)) {
				atleticar.remove(i);
			}
		}
	}
	

//	(za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim 
//	rezultatom 
//	(za vezbanje) metoda koja prikazuje podatke o pobedniku discipline. 
	
//	private Atleticar najboljiRezultat() {
//		int redniBroj = 0;
//		for (int i = 0; i < atleticar.size(); i++) {
//			boljiRezultat() == true;
//			redniBroj = i;					
//		}
//		return atleticar.get(redniBroj);
//	}
//	
	
	
	
}
