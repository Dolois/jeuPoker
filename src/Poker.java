import java.util.ArrayList;
import java.util.Collections;

public class Poker 
{
	/* Générer un paquet de 52 cartes pour jouer au poker
	 * 
	 * Mélanger plusieurs fois le paquet de 52 cartes
	 * 
	 * Distribuer à plusieurs joueurs (6 dans mon cas)
	 * deux cartes.
	 * 
	 * Distribuer 3 cartes au flop puis 
	 * distribuer le turn puis
	 * distribuer le river
	 * 
	 * Comparer les jeux des joueurs pour déterminer
	 * le gagnant de cette manche
	 *  
	 */
	
	
	/*
	 * @param String[] joueur
	 * @param ArrayList<String> deck
	 * 
	 * return String[]
	 */
	public static String[] distribuerJoueur(String[] joueur, ArrayList<String> deck, int donne)
	{	
		for (int i = 0; i < donne; i++)
		{
			if (joueur[i] == null)
			{
				// Ajouter dans le tableau joueur la carte distribuée
				joueur[i] = deck.get(i);
				// Supprimer de l'ArrayList la carte distribuée 
				deck.remove(i);
			}
		}
		return joueur;
	}
	
	/*
	 * @String[] flop
	 * @param ArrayList<String> deck
	 * 
	 * return String[]
	 */
	public static String[] distribuerFlop(String[] flop, ArrayList<String> deck, int donne)
	{
		for (int i = 0; i < donne; i++)
		{
			if (flop[i] == null)
			{
				// Ajouter dans le tableau flop la carte distribuée
				flop[i] = deck.get(i);
				// Supprimer de l'ArrayList la carte distribuée
				deck.remove(i);
			}
		}
		return flop;
	}
	
