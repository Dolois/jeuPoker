import java.util.ArrayList;
import java.util.Collections;

public class Poker 
{
	/*
	 * @param String[] joueur
	 * @param ArrayList<String> deck
	 * 
	 * return String[]
	 */
	public static String[] distribuerJoueur1(String[] joueur1, ArrayList<String> deck, int donne)
	{	
		for (int i = 0; i < donne; i++)
		{
			if (joueur1[i] == null)
			{
				// Ajouter dans le tableau joueur la carte distribuée
				joueur1[i] = deck.get(i);
				// Supprimer de l'ArrayList la carte distribuée 
				deck.remove(i);
			}
		}
		return joueur1;
	}
	
	/*
	 * @param String[] joueur
	 * @param ArrayList<String> deck
	 * 
	 * return String[]
	 */
	public static String[] distribuerJoueur2(String[] joueur2, ArrayList<String> deck, int donne)
	{	
		for (int i = 0; i < donne; i++)
		{
			if (joueur2[i] == null)
			{
				// Ajouter dans le tableau joueur la carte distribuée
				joueur2[i] = deck.get(i);
				// Supprimer de l'ArrayList la carte distribuée 
				deck.remove(i);
			}
		}
		return joueur2;
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
		deck.add("1C");	deck.add("2C");	deck.add("3C");	deck.add("4C");	deck.add("5C");	deck.add("6C");	deck.add("7C");	
		deck.add("8C");	deck.add("9C");	deck.add("10C"); deck.add("VC"); deck.add("DC");	deck.add("RC");
		
		// Ajouter les 13 cartes de (ca)rreau dans le paquet de 52 cartes
		deck.add("1ca");deck.add("2ca");deck.add("3ca");deck.add("4ca");deck.add("5ca");deck.add("6ca");deck.add("7ca"); 
		deck.add("8ca");deck.add("9ca");deck.add("10ca"); deck.add("Vca");deck.add("Dca");deck.add("Rca");
		
		// Ajouter les 13 cartes de (P)ique dans le paquet de 52 cartes
		deck.add("1P");	deck.add("2P");	deck.add("3P");	deck.add("4P");	deck.add("5P");	deck.add("6P");	deck.add("7P");	
		deck.add("8P");	deck.add("9P");	deck.add("10P"); deck.add("VP");deck.add("DP");deck.add("RP");
		
		// Ajouter les 13 cartes de (T)rèfle dans le paquet de 52 cartes
		deck.add("1T");deck.add("2T");	deck.add("3T");	deck.add("4T");	deck.add("5T");	deck.add("6T");	deck.add("7T");	
		deck.add("8T");	deck.add("9T");	deck.add("10T"); deck.add("VT");	deck.add("DT");	deck.add("RT");
	

		// Mélanger 5 fois le paquet de 52 cartes
		for (int i = 0; i < 5; i++) {
			Collections.shuffle(deck);
		}
		
		// Créer une instance nommée joueur1 de la Classe String[]
		String[] joueur1 = new String[5];
		
		// Créer une instance nommée joueur2 de la Classe String[]
		String[] joueur2 = new String[5];
		
		// Créer une instance nommée flop de la Classe String[]
		String[] flop = new String[5];
		
		// donne du joueur n°1
		int donne = 2;
		distribuerJoueur1(joueur1, deck, donne);
		System.out.print("Donne du joueur n° 1 : ");
		for (int i = 0; i < donne; i++)
		{
			System.out.print("'" + joueur1[i] + "' ");
		}
		System.out.println();
		
		// donne du joueur n°2
		donne = 2;
		distribuerJoueur2(joueur2, deck, donne);
		System.out.print("Donne du joueur n° 2 : ");
		for (int i = 0; i < donne; i++)
		{
			System.out.print("'" + joueur2[i] + "' ");
		}
		System.out.println();
		System.out.println();
		
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
	}
}
