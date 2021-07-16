package M3;

public abstract class Persona {
	protected String nombre;
	protected String apellidos;
	protected String fechaNacimiento;
	
	public Persona(String nombre, String apellidos, String fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}
}