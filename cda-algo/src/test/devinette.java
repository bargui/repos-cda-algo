package test;

import java.util.Random;
import java.util.Scanner;

public class devinette {

	public static void main(String[] args) {
		Scanner cn = new Scanner(System.in);
		// Generer une valeur 
		int valeurGeneree = random();
		// lire la premiére valeur du joueur 
		System.out.print("Saisissez un nombre entre 10 000 et 50 000 : " );
		int valeurSaisie = cn.nextInt();
		for (int i = 1; i < 15; i++) {
			if (i == 15 ) {
				System.out.println("Tu as perdu le nombre etait : " + valeurGeneree);
				break;
			}
			if (valeurSaisie == valeurGeneree) {
				System.out.print("bravo !! Tu as gagné");
				break;
			} else {
				if (valeurGeneree < valeurSaisie) {
					System.out.println("Plus petit ! ");
				} else {
					System.out.println("Plus grand ! ");
				}
			}
			System.out.print("Saisissez un nombre entre 10 000 et 50 000 : " + 
			"essai numero "+   i      );
			valeurSaisie = cn.nextInt();
		}
	}
	public static int random() {
		// ca va retourner une valeur entre 10.000 et 50.000
		return (int) (Math.random() * 40000) + 10000;
	}
}