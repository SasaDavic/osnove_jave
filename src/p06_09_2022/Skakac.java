package p06_09_2022;

public class Skakac extends Atleticar{
//	Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar. Kod trkača je bolji manji rezultat, 
//	a kod skakača veći. 
	
	public Skakac(String imeIPrezime, double rezultat) {
		super(imeIPrezime, rezultat);
		
	}

	public boolean boljiRezultat(Atleticar atleticar) {
		if(this.rezultat < atleticar.rezultat) {
			System.out.println("Jeste bolji rezultat");
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
}
