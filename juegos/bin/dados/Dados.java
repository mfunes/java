/**
 * @author Manuel Funes Domingo
 *
 * Juego de los dados
 * Se gana consiguiendo 20 puntos o m������s en 5 tiradas
 * Se juega 10 veces por estad������stica
 */

package dados;
import java.util.*;

public class Dados {
	
	public static void main(String[] args) {
		
		// Ejecutamos el programa 10 veces
		int ganas = 0;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int n5 = 0;
		int n6 = 0;
		for (int a = 1; a <= 10; a++) {
		
		int sale = 0;
		// Lanzamos los dados 5 veces
		for (int i = 1; i <= 5; i++) {
		    Random rand = new Random();
			int m = rand.nextInt(6)+1;
			
			switch (m) {
			case 1:
				System.out.print("1");
				n1++;
				break;
			case 2:
				System.out.print("2");
				n2++;
				break;
			case 3:
				System.out.print("3");
				n3++;
				break;
			case 4:
				System.out.print("4");
				n4++;
				break;
			case 5:
				System.out.print("5");
				n5++;
				break;
			case 6:
				System.out.print("6");
				n6++;
				break;
		} //switch
		System.out.println(" ");
	    sale = sale + m;
		} //for
		if (sale >= 18) {
	    	System.out.println("Bieeen!! Has ganado. Has sacado " + sale + " puntos");
	        ganas++;
	    }
	    else {
	    	System.out.println("Lo siento... Intentalo de nuevo! Has sacado " + sale + " puntos");
	    }
		if (a == 10) {
		System.out.println(" ");
		System.out.println("-------------------------------------- ");
		System.out.println("Has ganado " + ganas + " partidas de 10");
		System.out.println("-------------------------------------- ");
		System.out.println(" ");
		System.out.println("El n������mero 1 ha salido "+ n1 + " veces");
		System.out.println("El n������mero 2 ha salido "+ n2 + " veces");
		System.out.println("El n������mero 3 ha salido "+ n3 + " veces");
		System.out.println("El n������mero 4 ha salido "+ n4 + " veces");
		System.out.println("El n������mero 5 ha salido "+ n5 + " veces");
		System.out.println("El n������mero 6 ha salido "+ n6 + " veces");
		System.out.println(" ");
		
		int num1 = Math.max(n1, n2);
		int num2 = Math.max(n3, n4);
		int num3 = Math.max(n5, n6);
		int num4 = Math.max(num1, num2);
		int nummax = Math.max(num3, num4);
		String num;
		
		if (nummax == n1) {
			num = "1";
		}	
		else if (nummax == n2) {
			num = "2";
		}
		else if (nummax == n3) {
			num = "3";
		}
		else if (nummax == n4) {
			num = "4";
		}
		else if (nummax == n5) {
			num = "5";
		}
		else {
			num = "6";
		}
		
		System.out.println("El n������mero que mas ha salido ha sido el " + num + " y lo ha hecho " + nummax + " veces");
		
		
		}
		} //for
	} // public
} //class
