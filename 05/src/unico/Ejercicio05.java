package unico;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
// Realiza un programa que resuelva una ecuación de primer grado (del tipo: ax+b = 0).

		double a;
		double b;
		double x;
		
		System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
		System.out.print("Por favor, introduzca el valor de a: ");
		a = Double.parseDouble(teclado.nextLine());
		System.out.print("Ahora introduzca el valor de b: ");
		b = Double.parseDouble(teclado.nextLine());
		
		if (a == 0) {
			System.out.println("Esa ecuación no tiene solución real");
		} else {
			x = -b/a;
			System.out.print("x = " + x);
		}

	}

}