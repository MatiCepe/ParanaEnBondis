
public class Linea {

	private int idLinea;
	private String nombre;
	
	public Linea() {
		// TODO Auto-generated constructor stub
	}

	public Linea(int idLinea, String nombre) {
		super();
		this.idLinea = idLinea;
		this.nombre = nombre;
	}

	public int getIdLinea() {
		return idLinea;
	}

	public void setIdLinea(int idLinea) {
		this.idLinea = idLinea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Linea [idLinea=" + idLinea + ", nombre=" + nombre + "]";
	}

}
