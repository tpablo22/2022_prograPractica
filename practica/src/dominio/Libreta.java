package dominio;

import java.util.ArrayList;

public class Libreta{

	private ArrayList<Pasteleria> libreta = new ArrayList<>();

	public ArrayList<Pasteleria> getLibreta(){
		return libreta;
	}
	public void setLibreta(ArrayList<Pasteleria> libreta){

		this.libreta = libreta;
	}
	public void addPateleria(Pasteleria libreta){
		libreta.add(libreta);
	}
	public void eliminarPasteleria(Pasteleria libreta){
		libreta.remove(libreta);
	}
		
	public String toString(){
		StringBuilder mensaje = new StringBuilder();
		if(libreta.size() == 0){
			mensaje.append("La libreta está vacía");
		} else {
			for(Pasteleria libreta: libreta){
				mensaje.append(libreta).append("\n");
			}
		}
		return mensaje.toString();

	}

	public String toCSV(){
			StringBuilder mensaje = new StringBuilder();
			mensaje.append("id,reposteria,cliente,precio,\n");
			for(Pasteleria libreta: libreta){
				mensaje.append(libreta.toCSV()).append("\n");
			}
			return mensaje.toString();

		}


		
	}



