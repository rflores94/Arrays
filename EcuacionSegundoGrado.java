import utiles.*;
/**
*Define la clase EcuacionSegundoGrado que muestre las soluciones de una ecuación de segundo grado ax2 + bx + c = 0.
*Se le preguntará al usuario si quiere repetir el programa. Utiliza métodos (deseaContinuar, leerCoeficientes,
*mostrarResultados…)
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class EcuacionSegundoGrado{
	public static void main(String[] args) {
		double[] valores = new double[3];
//		double a, b, c;
		do{
			valores[0]=leerCoeficientes("a:");
			valores[1]=leerCoeficientes("b:");
			valores[2]=leerCoeficientes("c:");
			mostrarResultados(valores[0], valores[1], valores[2]);
		}while(deseaContinuar());
	}

	static double leerCoeficientes(String mensaje){
		return Teclado.leerEntero("Dime el valor de "+mensaje);
	}

	/**
	* Muestra en resultado de la ecuacion
	*/
	static void mostrarResultados(double a, double b, double c){
		System.out.println("El resultado es: "+(-b+(Math.sqrt((b*b)-(4*a*c))))/(2*a)+
				" y "+(-b-(Math.sqrt((b*b)-(4*a*c))))/(2*a));
	}

	/**
	* Pregunta al usuario si desea continuar
	*@return la respuesta del usuario
	*/
	static boolean deseaContinuar(){
		char respuesta;
		respuesta=Teclado.leerCaracter("Desea continuar? (s/n)");
		if(respuesta=='s' || respuesta=='S')
			return true;
		else
			return false;
	}
}