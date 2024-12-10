package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado= new ArrayList<>();
    public int caballos;
    public int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        Mamifero.listado.add(this);
    }
    public Mamifero(){
        this(null,0,null,null,false,0);
    }

    public static ArrayList<Mamifero> getListado(){
        return listado;
    }
    public static void setListado(ArrayList<Mamifero> list){
        Mamifero.listado = list;
    }


}