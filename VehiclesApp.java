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
	
	public static Moto crearMoto() {
		Moto moto;
		String matricula = JOptionPane.showInputDialog("Matrícula:");
		String marca = JOptionPane.showInputDialog("Marca:");
		String color = JOptionPane.showInputDialog("Color:");
		moto = new Moto(matricula, marca, color);
		
		return moto;
	}
	
	public static void ruedasTraseras(Coche coche) {
		String marcaTraseras = JOptionPane.showInputDialog("Marca de las ruedas traseras:");
		double diametroTraseras = Double.parseDouble(JOptionPane.showInputDialog("Diámetro de las ruedas traseras:"));
		
		coche.setMarcaRuedasTraseras(marcaTraseras);
		coche.setDiametroRuedasTraseras(diametroTraseras);
	}
	
	public static void ruedaTrasera(Moto moto) {
		String marcaTrasera = JOptionPane.showInputDialog("Marca de las rueda trasera:");
		double diametroTrasera = Double.parseDouble(JOptionPane.showInputDialog("Diámetro de las rueda trasera:"));
		
		moto.setMarcaRuedaTrasera(marcaTrasera);
		moto.setDiametroRuedaTrasera(diametroTrasera);
	}
	
	public static void ruedasTraseras(Camion camion) {
		String marcaTraseras = JOptionPane.showInputDialog("Marca de las ruedas traseras:");
		double diametroTraseras = Double.parseDouble(JOptionPane.showInputDialog("Diámetro de las ruedas traseras:"));
		
		camion.setMarcaRuedasTraseras(marcaTraseras);
		camion.setDiametroRuedasTraseras(diametroTraseras);
	}
	
	public static void ruedasDelanteras(Coche coche) {
		String marcaDelanteras = JOptionPane.showInputDialog("Marca de las ruedas delanteras:");
		double diametroDelanteras = Double.parseDouble(JOptionPane.showInputDialog("Diámetro de las ruedas delanteras:"));
		
		coche.setMarcaRuedasDelanteras(marcaDelanteras);
		coche.setDiametroRuedasDelanteras(diametroDelanteras);
	}
	
	public static void ruedaDelantera(Moto moto) {
		String marcaDelantera = JOptionPane.showInputDialog("Marca de la rueda delantera:");
		double diametroDelantera = Double.parseDouble(JOptionPane.showInputDialog("Diámetro de la rueda delantera:"));
		
		moto.setMarcaRuedaTrasera(marcaDelantera);
		moto.setDiametroRuedaTrasera(diametroDelantera);
	}
	
	public static void ruedasDelanteras(Camion camion) {
		String marcaDelanteras = JOptionPane.showInputDialog("Marca de las ruedas delanteras:");
		double diametroDelanteras = Double.parseDouble(JOptionPane.showInputDialog("Diámetro de las ruedas delanteras:"));
		
		camion.setMarcaRuedasDelanteras(marcaDelanteras);
		camion.setDiametroRuedasDelanteras(diametroDelanteras);
	}
	
	public static Camion crearCamion() {
		Camion camion;
		String matricula = JOptionPane.showInputDialog("Matrícula:");
		String marca = JOptionPane.showInputDialog("Marca:");
		String color = JOptionPane.showInputDialog("Color:");
		camion = new Camion(matricula, marca, color);
		
		return camion;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opción: \n"
															+ "1. Coche \n"
															+ "2. Moto \n"
															+ "3. Camión"));
		switch (n) {
			case 1:
			Coche coche1 = crearCoche();
			ruedasTraseras(coche1);
			ruedasDelanteras(coche1);
				break;
			case 2:
			Moto moto1 = crearMoto();
			ruedaTrasera(moto1);
			ruedaDelantera(moto1);
				break;
			case 3:
			Camion camion1 = crearCamion();
			ruedasTraseras(camion1);
			ruedasDelanteras(camion1);
			default: JOptionPane.showMessageDialog(null, "Opción no válida");
		}
	}
}