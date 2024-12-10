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
}