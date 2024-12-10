package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado= new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nom, int edad, String hab, String gen, String colorPlumas){
        super(nom, edad, hab, gen);
        this.colorPlumas = colorPlumas;
        Ave.listado.add(this);
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

    public static Ave crearHalcon(String nom, int edad, String gen) {
		Ave avee = new Ave(nom, edad, "montañas", gen, "cafe glorioso");
		halcones++;
		return avee;
	}
	
	public static Ave crearAguila(String nom, int edad, String gen) {
		Ave avee = new Ave(nom, edad, "montañas", gen, "blanco y amarillo");
		aguilas++; 
		return avee;
	}

    public int cantidadAves(){
        return Ave.listado.size();
    }
}