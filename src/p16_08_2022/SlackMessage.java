package p16_08_2022;

public class SlackMessage {
	
	public String tekst;
	public String ime;
	public String datumIVreme;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void stampaj() {
		System.out.println(this.ime + " - " + this.datumIVreme);
		System.out.println(this.tekst);
	}
}
