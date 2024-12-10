package zooAnimales;
import gestion.*;
import java.util.ArrayList;

public class Animal{
    private static int totalAnimales = 0;
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

}