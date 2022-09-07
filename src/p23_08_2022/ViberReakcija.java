package p23_08_2022;

public class ViberReakcija {
//	Kreirati klasu ViberReakcija koja ima:
//	emoji (moze da bude sunglases, heart, smile, like ili sad)
//	korisnika koji je reagovao
//	U mainu kreirati nekoliko poruka izmedju dva korisnika i postavite nekoliko reakcija na poruke.
	
	private String emoji;
	private ViberKorisnik reagovao;
	
	
	
	public ViberReakcija(String emoji, ViberKorisnik reagovao) {
		
		this.emoji = emoji;
		this.reagovao = reagovao;
	}
	public String getEmoji() {
		return emoji;
	}
	public void setEmoji(String emoji) {
		this.emoji = emoji;
	}
	public ViberKorisnik getReagovao() {
		return reagovao;
	}
	public void setReagovao(ViberKorisnik reagovao) {
		this.reagovao = reagovao;
	}
	
	
	
	
}
