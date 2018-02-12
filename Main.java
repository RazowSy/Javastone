import java.util.*;

public class Main  {
	public List<Carte> main;
	
	public Main ( List<Carte> main){
		this.main= new LinkedList<Carte>();
	}
	
	public boolean mainPleine(){
		return (main.size()>=10);
	}
	
	public String ajoutCarte(Deck d, Main m){
		if (!m.mainPleine()){// si la main n'est pas pleine 
			m.main.add(d.deck.get(0)); // on l'ajoute à la main 
			return "vous venez de piocher la carte "+d.deck.get(0);	
		}else{
			return "votre main est pleine, cette carte est supprimée du deck " +d.deck.get(0);
		}
		//d.deck.remove(0);// j'ai beau essayer il veut pas je ne sais pas pourquoi 
			
		}
	
	
	//public Carte choisirCarte(){ //pour que le joueur choisisse la carte à jouer dans sa main je ne sais pas du tout comment faire ^^
	//}
	
}


