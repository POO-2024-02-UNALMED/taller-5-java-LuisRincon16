package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado= new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nom, int edad, String hab, String gen, String cPiel, boolean ven){
        super(nom, edad, hab, gen);
        this.colorPiel = cPiel;
        this.venenoso = ven;
        Anfibio.listado.add(this);
    }
    public Anfibio(){
        this(null, 0, null, null, null, false);
    }
    public static ArrayList<Anfibio> getListado(){
        return listado;
    }
    public static void setListado(ArrayList<Anfibio> list){
        Anfibio.listado = list;
    }

    @Override
    public String movimiento(){
        return "saltar";
    }

    public static Anfibio crearRana(String nom, int edad, String gen) {
		Anfibio ranita = new Anfibio(nom, edad, "selva", gen, "rojo", true);
		ranas++;
		return ranita;
	}
    public static Anfibio crearSalamandra(String nom, int edad, String gen) {
		Anfibio sal = new Anfibio(nom, edad, "selva", gen, "negro y amarillo", false);
		salamandras++;
		return sal;
	}
    public int cantidadAnfibios(){
        return Anfibio.listado.size();
    }

    public void setColorPiel(String cPiel){
        this.colorPiel = cPiel;
    }
    public String getColorPiel(){
        return this.colorPiel;
    }

    public void setVenenoso(boolean ven){
        this.venenoso = ven;
    }
    public boolean isVenenoso(){
        return this.venenoso;
    }
}