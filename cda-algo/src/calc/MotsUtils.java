package calc;

import java.util.Arrays;

public class MotsUtils {
	public static String inverser(String str) {
		/*
		 * if(str.isEmpty()){ return str; } else { return
		 * inverser(str.substring(1))+str.charAt(0); } }
		 */
		int l = str.length();
		String newA = "";
		for (int i = l - 1; i > -1; i = i - 1) {
			newA = newA + str.charAt(i);
		}

		return newA;

	}

	public static String caracteresCommuns(String str1, String str2) {
		int l1 = str1.length();
		int l2 = str2.length();
		String newB = "";
		for (int i = 0; i < l1; i = i + 1) {
			for (int j = 0; j < l2; j = j + 1) {
				if (str1.charAt(i) == str2.charAt(j)) {
					if (!newB.contains(String.valueOf(str1.charAt(i)))) {
						newB = newB + str1.charAt(i);
					}

				}
			}
		}
		return newB;

	}

	public static boolean estUnPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {

			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i = i + 1;
			j = j - 1;
		}

		return true;
	}

	public static long sommeChiffresDansMot(String str) {
		long somme = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				// int b=Character.isDigit(str.charAt(i));
				// str2=str2+Character.toString(str.charAt(i));
				somme = somme + Integer.parseInt(str.charAt(i) + "");

			}
		}
		return somme;
	}

	public static String devinerAlgo(int a) {
		int x = a * 2;

		int y = a - 1;

		String str1 = Integer.toString(x);
		String str2 = Integer.toString(y);
		String str3 = str1 + str2;
		return str3;

	}

	public static long sommeUnicodes(String str) {
		long somme = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			somme = somme + ch;

		}
		return somme;
	}

	public static String exercice29(int param, int param2) {
		if (param % 2 == 0) {
			param = param + 1;
		} else {
			param = param + 2;

		}

		String result = "";
		int[] res = new int[param2];
		for (int i = 0; i < param2; i++) {
			result = result + "*" + (param + (i * 2));

		}
		return result.substring(1);

	}

	public static String exercice30(String n) {

		int s1 = 0;
		int s2 = 0;
		String entier = n.split("\\.")[0];
		String decimal = n.split("\\.")[1];

		char[] a = new char[entier.length()];
		for (int i = 0; i < entier.length(); i++) {
			s1 = s1 + Character.getNumericValue(entier.charAt(i));
		}

		char[] b = new char[decimal.length()];
		for (int i = 0; i < decimal.length(); i++) {

			s2 = s2 + Character.getNumericValue(decimal.charAt(i));
		}
		int s3 = s1 + s2;

		return "T" + s3 + "E" + s1 + "D" + s2;

	}

	public static String exercice31(String n) {
		n = n.toLowerCase();
		String res = "";
		char[] a = new char[n.length()];
		int[] nombre = new int[n.length()];

		for (int i = 0; i < n.length(); i++) {
			a[i] = n.charAt(i);
			nombre[i] = a[i] - 96;
			res = res + Integer.toString(nombre[i]);

		}
		return res;

	}

	public static String exercice32(String n) {

		int range = n.length();
		String result = "";
		String compteur = "";
		for (int i = 0; i < range; i++) {
			compteur = "";
			if (!Character.isDigit(n.charAt(i))) {
				result += n.charAt(i);
			} else if (i == range - 1) {
				continue;
			} else {
				while (Character.isDigit(n.charAt(i))) {
					compteur += n.charAt(i);
					i++;
				}
				for (int j = Integer.parseInt(compteur); j > 0; --j) {
					result += n.charAt(i);
				}
			}
		}
		return result;
	}

	public static void exercice33(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = n - i; j > 0; j--) {
				System.out.print("*");
			}

			System.out.println();

		}
	}

	/*public static void afficherNombreOccurence(String str) {
String a ="";
		int len = str.length();
		char[] ch = new char[str.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int res = 0;
			if (a.indexOf(str.charAt(i)) ==-1) {
				
				for (int j = 0; j < len; j++) {
					if (str.charAt(i) == ch[j]) {
						res = res + 1;
						
					}
					a=a+str.charAt(i);
			}
			
			}
			if (res != 0) {
				System.out.println(str.charAt(i) + ":" + res);
			}
		}
	}*/
	public static void afficherNombreOccurence(String str) {
		int len = str.length();
		String a = "";
//		char[] ch = new char[str.length()];
		for (int i = 0; i < len; i++) {
//			ch[i] = str.charAt(i);
			int res = 0;
			if (!a.contains(String.valueOf(str.charAt(i)))) {

			for (int j = i; j < len; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					res = res + 1;
				}
			}
			System.out.println(str.charAt(i) + ":" + res);

			}
			
			a += str.charAt(i);
		}
	}


}
