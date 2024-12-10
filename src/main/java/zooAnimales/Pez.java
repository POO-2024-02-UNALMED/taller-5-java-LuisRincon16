package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal{
    private static ArrayList<Pez> listado= new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nom, int edad, String hab, String gen, String cEscamas, int cAletas){
        super(nom, edad, hab, gen);
        this.colorEscamas = cEscamas;
        this.cantidadAletas = cAletas;
        Pez.listado.add(this);
    }
    public Pez(){
        this(null, 0, null, null, null, 0);
    }

    public static ArrayList<Pez> getListado(){
        return listado;
    }
    public static void setListado(ArrayList<Pez> list){
        Pez.listado = list;
    }

    @Override
    public String movimiento(){
        return "nadar";
    }

    public static Pez crearSalmon(String nom, int edad, String gen) {
		Pez salmonsin = new Pez(nom, edad, "oceano", gen, "rojo", 6);
		salmones++;
		return salmonsin;
	}
	
    public static Pez crearBacalao(String nom, int edad, String gen) {
		Pez baca = new Pez(nom, edad, "oceano", gen, "gris", 6);
		bacalaos++;
		return baca;
	}

    public int cantidadPeces(){
        return Pez.listado.size();
    }

    public void setColorEscamas(String cEscamas){
        this.colorEscamas = cEscamas;
    }
    public String getColorEscamas(){
        return this.colorEscamas;
    }

    public void setCantidadAletas(int cAletas){
        this.cantidadAletas = cAletas;
    }
    public int getCantidadAletas(){
        return this.cantidadAletas;
    }
}