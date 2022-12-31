package aplicacion;

import interfaz.*;

import java.util.Scanner;

public class Principal{
	public static void main(String args[]) {

		int i = 0;
		/*String sentencia = " ";
		for (int i = 0;i < args.length; i++){
			sentencia += args[i]+ " ";
			//sustitucion += args[i]+" ";

		}
		Interfaz.perticionGuia(sentencia/*,sustitucion**/
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


	}
}
