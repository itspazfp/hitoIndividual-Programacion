package ejercicio1;

public class Animal {
	
          String especie;
          String nombre;
          
          
		  public Animal(String especie, String nombre) {
			super();
			this.especie = especie;
			this.nombre = nombre;
		}
		  
		  

		
		  
		  
		  public String getEspecie() {
			return especie;
		}






		public void setEspecie(String especie) {
			this.especie = especie;
		}






		public String getNombre() {
			return nombre;
		}






		public void setNombre(String nombre) {
			this.nombre = nombre;
		}




         public void comer() {
		    System.out.println("Estoy comiendo");
		  }
         //Sobrecarga
         
         public void tocar()
         {
          System.out.println("Prohibido Aariciar");
         }
		
         //Sobrescritura
		
		
//		  public void sumar(String nombre)
//		    {
//		        System.out.println("Mi nombre es: "+nombre);
//		    }
//		 
//		    
//		    public void sumar(String especie)
//		    {    
//		        System.out.println("la suma es: "+especie);
//		    }
		}
