
public class Ramal {

	private int idRamal;
	private String nombre;
	private String origen;
	private String destino;
		
	public Ramal() {
		// TODO Auto-generated constructor stub
	}

	public Ramal(int idRamal, String nombre, String origen, String destino) {
		super();
		this.idRamal = idRamal;
		this.nombre = nombre;
		this.origen = origen;
		this.destino = destino;
	}

	public int getIdRamal() {
		return idRamal;
	}

	public void setIdRamal(int idRamal) {
		this.idRamal = idRamal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "Ramal [idRamal=" + idRamal + ", nombre=" + nombre + ", origen="
				+ origen + ", destino=" + destino + "]";
	}

}
