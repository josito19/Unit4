package EjercicioA1;

public class Principal {

	public static void main(String[] args) {
		// Creamos los tres Punto
		Punto p1 = new Punto();
		Punto p2 = new Punto();
		Punto p3 = new Punto();

		// Rellenamos con los datos cada Punto
		p1.x = 5;
		p1.y = 0;

		p2.x = 10;
		p2.y = 10;

		p3.x = -3;
		p3.y = 7;

		// Mostramos por pantalla los datos de los Punto
		System.out.println(p1.x + ", " + p1.y);
		System.out.println(p2.x + ", " + p2.y);
		System.out.println(p3.x + ", " + p3.y);

		// Modificamos los datos de cada Punto
		p1.x += 5;
		p1.y -= 2;

		p2.x /= 2;
		p2.y /= 2;

		p3.x *= 3;
		p3.y *= 3;
		
		// Mostramos por pantalla los datos de los Punto
		System.out.println("Nuevos Punto :");
		System.out.println(p1.x + ", " + p1.y);
		System.out.println(p2.x + ", " + p2.y);
		System.out.println(p3.x + ", " + p3.y);
	}

}
