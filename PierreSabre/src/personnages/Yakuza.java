package personnages;

public class Yakuza extends Humain {
	
	int réputation=0;
	int victoire=0;
	private String clan;
	
	public Yakuza(String clan, int argent, String boisson, String nom) {
		super(nom, argent, boisson);
		this.clan=clan;
		
	}

	
	
	public int getRéputation() {
		return réputation;
	}
	public void setRéputation(int réputation) {
		this.réputation = réputation;
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
		réputation++;
		parler("J'ai piqué les sous à " + nom_commercant + " maintenant il a que "+ argent_du_commercant + "sous");
	}
	
	public void gagner() {
		réputation++;
		victoire++;
	}
	
	public int perdre() {
		int argent_yakuza= getArgent();
		argent_yakuza-=argent_yakuza;
		réputation--;
		parler("J'ai tout perdu !le monde est trop injuste ... ");
		return argent_yakuza;
	}
	
	public void direBonjour() {
		super.direBonjour();
		parler ("Mon clan est celui de " + clan);
		
	}
	
}
