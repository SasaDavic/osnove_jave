package p05_09_2022;

public abstract class Figura {
//	 Zadatak
//	 Kreirati abstraktnu klasu Figura koja ima
//	 abstraktnu metodu povrsina
//	 abstraktnu metodu obim
//	 metodu koja stampa podatke u formatu:
//	 Povrsina je (povrsina)
//	 Obim je (obim)
	
	
	
	public abstract void povrsina();
	
	public abstract void obim();
	
	public void stampaj() {
		System.out.println("Povrsina je ");
		System.out.println("Obim je ");
	}
	
	
	
	
	
	
	
}
