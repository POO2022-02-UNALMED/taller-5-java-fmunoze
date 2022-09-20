package zooAnimales;
import gestion.Zona;
import java.util.*;

class Animal{
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero; 
    private ArrayList<Zona> zona;

    //constructor
    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }
    
    public Animal() {
    }

    //metodos
    public String movimiento(){
        return "desplazarse";
    }
    public static String totalPorTipo(){
        int Mamiferos = Mamifero.cantidadMamiferos();
        int Aves = Ave.cantidadAves();
        int Reptiles = Reptil.cantidadReptiles();
        int Peces = Pez.cantidadPeces();
        int Anfibios = Anfibio.cantidadAnfibios();
        String Text = "Mamiferos:"+Mamiferos+"\nAves: " + Aves+"\nReptiles: " + Reptiles +"\nPeces: " + Peces+"\nAnfibios: " + Anfibios;
        return Text;
    }
    public String toString() {
        if (zona == null) {
            String text = "Mi nombres es "+this.nombre+", tengo una edad de "+this.edad+", habito en"+this.habitat+" y mi genero es "+this.genero;
            return text;    
        }
        String text = "Mi nombres es "+this.nombre+", tengo una edad de "+this.edad+", habito en"+this.habitat+" y mi genero es "+this.genero+", la zona en la que me ubico es "+this.zona+"en el ";   
        return text;
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
    public void setZona(ArrayList<Zona> zona) {
        this.zona = zona;
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