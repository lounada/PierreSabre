package personnages;

public class Yakuza extends Humain {
	
	int r�putation=0;
	int victoire=0;
	private String clan;
	
	public Yakuza(String clan, int argent, String boisson, String nom) {
		super(nom, argent, boisson);
		this.clan=clan;
		
	}

	
	
	public int getR�putation() {
		return r�putation;
	}
	public void setR�putation(int r�putation) {
		this.r�putation = r�putation;
	}
	
	public String getClan() {
		return clan;
	}
	public void setClan(String clan) {
		this.clan = clan;
	}

	
	
	public void extorquer(Commercant commercant) {
		int argent_du_commercant = commercant.seFaireExtorque();
		String nom_commercant= commercant.getNom();
		r�putation++;
		parler("J'ai piqu� les sous � " + nom_commercant + " maintenant il a que "+ argent_du_commercant + "sous");
	}
	
	public void gagner() {
		r�putation++;
		victoire++;
	}
	
	public int perdre() {
		int argent_yakuza= getArgent();
		argent_yakuza-=argent_yakuza;
		r�putation--;
		parler("J'ai tout perdu !le monde est trop injuste ... ");
		return argent_yakuza;
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler ("Mon clan est celui de " + clan);
		
	}
	
}
