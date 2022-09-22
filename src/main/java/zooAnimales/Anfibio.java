package zooAnimales;
import java.util.*;

public class Anfibio extends Animal{

    private static ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    //constructor
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.setColorPiel(colorPiel);
		this.setVenenoso(venenoso);
		super.setTotalAnimales(super.getTotalAnimales() + 1);
		listado.add(this);
	}

    public Anfibio() {
    }

    //metodos
    @Override
    public String movimiento(){
        return "saltar";
    }
    public static Anfibio crearRana(String nombre, int edad, String genero){
        ranas++;
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }
    public static Anfibio crearSalamandra(String nombre,int edad ,String genero){
        salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }
    public static int cantidadAnfibios(){
        return Anfibio.getListado().size();
    }

    //Get and set
    public String getColorPiel() {
        return colorPiel;
    }
    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }
    public boolean isVenenoso() {
        return venenoso;
    }
    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
    public static ArrayList<Anfibio> getListado() {
        return listado;
    }
    public static void setListado(ArrayList<Anfibio> listado) {
        Anfibio.listado = listado;
    }

}