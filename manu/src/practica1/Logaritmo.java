/**
 * @author Alan Turing <alan.turing@acm.org>
 *
 * Esta aplicación calcula el logaritmo Neperiano de su primer parámetro.
 */

package practica1;

public class Logaritmo {

	/**
	 * Punto de entrada a la aplicación.
	 *
	 * Este método imprime el logaritmo Neperiano del número que se le pasa como entrada
	 *
	 * @param args Los argumentos de la línea de comando. Se espera un número como primer parámetro
	 */

	public static void main(String[] args) {
		if (args.length<1) {
			System.out.println("Se espera un numero como parámetro.");
			return;
		}
		String arg = args[0]; // una variable String que obtiene el primer parámetro
		double x = Double.parseDouble(arg); // una variable double, que convierte arg a numérico
		System.out.println("El logaritmo de " + arg + " es: " + Math.log(x));
	}
}