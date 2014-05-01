import java.sql.Date;


public class HorariosDePaso {

	private int idHorariosDePaso;
	private int idParadaRamal;
	private Date horario;
	
	public HorariosDePaso() {
		// TODO Auto-generated constructor stub
	}

	public HorariosDePaso(int idHorariosDePaso, int idParadaRamal, Date horario) {
		super();
		this.idHorariosDePaso = idHorariosDePaso;
		this.idParadaRamal = idParadaRamal;
		this.horario = horario;
	}

	public int getIdHorariosDePaso() {
		return idHorariosDePaso;
	}

	public void setIdHorariosDePaso(int idHorariosDePaso) {
		this.idHorariosDePaso = idHorariosDePaso;
	}

	public int getIdParadaRamal() {
		return idParadaRamal;
	}

	public void setIdParadaRamal(int idParadaRamal) {
		this.idParadaRamal = idParadaRamal;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "HorariosDePaso [idHorariosDePaso=" + idHorariosDePaso
				+ ", idParadaRamal=" + idParadaRamal + ", horario=" + horario
				+ "]";
	}

}
