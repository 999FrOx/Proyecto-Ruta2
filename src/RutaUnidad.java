import javax.swing.*;
import java.awt.*;

public class RutaUnidad extends JFrame {
    private JLabel lbUnidad;
    private Unidad unidad;
    public RutaUnidad(Unidad unidad){
        super("Rutas de la unidad");
        setSize(600,600);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setVisible(true);
        AreaDibujo area = new AreaDibujo(unidad);
        add(area);
        this.unidad = unidad;
        //Agrega la label para la unidad
        lbUnidad = new JLabel("Seleccionar Parada: ");
        lbUnidad.setBounds(55, 55, 200, 20);
        lbUnidad.setFont(new Font("Arial", Font.BOLD,18));
        add(lbUnidad);
        PasajerosDialog pasajerosDialog = new PasajerosDialog(unidad);


    }
}
