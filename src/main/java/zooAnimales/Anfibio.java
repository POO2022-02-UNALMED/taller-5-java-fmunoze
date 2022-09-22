package zooAnimales;
import java.util.*;

import gestion.Zona;

public class Anfibio extends Animal {
	private static List<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public Anfibio() {
		listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas++;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras++;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
	}
	
	public void setColorPiel(String cp) {
		colorPiel = cp;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public void setLargoCola(boolean ven) {
		venenoso = ven;
	}
	
	public boolean isVenenoso() {
		return venenoso;
	}

    public static ArrayList<Zona> getListado() {
        return null;
    }
	
}