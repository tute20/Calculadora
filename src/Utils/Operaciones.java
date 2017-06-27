package Utils;

public interface Operaciones {

	public double operacion(String operador, double...parametros); // Los "..." son para tener un array de parametros//
	public double operacion(String operador, double a, double b);
	public double operacion(String operador, double a, double b, double c);
	public double operacion(String operador, double a, double b, double c, double d);
}
