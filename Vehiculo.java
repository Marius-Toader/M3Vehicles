package M3;

import java.util.ArrayList;

public abstract class Vehiculo {
	
	//Atributos comunes entre vehÝculos
	protected String matricula;
	protected String marca;
	protected String color;
	protected int numeroRuedas;
	protected TitularDeVehiculo titular;
	protected ArrayList<Persona> conductores;
}