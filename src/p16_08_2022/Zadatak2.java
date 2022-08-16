package p16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Krairti klasu SlackMessage koja ima:
//			tekst poruke
//			ime i prezime osobe koja je stavila poruku
//			datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//			U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//			[ime i prezime osobe] - [kad je poslata]
//			[Tekst poruke]
//		
//		Dopuna:
//			Dopunite klasu SlackMessage metodom za stampu koja stampa podatke u formatu 
//			koji je naveden iznad i u mainu pozovite metode nad objektima koje ste kreirali.

		
		SlackMessage poruka1 = new SlackMessage();
		poruka1.tekst = "hello";
		poruka1.ime = "Pera Peric";
		poruka1.datumIVreme = "26.08.2021 18:55";
		
		SlackMessage poruka2 = new SlackMessage();
		poruka2.tekst = "hello";
		poruka2.ime = "Mira Peric";
		poruka2.datumIVreme = "16.09.2021 12:45";
		
		poruka1.stampaj();
		poruka2.stampaj();
		
		
//		System.out.println(poruka1.ime + " - " + poruka1.datumIVreme);
//		System.out.println(poruka1.tekst);
//		System.out.println();
//		System.out.println(poruka2.ime + " - " + poruka2.datumIVreme);
//		System.out.println(poruka2.tekst);
//		
		
	}

}
