package M3;

public class Coche {
	protected String matricula;
	protected String marca;
	protected String color;
	protected int numeroRuedas = 4;
	protected String marcaRuedasTraseras;
	protected String marcaRuedasDelanteras;
	protected double diametroRuedasTraseras;
	protected double diametroRuedasDelanteras;
	
	public Coche(String matricula, String marca, String color) {
		this.marca = marca;
		this.matricula = matricula;
		this.color = color;
		this.marcaRuedasTraseras = "";
		this.marcaRuedasDelanteras = "";
		this.diametroRuedasDelanteras = 0.0;
		this.diametroRuedasTraseras = 0.0;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public String getMarcaRuedasTraseras() {
		return marcaRuedasTraseras;
	}

	public void setMarcaRuedasTraseras(String marcaRuedasTraseras) {
		this.marcaRuedasTraseras = marcaRuedasTraseras;
	}

	public String getMarcaRuedasDelanteras() {
		return marcaRuedasDelanteras;
	}

	public void setMarcaRuedasDelanteras(String marcaRuedasDelanteras) {
		this.marcaRuedasDelanteras = marcaRuedasDelanteras;
	}

	public double getDiametroRuedasTraseras() {
		return diametroRuedasTraseras;
	}

	public void setDiametroRuedasTraseras(double diametroRuedasTraseras) {
		this.diametroRuedasTraseras = diametroRuedasTraseras;
	}

	public double getDiametroRuedasDelanteras() {
		return diametroRuedasDelanteras;
	}

	public void setDiametroRuedasDelanteras(double diametroRuedasDelanteras) {
		this.diametroRuedasDelanteras = diametroRuedasDelanteras;
	}
	
	
}