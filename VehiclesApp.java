package M3;

import javax.swing.JOptionPane;

public class VehiclesApp {
	public static void menu() {
		TitularDeVehiculo titular1 = crearTitular();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opción: \n"
															+ "1. Coche \n"
															+ "2. Moto \n"
															+ "3. Camión"));
		switch (n) {
			case 1:
			if (titular1.licencia.tipoLicencia.equalsIgnoreCase("Coche")) {
				Coche coche1 = crearCoche();
				ruedasTraseras(coche1);
				ruedasDelanteras(coche1);
				String conduce = JOptionPane.showInputDialog("El titular va a ser el conductor?");
				boolean bConduce = conduce.equalsIgnoreCase("si");
				if (!bConduce) {
					Conductor conductor1 = crearConductor();
					if (!conductor1.licencia.tipoLicencia.equalsIgnoreCase("Coche")) {
						JOptionPane.showMessageDialog(null, "El conductor no tiene la licencia para este vehículo");
					}
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "El titular no tiene la licencia para este vehículo");
			}
			
				break;
			case 2:
			if (titular1.licencia.tipoLicencia.equalsIgnoreCase("Moto")) {
				Moto moto1 = crearMoto();
				ruedaTrasera(moto1);
				ruedaDelantera(moto1);
				String conduce = JOptionPane.showInputDialog("El titular va a ser el conductor?");
				boolean bConduce = conduce.equalsIgnoreCase("si");
				if (!bConduce) {
					Conductor conductor1 = crearConductor();
					if (!conductor1.licencia.tipoLicencia.equalsIgnoreCase("Moto")) {
						JOptionPane.showMessageDialog(null, "El conductor no tiene la licencia para este vehículo");
					}
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "El titular no tiene la licencia para este vehículo");
			}
				break;
			case 3:
			if (titular1.licencia.tipoLicencia.equalsIgnoreCase("Camión")) {
				Camion camion1 = crearCamion();
				ruedasTraseras(camion1);
				ruedasDelanteras(camion1);
				String conduce = JOptionPane.showInputDialog("El titular va a ser el conductor?");
				boolean bConduce = conduce.equalsIgnoreCase("si");
				if (!bConduce) {
					Conductor conductor1 = crearConductor();
					if (!conductor1.licencia.tipoLicencia.equalsIgnoreCase("Camión")) {
						JOptionPane.showMessageDialog(null, "El conductor no tiene la licencia para este vehículo");
					}
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "El titular no tiene la licencia para este vehículo");
			}
				break;
			default: JOptionPane.showMessageDialog(null, "Opción no válida");
				break;
		}
	}
	
	public static TitularDeVehiculo crearTitular() {
		String nombre = JOptionPane.showInputDialog("Nombre:");
		String apellidos = JOptionPane.showInputDialog("Apellidos:");
		String fechaNacimiento = JOptionPane.showInputDialog("Fecha de nacimiento:");
		String seguro = JOptionPane.showInputDialog("Tiene seguro?");
		String garajePropio = JOptionPane.showInputDialog("Tiene garaje propio?");
		boolean bSeguro = seguro.equalsIgnoreCase("si");
		boolean bGaraje = garajePropio.equalsIgnoreCase("si");
		
		int id = Integer.parseInt(JOptionPane.showInputDialog("Número de licencia:"));
		String tipoLicencia = JOptionPane.showInputDialog("Tipo de licencia:");
		String nombreCompleto = nombre + " " + apellidos;
		String fechaCaducidad = JOptionPane.showInputDialog("Fecha de caducidad de la licencia:");
		
		TitularDeVehiculo titular = new TitularDeVehiculo(nombre, apellidos, fechaNacimiento, bSeguro, bGaraje);
		Licencia licencia = new Licencia(id, tipoLicencia, nombreCompleto, fechaCaducidad);
		titular.setLicencia(licencia);
		
		return titular;
	}
	
	public static Conductor crearConductor() {
		String nombre = JOptionPane.showInputDialog("Nombre:");
		String apellidos = JOptionPane.showInputDialog("Apellidos:");
		String fechaNacimiento = JOptionPane.showInputDialog("Fecha de nacimiento:");
		
		int id = Integer.parseInt(JOptionPane.showInputDialog("Número de licencia:"));
		String tipoLicencia = JOptionPane.showInputDialog("Tipo de licencia:");
		String nombreCompleto = nombre + " " + apellidos;
		String fechaCaducidad = JOptionPane.showInputDialog("Fecha de caducidad de la licencia:");
		
		Conductor conductor = new Conductor(nombre, apellidos, fechaNacimiento);
		Licencia licencia = new Licencia(id, tipoLicencia, nombreCompleto, fechaCaducidad);
		conductor.setLicencia(licencia);
		
		return conductor;
	}
	
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
		menu();
	}
}