package p22_08_2022;

public class YoutubePlayer {
//	Kreirati klasu YoutubePlayer koja ima:
//		svi atributi su private
//		objekat video
//		kvalitet videa (moze da bude 144, 240, 360, 480, 720, 1080)
//		rezim koji moze da bude - mini player , bioskopski rezim , preko celog ekrana
//		jacinu zvuka
//		trenutno vreme videa u reprodukciji
//		gettere za sve atribute
//		samo difoltni konstuktor, i njemu se svuk postavlja na 75 i kvalitet po difoltu na 144 kao i rezim na mini player.

	private Video video;
	private int kvalitet;	//44, 240, 360, 480, 720, 1080
	private String rezim;  //mini player , bioskopski rezim , preko celog ekrana
	private int jacinaZvuka;
	private int vremeReprodukcije;
	
	
	public YoutubePlayer() {		
	}


	public void setKvalitet(int kvalitet) { 	//144
		this.kvalitet = kvalitet;
	}


	public void setRezim(String rezim) {		//mini player
		this.rezim = rezim;
	}


	public void setJacinaZvuka(int jacinaZvuka) {	//75
		this.jacinaZvuka = jacinaZvuka;
	}


	public Video getVideo() {
		return video;
	}


	public int getKvalitet() {
		return kvalitet;
	}


	public String getRezim() {
		return rezim;
	}


	public int getJacinaZvuka() {
		return jacinaZvuka;
	}


	public int getVremeReprodukcije() {
		return vremeReprodukcije;
	}
//	metodu ucitajVideo kojoj se prosledjuje referenca do videa koji se pusta. Trenutno vreme kada se ucita 
//	video se postavlja na nulu. Treba videu da povecamo broj pregleda!

	
	
	
}
