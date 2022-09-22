package zooAnimales;
import java.util.*;

public class Ave extends Animal{

    private static ArrayList<Ave> listado = new ArrayList<Ave>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;


    //constructor
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public Ave() {
        listado.add(this);
    }

    //metodos
    @Override
    public String movimiento(){
        return "volar";
    }
    public static Ave crearHalcon(String nombre,int edad ,String genero){
        halcones++;
        return new Ave(nombre, edad, "montañas", genero, "cafe glorioso");
    }
    public static Ave crearAguila(String nombre,int edad ,String genero){
        aguilas++;
        return new Ave(nombre, edad, "montañas", genero, "blanco y amarillo");  
    }
    public static int cantidadAves(){
        return Ave.getListado().size();
    }

    //Get and set
    public String getColorPlumas() {
        return colorPlumas;
    }
    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
    public static ArrayList<Ave> getListado() {
        return listado;
    }
    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }
}