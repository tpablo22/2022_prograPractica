package interfaz;

import dominio.*;

import java.io.FileWriter;
import java.io.IOException;

public class Interfaz {

	public static String libretaPas ="Pasteleleria.txt";

	public static void perticionGuia(String guia) {
		String[] linea = guia.split(" ");
		Libreta libreta = inicializarLibreta();
		if (linea[0].equals("add")) {
			Pasteleria pasteleria = new Pasteleria(Integer.parseInt(linea[1]), linea[2], linea[3], Integer.parseInt(linea[4]));
			System.out.println(libreta);
			libreta.addPateleria(pasteleria);
			gurdarLibreta(libreta);
		} else if (linea[0].equals("delete")) {
			Pasteleria pasteleria = new Pasteleria(Integer.parseInt(linea[1]));
			libreta.eliminarPasteleria(pasteleria);
			guardarLibreta(libreta);
		} else if (linea[0].equals("list")) {
			System.out.println("La Pasteleria tiene los siguientes productos: \n");
			System.out.println(libreta);
		} else if (linea[0].equals("help")) {
			printHelp();

		} else if (linea[0].equals("exit")) {
			System.out.println("Gracias por comprar en nuestra pasteleria : )");
		} else {
			System.out.println("no se pudo realizar su peticion");

		}
	}
	private static void guardarLibreta(Libreta libreta){


	}
	private static Libreta inicializarLibreta(){

	}
	private static void printHelp(){
		String helpInfo = "En nuestra Libreta puedes realizar las siguientes operaciones: \n" +
				"---> 'add' para añadir un elemento a la libreta: \n   " +
				"Usando como base estas intrucciones (id, reposteria, cliente, precio)\n " +
				"---> 'delete' para eliminar un elemento a la libreta: \n   " +
				"Usando el id como intruccion para que se borre el elemento\n" +
				"---> 'edit' para editar un elemento a la libreta: \n   " +
				"Usando el id como intruccion para que se borre el elemento\n"+
				"---> 'help' para mostrar la guia de nuevo: \n   " +
				"---> 'generar' para eliminar un elemento a la libreta: \n   "+
				"---> 'exit' para salir de la libreta: \n   ";
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




