/**
 * @author Manuel Funes Domingo
 *
 * Esta aplicación calcula la mediana de varios números
 * y los ordena de menor a mayor
 */

package practica1;

public class Mediana {

	public static void main(String[] args) {

		if (args.length<2 || args.length>20) {
			System.out.println("ERROR: Se esperan entre dos y veinte números como parámetros.");
			return;
		} //if
		
		else {
			
			// Contador para el algoritmo
		    //int j = 0;
			
			// Array que pasamos como parámetros 
			int[] numeros = new int[args.length];
			
			System.out.println("Lista inicial: ");
			// Guardamos todos los numeros en el nuevo array
			for (int i = 0; i<args.length; i++){
				numeros[i] = Integer.parseInt(args[i]);
				// Imprimimos la lista inicial por pantalla
				System.out.print(" " + numeros[i]);
			} //for

			System.out.println(" ");
			
			 int buffer;
			 
			 int i,j;
			 
			 for(i = 0; i < args.length; i++) {
			 
				 for(j = 0; j < i; j++) {
			 
					 if(numeros[i] < numeros[j]) {
			 
						 buffer = numeros[j];
			 
						 numeros[j] = numeros[i];
			 
						 numeros[i] = buffer;
					 } //if
				 } //for
			 } //for
				
			System.out.println("Lista ordenada: ");
			// Imprimimos la lista final por pantalla
			for ( i = 0; i<args.length; i++)			
				System.out.print(" " + numeros[i]);
		    
			System.out.println(" ");
            
			int m = i / 2;
			System.out.println("La mediana de la lista es "+ numeros[m]);
		} //else	
	} //static
} //class