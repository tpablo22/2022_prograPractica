package aplicacion;

import interfaz.*;

import java.util.Scanner;
import java.util.StringTokenizer;



public class Principal{
	public static void main(String[] args){

		Interfaz interfaz = new Interfaz();
		interfaz.printHelp();
		int i = 0;
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
					System.out.println("Que producto quieres cambiar");
					sustitucion = sc.nextLine();
				}
			}
			interfaz.procesarPeticion(sentencia, sustitucion);
		}
	}
}
