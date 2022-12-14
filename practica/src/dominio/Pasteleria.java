package dominio;
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
public class Pasteleria {

	private int id;
	private String reposteria;
	private String sabor;
	private String cliente;
	private int precio;


	public Pasteleria(int id, String reposteria, String sabor, String cliente, int precio) {
		this.id = id;
		this.reposteria = reposteria;
		this.sabor = sabor;
		this.cliente = cliente;
		this.precio = precio;
	}

	public Pasteleria(int id) {
		this.id = id;
	}

	public Pasteleria() {
		this.id = 0;
		this.reposteria = "";
		this.sabor = "";
		this.cliente = "";
		this.precio = 0;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCliente() {
		return cliente;
	}

	public void setReposteria(String reposteria) {
		this.reposteria = reposteria;
	}

	public String getReposteria() {
		return reposteria;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getSabor() {
		return sabor;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}

	public String toCSV() {
		return " " + id + " " + reposteria + " " + sabor + " " + cliente + " " + precio + "€";
	}


	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj instanceof Pasteleria) {
			Pasteleria x = (Pasteleria) obj;
			if (x.getId() == id) {
				return true;
			}
		}
		return false;
	}

	public String toString() {
		return " " + id + " " + reposteria + " " + sabor + " " + cliente + " " + precio;


	}
}