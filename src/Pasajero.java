public class Pasajero {
private int pasAb;
private int pasBaj;
private int capacidadUnidad=20;
private int pasajerosAbordo;
private double ganancia;
private Unidad unidad;
// constructor de pasajero
    public Pasajero(int pasAb, int pasBaj, int capacidadUnidad, int pasajerosAbordo, double ganancia) {
        this.pasAb = pasAb;
        this.pasBaj = pasBaj;
        this.capacidadUnidad = capacidadUnidad;
        this.pasajerosAbordo = pasajerosAbordo;
        this.ganancia= ganancia;
        this.unidad = unidad;

    }


    public Pasajero() {
        this (0,0,20,0,0);
    }
    //Getters y Setters
    public int getPasAb() {
        return pasAb;
    }

    public void setPasAb(int pasAb) {
        this.pasAb = pasAb;
    }

    public int getPasBaj() {
        return pasBaj;
    }

    public void setPasBaj(int pasBaj) {
        this.pasBaj = pasBaj;
    }

    public int getCapacidadUnidad() {
        return capacidadUnidad;
    }

    public void setCapacidadUnidad(int capacidadUnidad) {
        this.capacidadUnidad = capacidadUnidad;
    }

    public int getPasajerosAbordo() {
        return pasajerosAbordo;
    }

    public void setPasajerosAbordo(int pasajerosAbordo) {
        this.pasajerosAbordo = pasajerosAbordo;
    }
    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    public Unidad getUnidad() {
        return unidad;
    }
    //Metodo para actuaizar los pasageros que abordan
    public void abordarPasajeros(int pasAb) {
        if (pasajerosAbordo + pasAb <= capacidadUnidad) {
            this.pasAb = pasAb;
            pasajerosAbordo += pasAb;
            calcularCobro();
        }
    }
    //Metodo para actualizar los pasajeros que bajan
    public void bajarPasajeros(int pasBaj) {
        if (pasajerosAbordo - pasBaj >= 0) {
            this.pasBaj = pasBaj;
            pasajerosAbordo -= pasBaj;
        }
    }
//calcula el cobro
    public double calcularCobro() {
        double cobro = pasAb * 8;
         ganancia += cobro;
        if (unidad != null) {
            unidad.agregarGanancias(cobro);
        }
        return cobro;
    }
}
