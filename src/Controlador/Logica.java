package Controlador;

import Utils.Ayudante;
import Utils.Resta;
import Utils.Suma;

public class Logica {

	public double calcular(String valores){
		
		String[] numeros;
		double resultado=0;
		
		if(valores.contains("+"))
		{
			numeros = valores.split("\\+");
			if(numeros.length>1)
			{
				Suma sumar = new Suma();
				
				switch (numeros.length) {
				case 2: //en caso de que sean 2 numeros //
					resultado = sumar.Suma("+", Ayudante.conversor(numeros[0]), Ayudante.conversor(numeros[1]));
					break;
				case 3: //en caso de que sean 3 numeros //
					resultado = sumar.Suma("+", Ayudante.conversor(numeros[0]), Ayudante.conversor(numeros[1]), Ayudante.conversor(numeros[2]));
					
				default: //En caso de que sean 4 o mas, Utilizamos el default//
					resultado = sumar.Suma("+", Ayudante.conversor(numeros));
					break;
				}
			}
		}
		
		if(valores.contains("-"))
		{
			numeros = valores.split("-");
			if(numeros.length>1)
			{
				Resta restar = new Resta();
				
				switch (numeros.length) {
				case 2: //en caso de que sean 2 numeros //
					resultado = restar.Resta("+", Ayudante.conversor(numeros[0]), Ayudante.conversor(numeros[1]));
					break;
				case 3: //en caso de que sean 3 numeros //
					resultado = restar.Resta("+", Ayudante.conversor(numeros[0]), Ayudante.conversor(numeros[1]), Ayudante.conversor(numeros[2]));
					
				default: //En caso de que sean 4 o mas, Utilizamos el default//
					resultado = restar.Resta("+", Ayudante.conversor(numeros));
					break;
				}
			}
		}
		return resultado;
	}
}
