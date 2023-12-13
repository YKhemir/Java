
public class Cercle {
	// Attributs de la classe Cercle 
	private double x;
	private double y;
	private double r;
	
	// Méthodes
	public void deplace (double x, double y) {
		this.setX(x) ;
		this.setY(y);
	}
	
	public double surface () {
		return Math.PI * Math.pow(getR(), 2 );
	}
	
	
	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}
	
	

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	// Constructeur 
	public Cercle(double x, double y, double r) {
		this.setX(x);
		this.setY(y);
		this.setR(r);
	}
	public void affiche() {
		System.out.println("Cercle de rayon :" + r);
		System.out.println("Centre du cercle :" + x + ","+ y);
		System.out.println("Le nouveaux cordoonées du centre sont : " + x +", "+ y);
		System.out.println("La surface du cercle est de : " + surface());
		
	}
	
}
