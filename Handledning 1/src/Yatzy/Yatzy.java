package Yatzy;

public class Yatzy {

	public static void main(String[] args) {

		int roll[] = new int[4];
		
		System.out.println("Ditt f�rsta kast: ");
		System.out.println("------------------");
		for (int i = 0; i < 5; i++) {											// Anropar Dice f�r kast av t�rning
			 roll[i] = Dice.dice();												// 5 g�nger;
			 System.out.println("T�rning:"+ (i+1) +  ": " + roll[i]);			// Visar resultat
			}
		SaveDice.save(roll);
		

	}

}
