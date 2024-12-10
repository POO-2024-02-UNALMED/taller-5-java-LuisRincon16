package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
    private static ArrayList<Reptil> listado= new ArrayList<>();
    public int iguanas;
    public int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nom, int edad, String hab, String gen, String colorEscamas, int largoCola){
        super(nom, edad, hab, gen);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        Reptil.listado.add(this);
    }
    public Reptil(){
        this(null,0,null,null,null,0);
    }

    public static ArrayList<Reptil> getListado(){
        return listado;
    }
    public static void setListado(ArrayList<Reptil> list){
        Reptil.listado = list;
    }

    @Override
    public String movimiento(){
        return "reptar";
    }
}