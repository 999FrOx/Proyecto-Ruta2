public class Pasajero {
private int pasAb;
private int pasBaj;
private int capacidadUnidad=20;
private int pasajerosAbordo;
private double ganancia;
private Unidad unidad;

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

    public void abordarPasajeros(int pasAb) {
        if (pasajerosAbordo + pasAb <= capacidadUnidad) {
            this.pasAb = pasAb;       // Actualizar el número de pasajeros que abordan
            pasajerosAbordo += pasAb; // Incrementar los pasajeros a bordo
            calcularCobro();          // Calcular y acumular la ganancia
            System.out.println(pasAb + " pasajeros han abordado.");
        } else {
            System.out.println("No hay suficiente espacio para que aborden todos los pasajeros.");
        }
    }

    public void bajarPasajeros(int pasBaj) {
        if (pasajerosAbordo - pasBaj >= 0) {
            this.pasBaj = pasBaj;      // Actualizar el número de pasajeros que bajan
            pasajerosAbordo -= pasBaj; // Reducir los pasajeros a bordo
            System.out.println(pasBaj + " pasajeros han bajado.");
        } else {
            System.out.println("No puedes bajar más pasajeros de los que hay!!!");
        }
    }

    public double calcularCobro() {
        double cobro = pasAb * 8; // Calcular cobro para los pasajeros que abordan
        //ganancia += cobro;       // Sumar al total de ganancias
        if (unidad != null) {    // Verificar si está asociada a una unidad
            unidad.agregarGanancias(cobro);
        }
        return cobro;
    }
}
