package dominio;

public class Pasteleria{

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
	public Pasteleria(){
		this.id = 0;
		this.reposteria = " ";
		this.sabor = " ";
		this.cliente = " ";
		this.precio = 0;
	}


	public Pasteleria(int id){
		this.id = id;
	}


	public int getId(){

		return id;
	}
	public void setId(int id){

		this.id = id;
	}

	public String getReposteria(){

		return reposteria;
	}
	public void setReposteria(String reposteria){

		this.reposteria = reposteria;
	}
	public String getSabor(){
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getCliente(){

		return cliente;
	}
	public void setCliente(String cliente){

		this.cliente = cliente;
	}

	public int getPrecio(){

		return precio;
	}
	public void setPrecio(int precio){

		this.precio = precio;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == this){
			return true;
		}
		if (obj instanceof Pasteleria) {
			Pasteleria p = (Pasteleria) obj;
			if (p.getId() == id) {
				return true;
			}
		}
		return false;
	}

	public String toCSV(){
		return " "+id + " " + reposteria + " "+sabor +" "+ cliente + " " + precio + "€";
	}


	public String toString(){

		return id + reposteria + sabor + cliente + precio;
	}


}

