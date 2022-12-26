package dominio;

public class Pasteleria{

	public Pasteleria(int id, String reposteria, String cliente, int precio){
		this.id = id;
		this.reposteria = reposteria;
		this.cliente = cliente;
		this.precio = precio;
	}

	private int id;
	private String reposteria;
	private String cliente;
	private int precio;

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
	public String toCSV(){
		return " "+ id + " " + reposteria + " " + cliente + " " + precio + "€";
	}
	public String toString(){

		return id + reposteria + cliente + precio;
	}

	public void add(Pasteleria libreta) {
	}

	public void remove(Pasteleria libreta) {
	}
}

