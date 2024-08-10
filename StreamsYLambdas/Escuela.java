package ejercicios.StreamsYLambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Escuela {
	
	
	private List<Alumno> alumnos;
	 
     private  String[] nombres = {"Juan", "Ana", "Pedro", "Maria", "Luis", "Laura", "Carlos", "Sofia", "Javier", "Claudia", "Andres", "Valeria", "Ricardo", "Gabriela", "Fernando"};
     private String[] apellidos = {"Gomez", "Lopez", "Martinez", "Rodriguez", "Hernandez", "Garcia", "Perez", "Sanchez", "Ramirez", "Morales", "Castro", "Ortiz", "Ruiz", "Mendez", "Flores"};
     private String[] cursos = {"Matematicas", "Historia", "Ciencias", "Literatura", "Geografia", "Fisica", "Quimica", "Biologia"};
 
	
	public Escuela () {
		this.alumnos = new ArrayList<>();
	}
	
	//a) Muestre todos los alumnos de la lista
	
	public void mostrarAlumnos () {
		this.alumnos.stream().forEach(a -> System.out.println(a.toString()));	
	}
	
	//b) Muestre todos los alumnos ordenados de menor a mayor por edad
	public void mostrarEdades () {
		this.alumnos.stream()
         .sorted(Comparator.comparingInt(a -> a.getEdad()))
         .forEach(a -> System.out.println(a.toString()));
	}
	
	//c) Muestre aquellos alumnos cuyo nombre empieza con un 
	//caracter dado (elegir el caracter en base a la lista de nombre que se utilizo)
	
	public List<Alumno> alumnosConLetra (String letra){
		return this.alumnos.stream().filter(a -> a.getNombre().startsWith(String.valueOf(letra))).collect(Collectors.toList());
	
	}
	
	 public void mostrarAlumnosConLetra(String letra) {
	        List<Alumno> filtrados = alumnosConLetra(letra);
	        if (filtrados.isEmpty()) {
	            System.out.println("No se encontraron alumnos con la letra " + letra);
	        } else {
	            filtrados.forEach(a -> System.out.println(a.toString()));
	        }
	    }
	
	//d) Sume la edad de todos los alumnos
	 
	 public double sumaEdades () {
		 return this.alumnos.stream().mapToInt(a -> a.getEdad()).sum();
	 }
	 
	 //e) Obtenga un mapa donde la clave sea la nota y el valor sea una lista de alumnos que tienen esa nota
	// Método para agrupar alumnos por nota
	 
	 public Map<Double, List<Alumno>> agruparPorNota() {
	     return this.alumnos.stream().collect(Collectors.groupingBy(Alumno::getNota));
	 } 

	 public void mostrarAgrupadosPorNota() {
	     Map<Double, List<Alumno>> alumnosPorNota = agruparPorNota();
	     alumnosPorNota.forEach((nota, lista) -> {
	     System.out.println("Nota: " + nota);
	     lista.forEach(System.out::println);
	      });
	    }
	 
	
	public void crearLista () {
	
		Random random = new Random();
		 
		for (int i = 0; i < 15; i++) {
	            int id = i + 1;
	            String dni = "DNI" + (1000 + i);
	            String nombre = nombres[random.nextInt(nombres.length)];
	            String apellido = apellidos[random.nextInt(apellidos.length)];
	            String curso = cursos[random.nextInt(cursos.length)];
	            double nota = 5 + (10 - 5) * random.nextInt(); // Nota entre 5 y 10
	            int edad = 15 + random.nextInt(5); // Edad entre 15 y 19
	            
	            Alumno alumno = new Alumno(id, dni, nombre, apellido, curso, nota, edad);
	            alumnos.add(alumno);
	        }	
	}
	
	
	
	

}
