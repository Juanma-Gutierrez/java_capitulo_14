/**
 * Gato.java
 *
 * @version: 13/01/2023
 * @author: Juan Manuel Gutiérrez
 *          https://github.com/Juanma-Gutierrez
 */

public class Gato {
	private String name;
	private String sex;
	private String breed;
	private String favouriteFood;

	public Gato(String breed, String favouriteFood) {
		this.breed = breed;
		this.favouriteFood = favouriteFood;
	}

	public Gato() {

	}

	public Gato(String name, String sex, String breed, String favouriteFood) {
		this.name = name;
		this.sex = sex;
		this.breed = breed;
		this.favouriteFood = favouriteFood;
	}

	public String getName() {
		return this.name;
	}

	public String getSex() {
		return this.sex;
	}

	public String getBreed() {
		return this.breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getFavouriteFood() {
		return this.favouriteFood;
	}

	public void setFavouriteFood(String favouriteFood) {
		this.favouriteFood = favouriteFood;
	}

	/**
	 * toString: muestra todos los datos del gato
	 */
	@Override
	public String toString() {
		String name;
		String sex;
		String breed;
		String favouriteFood;
		String ret;

		name = this.getName();
		sex = this.getSex();
		breed = this.breed;
		favouriteFood = this.favouriteFood;

		ret = "******************\n";
		ret += "* DATOS DEL GATO *\n";
		ret += "******************\n";
		ret += "Nombre: " + name + "\n";
		ret += "Sexo: " + sex + "\n";
		ret += "Raza: " + breed + "\n";
		ret += "Comida favorita: " + favouriteFood + "\n";
		return ret;
	}

	/**
	 * tomaComida: Alimenta al gato y éste imprime si le gusta o no la comida
	 * 
	 * @param food Comida para alimentar al gato
	 */
	public void tomaComida(String food) {
		if (food.equals("pescado"))
			System.out.println("Mmmm, me encanta el pescado");
		else
			System.out.println("Puagh, eso no me gusta, quiero pescado");
	}

	/**
	 * ronronea: hace que el gato ronronee
	 */
	public void ronronea() {
		System.out.println("Grrrrrr");
	}

	/**
	 * maulla: hace que el gato maulle
	 */
	public void maulla() {
		System.out.println("Miaauuu, miiiiaaauuuuu");
	}

	public Gato apareaCon(Gato g) throws ExcepcionMismoSexo {
		if (this.getSex().equals(g.getSex()))
			throw new ExcepcionMismoSexo();
		else {
			return new Gato("Nuevo gato","Macho", "Atún", "Pescado");
		}
	}
}
