import java.util.ArrayList;
import java.util.List;

public class Unidad {
    private int noUnidad;
    private String matricula;
    private List<String> listaUnidad;

    public Unidad() {
        this.noUnidad = noUnidad;
        this.matricula = matricula;
        this.listaUnidad = new ArrayList<>();
    }

    public int getNoUnidad() {
        return noUnidad;
    }

    public void setNoUnidad(int noUnidad) {
        this.noUnidad = noUnidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<String> getListaUnidad() {
        return listaUnidad;
    }

    @Override
    public String toString() {
        return "|Unidad " + noUnidad + "|" + " |Matricula= " + matricula + "|";
    }
}
