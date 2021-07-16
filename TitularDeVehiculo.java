package M3;

public class TitularDeVehiculo extends Persona {
	protected Licencia licencia;
	protected boolean seguro;
	protected boolean garajePropio;
	
	public TitularDeVehiculo(String nombre, String apellidos, String fechaNacimiento, boolean seguro, boolean garajePropio) {
		super(nombre, apellidos, fechaNacimiento);
		this.seguro = seguro;
		this.garajePropio = garajePropio;
	}

	public Licencia getLicencia() {
		return licencia;
	}

	public void setLicencia(Licencia licencia) {
		this.licencia = licencia;
	}
}