package personnages;


public class Humain {
	private int argent;
	private String boisson;
	private String nom;

	

	public Humain( String nom, int argent,String boisson) {
		super();
		this.argent = argent;
		this.boisson = boisson;
		this.nom = nom;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}
	

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void parler(String texte) {
		System.out.println("("+nom+") "+" - "+texte);
	}
	
	public void direBonjour() {
		String mot1="Bonjour ! Je m’appelle ";
		String mot2=" et j’aime boire : ";
		String mot5= " .J'ai actuellement ";
		String mot6= "sous en poche";
		parler (mot1 + nom + mot2 + boisson + mot5+ argent+ mot6);
		
	}
	
	public void boire() {
		String mot3= "Ahhh, un bon verre de ";
		String mot4= "! GLOUPS !";
		parler(mot3 + boisson + mot4);
	}
	public void boire (String boisson) {
		String mot1= "Oh chouette je vais boire une goutte de :";
		String mot2 = " GLOUPS!";
		parler ( mot1 + boisson + mot2);
	}

	
	public int ajouterArgent(int somme) {
		return argent=argent+somme;
	}
	public int perdreArgent(int somme) {
		return argent=argent-somme;
	}

	}

