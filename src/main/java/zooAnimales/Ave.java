package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado= new ArrayList<>();
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

    public static ArrayList<Ave> getListado(){
        return listado;
    }
    public static void setListado(ArrayList<Ave> list){
        Ave.listado = list;
    }

    @Override
    public String movimiento(){
        return "volar";
    }
}