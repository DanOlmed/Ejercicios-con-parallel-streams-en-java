package ar.com.unpaz.principal;

import java.util.Scanner;

import ar.com.unpaz.model.Ejercicios;

public class Main {

	public static void main(String[] args) {
		menu();
	}
	
	
	public static void menu() {
		int opcion =0;
		
		System.out.println("***MENU PRINCIPAL***\n");
		System.out.println("1.Ejercicio 1\n");
		System.out.println("2.Ejercicio 2\n");
		System.out.println("3.Ejercicio 3\n");
		System.out.println("4.Ejercicio 4\n");
		System.out.println("5.SALIR\n");
		System.out.println("Seleccionar opcion: ");
		
		
		Scanner ingreso = new Scanner(System.in);
		opcion = ingreso.nextInt();
		switch(opcion) {
		case 1:{ 
			
			Ejercicios.ejercicio1();;
			break;}
		case 2:{ Ejercicios.ejercicio2();;
			break;}
		case 3: {Ejercicios.ejercicio3();
			break;}
		case 4:{ Ejercicios.ejercicio4();;
			break;}
		case 5: {
			
		}
		
		default:{
			break;}
		}
	
		
		System.out.println("***FIN DEL PROGRAMA***");

		
	}

}
