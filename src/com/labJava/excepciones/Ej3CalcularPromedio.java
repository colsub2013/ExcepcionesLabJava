package com.labJava.excepciones;

public class Ej3CalcularPromedio {
	
/*	
	Ejercicio 3: 
	Dentro del m�todo com.labJava.excepciones.main(...) implementar un bucle for 
	que calcule el promedio de resultado de ex�menes (cuya calificaci�n es de 1 a 10 
	y admite cent�simos). Los datos son ingresados desde el array de Strings argumento del 
	m�todo main(...). En caso de que dichos datos de entrada est�n fuera del rango de 
	calificaci�n arrojar un IllegalArgumentException
	
	Sugerencia: Pasaje de par�metros populando el array de String del main:
	
	. Tildar con bot�n derecho en este archivo
	. Run As ...
	. Run Configurations ...
	. Escribir dentro de la pesta�a 'Arguments', en la ventana 'Program Arguments' los siguiente nros
	  separados s�lo por espacios. Ej.: 4.5 9 6.3 5.5 7.1 9.5
	. Click en bot�n Run
	
	
*/	
	public static void main(String[] args) {
		
		float y = 0;
		float cantidad = args.length;

		// implementar c�digo
			
		if(cantidad > 0) {
			System.out.println("Promedio: " + y/cantidad);
		} 
		
	}

}
