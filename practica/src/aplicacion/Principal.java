package aplicacion;

import interfaz.Interfaz;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Principal{
	public static void main(String args[]) {

		int i = 0;
		/*String sentencia = " ";
		for (int i = 0;i < args.length; i++){
			sentencia += args[i]+ " ";
			//sustitucion += args[i]+" ";

		}
		Interfaz.perticionGuia(sentencia/*,sustitucion
		Interfaz interfaz = new Interfaz();
		interfaz.printHelp();
		Scanner sc = new Scanner(System.in);


		String sentencia = null;
		while (i == 0) {
			System.out.println("Que operacion quieres realizar?");
			sentencia = sc.nextLine();
			if (sentencia.equalsIgnoreCase("exit")) {
				i = 1;
			}
		}
		Interfaz.perticionGuia(sentencia);

*/
		System.out.println("-------------------------------------");
		System.out.println("Bienvenido a tu catalogo de Zapatillas\n");
		Interfaz interfaz = new Interfaz();
		interfaz.printHelp();

		Scanner sc = new Scanner(System.in);
		String sustitucion = "";
		while(i == 0){
			System.out.println("¿Que deseas hacer?");
			String sentencia = sc.nextLine();

			if(sentencia.equalsIgnoreCase("exit")){
				i = 1;

			}else if(sentencia.contains("edit")){
				StringTokenizer st = new StringTokenizer(sentencia);
				if(st.countTokens() == 6){
					System.out.println("Por que zapatilla la quieres sustituir");
					sustitucion = sc.nextLine();
				}
			}
			Interfaz.procesarPeticion(sentencia, sustitucion);
		}
	}
}


