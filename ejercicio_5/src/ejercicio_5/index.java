package ejercicio_5;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		float pesetas, euro ;

		
		System.out.println("Ingrese el valor de pesetas que desea convertir a euros");
		pesetas= teclado.nextFloat();
		euro = pesetas/166.386f;

		System.out.println(pesetas+" son equivalentes a:"+ euro+" euros");
		teclado.close();

	}

}
