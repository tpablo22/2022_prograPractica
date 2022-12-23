package dominio;

public class Contacto{
	private String nombre;
	private String numeroDeTelefono;

	public Contacto(){
		nombre = "";
		numeroDeTelefono = "";
	}

	public Contacto(String nombre, String numeroDeTelefono){
		this.nombre = nombre;
		this.numeroDeTelefono = numeroDeTelefono;
	}

	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNumeroDeTelefono(){
		return numeroDeTelefono;
	}
	public void setNumeroDeTelefono(String numeroDeTelefono){
		this.numeroDeTelefono = numeroDeTelefono;
	}
	public String toCSV(){
		return nombre + "," + numeroDeTelefono;
	}
	public String toString(){
		return nombre + " " + numeroDeTelefono;
	}

}
