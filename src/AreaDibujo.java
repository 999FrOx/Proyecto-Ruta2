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
        // Parada Base
        g.setColor(Color.DARK_GRAY);
        g.fillRect(90, 20, 100, 40);
        g.setColor(Color.WHITE);
        g.drawString("Base Teziutlán", 100, 45);

        // Primera parada
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(90, 100, 100, 40);
        g.setColor(Color.BLACK);
        g.drawString("Guadalupano", 100, 125);

        // Segunda parada
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(90, 180, 100, 40);
        g.setColor(Color.BLACK);
        g.drawString("Cinepolis", 115, 205);

        // Tercera parada
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(90, 260, 100, 40);
        g.setColor(Color.BLACK);
        g.drawString("Aurrera", 120, 285);

        // Cuarta parada
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(90, 340, 100, 40);
        g.setColor(Color.BLACK);
        g.drawString("La Misma Idea", 100, 365);

        // Primera parada derecha
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(210, 20, 100, 40);
        g.setColor(Color.BLACK);
        g.drawString("Valle Dorado", 220, 45);

        // Segunda parada derecha
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(210, 100, 100, 40);
        g.setColor(Color.BLACK);
        g.drawString("San Diego", 230, 125);

        // Tercera parada derecha
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(210, 180, 100, 40);
        g.setColor(Color.BLACK);
        g.drawString("Puente S.Diego", 220, 205);

        // Cuarta parada derecha
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(210, 260, 100, 40);
        g.setColor(Color.BLACK);
        g.drawString("Mexcal", 240, 285);

        // Última parada derecha
        g.setColor(Color.DARK_GRAY);
        g.fillRect(210, 340, 100, 40);
        g.setColor(Color.WHITE);
        g.drawString("ITST", 250, 365);
    }
    public void MostDialog(){
        PasajerosDialog pasajerosDialog = new PasajerosDialog(unidad);
        pasajerosDialog.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = getY(e, x);


        // Coordenadas del sexto rectángulo (columna derecha)
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
        //Coordenadas Base: 90,20,100,40
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
