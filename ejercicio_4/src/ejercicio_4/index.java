package ejercicio_4;
import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		float euro, conversion;
		float pesetas = 166.386f;
		
		System.out.println("Ingrese el valor de euros que desea convertir a pesetas");
		euro= teclado.nextFloat();
		
		conversion = euro*pesetas;

		System.out.println(euro+" son equivalentes a:"+ conversion+" pesetas");
		teclado.close();
	}

}
