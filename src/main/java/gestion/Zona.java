package gestion;
import zooAnimales.*;
import java.util.*;

public class Zona{
    
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<Animal>();
    
    //constructor
    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
    }
    
    public Zona() {
    }

    //metodos
    public void agregarAnimales(Animal A){
        if (A!=null){
            this.animales.add(A);
        }
    }
    public int cantidadAnimales(){
        return  animales.size();
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