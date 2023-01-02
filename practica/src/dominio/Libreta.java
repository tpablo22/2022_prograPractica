

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

	public void annadirPateleria(Pasteleria pasteleria){
		pastelerias.add(pasteleria);
	}


	public void eliminarPasteleria(Pasteleria pasteleria){
		pastelerias.remove(pasteleria);
	}
	public String toString(){
		String mensaje = "";
		for(int i = 0; i < pastelerias.size(); i++){
			mensaje += pastelerias.get(i) + "\n";
		}

		return mensaje;
	}
	public String toCSV(){
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("nombre,talla,color,precio\n");
		for(Pasteleria pasteleria: pastelerias){
			mensaje.append(pasteleria.toCSV() + "\n");
		}
		return mensaje.toString();


	}

	public void editarPasteleria(Pasteleria pateleria, Pasteleria sustituto){
		if(pastelerias.remove(pateleria)){
			pastelerias.remove(pateleria);
			pastelerias.add(sustituto);
		}else{
			System.out.println("No se puede editar porque no tenemos a esa zapatilla.");
		}
	}






}



