package ejercicio1;

import java.util.Scanner;

public class Calculadora_de_precios {

	public static void main(String[] args) {
		//Variables
		Scanner sc = new Scanner(System.in);
		double PrecioBase;
		
		
		//funciones
		System.out.println("Introduzca por teclado el precio base");
		PrecioBase = sc.nextDouble();
		double Ganancias=((PrecioBase * 30)/100) ;
		double Impuestos=((PrecioBase * 21)/100);
		double PrecioFinal = (PrecioBase+Ganancias+Impuestos);
		if(PrecioFinal>600) {
			System.out.println("El precio final del producto de lujo es de: " + PrecioFinal+"€");
		}else {
			System.out.println("El precio final del producto es de: " + PrecioFinal+"€");
		}
		
		sc.close();
	}

}
