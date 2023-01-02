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
		mensaje.append("id,reposteria, cliente, sabor,precio\n");
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
			System.out.println("No se puede editar el pedido.");
		}
	}






}



