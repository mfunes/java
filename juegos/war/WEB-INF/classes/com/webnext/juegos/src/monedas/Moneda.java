/**
 * @author Manuel Funes Domingo
 *
 * Juego de la moneda
 * Se gana consiguiendo tres cruces en 5 tiradas
 * Se juega 10 veces por estadística
 */

package monedas;
import java.util.*;

public class Moneda {
	
	public static void main(String[] args) {
		
		// Ejecutamos el programa 10 veces
		int ganas = 0;
		for (int a = 1; a <= 10; a++) {
		
		int sale = 0;
		// Lanzamos la moneda 5 veces
		for (int i = 1; i <= 5; i++) {
		    Random rand = new Random();
			int m = rand.nextInt(2)+1;
			
			if (m == 2) {
				System.out.print("X");
				sale++;
			}
			else {
				System.out.print("O");
			}
		}
		System.out.println(" ");
	    
		if (sale >= 3) {
	    	System.out.println("Bieeen!! Has ganado. Han salido " + sale + " cruces");
	        ganas++;
	    }
	    else {
	    	System.out.println("Lo siento... Intentalo de nuevo! Han salido " + sale + " cruces");
	    }
		if (a == 10) {
		System.out.println(" ");
		System.out.println("-------------------------------------- ");
		System.out.println("Has ganado " + ganas + " partidas de 10");
		System.out.println("-------------------------------------- ");
		}
		} //for
	} // public
} //class
