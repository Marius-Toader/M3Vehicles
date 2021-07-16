package M3;

import javax.swing.JOptionPane;

public class VehiclesApp {

	public static void main(String[] args) {
		String matricula = JOptionPane.showInputDialog("Matrícula:");
		String marca = JOptionPane.showInputDialog("Marca:");
		String color = JOptionPane.showInputDialog("Color:");
		
		Coche coche1 = new Coche(matricula, marca, color);
		
		String marcaTraseras = JOptionPane.showInputDialog("Marca de las ruedas traseras:");
		double diametroTraseras = Double.parseDouble(JOptionPane.showInputDialog("Diámetro de las ruedas traseras:"));
		
		coche1.setMarcaRuedasTraseras(marcaTraseras);
		coche1.setDiametroRuedasTraseras(diametroTraseras);
		
		String marcaDelanteras = JOptionPane.showInputDialog("Marca de las ruedas delanteras:");
		double diametroDelanteras = Double.parseDouble(JOptionPane.showInputDialog("Diámetro de las ruedas delanteras:"));
		
		coche1.setMarcaRuedasDelanteras(marcaDelanteras);
		coche1.setDiametroRuedasDelanteras(diametroDelanteras);
	}
}