package gestion;
import zooAnimales.*;
import java.util.ArrayList;

public class Zoologico{
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas= new ArrayList<>();
    private int totalAnimales;

    public Zoologico(String nom, String ubi){
        this.nombre = nom;
        this.ubicacion = ubi;
    }
    public Zoologico(){
        this(null, null);
    }

    public void agregarZonas(Zona zona){
        zonas.add(zona);
    }
    public int cantidadTotalAnimales(){
        totalAnimales = 0;
        for(Zona zonas : zonas){
            totalAnimales += zonas.cantidadAnimales();
        }
        return totalAnimales;
    }
    

}