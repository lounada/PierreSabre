package personnages;

public class Commercant extends Humain{

	public Commercant(int argent, String nom , String boisson) {
		super(nom, argent, "thé");}
	
	public int seFaireExtorque() {
		perdreArgent(getArgent());
		parler ("J'ai tout perdu! le monde est vraiment injuste");
		return getArgent();
	}
	
	public void recevoir(int argentbis) {
		ajouterArgent(argentbis);
	}
	public void boire (String boisson) {
		String mot1= "Mmmm un bon verre de  :";
		String mot2 = " GLOUPS!";
		parler ( mot1 + boisson + mot2);
	}

}