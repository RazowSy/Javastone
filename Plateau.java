import java.util.*;
/*dans cette classe sont definies les fonctions :
 * -plateau plein 
 * ajoutCreature (sur le plateau)
 * retirerCreature (si elle est morte)
 */

public class Plateau {

	public List<Creature> plateau;
	
	public Plateau (List<Creature>plateau){
		this.plateau= new LinkedList <Creature>(); 
	}
	
	public boolean plateauPlein(){// on peut pas demander si kase ==7 alors qu'en haut on a defini que c'etait 7 ca ne va pas 
		return(plateau.size()>=7);
	}
	
	public void ajoutCreature(Creature c){
		if (!plateauPlein()){// on test si le plateau n'est pas plein avant 
		plateau.add(c);
		}
	}
	
	public void retirerCreature(Creature c){// on retire la creature du plateau si elle est morte 
		if( c.estMort()){
			plateau.remove(c);
		}
	}
}
