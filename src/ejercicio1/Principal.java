package ejercicio1;

import java.util.ArrayList;

public class Principal {
	 public static void main(String[] args) {
		 ArrayList<String> animal = new ArrayList<String>();
		    animal.add("Castor");
		    animal.add("Ave");
		    animal.add("Blanco");
		    
		    System.out.println(animal);
		    
		    Perro labrador = new Perro(null, null);

		    labrador.nombre = "Blanco";
		    labrador.displayNombre();
		    labrador.comer();
		    
		    Mono miMono = new Mono(null, null);
		    miMono.nombre= "Clara";
		    miMono.especie="mamifero";
		    miMono.displayNombre();
		    miMono.displayEspecie();
		    miMono.comer();

		  }
}
