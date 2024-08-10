package ejercicios.threads.ejercicio2;


public class Hilo1 extends Thread{
	
	//Generar un Thread que imprima numeros pares (1 al 10) y calcule la suma.
	
	public boolean esPar (int num) {
		return (num % 2) == 0;
	}
	
	@Override
	public void run() {	
		int suma = 0;	
		
		try {
			for (int i=1 ; i <= 10 ; i++) {
				if (esPar(i)) {
					System.out.print(i + " | ");
					suma += i;
				}			
			}
			Thread.sleep(2000);
			System.out.println(" ");
			System.out.println("Suma numero pares : " + suma);
		}
		catch (InterruptedException e) {
			System.out.println("Ocurrio un error " + e.getMessage());
			
		}
	}

}
