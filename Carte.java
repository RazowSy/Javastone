
public class Carte {
	
	public int cout;
	public String nom;


	public Carte(String nom, int cout){
		this.cout=cout;
		this.nom=nom; 
	}

	@Override
	public String toString() {
		return "Carte [cout=" + cout + ", nom=" + nom + "]";
	}
	
	public int getCout() {
		return cout;
	}

	public void setCout(int cout) {
		this.cout = cout;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	

	
	/*public boolean peutAcheter(){
	 * if (c.cout<= j.cristaux){
	 * return true;
	 * }else { 
	 * return false 
	 }*/

	/*public boolean peutAttaquer(){	
	}*/
	
	
	
}