	public static void main(String [] args)
	{
		// Créer une instance nommée deck de la Clase ArrayList
		ArrayList<String> deck = new ArrayList<String>();

		// Ajouter les 13 cartes de (C)oeur dans le paquet de 52 cartes
		deck.add("AC");	deck.add("2C");	deck.add("3C");	deck.add("4C");	deck.add("5C");	deck.add("6C");	deck.add("7C");
		deck.add("8C");	deck.add("9C");	deck.add("10C"); deck.add("VC");deck.add("DC");deck.add("RC");
		
		// Ajouter les 13 cartes de (c)arreau dans le paquet de 52 cartes
		deck.add("Ac");deck.add("2c");deck.add("3c");deck.add("4c");deck.add("5c");deck.add("6c");deck.add("7c");
		deck.add("8c");deck.add("9c");deck.add("10c"); deck.add("Vc");deck.add("Dc");deck.add("Rc");
		
		// Ajouter les 13 cartes de (P)ique dans le paquet de 52 cartes
		deck.add("AP");	deck.add("2P");	deck.add("3P");	deck.add("4P");	deck.add("5P");	deck.add("6P");	deck.add("7P");
		deck.add("8P");	deck.add("9P");	deck.add("10P"); deck.add("VP");deck.add("DP");deck.add("RP");
		
		// Ajouter les 13 cartes de (T)rèfle dans le paquet de 52 cartes
		deck.add("AT");deck.add("2T");	deck.add("3T");	deck.add("4T");	deck.add("5T");	deck.add("6T");	deck.add("7T");
		deck.add("8T");	deck.add("9T");	deck.add("10T"); deck.add("VT");deck.add("DT");	deck.add("RT");
	

		// Mélanger 5 fois le paquet de 52 cartes
		for (int i = 0; i < 5; i++) {
			Collections.shuffle(deck);
		}
		
		// Créer une instance nommée joueur de la Classe String[]
		String[] joueur = new String[7];
		
		// Créer une instance nommée joueur1 de la Classe String[]
		String[] joueur1 = new String[7];
		// donne du joueur n°1
		int donne = 2;
		joueur = joueur1;
		distribuerJoueur(joueur, deck, donne);
		joueur1 = joueur;
		System.out.print("Donne du joueur n° 1 : ");
		for (int i = 0; i < donne; i++)
		{
			System.out.print("'" + joueur1[i] + "' ");
		}
		System.out.println();
		
		// Créer une instance nommée joueur2 de la Classe String[]
		String[] joueur2 = new String[7];
		// donne du joueur n°2
		donne = 2;
		joueur = joueur2;
		distribuerJoueur(joueur, deck, donne);
		joueur2 = joueur;
		System.out.print("Donne du joueur n° 2 : ");
		for (int i = 0; i < donne; i++)
		{
			System.out.print("'" + joueur2[i] + "' ");
		}
		System.out.println();
		
		// Créer une instance nommée joueur3 de la Classe String[]
		String[] joueur3 = new String[7];
		// donne du joueur n°3
		donne = 2;
		joueur = joueur3;
		distribuerJoueur(joueur, deck, donne);
		joueur3 = joueur;
		System.out.print("Donne du joueur n° 3 : ");
		for (int i = 0; i < donne; i++)
		{
			System.out.print("'" + joueur3[i] + "' ");
		}
		System.out.println();
		
		// Créer une instance nommée joueur4 de la Classe String[]
		String[] joueur4 = new String[7];
		// donne du joueur n°4
		donne = 2;
		joueur = joueur4;
		distribuerJoueur(joueur, deck, donne);
		joueur4 = joueur;
		System.out.print("Donne du joueur n° 4 : ");
		for (int i = 0; i < donne; i++)
		{
			System.out.print("'" + joueur4[i] + "' ");
		}
		System.out.println();
		
		// Créer une instance nommée joueur5 de la Classe String[]
		String[] joueur5 = new String[7];
		// donne du joueur n°5
		donne = 2;
		joueur = joueur5;
		distribuerJoueur(joueur, deck, donne);
		joueur5 = joueur;
		System.out.print("Donne du joueur n° 5 : ");
		for (int i = 0; i < donne; i++)
		{
			System.out.print("'" + joueur5[i] + "' ");
		}
		System.out.println();
		
		// Créer une instance nommée joueur6 de la Classe String[]
		String[] joueur6 = new String[7];
		// donne du joueur n°6
		donne = 2;
		joueur = joueur6;
		distribuerJoueur(joueur, deck, donne);
		joueur6 = joueur;
		System.out.print("Donne du joueur n° 6 : ");
		for (int i = 0; i < donne; i++)
		{
			System.out.print("'" + joueur6[i] + "' ");
		}
		System.out.println();
		System.out.println();
		
		// Créer une instance nommée flop de la Classe String[]
		String[] flop = new String[5];
		
		// donne du flop
		donne = 3;
		distribuerFlop(flop, deck, donne);
		System.out.print("Donne du flop        : ");
		for (int i = 0; i < donne; i++)
		{
			System.out.print("'" + flop[i] + "' ");
		}
		System.out.println();
		
		// donne du turn
		donne = donne + 1;
		distribuerFlop(flop, deck, donne);
		System.out.print("Donne du turn        : ");
		for (int i = 0; i < donne; i++)
		{
			System.out.print("'" + flop[i] + "' ");
		}
		System.out.println();
		
		// donne du river
		donne = donne + 1;
		distribuerFlop(flop, deck, donne);
		System.out.print("Donne du river       : ");
		for (int i = 0; i < flop.length; i++)
		{
			System.out.print("'" + flop[i] + "' ");
		}
		System.out.println();
		
		/*
		 * valeurs des mains au poker
		 * 
		 * 1.  quinte flush royale	= AC+RC+DC+VC+10C
		 * 2.  quinte flush			= 9C+8C+7C+6C+5C
		 * 3.  carré				= AC+AT+AP+Ac+10C
		 * 4.  full					= AC+AT+Ac+RC+RT
		 * 5.  couleur				= AC+10C+8C+5C+2C
		 * 6.  quinte				= 5C+4T+3c+2P+AC
		 * 7.  brelan				= 10C+10T+10c+5C+3T
		 * 8.  double paire			= AC+AT+RC+RT+5T
		 * 9.  paire				= AC+AT+6C+4C+2c
		 * 10. hauteur				= AC+9T+6c+4P+2C
		 * 
		 */
	}
}
