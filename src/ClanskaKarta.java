
public class ClanskaKarta {
//	Kreirati klasu ClanskaKarta koja ima:
//	popust (u rasponu od 5 do 10 %)
//	broj kartice (npr: 9329-0239)
//	gettere i setter 
//	konstuktore
	
	private int popust;
	private String broj;
		
	public ClanskaKarta(int popust, String broj) {

		this.popust = popust;
		this.broj = broj;
	}
	public int getPopust() {
		return popust;
	}
	public void setPopust(int popust) {
		this.popust = popust;
	}
	public String getBroj() {
		return broj;
	}
	public void setBroj(String broj) {
		this.broj = broj;
	}
	
	
	
}
