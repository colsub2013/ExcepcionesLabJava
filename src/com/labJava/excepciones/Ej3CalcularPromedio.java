package com.labJava.excepciones;

public class Ej3CalcularPromedio {
	
/*	
	Ejercicio 3: 
	Dentro del método com.labJava.excepciones.main(...) implementar un bucle for 
	que calcule el promedio de resultado de exámenes (cuya calificación es de 1 a 10 
	y admite centésimos). Los datos son ingresados desde el array de Strings argumento del 
	método main(...). En caso de que dichos datos de entrada estén fuera del rango de 
	calificación arrojar un IllegalArgumentException
	
	Sugerencia: Pasaje de parámetros populando el array de String del main:
	
	. Tildar con botón derecho en este archivo
	. Run As ...
	. Run Configurations ...
	. Escribir dentro de la pestaña 'Arguments', en la ventana 'Program Arguments' los siguiente nros
	  separados sólo por espacios. Ej.: 4.5 9 6.3 5.5 7.1 9.5
	. Click en botón Run
	
	
*/	
	public static void main(String[] args) {
		
		float y = 0;
		float cantidad = args.length;

		// implementar código
			
		if(cantidad > 0) {
			System.out.println("Promedio: " + y/cantidad);
		} 
		
	}

}
