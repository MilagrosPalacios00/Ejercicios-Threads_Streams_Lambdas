package ejercicios.threads.ejercicio2;

public class Main {
	
	/*  Cada Thread muestra la suma resultante cuando finaliza.  
	 * Utilizar las pausas necesarias para que se observe el paralelismo. */
	
	public static void main(String[] args) {
		
		Hilo1 h1 = new Hilo1();
		Hilo2 h2 = new Hilo2(); 
		
		h1.start();
		h2.start();
		
	}
	
	
	
	

	

}
