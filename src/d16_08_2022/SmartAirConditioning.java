package d16_08_2022;

public class SmartAirConditioning {
	
	public String marka;
	public double temperatura;
	public String mod;
	
	public void stampaj() {
		System.out.println("Klima " + this.marka + ", " + this.mod + ", " + this.temperatura + " C");
	}
//	public String temp(int napolju) {
//			if (this.temperatura > napolju) {
//				return "Napolju je manja temperatura";
//			}
//			return "Napolju je veca temperatura";
//	}
	// ILI
	public boolean temp(int napolju) {
		return (this.temperatura < napolju) ? true : false;
	}


}
