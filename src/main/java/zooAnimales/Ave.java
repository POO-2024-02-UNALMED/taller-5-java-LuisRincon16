package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
    private ArrayList<Ave> listado= new ArrayList<>();
    public int halcones;
    public int aguilas;
    private String colorPlumas;

    public Ave(String nom, int edad, String hab, String gen, String colorPlumas){
        super(nom, edad, hab, gen);
        this.colorPlumas = colorPlumas;
    }
    public Ave(){
        this(null,0,null,null,null);
    }

}