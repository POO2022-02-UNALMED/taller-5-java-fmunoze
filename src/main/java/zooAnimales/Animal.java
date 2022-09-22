package zooAnimales;
import gestion.*;
import java.util.*;

public class Animal{
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero; 
    private static ArrayList<Zona> zona = new ArrayList<>();

    //constructor
    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }
    
    public Animal() {
        totalAnimales++;
    }

    //metodos
    public String movimiento(){
        return "desplazarse";
    }
    
	public static String totalPorTipo() {
		String str = "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" + 
				"Aves: "+Ave.cantidadAves()+ "\n" + 
				"Reptiles: "+ Reptil.cantidadReptiles() + "\n" + 
				"Peces: "+ Pez.cantidadPeces() +"\n" + 
				"Anfibios: "+ Anfibio.cantidadAnfibios();
		return str;
		
	}
	

	@Override
	public String toString() {
		if (zona.size() == 0) {
			String str = "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;
			return str;
		} else {
			String str = "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + "y mi genero es " + genero + 
					", la zona en la que me ubico es " + zona.get(0) + ", en el " + zona.get(0).getZoo();
			return str;
		}
		
	}

    //get and set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public static int getTotalAnimales() {
        return totalAnimales;
    }
    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }
    public ArrayList<Zona> getZona() {
        return zona;
    }
    public void setZona(Zona zona) {
        Animal.zona.add(zona);
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}