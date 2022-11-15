package histoire;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain h = new Humain("prof",54,"kambucha");
		h.direBonjour();
		h.boire();
		
		Commercant c= new Commercant(20,"Marco");
		c.direBonjour();
		
		Yakuza y = new Yakuza ("warsong",42,"whisky", "Yaku_le_noir");
		y.direBonjour();
		y.extorquer(c);
		
		Ronin r = new Ronin(1,"shochu","Roro");
		r.donnerArgentCommercant(10, c);
		r.provoquerDuel(y);
		r.direBonjour();
		
		
	}}
