package ejercicios.threads.ejercicio2;

public class Hilo2 extends Thread {
	
	//otro Thread que imprima impares (1 al 10) y calcula la suma.
	
	public boolean esImpar (int num) {
		return (num % 2) != 0;
	}
	
	@Override
	public void run() {	
		
		int suma = 0;
		
		try {
			Thread.sleep(1000);
			System.out.println(" ");
			for (int i=1 ; i <= 10 ; i++) {
				if (esImpar(i)) {
					System.out.print(i + " | ");
					suma += i;
				}			
			}
			Thread.sleep(2000);
			System.out.println("Suma numeros impares :  " + suma);
		}
		catch (InterruptedException e) {
			System.out.println("Ocurrio un error " + e.getMessage());
		}
	}


}
