package dominio;

public class Pasteleria{

	private int id;
	private String reposteria;
	private String cliente;
	private int precio;

	public Pasteleria(int parseInt, String s, String s1, int parseInt1) {
	}

	public Pasteleria(int parseInt) {
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


}

