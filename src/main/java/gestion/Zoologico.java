package gestion;
import zooAnimales.*;
import java.util.ArrayList;

public class Zoologico{
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas= new ArrayList<>();

    public Zoologico(String nom, String ubi){
        this.nombre = nom;
        this.ubicacion = ubi;
    }
    public Zoologico(){
        this(null, null);
    }

    

}