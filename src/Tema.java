/**
 * Created by cristian on 18/05/17.
 */
public class Tema {

    private String nombre;
    private Double tiempo;


    public Tema(String nombre, Double tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getTiempo() {
        return tiempo;
    }

    public void setTiempo(Double tiempo) {

        this.tiempo = tiempo;
    }

    public void escucharTema(){
        System.out.println("Estas escuchando : "+ this.getNombre()+" que dura :" +this.getTiempo() );
    }

    public void detenerTema (){

    }


}
