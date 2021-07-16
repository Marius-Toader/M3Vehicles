package M3;

import javax.swing.JOptionPane;

public class VehiclesApp {
	public static Coche crearCoche() {
		Coche coche;
		String matricula = JOptionPane.showInputDialog("Matrícula:");
		String marca = JOptionPane.showInputDialog("Marca:");
		String color = JOptionPane.showInputDialog("Color:");
		coche = new Coche(matricula, marca, color);
		
		return coche;
	}
	
	public static void ruedasTraseras(Coche coche) {
		String marcaTraseras = JOptionPane.showInputDialog("Marca de las ruedas traseras:");
		double diametroTraseras = Double.parseDouble(JOptionPane.showInputDialog("Diámetro de las ruedas traseras:"));
		
		coche.setMarcaRuedasTraseras(marcaTraseras);
		coche.setDiametroRuedasTraseras(diametroTraseras);
	}
	
	public static void ruedasDelanteras(Coche coche) {
		String marcaDelanteras = JOptionPane.showInputDialog("Marca de las ruedas delanteras:");
		double diametroDelanteras = Double.parseDouble(JOptionPane.showInputDialog("Diámetro de las ruedas delanteras:"));
		
		coche.setMarcaRuedasDelanteras(marcaDelanteras);
		coche.setDiametroRuedasDelanteras(diametroDelanteras);
	}

	public static void main(String[] args) {
		Coche coche1 = crearCoche();
		
		ruedasTraseras(coche1);
		
		ruedasDelanteras(coche1);
	}
}