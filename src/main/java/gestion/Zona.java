package gestion;
import zooAnimales.*;
import java.util.ArrayList;

public class Zona{
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales= new ArrayList<>();

    public Zona(String nom, Zoologico zoo){
        this.nombre = nom;
        this.zoo = zoo;
    }
    public Zona(){
        this(null, null);
    }

    public void agregarAnimales(Animal animal) {
    	animales.add(animal);
    	
    }
    public int cantidadAnimales() {
    	int cAnimales = animales.size();
    	return cAnimales;	
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setZoo(Zoologico zoo){
        this.zoo = zoo;
    }
    public Zoologico getZoo(){
        return zoo;
    }

    public void setAnimales(ArrayList<Animal> animales){
        this.animales = animales;
    }
    public ArrayList<Animal> getAnimales(){
        return this.animales;
    }
}