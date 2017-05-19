import java.util.ArrayList;

/**
 * Created by cristian on 18/05/17.
 */
public class Cd {

    private String nombre;
    private ArrayList<Tema> listaDeTemas;

    public Cd(String nombre) {
        this.nombre = nombre;
        this.listaDeTemas= new ArrayList<>();
    }

    public String getNombre(int numeroDeCd) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int canTemas (){
        return 0;
    }
    public void agregarTema(Tema tema){
        this.listaDeTemas.add(tema);
    }

    public Tema getTema(int numeroDetema){
        return this.listaDeTemas.get(numeroDetema);
    }
}
