package EjercicioA3;

public class Principal {

	public static void main(String[] args) {
		// Creamos dos Rectangulo
		Rectángulo r1 = new Rectángulo();
		Rectángulo r2 = new Rectángulo();

		// Rellenamos sus atributos
		r1.x1 = 0;
		r1.x2 = 5;
		r1.y1 = 0;
		r1.y2 = 5;

		r2.x1 = 7;
		r2.x2 = 2;
		r2.y1 = 9;
		r2.y2 = 3;

		// Mostramos los rectángulos
		System.out.println("Primer Rectángulo:\rCoordenadas: (" + r1.x1 + "," + r1.y1 + ")(" + r1.x2 + "," + r1.y2
				+ ")\rPerímetro: " + r1.perimetro + "\rÁrea: " + r1.area);
		System.out.println("Segundo Rectángulo:\rCoordenadas: (" + r2.x1 + "," + r2.y1 + ")(" + r2.x2 + "," + r2.y2
				+ ")\rPerímetro: " + r2.perimetro + "\rÁrea: " + r2.area);

		// Modificamos los datos
		r1.x1 = 1;
		r1.x2 = 6;
		r1.y1 = 1;
		r1.y2 = 6;

		r2.x1 = 6;
		r2.x2 = 1;
		r2.y1 = 8;
		r2.y2 = 2;

		// Volvemos a mostrar los rectángulos
		System.out.println("Primer Rectángulo:\rCoordenadas: (" + r1.x1 + "," + r1.y1 + ")(" + r1.x2 + "," + r1.y2
				+ ")\rPerímetro: " + r1.perimetro + "\rÁrea: " + r1.area);
		System.out.println("Segundo Rectángulo:\rCoordenadas: (" + r2.x1 + "," + r2.y1 + ")(" + r2.x2 + "," + r2.y2
				+ ")\rPerímetro: " + r2.perimetro + "\rÁrea: " + r2.area);
	}

}
