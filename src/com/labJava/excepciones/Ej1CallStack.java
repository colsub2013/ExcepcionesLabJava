package com.labJava.excepciones;

public class Ej1CallStack {

	/*

		Ejercicio 1: En el método com.labJava.excepciones.Ej1CallStack.c() 
		generar un código que produzca un java.lang.ArrayIndexOutOfBoundsException 
		(por ejemplo creando un array estático y populando con un elemento del array 
		con un índice fuera de rango). Luego modificar el método b() tal que tenga la 
		forma: 
		
		private static void b() throws Exception { 
		
		y utilizar el asistente de compilación de Eclipse para terminar manejando dicha 
		Excepción en el main()

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
