package p16_08_2022_i_18_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Krairti klasu SlackMessage koja ima:
//			tekst poruke
//			ime i prezime osobe koja je stavila poruku
//			datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//			U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//			[ime i prezime osobe] - [kad je poslata]
//			[Tekst poruke]
//
//			Dopuna:
//			Dopunite klasu SlackMessage metodom za stampu koja stampa podatke u formatu koji je naveden 
//			iznad i u mainu pozovite metode nad objektima koje ste kreirali.

		SlackMessage poruka1 = new SlackMessage();
		poruka1.text = "Zdravo. Kako si? ";
		poruka1.sender = "Julija";
		poruka1.dateTime = "26.08.1985. 18:55";
		System.out.println(poruka1.sender + " - " + poruka1.dateTime);
		System.out.println(poruka1.text);
		
		SlackMessage poruka2 = new SlackMessage();
		poruka2.text = "Pregazeno!";
		poruka2.sender = "Romeo";
		poruka2.dateTime = "26.08.2022. 00:00";
		System.out.println(poruka2.sender + " - " + poruka2.dateTime);
		System.out.println(poruka2.text);
		
		System.out.println("----------------------------------");
		poruka1.stampaj();
		poruka2.stampaj();
		
		
		
		
	}

}
