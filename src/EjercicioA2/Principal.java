package EjercicioA2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Creacion del escaner
		Scanner sc = new Scanner(System.in);
		boolean esMayor;
		
		// Creamos dos Persona
		Persona p1 = new Persona();
		Persona p2 = new Persona();

		// Solicitamos los datos y asignamos a cada Persona
		System.out.println("Introduzca los datos de Persona:\rNombre:");
		p1.nombre = sc.next();
		System.out.println("Apellidos:");
		p1.apellidos = sc.next();
		System.out.println("Edad:");
		p1.edad = sc.nextInt();
		System.out.println("DNI:");
		p1.dni = sc.next();

		System.out.println("Introduzca los datos de Persona:\rNombre:");
		System.out.println();
		p2.nombre = sc.next();
		System.out.println("Apellidos:");
		p2.apellidos = sc.next();
		System.out.println("Edad:");
		p2.edad = sc.nextInt();
		System.out.println("DNI:");
		p2.dni = sc.next();
		
		// Mostramos los datos de Persona
		esMayor = p1.edad >= 18 ? true : false;
		System.out.println(p1.nombre + " " + p1.apellidos + " con dni " + p1.dni + " es mayor de edad");
				
		sc.close();
	}

}
