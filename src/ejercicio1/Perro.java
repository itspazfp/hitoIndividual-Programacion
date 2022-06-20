package ejercicio1;

public class Perro extends Animal {

		  public Perro(String especie, String nombre) {
		super(especie, nombre);
		// TODO Auto-generated constructor stub
	}

		public void displayNombre() {
		    System.out.println("Mi nombre es " + nombre);
		  }
		public void displayEspecie() {
		    System.out.println("Soy un " + especie );
		  }
		}

