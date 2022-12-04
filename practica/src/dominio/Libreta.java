package dominio;

import java.util.ArrayList;

public class Libreta{

	private ArrayList<Libreta> libreta = new ArrayList<>();

	public ArrayList<Libreta> getLibreta(){
		return libreta;
	}
	public void setLibreta(ArrayList<Libreta> libreta){

		this.libreta = libreta;
	}
	public void addLibreta(Pasteleria libreta){
		libreta.add(libreta);
	}
	public void eliminarLibreta(Pasteleria libreta){
		libreta.remove(libreta);
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
		for(Libreta libreta: libreta){
			
		}
		return mensaje.toString();

		
	}
}
