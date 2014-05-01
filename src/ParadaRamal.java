
public class ParadaRamal {

	private int idParadaRamal;
	private int idParada;
	private int idRamal;
	
	public ParadaRamal() {
		// TODO Auto-generated constructor stub
	}

	public ParadaRamal(int idParadaRamal, int idParada, int idRamal) {
		super();
		this.idParadaRamal = idParadaRamal;
		this.idParada = idParada;
		this.idRamal = idRamal;
	}

	public int getIdParadaRamal() {
		return idParadaRamal;
	}

	public void setIdParadaRamal(int idParadaRamal) {
		this.idParadaRamal = idParadaRamal;
	}

	public int getIdParada() {
		return idParada;
	}

	public void setIdParada(int idParada) {
		this.idParada = idParada;
	}

	public int getIdRamal() {
		return idRamal;
	}

	public void setIdRamal(int idRamal) {
		this.idRamal = idRamal;
	}

	@Override
	public String toString() {
		return "ParadaRamal [idParadaRamal=" + idParadaRamal + ", idParada="
				+ idParada + ", idRamal=" + idRamal + "]";
	}

}
