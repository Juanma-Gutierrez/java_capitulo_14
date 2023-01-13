/**
 * Ejercicio2.java
 *
 * @version: 13/01/2023
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */
/*
 * Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
 * Este método debe comprobar que los gatos son de distinto sexo, tras lo
 * cual, genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria
 * = garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo,
 * el método debe generar la excepción ExcepcionApareamientoImposible. Crea un
 * programa desde el que se pruebe el método.
 */

public class Ejercicio2 {
	public static void main(String[] args) {
		// Var declarations
		Gato garfield = new Gato("Garfield", "Macho", "Pescado", "Pescado");
		Gato tom = new Gato("Tom", "Macho", "Atún", "Atún");
		Gato lisa = new Gato("Lisa", "Hembra", "Salmón", "Salmón");

		aparea(garfield, tom);
		aparea(tom, garfield);
		aparea(tom, lisa);
		aparea(lisa, garfield);
	}

	public static void aparea(Gato gato1, Gato gato2) {
		try {
			Gato nuevo;
			nuevo = gato1.apareaCon(gato2);
			System.out.println("Nombres de los padres: " + gato1.getName() + " y " + gato2.getName());
			System.out.println(nuevo);
		} catch (ExcepcionMismoSexo e) {
			System.out.println("Para " + gato1.getName() + " y " + gato2.getName()
					+ ", ambos gatos son del mismo sexo, no pueden aparearse");
		}
	}
}
