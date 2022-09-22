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
		return "Mamiferos: " + Mamifero.getListado().size() + "\n" + 
				"Aves: " + Ave.getListado().size() + "\n" + 
				"Reptiles: "+ Reptil.getListado().size() + "\n" + 
				"Peces: " + Pez.getListado().size() + "\n" + 
				"Anfibios: " + Anfibio.getListado().size();
	}
	

	public String toString() {
		if (zona.size() != 0) {
			return "Mi nombre es " +  this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + " y mi genero es " + this.getGenero() + ", la zona en la que me ubico es " + zona.get(0).getNombre() + ", en el " + zona.get(0).getZoo().getNombre();
		}else {
			return "Mi nombre es " +  this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + " y mi genero es " + this.getGenero();
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