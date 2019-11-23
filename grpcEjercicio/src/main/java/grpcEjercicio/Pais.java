package grpcEjercicio;

import java.util.List;

public class Pais {
	String name;
	String capital;
	List<String> ciudades;
	int habitantes;


	public Pais(String name, String capital, List<String> ciudades, int habitantes) {
		super();
		this.name = name;
		this.capital = capital;
		this.ciudades = ciudades;
		this.habitantes = habitantes;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public List<String> getCiudades() {
		return ciudades;
	}
	public void setCiudades(List<String> ciudades) {
		this.ciudades = ciudades;
	}
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	
	
	 
}
