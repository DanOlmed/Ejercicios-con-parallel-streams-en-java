package ar.com.unpaz.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.*;

public class Ejercicios {

	static public void ejercicio1() {
		/*
		 * Implementa un programa en Java que utilice
		 *  parallel streams para calcular la suma de los cuadrados de los números enteros del 1 al 100 de manera paralela
		 */
		
		List<Integer> numerosEnteros =IntStream.range(1, 100).boxed().collect(Collectors.toList());
		long lista = numerosEnteros.parallelStream()							   
							   .mapToInt(x->x*x)
							   .sum();
		
		System.out.println("Implementa un programa en Java que utilice parallel streams \npara calcular la suma de los cuadrados de los números enteros del 1 al 100 de manera paralela");
		System.out.println("El resultado de la suma de los cuadrados de los enteros entre 1 y 100 es : "+lista);
	}
	
	static public void ejercicio2() {
		/*
		 * Desarrolla una aplicación en Java que procese una lista de strings y busque las palabras que contienen una
		 * determinada subcadena utilizando parallel streams para mejorar la eficiencia del proceso
		 */
		System.out.println("\n\n");
		System.out.println("Ingrese letras para realizar la busqueda de un animal en la lista: ");
		List<String>listaPalabras = Arrays.asList("gato","perro","ave","lagarto","cabra","elefante","colibri","pez","mapache","coati");
		
		Scanner ingreso = new Scanner(System.in);
		String search = ingreso.next();
		System.out.println("Estas son las coincidencias encontradas");
		List<String> busqueda = listaPalabras.parallelStream()
						  .filter(x->x.contains(search))
						  .collect(Collectors.toList());
		busqueda.parallelStream().forEachOrdered(System.out::println);
						  
		ingreso.close();
	}
	
	static public void ejercicio3() {
		/*
		 * Escribe un programa en Java que utilice parallel streams para calcular el producto de los
		 * elementos de una lista de números enteros generados aleatoriamente y mostrar el resultado por pantalla
		 */
		ArrayList<Integer> listaDeNumeros=new ArrayList<Integer>();
		int numero=0;
		int producto=1;
		for(int i=0;i<5;i++) {
			numero = (int) (Math.random()*30+1);
			listaDeNumeros.add(numero);
			
		}		
		producto =listaDeNumeros.parallelStream().reduce(producto,(x,y)-> x*y);
							
		System.out.println("La lista de numeros es la siguiente\n"+listaDeNumeros);
		System.out.println("\n");
		System.out.println("El producto entre los numeros pertenecientes a la lista mostrada arriba es: "+producto);
	}
	
	static public void ejercicio4() {
		/*
		 * Crea una aplicación en Java que utilice parallel streams para encontrar
		 * los números primos en un rango dado y mostrarlos en orden ascendente,
		 * aprovechando la capacidad de procesamiento paralelo para mejorar el rendimiento del cálculo
		 */
		
		System.out.println("Ingrese rango para operar\n");
		System.out.println("Ingrese numero base: ");
		Scanner ingresoBase = new Scanner(System.in);
		int base =ingresoBase.nextInt();
		System.out.println("Ingrese numero de tope: \n");
		Scanner ingresoTope = new Scanner(System.in);
		int tope = ingresoTope.nextInt();
		ingresoBase.close();
		ingresoTope.close();
	
	   List<Integer>listaNumerica = IntStream.range(base, tope).boxed().collect(Collectors.toList());
	   ArrayList<Integer>listaPrimos= new ArrayList();
	   System.out.println("Los numeros primos en el rango de "+base+" a "+tope+" son: ");
	   for(int i=base;i<tope;i++) {
		   int count =0;
		   for(int j=1;j<=i;j++) {
			   if(i%j==0) {
				   count++;
			   }
		   }
		   if(count==2) {
			   listaPrimos.add(i);
		   }
	   }
	   listaPrimos.parallelStream().forEachOrdered(System.out::println);
	   
			   					 
	    
	   
		
		
		
	}
}
