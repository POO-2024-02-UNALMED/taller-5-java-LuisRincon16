package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal{
    private static ArrayList<Pez> listado= new ArrayList<>();
    public int salmones;
    public int bacalaos;
    private String colorEscamas;
    public int cantidadAletas;

    public Pez(String nom, int edad, String hab, String gen, String cEscamas, int cAletas){
        super(nom, edad, hab, gen);
        this.colorEscamas = cEscamas;
        this.cantidadAletas = cAletas;
    }
    public Pez(){
        this(null, 0, null, null, null, 0);
    }

    public static ArrayList<Pez> getListado(){
        return listado;
    }
    public static void setListado(ArrayList<Pez> list){
        Pez.listado = list;
    }
}