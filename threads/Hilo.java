package ejercicios.threads;

import java.time.LocalDateTime;

public class Hilo extends Thread {
	
	/* 1) Mostrar los numeros del 1 al 20 con un retardo de 3 segundos entre cada numero*/
	
	@Override
	public void run() {
		
		try {
			for (int i=1 ; i <= 20 ; i++) {
				System.out.println(i);
				Thread.sleep(3000);
				
			}
		}
		catch (InterruptedException e) {
			System.out.println(e.getMessage());		
		}
		
	}
	
	public static void main(String[] args) {
		Hilo hilo = new Hilo();
		
		hilo.start();
	}

}
