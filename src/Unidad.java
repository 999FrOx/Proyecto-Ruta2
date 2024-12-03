import java.util.ArrayList;
import java.util.List;

public class Unidad {
    private int noUnidad;
    private String matricula;
    private double ganancia;
    private List<String> listaUnidad; //Lista para las unidades
    private Pasajero pasajero;
    //Constructor
    public Unidad() {
        this.noUnidad = 0;
        this.matricula = "Sin matrícula";
        this.ganancia = 0;
        this.listaUnidad = new ArrayList<>();
        this.pasajero = new Pasajero();
        this.pasajero.setUnidad(this);
    }
    //Getters y Setters
    public double getGanancias() {
        return ganancia;
    }

    //Metódo para sumar las ganancias
    public void agregarGanancias(double monto) {
        this.ganancia += monto;
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

    public Pasajero getPasajero() {
        return pasajero;
    }

    //toString
    @Override
    public String toString() {
        return "|Unidad " + noUnidad + "|" + " |Matricula= " + matricula + "|";
    }
}
