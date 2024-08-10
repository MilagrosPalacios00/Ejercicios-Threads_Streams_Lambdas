package ejercicios.StreamsYLambdas;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Escuela escuela = new Escuela ();
		
		escuela.crearLista();
		/*System.out.println("----- LISTA DE ALUMNOS -----");
		escuela.mostrarAlumnos();
		
		System.out.println("----- Alumnos ordenados de menor a mayor por edad -----");
		escuela.mostrarEdades(); 
		
		
		 escuela.mostrarAlumnosConLetra("L"); 
		 System.out.println("La suma de las edades de los alumnos es : " + escuela.sumaEdades());*/
		 
		System.out.println("----- Alumnos agrupados por nota  -----");
		escuela.mostrarAgrupadosPorNota();
		
		
		
		
	}

}
