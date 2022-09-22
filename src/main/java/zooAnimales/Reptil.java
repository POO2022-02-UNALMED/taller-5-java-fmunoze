package zooAnimales;
import java.util.*;

public class Reptil extends Animal{

    private static ArrayList<Reptil> listado;
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    //constructor
    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }

    public Reptil() {
    }

    //metodos
    @Override
    public String movimiento(){
        return "reptar";
    }
    public static Reptil crearIguana(String nombre,int edad ,String genero){
        iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
    }
    public static Reptil crearSerpiente( String nombre,int edad ,String genero){
        serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1); 
    }
    public static int cantidadReptiles(){
        return Reptil.getListado().size();
    }

    //Get and set
    public String getColorEscamas() {
        return colorEscamas;
    }
    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }
    public int getLargoCola() {
        return largoCola;
    }
    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
    public static ArrayList<Reptil> getListado() {
        return listado;
    }
    public static void setListado(ArrayList<Reptil> listado) {
        Reptil.listado = listado;
    }
}