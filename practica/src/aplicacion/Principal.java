/*
		Copyright [2023] [Estefania Del Valle De Nisco Rubino, Pablo Torres]
		Licensed under the Apache License, Version 2.0 (the "License");
		you may not use this file except in compliance with the License.
		You may obtain a copy of the License at
		http://www.apache.org/licenses/LICENSE-2.0
		Unless required by applicable law or agreed to in writing, software
		distributed under the License is distributed on an "AS IS" BASIS,
		WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		See the License for the specific language governing permissions and
		limitations under the License.

 */

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
