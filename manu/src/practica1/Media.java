/**
 * @author Manuel Funes Domingo
 *
 * Esta aplicaci�n calcula la media de dos n�meros
 */

package practica1;

public class Media {

	/**
	 * Punto de entrada a la aplicaci�n.
	 *
	 * Este m�todo imprime la media de dos n�meros que son pasados como par�metro
	 *
	 * @param args Los argumentos de la l�nea de comando. Se esperan dos n�meros.
	 */
		public static void main(String[] args) {

		if (args.length<2 || args.length>2) {
			System.out.println("ERROR: Se esperan dos n�meros como par�metros.");
			return;
		} //if


		else {

			String arg1 = args[0]; // una variable String que obtiene el primer parametro
			String arg2 = args[1]; // Una variable Stirng que obtiene el segundo parametro

			int x = Integer.parseInt(arg1); // una variable int, que convierte arg a numerico
			int y = Integer.parseInt(arg2); // una variable int, que convierte arg a numerico
	
	
			if ((x<0) || (y<0)){
				System.out.println("ERROR: Uno de los par�metros es incorrecto.");
				return;
			} //if
			
			else{

				int z = (x+y)/2; // Calcula la media
					System.out.println("La media entre " + arg1 + " y " + arg2 +" es: " + z);
			} //else
		} //else
	} //class
} //class