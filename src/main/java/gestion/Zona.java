package gestion;
import zooAnimales.Animal;
import java.util.*;

class Zona{
    
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales;
    
    //constructor
    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
    }
    
    public Zona() {
    }

    //metodos
    public void agregarAnimales(Animal A){
        this.animales.add(A);
    }
    public int cantidadAnimales(){
        int cantidad = animales.size();
        return cantidad;
    }

    //Get and set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Zoologico getZoo() {
        return zoo;
    }
    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }
    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }
}