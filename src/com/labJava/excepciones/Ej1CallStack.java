package com.labJava.excepciones;

public class Ej1CallStack {

	/*

		Ejercicio 1: En el m�todo com.labJava.excepciones.Ej1CallStack.c() 
		generar un c�digo que produzca un java.lang.ArrayIndexOutOfBoundsException 
		(por ejemplo creando un array est�tico y populando con un elemento del array 
		con un �ndice fuera de rango). Luego modificar el m�todo b() tal que tenga la 
		forma: 
		
		private static void b() throws Exception { 
		
		y utilizar el asistente de compilaci�n de Eclipse para terminar manejando dicha 
		Excepci�n en el main()

	 */
	
	public static void main(String[] args) {		
		a();
	}
	
	private static void a() {
		b();
	}

	private static void b() {	
		c();
		
	}
	
	private static void c() {
		
	}
	
}
