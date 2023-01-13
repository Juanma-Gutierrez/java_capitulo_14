
/**
 * Ejercicio3.java
 *
 * @version: 13/01/2023
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */
/**
 * Realiza un programa que genere una excepción de forma aleatoria de entre
 * las siguientes excepciones: NumberFormatException, IOException,
 * FileNotFoundException, IndexOutOfBoundsException y ArithmeticException.
 */
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio3 {
	public static void main(String[] args) throws Exception {
		// Process
		for (int i = 1; i <= 10; i++) {
			int n = (int) (Math.random() * 5);
			try {
				switch (n) {
					case 0:
						throw new NumberFormatException();
					case 1:
						throw new IOException();
					case 2:
						throw new FileNotFoundException();
					case 3:
						throw new IndexOutOfBoundsException();
					case 4:
						throw new ArithmeticException();
				}
			} catch (NumberFormatException e) {
				System.out.println(i + ": Excepción NumberFormatException");
			} catch (FileNotFoundException e) {
				System.out.println(i + ": Excepción FileNotFoundException");
			} catch (IOException e) {
				System.out.println(i + ": Excepción IOException");
			} catch (IndexOutOfBoundsException e) {
				System.out.println(i + ": Excepción IndexOutOfBoundsException");
			} catch (ArithmeticException e) {
				System.out.println(i + ": Excepción ArithmeticException");
			} catch(Exception e){
				System.out.println(i + ": Error general");
			}
		}
	}
}
