package ejercicio1;

public class Mono extends Animal{

	public Mono(String especie, String nombre) {
		super(especie, nombre);
		// TODO Auto-generated constructor stub
	}
	public void displayNombre() {
	    System.out.println("Mi nombre es " + nombre);
	  }
	public void displayEspecie() {
		    System.out.println("Soy un " + especie );
		  }
	//Sobrecarga
	 @Override         
	 public void tocar() {
	    System.out.println("Acaricicar con cuidado");
	 }

}
