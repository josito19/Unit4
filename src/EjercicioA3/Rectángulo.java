package EjercicioA3;

public class Rectángulo {

	// Creacio de los atributos
	int x1;
	int x2;
	int y1;
	int y2;
	double ancho = Math.abs(x2 - x1);
	double alto = Math.abs(y2 - y1);
	double area = ancho * alto;
	double perimetro = 2 * (ancho + alto);
}
