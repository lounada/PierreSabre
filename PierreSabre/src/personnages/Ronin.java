package personnages;

public class Ronin extends Humain {
	
	int honneur=1;
	int argentR;
	public Ronin(int argent, String boisson, String nom) {
		super(nom,argent,boisson);
		// TODO Auto-generated constructor stub
	}
	void donnerArgentCommercant(int argentc, Commercant commercant) {
		int argent_du_commercant = commercant.ajouterArgent(argentc);
		String nomcom= commercant.getNom();
		parler ( "J'ai donné " + argentc + "sous au commercant " + nomcom + ". Maintenant il a " + argent_du_commercant + "sous");
	}
	void provoquerDuel(Yakuza yakuza) {
		int dblhonneurR= honneur*honneur;
		int repY= yakuza.getRéputation();
		
		if (dblhonneurR>repY) {           //ronin gagne Yazuka perd
			int argentY= yakuza.getArgent();
			argentR+=argentY;
			yakuza.perdre();
			honneur++;
			parler("je t'ai eu petit yakuza" );
		}
		else {                           //Ronin perd, Yazuka gagne
			yakuza.gagner();
			honneur--;
			parler("j'ai perdu contre le yakuza mon honneur et ma bourse ont en pris un coup ");
		}
	}
		
	
}