public class Pion {
	private char Etat;
	private int Px;
	private int Py;

	public Pion(char c) {
		// TODO Auto-generated constructor stub
		this.Etat = c;
		this.Px = -1;
		this.Py = -1;
	}

	public void placerPion(Pion p) {
		// TODO Auto-generated constructor stub
		this.Etat = p.getEtat();
		this.Py = p.getPy();
		this.Px = p.getPx();
	}

	public Pion(char c, int x, int y) {
		this.Etat = c;
		this.Px = x;
		this.Py = y;

	}

	public char getEtat() {
		return Etat;
	}

	public void setEtat(char etat) {
		Etat = etat;
	}

	public int getPx() {
		return Px;
	}

	public void setPx(int px) {
		Px = px;
	}

	public int getPy() {
		return Py;
	}

	public void setPy(int py) {
		Py = py;
	}

	public void afficher_Pion() {
		System.out.println("Etat " + Etat);
		System.out.println("X " + Px);
		System.out.println("Y " + Py);
	}
}
