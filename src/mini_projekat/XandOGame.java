package mini_projekat;

import java.util.ArrayList;

public class XandOGame{
//	Kreirati klasu XandOGame koja ima:
//	table - niz koji cuva stanje igre. Npr: table = x, x, 0, 0, x, 0, x, 0, x
//	nextPlayer - atribut koji cuva informaciju ko igra sledeci. Moze da ima vrednosti x ili o
//	playerX - igrac X
//	playerO - igrac O
//	Difoltni konstuktor koji u niz dodaje 9 elemenata. Svaki element u nizu je “ “
//	Kontuktor koji prima dva parametra, igraca x i igraca o i ovaj kontuktor radi sve sto radi i difoltni samo sto dodatno postavlja i igraca
//	gettere i settere za igrace
	
	private ArrayList<String> table = new ArrayList<String>();
	private boolean nextPlayer;
	private Player playerX; 
	private Player playerO;
	
	public XandOGame() {
		for (int i = 0; i < 9; i++) {
			this.table.add(" ");
		}		
	}
	
	public XandOGame(Player playerX, Player playerO) {
		for (int i = 0; i < 9; i++) {
			this.table.add(" ");
		}	
		this.playerX = playerX;
		this.playerO = playerO;
	}

	public ArrayList<String> getTable() {
		return table;
	}

	public void setTable(ArrayList<String> table) {
		this.table = table;
	}

	public boolean getNextPlayer() {
		return nextPlayer;
	}

	public void setNextPlayer(boolean nextPlayer) {
		this.nextPlayer = nextPlayer;
	}

	public Player getPlayerX() {
		return playerX;
	}

	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}

	public Player getPlayerO() {
		return playerO;
	}

	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}
//	Metodu print koja stampa tablu sliku kao na slici. Stampanje se vrsi petljom. Ako je niz iz primera iznad stampa izgleda:
//	x | x | 0 |
//	0 | x | 0 |
//	x | 0 | x |
	
	public void print() {
		for (int i = 0; i < 3; i++) {
			System.out.print(this.table.get(i) + " | ");
		}
		System.out.println();
		for (int i = 3; i < 6; i++) {
			System.out.print(this.table.get(i) + " | ");
		}
		System.out.println();
		for (int i = 6; i < 9; i++) {
			System.out.print(this.table.get(i) + " | ");
		}
		System.out.println();
	}
//
//	Metodu startGame, metoda postavlja sve elemente niza na prazan string “ “ i zatim postavlja da je na redu igrac X.
//	Metodu isGameOver, igra je gotova ako su sva polja popunjena.
	
	public void startGame() {
		for (int i = 0; i < 9; i++) {
			this.table.set(i, " ");
		}
		this.setNextPlayer(true);		
	}
	public int isGameOver() {
		if (!this.table.get(0).equals(" ") && !this.table.get(1).equals(" ") && !this.table.get(2).equals(" ")
				&& !this.table.get(3).equals(" ") && !this.table.get(4).equals(" ") && !this.table.get(5).equals(" ")
				&& !this.table.get(6).equals(" ") && !this.table.get(7).equals(" ") && !this.table.get(8).equals(" ")) {
			
			return 3;
		} else {
			
			return 0;
		}
	}
//	Metodu isFieldFree, koja vraca da li je trazeno polje slobodno. Metoda od parametara prima niz i 
//	poziciju za kojju se proverava. Polje je slobodno ako u njemu ne pise x ili o
//	Metodu playNext, metoda prebacuje potez na sledeceg igraca, ako je bio igrac x prebacuje ga na o i obrnuto
	
	public boolean isFieldFree(int pozicija) {
		if (this.table.get(pozicija).equals("x") || this.table.get(pozicija).equals("o")) {
			return false; //popunjeno polje
		} else {
			return true;
		}
	}
	public void playNext() {
		if (this.nextPlayer == true) {
			System.out.println("Sada je na redu igrac Oks!");
			this.nextPlayer = false;
		} else {
			System.out.println("Sada je na redu igrac Iks!");
			this.nextPlayer = true;
		}
	}
