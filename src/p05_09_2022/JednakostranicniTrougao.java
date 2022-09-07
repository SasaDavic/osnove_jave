package p05_09_2022;

public class JednakostranicniTrougao extends Figura{
	
//	 Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//	 stranicu a
//	 gettere/settere/konstruktore
//	 implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//	 implementira metodu obim
	
	private int a;

public JednakostranicniTrougao(int a) {
	super();
	this.a = a;
}


	
public void povrsina() {
	double p = (a * a) * 1.73205 / 4;
	System.out.println(p);
}

public void obim() {
	double o = 3 * a;
	System.out.println(o);
}
	

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public void stampaj() {
	System.out.print("Povrsina je ");
	this.povrsina();
	System.out.print("Obim je ");
	this.obim();
}	
	
	
}
