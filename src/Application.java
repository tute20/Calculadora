import Controlador.Logica;
import Vista.Pantallas;

public class Application {

	public static void main(String[] args){
		
		Pantallas vista = new Pantallas();
		Logica controlador = new Logica();
		
		String valorIngresado = vista.ingresarvalor(" Calculadora ");
		
		vista.mostrarmensaje("El resultado es: "+controlador.calcular(valorIngresado));
		
	}
}
