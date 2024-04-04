/**
 * 
 */

package practica1;
import java.util.Scanner;
/**
 * clase principal  del sistema
 * @author garre
 * @version1 1.1 
 *
 */
public class notas {
	/**
	 * @param uf1,uf2,uf3  variables con el valor de las notas 
	 * @param acu1,acu2,acu3  variables  valor promedio de la nota 
	 */

	//declaramos la variables que nos hacen falta
		double uf4, uf5, uf6;
		double acu1, acu2, acu3, def;
		//utilizamos Scaner para poder introducir datos
		Scanner entrada = new Scanner(System.in);
		
		///vamos ca crear un metodo para ingresar 
		/**
		 * metodo que permite introducir los parametros 
		 * @param uf4, uf5, uf6  variables con el valor de las notas 
		 */
		public void IngresaNotas() {
			//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
			System.out.println("ingrese las notas del estudiante");
			
			System.out.print("ingrese nota 1: ");
			
			uf4= entrada.nextDouble();

			
			
			System.out.print("ingrese nota 2: ");
			
			uf5= entrada.nextDouble();
			System.out.print("ingrese nota 3: ");
			
			uf5= entrada.nextDouble();
			
		
		}
		
		// metodo para comprobar bien entroduccion de notas
		/**
		 * metodo para verificar que las notas introducidas son correctas.
		 * @return retorna texto indicando si las notas  introducidas son correctas.
		 */
		public void comprobarcion(){
			
			if (uf4>10) {
				System.out.println(" nota1 mal introducida");
				
			}else {
				System.out.println(" nota1 correcta");
			}
			
			if (uf5>10) {
				System.out.println(" nota2 mal introducida");
				
			}else {
				System.out.println(" nota2 correcta");
			}
			if (uf6>10) {
				System.out.println(" nota3 mal introducida");
				
			}else {
				System.out.println(" nota3 correcta");
			}
			
				
			
			
		}
		// metodo para calcular nota
		
		/**
		 * metodo para el calculo  de la nota definitiva
		 * @param acu1,acu2,acu3  variables  valor promedio de la nota 
		 * @param  def variable con el valor de la suma las notas parciales 
		 */
		public void Calculonotas() {
			acu1= uf4*0.35;
			acu2 = uf5 * 0.35;
			acu3 = uf6 * 0.30;
			
			def = acu1 + acu2+ acu3;
			
			//hasta aqui la tenemos calculada peor no la mostramos
		}
		/**
		 * metodo para mostrar toda la infomacion de las notas parciales y totales
		 * indicando la nota definitiva 
		 */
		public void Mostrar() {
			//print ln lo que hace es que al terminar el print baja la linea
			System.out.println(" notas introducidas son:");
			System.out.println(" nota1 = " + uf4);
			System.out.println(" nota2 = " + uf5);
			System.out.println(" nota3 = " + uf6);
			
			System.out.println(" acumuado 1 = "+ acu1);
			System.out.println(" acumuado 2 = "+ acu2);
			System.out.println(" acumuado 3 = "+ acu3);
			
			System.out.println(" nota definitiva es = "+ def);
			
		}
		/**
		 * metodo de verificacion del valor de la nota 
		 * @return sin el valor este entre 0-5 suspendido  y  5-10   aprovado  por encima o debajo error
		 * 
		 */
		public void aprobado() {
				
				if(def<5 && def>=0) {
					System.out.println("has suspendido, deberas recuperar");
				}else {
					if (def>=5 && def<=10 ) {
					System.out.println(" bien has  aprobado");
					}else {
						System.out.println(" error en la notas");
					}
				}
			}
			/**
			 * metodo 
			 * @param args
			 */
			
		public static void main(String[] args) {
			// creamos mecanimos para llamar a cualquier metodo fuero de la clase
			notas fc= new notas();
			
			fc.IngresaNotas();
			
			fc.comprobarcion();
			

			fc.Calculonotas();
			
			fc.Mostrar();
			
			fc.aprobado();
			
		}



}
