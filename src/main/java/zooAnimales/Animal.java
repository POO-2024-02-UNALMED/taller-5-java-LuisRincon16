package zooAnimales;
import gestion.*;
import java.util.ArrayList;

public class Animal{
    private static int totalAnimales = 0;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(String nom, int edad, String hab, String gen){
        this.nombre= nom;
        this.edad = edad;
        this.habitat = hab;
        this.genero = gen;
        totalAnimales++;
    }
    public Animal(){
        this(null,0,null,null);
    }

    public static String totalPorTipo(){	
		return "Mamiferos: " + Mamifero.getListado().size()+"\n"+ 
		"Aves: " + Ave.getListado().size() + "\n" + 
		"Reptiles: "+ Reptil.getListado().size() + "\n" + 
		"Peces: " + Pez.getListado().size() + "\n" + 
		"Anfibios: "+ Anfibio.getListado().size();		
	}

    public void setZona(Zona zona){
		this.zona = zona;
	}
	public Zona getZona(){
		return zona;
	}

    public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	
	public void setEdad(int edad){
		this.edad = edad;
	}
	public int getEdad(){
		return edad;
	}
	
	public void setHabitat(String habitat){
		this.habitat = habitat;
	}
	public String getHabitat(){
		return habitat;
	}
	
	public void setGenero(String genero){
		this.genero = genero;
	}
	public String getGenero(){
		return genero;
	}

    public String toString(){
		if (getZona()!=null){
			return "Mi nombre es " + getNombre() + ", tengo una edad de " + getEdad() + ", habito en "+ getHabitat() + " y mi genero es "+ getGenero() + ", la zona en la que me ubico es " + getZona().getNombre() + ", en el " + getZona().getZoo().getNombre();
		}
		else{
		    return "Mi nombre es " + getNombre() + ", tengo una edad de " + getEdad() + ", habito en " + getHabitat() + " y mi genero es " + getGenero();
		}
	}

    public String movimiento(){
        return "desplazarse";
    }
    public int getTotalAnimales(){
        return totalAnimales;
    }
}