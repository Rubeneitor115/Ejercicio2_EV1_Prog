/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase principal de la aplicación
 * rbr - 240924
 */
public class Principal {

	/**
	 * Método principal de la aplicación
	 * rbr - 240924
	 * @param args
	 */
	public static void main(String[] args) {
	
		//Variables
		int numDni, resto;
		char letra;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Solicito los datos por consola y los guardo en sus correspondientes variables
		System.out.println("Escriba el número de su DNI (sin la letra): ");
		numDni = sc.nextInt();
		System.out.println("Escriba la letra de su DNI (en mayúscula): ");
		letra = sc.next().charAt(0);
		
		/*Ralizo el cálculo de validación de la letra para mostrar el resto de la operación
		 * !!!La validación no se esta teniendo en cuenta. Solo es para mostrar por consola el resto!!!
		 */
		resto = numDni % 23;
		System.out.println("El resto de la operación es: " + resto);
		
		//Muestro por consola la concatenación solicitada por el ejercicio
		System.out.println("Su DNI completo es: " + numDni + letra);

	}

}
