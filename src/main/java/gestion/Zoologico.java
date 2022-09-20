package gestion;
import java.util.*;

class Zoologico{
    
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;

    //constructor
    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    
    public Zoologico() {
    }

    //metodos
    public void agregarZonas(Zona Z){
        this.zonas.add(Z);
    }
    public int cantidadTotalAnimales(){
        int cantidadAnimales = 0;
        for (Zona zonas : zonas){
            cantidadAnimales += zonas.cantidadAnimales();
        }
        return cantidadAnimales;
    }

    //Get and set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public ArrayList<Zona> getZona() {
        return zonas;
    }
    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }
}