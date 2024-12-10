package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado= new ArrayList<>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        Mamifero.listado.add(this);
    }
    public Mamifero(){
        this(null,0,null,null,false,0);
    }

    public static ArrayList<Mamifero> getListado(){
        return listado;
    }
    public static void setListado(ArrayList<Mamifero> list){
        Mamifero.listado = list;
    }

    public static Mamifero crearCaballo(String nom, int edad, String gen) {
		Mamifero Mamifero = new Mamifero(nom,edad,"pradera",gen,true,4);
		caballos++;
		return Mamifero;
	}
	
	public static Mamifero crearLeon(String nom, int edad, String gen) {
		Mamifero Mamifero = new Mamifero(nom,edad,"selva",gen,true,4);
		leones++; 
		return Mamifero;
	}

    public int cantidadMamiferos(){
        return Mamifero.listado.size();
    }

    public void setPelaje(boolean pelo){
        this.pelaje = pelo;
    }
    public boolean isPelaje(){
        return this.pelaje;
    }

    public void setPatas(int patas){
        this.patas = patas;
    }
    public int getPatas(){
        return this.patas;
    }
}