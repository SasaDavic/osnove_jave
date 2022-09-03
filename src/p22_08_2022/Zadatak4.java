package p22_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		Video video = new Video("https://www.youtube.com/watch?v=d5sRPOXTNvE", "Ibiza Summer Mix 2022", 235, 19076, 56, 1340007);
		YoutubePlayer player = new YoutubePlayer();
		player.setVideo(video);
		
		System.out.println(video.getDuzinaVideaS());
		player.iscitaj();
		
		System.out.println(player.sherovanje());
		player.aktivirajBioskopskiMod();
		player.postaviKvalitet(8);
		player.pojacaj();
		player.premotajUnapred();
		player.iscitaj();
	
	}

}
