package calc;

import java.lang.Character.UnicodeBlock;
import java.util.Random;

public class Calculatrice {
	public static int addition(int a, int b) {
		return a + b;
	}

	public static int soustraction(int a, int b) {
		return a - b;
	}

	public static int multiplication(int a, int b) {
		return a * b;
	}

	public static int max(int a, int b) {
		if (a > b) {
			return a;
		}
		return b;
	}

	public static char signe(int a) {
		if (a > 0) {
			return '+';
		}
		return '-';
	}

	public static long factorielle(int a) {
		// avec le for
//	long facto = 1;
//	for (int i = 1; i <= a; i++) {
//		facto *= i;
//	}
//	return facto;
		// avec le while
		int i = 1;
		long facto = 1;
		while (i <= a) {
			facto *= i;
			i++;
		}
		return facto;

	}

	public static boolean conjonction(boolean a, boolean b) {
		return a && b;
	}

	public static boolean disjonction(boolean a, boolean b) {
		return a || b;
	}

	public static boolean negation(boolean a) {
		return !a;
	}
	public static int binaireToDecimal(int binary){  
	    int decimal = 0;  
	    int i = 0;  
	    while(true){  
	      if(binary == 0){  
	        break;  
	      } else {  
	          int temp = binary%10;  
	          decimal =(int) (decimal+ temp*Math.pow(2, i));  
	          binary = binary/10;  
	          i++;  
	       }  
	    }  
	    return decimal;  
	}  
	public static int aleatoireInferieur(int max) {
		Random a =new Random();
		int b=a.nextInt(max);
		return b;
		
	}
}
