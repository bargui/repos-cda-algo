package calc;

import java.util.Arrays;

public class CalculatriceTableau {
	public static int sommeElements(int[] tabInt) {

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + tabInt[i];
		}
		System.out.println("La somme des elements est égal à =" + sum);
		return sum;

	}

	public static int plusPetitElement(int[] tabInt) {
		int a = tabInt[0];
		for (int i = 0; i < 5; i++) {
			if (a > tabInt[i]) {
				a = tabInt[i];

			}

		}
		return a;
	}

	public static int sommeElementsDeuxTableaux(int[] tabInt, int[] tabInt2) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + tabInt[i] + tabInt2[i];
		}
		System.out.println("La somme des elements est égal à =" + sum);
		return sum;

	}

	public static int[] triAscendant(int[] tabInt) {

		int taille = tabInt.length;
		int tmp = 0;
		for (int i = 0; i < taille; i++) {
			for (int j = 1; j < (taille - i); j++) {
				if (tabInt[j - 1] > tabInt[j]) {

					tmp = tabInt[j - 1];
					tabInt[j - 1] = tabInt[j];
					tabInt[j] = tmp;
				}

			}
		}
		return tabInt;

	}

	public static int[] triAscendantDeuxTableaux(int[] tabInt1, int[] tabInt2) {
		int l1 = tabInt1.length;
		int l2 = tabInt2.length;
		int tmp = 0;
		int[] tabInt3 = new int[l1 + l2];
		for (int i = 0; i < l1; i++) {
			tabInt3[i] = tabInt1[i];
			tabInt3[i + l1] = tabInt2[i];
		}

		return triAscendant(tabInt3);

	}

	public static boolean conjonction(boolean[] tabBool) {
		boolean b = true;
		for (int i = 0; i < tabBool.length; i++) {
			if (!tabBool[i]) {
				b = false;
			}
		}
		return b;
	}

	public static long nombreDElementsPair(int[] tab) {
		int res = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 2 == 1) {
				res = res + 1;

			}
		}
		return res;
	}

	public static boolean chercheSiUnElementExiste(int a, int[] tab) {
		boolean param = true;
		for (int i = 0; i < tab.length; i++) {

			if (a == tab[i]) {
				param = true;

			} else {
				param = false;
			}
		}
		return param = false;
	}

	public static int[] mettreZeroDansLesCasesAIndicesImpair(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 2 == 1) {
				tab[i] = 0;

			}
		}
		return tab;

	}

	public static int[] decalerLesElementsTableauDUneCase(int[] tab) {
		int j = tab.length - 1;
		for (int i = 0; i < j; i++) {
			tab[i] = tab[i] + tab[j];
			tab[j] = tab[i] - tab[j];
			tab[i] = tab[i] - tab[j];
		}
		return tab;
	}
}
