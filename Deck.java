import java.util.*;
/*dans cette classe sont definies les fonctions :
 * melangeDeck
 */
public class Deck {
	public List<Carte> deck;


	public Deck( List<Carte> deck){
		this.deck= new LinkedList<Carte>();
	}

	public void melangeDeck (){
		Collections.shuffle(deck);	
	}
	public void supprimeFirst (){
		deck.remove(0);
	}


	

}

