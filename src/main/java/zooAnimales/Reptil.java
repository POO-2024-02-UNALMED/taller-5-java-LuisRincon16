package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
    private ArrayList<Reptil> listado= new ArrayList<>();
    public int iguanas;
    public int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nom, int edad, String hab, String gen, String colorEscamas, int largoCola){
        super(nom, edad, hab, gen);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }
    public Reptil(){
        this(null,0,null,null,null,0);
    }
}