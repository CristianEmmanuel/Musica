import java.util.ArrayList;

/**
 * Created by cristian on 18/05/17.
 */
public class Banda {

    private String nombre;
    private ArrayList<Cd> listaDeBandas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Banda(String nombre) {
        this.nombre = nombre;
        this.listaDeBandas = new ArrayList<>();
    }


}
