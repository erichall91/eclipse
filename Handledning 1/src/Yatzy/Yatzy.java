package Yatzy;

public class Yatzy {

	public static void main(String[] args) {

		int roll[] = new int[5];
		
		System.out.println("Ditt första kast: ");
		System.out.println("------------------");
		for (int i = 0; i < 5; i++) {											// Anropar Dice för kast av tärning
			 roll[i] = Dice.dice();												// 5 gånger;
			 System.out.println("Tärning:"+ (i+1) +  ": " + roll[i]);			// Visar resultat
			}
		SaveDice.save(roll);
		

	}

}
