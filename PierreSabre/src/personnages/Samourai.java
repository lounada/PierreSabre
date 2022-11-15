package personnages;

public class Samourai extends Ronin {
	private String seigneur;
	public Samourai(int argent, String boisson, String nom, String seigneur) {
		super(argent, boisson, nom);
		this.seigneur = seigneur;
	}
	@Override
	public void direBonjour() {
		// TODO Auto-generated method stub
		super.direBonjour();
		
	}
	
	
	
	
	}