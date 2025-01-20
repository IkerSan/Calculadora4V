package org.cuatrovientos.dam.ed.calculadora4v;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		int numero;
		float numero1;
		float numero2;
		Scanner scanner = new Scanner(System.in);
		
		//Menú de la calculadora
		
			System.out.println("CALCULADORA");
			System.out.println("===========");
			System.out.println("1 - Suma");
			System.out.println("2 - Resta");
			System.out.println("3 - Multiplicación");
			System.out.println("4 - División");
			System.out.println("Introduce una opción:");
			
		//Comprobar que se introduce una operación válida
			
			do {
				String respuesta = scanner.nextLine();
				numero = Integer.parseInt(respuesta);
				if (numero<0||numero>5) {
					System.out.println("Introduce un número 1-4");	
				}					
			}while (numero<=0||numero>5);
			
		//Introducir los 2 números a operar
			
			System.out.print("Introduce el número 1: ");
			String respuesta1 = scanner.nextLine();
			numero1 = Float.parseFloat(respuesta1);
			
			System.out.print("Introduce el número 2: ");
			String respuesta2 = scanner.nextLine();
			numero2 = Float.parseFloat(respuesta2);
			
		//Resolución de la operación con sus 4 variantes
			
			switch(numero) {
			case 1:
				System.out.println("Suma de los números: " + (numero1 + numero2));
				break;
			case 2:
				System.out.println("Resta de los números: " + (numero1 - numero2));
				break;
			case 3:
				System.out.println("Multiplicación de los números: " + (numero1 * numero2));
				break;
			case 4:
				 if (numero2 == 0) {
                     System.out.println("Error: no se puede dividir entre cero");
                 } else {
                	 System.out.println("División de los números: " + (numero1 / numero2));
                	 break;	
                 }
		}		
	}
}