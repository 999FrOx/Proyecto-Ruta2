public class Pasajero {
private int pasAb;
private int pasBaj;

    public Pasajero() {
        this.pasAb = pasAb;
        this.pasBaj = pasBaj;
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

    @Override
    public String toString() {
        return "Pasajero"
                + "\n pasAb= " + pasAb
                + "\n pasBaj= " + pasBaj;
    }
}