//	Metodu makeAMove, metoda prima poziciju gde moze da odigra potez.
//	Ako je trenutno stanje u igri i sledeci na redu je igrac x
//	x | x | 0 |
//	0 |   |   |
//	x |   |   |
//	I pozove se metoda makeAMove za poziciju 5, novo stanje u igri je 
//	x | x | 0 |
//	0 |   | x |
//	x |   |   |
	
	public void makeAMove(int potez) {
		if (nextPlayer == true) {
			this.table.set(potez, "x");
		} else {
			this.table.set(potez, "o");
		}
	}
//	Metodu isWinnerX - metoda vraca rezultat igre za igraca X. Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
//	Metodu isWinnerO -  metoda vraca rezultat igre za igraca O. Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
	
	public boolean isWinnerX() {
		if ((this.table.get(0).equals("x") && this.table.get(1).equals("x") && this.table.get(2).equals("x")) ||
				(this.table.get(3).equals("x") && this.table.get(4).equals("x") && this.table.get(5).equals("x")) ||
				(this.table.get(6).equals("x") && this.table.get(7).equals("x") && this.table.get(8).equals("x")) ||
				(this.table.get(0).equals("x") && this.table.get(3).equals("x") && this.table.get(6).equals("x")) ||
				(this.table.get(1).equals("x") && this.table.get(4).equals("x") && this.table.get(7).equals("x")) ||
				(this.table.get(2).equals("x") && this.table.get(5).equals("x") && this.table.get(8).equals("x")) ||
				(this.table.get(0).equals("x") && this.table.get(4).equals("x") && this.table.get(8).equals("x")) ||
				(this.table.get(2).equals("x") && this.table.get(4).equals("x") && this.table.get(6).equals("x")) ){
			System.out.println("Pobednik je igrac X!");
			return true;
		} else {
			return false;
		}
	}
	public boolean isWinnerO() {
		if ((this.table.get(0).equals("o") && this.table.get(1).equals("o") && this.table.get(2).equals("o")) ||
				(this.table.get(3).equals("o") && this.table.get(4).equals("o") && this.table.get(5).equals("o")) ||
				(this.table.get(6).equals("o") && this.table.get(7).equals("o") && this.table.get(8).equals("o")) ||
				(this.table.get(0).equals("o") && this.table.get(3).equals("o") && this.table.get(6).equals("o")) ||
				(this.table.get(1).equals("o") && this.table.get(4).equals("o") && this.table.get(7).equals("o")) ||
				(this.table.get(2).equals("o") && this.table.get(5).equals("o") && this.table.get(8).equals("o")) ||
				(this.table.get(0).equals("o") && this.table.get(4).equals("o") && this.table.get(8).equals("o")) ||
				(this.table.get(2).equals("o") && this.table.get(4).equals("o") && this.table.get(6).equals("o")) ){
			System.out.println("Pobednik je igrac O!");
			return true;
		} else {
			return false;
		}
	}
	
//	Metodu isValidMove koja vraca informaciju da li je pozicija na koju igrac zeli da odigra potez validna. 
//	Pozicija je validna ako je u opsegu od 0 do 8

	
	public boolean isValidMove(int pozicija) {
		if (pozicija >= 0 && pozicija <= 8) {
			System.out.println("Potez je validan!");
			return true;
		} else {
			System.out.println("Potez nije validan");
			return false; ///igra ponovo ako potez nije validan
		}
	}
//	Metodu gameScore, metoda vraca informaciju za kraj igre.
//	Ukoliko je pobednik igrac x, metoda vraca 1
//	Ukoliko je pobednik igrac o, metoda vraca 2
//	Ukoliko nemam pobednika vracamo 0
	
	public int gameScore() {
		if (this.isWinnerX() == true) {
			return 1;
		} else if (this.isWinnerO() == true) {
			return 2;
		} else {
			return 0;
		}
		
	}
	
	
	
	
}
