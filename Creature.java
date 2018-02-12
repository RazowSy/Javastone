public class Creature extends Carte{
	public int vie;
	public int attaque;
	public boolean gardien;

	@Override
	public String toString() {
		return "Creature [nom=" + nom + ", vie=" + vie + ", attaque=" + attaque
				+ ", gardien=" + gardien + "]";
	}

	public Creature(String nom, int cout, int vie, int attaque, boolean gardien){
		super(nom, cout);
		this.vie=vie;
		this.attaque=attaque;
		this.gardien=gardien;
	}


	@Override
	public String getNom() {
		return super.nom;
	}

	public int getVie() {
		return vie;
	}

	public int getAttaque() {
		return attaque;
	}

	public boolean getGardien() {
		return gardien;
	}

	public void setNom(String nom) {
		super.nom = nom;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}

	public void setGardien(boolean gardien) {
		this.gardien = gardien;
	}

	public boolean estMort() {
		return (vie <= 0);
	}

	public int estAttaque(int attaqueEnnemie) {
		return vie -= attaqueEnnemie;
	}


	public String jouerCarte(Creature c, Plateau p, Main m){
		if ( p.plateauPlein()){// si la carte est bien dans la main
				return "vous ne pouvez jouer cette creature, votre plateau est plein";
			}else if (m.main.contains(c) && (achatCarte(c)==true)){
				m.main.remove(c); // on enleve la carte de la main
				p.plateau.add(c);// on ajoute la carte au plateau 
				return "votre carte a bien été posée";
			}else {
				return "vous ne possédez pas cette carte dans votre main, merci d'utiliser une carte valide"; 
			}
		}
	}
