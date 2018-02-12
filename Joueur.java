
public class Joueur {
		public int vie=30;
		public Deck d;
		public Main m;
		public Plateau p;
		public Mana ma;

		public Joueur(int vie, Deck d, Main m, Plateau p,Mana ma){
			this.vie=vie;
			this.d=d;
			this.m=m;
			this.p=p;
			this.ma=ma;
		}
		public class Mana {
			int restant =0;
			int total ;
			public Mana (int restant, int total ){
				this.restant =restant;
				this.total=total;
			}
			public void nouveautour (Mana ma){
				ma.total=ma.total+1;
				ma.restant=ma.total;
			}

			public boolean achatCarte (Carte c){
				if (c.cout <= ma.restant ){
					ma.restant -= c.cout;
					return true; 
				}else return false; 
			}
			
		public int getVie() {
			return vie;
		}

		

		public boolean estMort(){
			return(vie<=0);// et fin de la partie 
		}

		}



		//creer une fonction nouveau tour (incremente les cristaux, propose une nouvelle carte du deck) 
		// fonction jouer carte qui enlève le nb de cristaux et le nb cartes dans la main 
		// fonction jouer squi enlève les pv , attaque , autant que le joueur veut 
	}
