package ejercicio1;

import java.util.Scanner;

public class Calculadora_de_precios {

	public static void main(String[] args) {
		//Variables
		Scanner sc = new Scanner(System.in);
		double PrecioBase;
		double Ganancias= 0.3 ;
		double Impuestos=0.21 ;
		double PrecioBaseMasGanancias;
		//funciones
		System.out.println("Introduzca por teclado el precio base");
		PrecioBase = sc.nextDouble();
		double PrecioFinal = (PrecioBase*Ganancias);
		if(PrecioFinal>600) {
			System.out.println("El precio final del producto de lujo es de: " + PrecioFinal);
		}else {
			System.out.println("El precio final del producto es de: " + PrecioFinal);
		}
		
		
	}

}
