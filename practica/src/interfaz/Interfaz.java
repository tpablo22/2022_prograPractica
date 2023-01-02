package interfaz;

import dominio.Libreta;
import dominio.Pasteleria;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Interfaz {

	private static String NOMBRE_FICHERO_CSV = "pasteleleria.csv";

	public static void procesarPeticion(String guia ,String remplazo) {



		Libreta libreta = inicializarLibreta();

		String[] partes = guia.split(" ");
		String[] partesSustitucion = remplazo.split(" ");

		if(partes.length == 6){
			if (partes[0].equalsIgnoreCase("add")){
				Pasteleria rep = new Pasteleria(Integer.parseInt(partes[1]), partes[2], partes[3], partes[4], Integer.parseInt(partes[5]));
				libreta.addPasteleria(rep);
				guardarLibreta(libreta);

			}else if (partes[0].equalsIgnoreCase("edit")){
				Pasteleria rep = new Pasteleria(Integer.parseInt(partes[1]), partes[2], partes[3], partes[4], Integer.parseInt(partes[5]));
				Pasteleria repos = new Pasteleria(Integer.parseInt(partesSustitucion[0]), partesSustitucion[1], partesSustitucion[2], partesSustitucion[3], Integer.parseInt(partesSustitucion[4]));
				libreta.editarPasteleria(rep, repos);
				guardarLibreta(libreta);
			}else{
				System.out.println("Lo siento no te entiendo, vuelve a intentarlo.");
			}
		}else if (partes[0].equalsIgnoreCase("delete")){
			Pasteleria pasteleria = new Pasteleria(Integer.parseInt(partes[1]));
			libreta.addPasteleria(pasteleria);
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
					FileWriter fw = new FileWriter(NOMBRE_FICHERO_CSV);
					fw.write(libreta.toString());
					fw.close();
				} catch (IOException s) {
					System.out.println("Ha habido un error al guardar el fichero");
				}

			}
			private static Libreta inicializarLibreta () {

				Libreta libreta = new Libreta();
				try{
					try{
						try{
							File file = new File(NOMBRE_FICHERO_CSV);
							Scanner sc = new Scanner(file);
							while(sc.hasNext()){
								String id = sc.next();
								String reposteria = sc.next();
								String sabor = sc.next();
								String cliente = sc.next();
								String precio = sc.next();
								Pasteleria pasteleria = new Pasteleria(Integer.parseInt(id), reposteria, sabor, cliente, Integer.parseInt(precio));
								libreta.addPasteleria(pasteleria);
							}
							sc.close();
						}catch(NoSuchElementException j){
						}
					}catch(NumberFormatException i){

					}
				}catch(FileNotFoundException e){
				}
				return libreta;

			}
			public static void printHelp () {
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
			private static void generarCSV (Libreta libreta){
				try {
					FileWriter fw = new FileWriter(NOMBRE_FICHERO_CSV);
					fw.write(libreta.toCSV());
					fw.close();
					System.out.println("Se ha generado el fichero CSV");
				} catch (IOException e) {
					System.out.println("No se ha podido generar el fichero CSV");
				}
			}


		}






