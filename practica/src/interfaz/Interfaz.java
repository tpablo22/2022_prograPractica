package interfaz;



import dominio.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.NoSuchElementException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.NumberFormatException;


public class Interfaz{

	private static String Pasteleria_Exel = "Pasteleleria.csv";




	public void procesarPeticion(String sentencia, String sustitucion){
		Libreta libreta = inicializarLibreta();

		String[] partes = sentencia.split(" ");
		String[] partesSustitucion = sustitucion.split(" ");

		if(partes.length == 6){
			if (partes[0].equalsIgnoreCase("add")){
				Pasteleria pasteleria = new Pasteleria(Integer.parseInt(partes[1]), partes[2], partes[3], partes[4], Integer.parseInt(partes[5]));
				libreta.annadirPateleria(pasteleria);
				guardarLibreta(libreta);

			}else if (partes[0].equalsIgnoreCase("edit")){
				Pasteleria pasteleria = new Pasteleria(Integer.parseInt(partes[1]), partes[2], partes[3], partes[4], Integer.parseInt(partes[5]));
				Pasteleria pasteleria2 = new Pasteleria(Integer.parseInt(partesSustitucion[0]), partesSustitucion[1], partesSustitucion[2], partesSustitucion[3], Integer.parseInt(partesSustitucion[4]));
				libreta.editarPasteleria(pasteleria, pasteleria2);
				guardarLibreta(libreta);
			}else{
				System.out.println("Lo siento no te entiendo, vuelve a intentarlo.");
			}
		}else if (partes[0].equalsIgnoreCase("delete")){
			Pasteleria pasteleria = new Pasteleria(Integer.parseInt(partes[1]));
			libreta.eliminarPasteleria(pasteleria);
			guardarLibreta(libreta);

		}else if(partes[0].equalsIgnoreCase("list")){
			System.out.println("Estos son los productos que tienes en la libreta:\n");
			System.out.println(libreta);

		}else if(partes[0].equalsIgnoreCase("help")){
			printHelp();



		}else if(partes[0].equalsIgnoreCase("exit")){
			System.out.println("Gracias por su visita vuelva pronto");

		}else{
			System.out.println("Lo siento no te entiendo, vuelve a intentarlo.");

		}

	}

			private static void guardarLibreta (Libreta libreta){
				try {
					FileWriter fw = new FileWriter(Pasteleria_Exel);
					fw.write(libreta.toString());
					fw.close();
				} catch (IOException p) {
					System.out.println("Ha habido un error al guardar el fichero");
				}

			}
	private static Libreta inicializarLibreta() {
		Libreta libreta = new Libreta();
		try {
			try {
				try {
					File file = new File(Pasteleria_Exel);
					Scanner sc = new Scanner(file);
					while (sc.hasNext()) {
						String id = sc.next();
						String reposteria = sc.next();
						String sabor = sc.next();
						String cliente = sc.next();
						String precio = sc.next();
						Pasteleria pasteleria = new Pasteleria(Integer.parseInt(id), reposteria, sabor, cliente, Integer.parseInt(precio));
						libreta.annadirPateleria(pasteleria);
					}
					sc.close();
				} catch (NoSuchElementException j) {
				}
			} catch (NumberFormatException i) {

			}
		} catch (FileNotFoundException e) {
		}return libreta;


	}
			public static void printHelp () {
				String helpInfo = "En nuestra Libreta puedes realizar las siguientes operaciones:\n" +
						"\n---> 'add' para añadir un elemento a la libreta:\n" +
						"       Usando como base estas intrucciones: add id reposteria sabor cliente precio)\n" +
						"---> 'delete' para eliminar un elemento a la libreta:\n" +
						"       Usando como base estas intrucciones: delete id\n" +
						"---> 'edit' para edit un elemento a la libreta:\n" +
						"       Usando como base estas intrucciones: edit id reposteria color cliente precio (del producto que se quiere cambiar)\n" +
						"       Y luego escribiedo el producto nuevo con estas intrucciones: add id reposteria sabor cliente precio)\n"+
						"---> 'list' para ver los elemento de la libreta:\n" +
						"---> 'help' para mostrar la guia de nuevo: \n" +
						"---> 'exit' para salir de la libreta y guardad los datos en un csv\n";
				System.out.println(helpInfo);
			}
	private static void generarCSV(Libreta libreta){

		try{
			FileWriter fw = new FileWriter(Pasteleria_Exel);
			fw.write(libreta.toCSV());
			fw.close();
		} catch(IOException e){
			System.out.println("Error en la creacion del fichero");
		}
	}


		}






