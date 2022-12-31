package interfaz;
import java.util.NoSuchElementException;
import java.util.Scanner;
import dominio.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class Interfaz {

	private static String libretaPas ="pasteleleria.csv";

	public static void perticionGuia(String guia /*,String remplazo*/) {
		String[] linea = guia.split(" ");
		//String[] lineaRemplazo = remplazo.split(" ");

		Libreta libreta = inicializarLibreta();

		if (linea[0].equalsIgnoreCase("add") && (linea.length == 5)) {

			Pasteleria pasteleria = new Pasteleria(Integer.parseInt(linea[1]), linea[2], linea[3], Integer.parseInt(linea[4]));
			libreta.addPasteleria(pasteleria);
			guardarLibreta(libreta);

		}/* else if (linea[0].equalsIgnoreCase("edit")) {

			Pasteleria pasteleria = new Pasteleria(Integer.parseInt((linea[1])));
			Pasteleria pasteleria1 = new Pasteleria(Integer.parseInt(lineaRemplazo[1]), lineaRemplazo[2], lineaRemplazo[3], Integer.parseInt(lineaRemplazo[4]));
			libreta.editarPasteleria(pasteleria, pasteleria1);
			guardarLibreta(libreta);
			}*/
		 else if (linea[0].equalsIgnoreCase("delete")) {

			Pasteleria pasteleria = new Pasteleria(Integer.parseInt(linea[1]));
			libreta.eliminarPasteleria(pasteleria);
			guardarLibreta(libreta);

		} else if (linea[0].equalsIgnoreCase("list")) {

			System.out.println("La Pasteleria tiene los siguientes productos: \n");
			System.out.println(libreta);


		} else if (linea[0].equalsIgnoreCase("help")) {

			printHelp();

		} else if (linea[0].equalsIgnoreCase("exit")) {
			System.out.println("Gracias por comprar en nuestra pasteleria : )");
		} else {
			System.out.println("no se pudo realizar su peticion");

		}
	}
	private static void guardarLibreta(Libreta libreta){
		try{
			FileWriter fw = new FileWriter(libretaPas);
			fw.write(libreta.toString());
			fw.close();
			System.out.println("Se ha guardado la libreta");
		}catch(IOException s){
			System.out.println("Ha habido un error al guardar el fichero");
		}

	}
	private static 	Libreta inicializarLibreta(){

		Libreta libreta = new Libreta();
		try{
			try {
				try {



				File file = new File(libretaPas);
				Scanner sc = new Scanner(file);
				while (sc.hasNext()) {
					String id = sc.next();
					String reposteria = sc.next();
					String cliente = sc.next();
					String precio = sc.next();
					Pasteleria pasteleria = new Pasteleria(Integer.parseInt(id), reposteria, cliente, Integer.parseInt(precio));
					libreta.addPasteleria(pasteleria);
				}
				sc.close();
				} catch (NoSuchElementException j) {
				}
			}catch (NumberFormatException i){
			}
		}catch (FileNotFoundException e){

		}
		return libreta;

	}
	public static void printHelp(){
		String helpInfo = "En nuestra Libreta puedes realizar las siguientes operaciones:\n" +
				"\n---> 'add' para añadir un elemento a la libreta:\n" +
				"       Usando como base estas intrucciones (id, reposteria, cliente, precio)\n" +
				"---> 'delete' para eliminar un elemento a la libreta:\n" +
				"       Usando el id como intruccion para que se borre el elemento\n" +
				"---> 'list' para ver los elemento de la libreta:\n" +
				"---> 'help' para mostrar la guia de nuevo: \n" +
				"---> 'exit' para salir de la libreta:\n";
		System.out.println(helpInfo);
	}
	private static void generarCSV(Libreta libreta) {
		try{
			FileWriter fw = new FileWriter(libretaPas);
			fw.write(libreta.toCSV());
			fw.close();
			System.out.println("Se ha generado el fichero CSV");
		} catch(IOException e){
			System.out.println("No se ha podido generar el fichero CSV");
		}
	}






}




