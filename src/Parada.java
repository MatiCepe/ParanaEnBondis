
public class Parada {
	
	private int idParada;
	private String nombre;
	private String direccionGoogle;
	private Double latitud;
	private Double longitud;

	public Parada() {
		// TODO Auto-generated constructor stub
	}

	public Parada(int idParada, String nombre, String direccionGoogle,
			Double latitud, Double longitud) {
		super();
		this.idParada = idParada;
		this.nombre = nombre;
		this.direccionGoogle = direccionGoogle;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public int getIdParada() {
		return idParada;
	}

	public void setIdParada(int idParada) {
		this.idParada = idParada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccionGoogle() {
		return direccionGoogle;
	}

	public void setDireccionGoogle(String direccionGoogle) {
		this.direccionGoogle = direccionGoogle;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Parada [idParada=" + idParada + ", nombre=" + nombre
				+ ", direccionGoogle=" + direccionGoogle + ", latitud="
				+ latitud + ", longitud=" + longitud + "]";
	}

}
