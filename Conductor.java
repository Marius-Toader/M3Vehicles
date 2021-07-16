package M3;

public class Conductor extends Persona {
	protected Licencia licencia;
	
	public Conductor(String nombre, String apellidos, String fechaNacimiento) {
		super(nombre, apellidos, fechaNacimiento);
	}

	public Licencia getLicencia() {
		return licencia;
	}

	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}
}