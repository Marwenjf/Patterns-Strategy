
public abstract class Canard {
	private ComportementCancan comportementCancan;
	private ComportementVol comportementVol;

	public void nager() {
		System.out.println("Je nage..");
	}

	public void setComportementCancan(ComportementCancan comportementCancan) {
		this.comportementCancan = comportementCancan;
	}

	public void setComportementVol(ComportementVol comportementVol) {
		this.comportementVol = comportementVol;
	}

	public abstract void afficher();

	public void effectuerVol() {
		comportementVol.voler();
	}

	public void effectuerCancan() {
		comportementCancan.concaner();
	}
}
