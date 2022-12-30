package dominio;

import java.util.ArrayList;

public class Libreta{

	private ArrayList<Pasteleria> pasteleria = new ArrayList<>();

	public ArrayList<Pasteleria> getLibreta(){
		return pasteleria;
	}
	public void setLibreta(ArrayList<Pasteleria> libreta){

		this.pasteleria = libreta;
	}
	public void addPasteleria(Pasteleria libreta){
		libreta.add(libreta);
	}
	public void eliminarPasteleria(Pasteleria libreta){
		libreta.remove(libreta);
	}
	public void editarPasteleria(Pasteleria libreta, Pasteleria libreta2){
		if(pasteleria.remove(libreta)) {
			pasteleria.remove(libreta);
			pasteleria.add(libreta2);
		}else{
			System.out.println("No se puede editar la libreta");

		}
	}
		
	public String toString(){
		String mensaje = "";
		for(int i = 0; i < libreta.size(); i++){
			mensaje += libreta.get(i) + "\n";
		}
		return mensaje;
	}
	public String toCSV(){
		StringBuilder mensaje = new StringBuilder();
		for(Pasteleria libreta: pasteleria){
			
		}
		return mensaje.toString();

		
	}
}
