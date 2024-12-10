package gestion;
import zooAnimales.*;
import java.util.ArrayList;

public class Zoologico{
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas= new ArrayList<>();
    private int totalAnimales;      //agregado por mí

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
    
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setUbicacion(String ubi){
        this.ubicacion = ubi;
    }
    public String getUbicacion(){
        return this.ubicacion;
    }
    public void setZonas(ArrayList<Zona> zona){
        this.zonas = zona;
    }
    public ArrayList<Zona> getZonas(){
        return zonas;
    }
}