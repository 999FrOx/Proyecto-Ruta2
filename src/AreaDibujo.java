import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AreaDibujo extends JPanel implements MouseListener {
    private Unidad unidad;
    public AreaDibujo(Unidad unidad){
        super();
        this.unidad = unidad;
        setBounds(70,100,400,400);
        setBackground(new Color(91, 111, 0));
        addMouseListener(this);
        setLayout(null);
    }
    public void paint(Graphics g){
        super.paint(g);
        // Parada Base Teziutlán
        g.setColor(Color.DARK_GRAY);
        g.fillRect(90, 20, 100, 40);
        g.setColor(Color.WHITE);
        g.drawString("1.Base Teziutlán", 95, 45);

        // Parada Guadalupano
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(90, 100, 100, 40);
        g.setColor(Color.BLACK);
        g.drawString("2.Guadalupano", 100, 125);

        // Parada Cinepolis
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(90, 180, 100, 40);
        g.setColor(Color.BLACK);
        g.drawString("3.Cinepolis", 105, 205);

        // Parada Aurrera
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(90, 260, 100, 40);
        g.setColor(Color.BLACK);
        g.drawString("4.Aurrera", 115, 285);

        // Parada La Misma Idea
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(90, 340, 100, 40);
        g.setColor(Color.BLACK);
        g.drawString("5.La Misma Idea", 95, 365);

        // Parada Valle Dorado
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(210, 20, 100, 40);
        g.setColor(Color.BLACK);
        g.drawString("6.Valle Dorado", 220, 45);

        // Parada San Diego
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(210, 100, 100, 40);
        g.setColor(Color.BLACK);
        g.drawString("7.San Diego", 230, 125);

        // Parada Puente S.Diego
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(210, 180, 100, 40);
        g.setColor(Color.BLACK);
        g.drawString("8.Puente S.Diego", 212, 205);

        // Parada Mexcal
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(210, 260, 100, 40);
        g.setColor(Color.BLACK);
        g.drawString("9.Mexcal", 240, 285);

        // Parada ITST
        g.setColor(Color.DARK_GRAY);
        g.fillRect(210, 340, 100, 40);
        g.setColor(Color.WHITE);
        g.drawString("10.ITST", 240, 365);
    }
    public void MostDialog(){
        PasajerosDialog pasajerosDialog = new PasajerosDialog(unidad);
        pasajerosDialog.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = getY(e, x);


        // Coordenadas del sexto rectángulo
        if (x >= 210 && x <= 310 && y >= 20 && y <= 60) {
            MostDialog();
        }

        // Coordenadas del séptimo rectángulo
        if (x >= 210 && x <= 310 && y >= 100 && y <= 140) {
            MostDialog();
        }

        // Coordenadas del octavo rectángulo
        if (x >= 210 && x <= 310 && y >= 180 && y <= 220) {
            MostDialog();
        }

        // Coordenadas del noveno rectángulo
        if (x >= 210 && x <= 310 && y >= 260 && y <= 300) {
            MostDialog();
        }

        // Coordenadas del décimo rectángulo
        if (x >= 210 && x <= 310 && y >= 340 && y <= 380) {
            MostDialog();
        }

    }
    private  int getY(MouseEvent e, int x) {
        int y = e.getY();
        Pasajero pasajero = new Pasajero();
        //Coordenadas Base
        if (x >=90 && x <=190 && y>=20 && y<=60){
            MostDialog();
        }
        // Coordenadas del segundo rectángulo
        if (x >= 90 && x <= 190 && y >= 100 && y <= 140) {
            MostDialog();
        }

        // Coordenadas del tercer rectángulo
        if (x >= 90 && x <= 190 && y >= 180 && y <= 220) {
            MostDialog();
        }

        // Coordenadas del cuarto rectángulo
        if (x >= 90 && x <= 190 && y >= 260 && y <= 300) {
            MostDialog();
        }

        // Coordenadas del quinto rectángulo
        if (x >= 90 && x <= 190 && y >= 340 && y <= 380) {
            MostDialog();
        }
        return y;
    }
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
