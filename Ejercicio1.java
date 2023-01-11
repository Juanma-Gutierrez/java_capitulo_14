
/**
 * Ejercicio1.java
 *
 * @version: 11/01/2023
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */
/**
 * Realiza un programa que pida 6 números por teclado y nos diga cuál es el
 * máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
 * entero) el programa debe indicarlo y debe pedir de nuevo el número.
 */

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		// Var declarations
		int max;
		int num;

		// Scanner class
		Scanner sc = new Scanner(System.in);

		max = Integer.MIN_VALUE;
		for (int i = 0; i < 6; i++) {
			num = pideNumero("Por favor, introduce el número " + (i + 1) + ": ",
					"El dato introducido no es correcto.\nDebe introducir un número entero.", sc);
			if (num > max)
				max = num;
		}
		System.out.println("El número introducido mayor es el " + max);

		// Close scanner
		sc.close();
	}

	public static int pideNumero(String intro, String error, Scanner sc) {
		int num = 0;
		boolean datoValido = false;
		do {
			try {
				System.out.print(intro);
				num = sc.nextInt();
				datoValido = true;
			} catch (Exception e) {
				System.out.print(error);
				sc.nextLine();
			}
		} while (!datoValido);
		return num;
	}
}
