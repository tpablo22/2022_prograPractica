package dominio;

import java.util.ArrayList;

public class Libreta{

	private ArrayList<Pasteleria> pastelerias = new ArrayList<>();

	public ArrayList<Pasteleria> getPasteleria(){
		return pastelerias;
	}
	public void setPasteleria(ArrayList<Pasteleria> pastelerias){

		this.pastelerias = pastelerias;
	}
	public void addPasteleria(Pasteleria pasteleria){
		pastelerias.add(pasteleria);
	}
	public void eliminarPasteleria(Pasteleria pasteleria){
		pastelerias.remove(pasteleria);
	}
	public void editarPasteleria(Pasteleria libreta, Pasteleria libreta1){
		if(pastelerias.remove(libreta)) {
			pastelerias.remove(libreta);
			pastelerias.add(libreta1);
		}else{
			System.out.println("No se puede editar la libreta");

		}
	}
		
	public String toString(){
		String mensaje = "";
		for (int i = 0; i < pastelerias.size();i ++){
			mensaje += pastelerias.get(i)+"\n";
		}

		return mensaje;
	}
	public String toCSV(){
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("id,Pasteleria,Cliente,Precio\n");
		for(Pasteleria pasteleria: pastelerias){
			mensaje.append(pasteleria.toCSV()+"\n");
			
		}
		return mensaje.toString();

		
	}
}
