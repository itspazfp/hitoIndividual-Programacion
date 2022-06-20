package ejercicio2;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Leer accediendo =new Leer();
		accediendo.leer();
			
	}
}
 class Leer {
	public void leer() {
		try {
			entrada = new FileReader("./fichero1.txt");
			
			int c=entrada.read();
			
			
			while (c!=-1) {
				c=entrada.read();
				char letra =(char)c;
				System.out.print(letra);
			
			}
			//entrada.close();			
		} catch (IOException e) {
			System.out.print("Fichero no encontrado");
		} finally {
			try {
			entrada.close();	
			}catch (IOException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
   }
	
	FileReader entrada;
}