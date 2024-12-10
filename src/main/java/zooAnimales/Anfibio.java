package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
    private ArrayList<Anfibio> listado= new ArrayList<>();
    public int ranas;
    public int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nom, int edad, String hab, String gen, String cPiel, boolean ven){
        super(nom, edad, hab, gen);
        this.colorPiel = cPiel;
        this.venenoso = ven;
    }
    public Anfibio(){
        this(null, 0, null, null, null, false);
    }
}