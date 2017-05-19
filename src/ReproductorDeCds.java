/**
 * Created by cristian on 18/05/17.
 */
public class ReproductorDeCds {

    private Cd unCdParaReproducir;

    public Cd getUnCdParaReproducir() {
        return unCdParaReproducir;
    }

    public void setUnCdParaReproducir(Cd unCdParaReproducir) {
        this.unCdParaReproducir = unCdParaReproducir;
    }


    public void reproducirCd(int numeroDeTema){

        Tema unTema=this.unCdParaReproducir.getTema(numeroDeTema);
        unTema.escucharTema();
    }
}
