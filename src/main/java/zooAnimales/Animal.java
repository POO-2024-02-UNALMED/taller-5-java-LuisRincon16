package zooAnimales;
import java.util.ArrayList;

public class Animal{
    private int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private ArrayList<Zona> zona= new ArrayList<>();

    public Animal(String nom, int edad, String hab, String gen){
        this.nombre= nom;
        this.edad = edad;
        this.habitat = hab;
        this.genero = gen;
    }
    public Animal(){
        this(null,0,null,null);
    }

}