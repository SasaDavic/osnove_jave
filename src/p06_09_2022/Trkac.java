package p06_09_2022;

public class Trkac extends Atleticar{
//	Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar. Kod trkača je bolji manji rezultat


	public Trkac(String imeIPrezime, double rezultat) {
		super(imeIPrezime, rezultat);
		
	}

	public boolean boljiRezultat(Atleticar atleticar) {
		if(this.rezultat > atleticar.rezultat) {
			System.out.println("Jeste bolji rezultat");
			return true;
		} else {
			return false;
		}
	}
	
	
}
