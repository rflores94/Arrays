import utiles.*;
/** 
* Define la clase Alumnos que obtenga aleatoriamente las notas de 30 alumnos. La nota será un número decimal 
comprendido entre 0 y 10, ambos inclusive. Utiliza métodos. Al finalizar el programa deberá mostrar:
a. Total de notas
b. Número de aprobados
c. Número de suspensos
d. Nota máxima
e. Nota mínima
f. Media

* @author: Roberto Carlos Flores Gomez
* @version: 1.0

*/

public class Alumnos{

		public static void main(String[] args){
		
			int numAlumnos=pedirNumAlumnos();
			double[] notas = new double[numAlumnos];
			double notamax=0, notamin=10, media=0;
			int numaprobados=0, i=0, numsuspensos=0;
			
			System.out.println("\n\t\t\t\tNotas alumnos: \n");
			
			while (i<notas.length){
				notas[i]=totalNotas();
				System.out.print("\t"+(int)notas[i]+"\t");
				numaprobados+=contarAprobados(notas[i]);
				numsuspensos+=contarSuspensos(notas[i]);
				notamax=calcularMaxima(notas[i], notamax);
				notamin=calcularMinima(notas[i], notamin);
				media=calcularMedia(notas[i], media);
				i++;
			}
			System.out.println("\nEl numero de aprobados es "+numaprobados);
			System.out.println("\nEl numero de suspensos es "+numsuspensos);
			System.out.println("\nLa nota maxima es "+notamax);
			System.out.println("\nLa nota minima es "+notamin);
			System.out.println("\nLa media de todas las notas es "+(media/notas.length));
		}

		/**
		* Pide el numero de alumnos al usuario
		*@return entero con el numero de alumnos mayor que 2
		*/
		static int pedirNumAlumnos(){
			int alumnos;
			do{
				alumnos=Teclado.leerEntero("Dime el numero de alumnos. Tiene que ser mayor que 2");
			}while(alumnos<3);
			return alumnos;
		}
		
		/**
		*
		* @return Devuelve el total de notas a la variable nota
		*
		* @param nota Double que va a devolver 
		*
		*/
		static double totalNotas(){
			int aux;
			double nota;
			nota=Math.random()*10+1;
			return aux=(int)nota;
		}
		
		/**
		*
		* @return Devuelve el total de aprobados a la variable numaprobados
		*
		* @param nota Double que va a devolver
		*
		*/
		static int contarAprobados(double nota){
			int contador2=0;
			if (nota>4)
				contador2++;
			return contador2;
		}
		
		/**
		*
		* @return Devuelve el total de suspensos a la variable numsuspensos
		*
		* @param nota Double que va a devolver
		*
		*/
		static int contarSuspensos(double nota){
			int contador2=0;
			if (nota<5)
				contador2++;
			return contador2;
		}
		
		/**
		*
		* @return Devuelve la nota máxima a la variable notamax
		*
		* @param nota Double con el que opera y devuelve
		* @param notamax Double con el que opera y devuelve
		*
		*/
		static double calcularMaxima(double nota, double notamax){
			if (nota>notamax)
				return nota;
			else return notamax;
		}
		
		/**
		*
		* @return Devuelve la nota mínima a la variable notamin
		*
		* @param nota Double con el que opera y devuelve
		* @param notamax Double con el que opera y devuelve
		*
		*/
		static double calcularMinima(double nota, double notamin){
			if (notamin>nota)
				return nota;
			else return notamin;
		}
		
		/**
		*
		* @return Devuelve la nota media a la variable media
		*
		* @param nota Double con el que opera
		* @param media Double con el que opera y devuelve
		*
		*/
		static double calcularMedia(double nota, double media){
			return nota+media;
		}

}