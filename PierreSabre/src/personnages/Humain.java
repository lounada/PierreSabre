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
		
		parler ("Bonjour ! Je m’appelle " + nom + " et j’aime boire : " + boisson + " .J'ai  "+ argent+ "sous en poche");
		
	}
	
	public void boire() {
		parler( "Ahhh, un bon verre de " + boisson + "! GLOUPS !");
	}
	public void boire (String boisson) {
		parler ("Mmmm un bon verre de  :" + boisson +  " GLOUPS!");
	}

	
	public int ajouterArgent(int somme) {
		return argent=argent+somme;
	}
	public int perdreArgent(int somme) {
		return argent=argent-somme;
	}

	}

