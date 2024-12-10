package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
    private static ArrayList<Reptil> listado= new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nom, int edad, String hab, String gen, String colorEscamas, int largoCola){
        super(nom, edad, hab, gen);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        Reptil.listado.add(this);
    }
    public Reptil(){
        this(null,0,null,null,null,0);
    }

    public static ArrayList<Reptil> getListado(){
        return listado;
    }
    public static void setListado(ArrayList<Reptil> list){
        Reptil.listado = list;
    }

    @Override
    public String movimiento(){
        return "reptar";
    }

    public static Reptil crearIguana(String nom, int edad, String gen) {
		Reptil iguanita = new Reptil(nom, edad, "humedal", gen, "verde", 3);
		iguanas++;
		return iguanita;
	}
	
	public static Reptil crearSerpiente(String nom, int edad, String gen) {
		Reptil snake = new Reptil(nom, edad, "jungla", gen, "blanco", 1);
		serpientes++;
		return snake;
	}

    public int cantidadReptiles(){
        return Reptil.listado.size();
    }

    public void setColorEscamas(String cEscamas){
        this.colorEscamas = cEscamas;
    }
    public String getColorEscamas(){
        return this.colorEscamas;
    }

    public void setLargoCola(int lCola){
        this.largoCola = lCola;
    }
    public int getLargoCola(){
        return this.largoCola;
    }
}