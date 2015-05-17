/**
 * @author Alan Turing <alan.turing@acm.org>
 *
 * Esta aplicaci�n calcula el logaritmo Neperiano de su primer par�metro.
 */

package practica1;

public class Logaritmo {

	/**
	 * Punto de entrada a la aplicaci�n.
	 *
	 * Este m�todo imprime el logaritmo Neperiano del n�mero que se le pasa como entrada
	 *
	 * @param args Los argumentos de la l�nea de comando. Se espera un n�mero como primer par�metro
	 */

	public static void main(String[] args) {
		if (args.length<1) {
			System.out.println("Se espera un numero como parametro.");
			return;
		}
		String arg = args[0]; // una variable String que obtiene el primer parametro
		double x = Double.parseDouble(arg); // una variable double, que convierte arg a numerico
		System.out.println("El logaritmo de " + arg + " es: " + Math.log(x));
	}
}