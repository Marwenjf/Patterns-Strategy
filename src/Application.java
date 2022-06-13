
public class Application {

	public static void main(String[] args) {
		Canard c = new Colvert();
		c.nager();
		c.afficher();
		c.setComportementVol(new VollerAvecDesAilles());
		c.effectuerVol();
		c.setComportementVol(new NePasVoller());
		c.effectuerVol();

	}

}
