package p16_08_2022_i_18_08_2022;

public class SlackMessage {
//	tekst poruke
//	ime i prezime osobe koja je stavila poruku
//	datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
	
	public String text;
	public String sender;
	public String dateTime;
	
//	Dopuna:
//	Dopunite klasu SlackMessage metodom za stampu koja stampa podatke u formatu koji je naveden 
//	iznad i u mainu pozovite metode nad objektima koje ste kreirali.

	public void stampaj() {
		System.out.println(this.sender + " - " + this.dateTime);
		System.out.println(this.text);
		
	}
	
	
}
