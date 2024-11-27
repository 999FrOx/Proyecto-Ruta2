import javax.swing.*;
import java.awt.*;

public class RutaUnidad extends JFrame {
    private JLabel lbUnidad;
    private JLabel lbNoUnidad;
    private JLabel lbPasajerosSub;
    private JLabel lbPasajerosBajan;
    private JLabel lbTotal;

    public RutaUnidad(JComboBox cbUnidades){
        super("Rutas de la unidad");
        setSize(900,600);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setVisible(true);
        cbUnidades.setBounds(270, 50, 200, 30);
        add(cbUnidades);
        AreaDibujo area= new AreaDibujo();
        add(area);
        setVisible(true);

        //Agrega la label para la unidad
        lbUnidad = new JLabel("Seleccionar Unidad: ");
        lbUnidad.setBounds(55, 55, 200, 20);
        lbUnidad.setFont(new Font("Arial", Font.BOLD,18));
        add(lbUnidad);
        //Agrega la label para El No de Unidad
        lbNoUnidad = new JLabel("Unidad " + cbUnidades.getSelectedItem());
        lbNoUnidad.setBounds(500, 100, 350, 20);
        lbNoUnidad.setFont(new Font("Arial", Font.BOLD,16));
        add(lbNoUnidad);
        //Agrega la label para Pasajeros que Abordan
        lbPasajerosSub= new JLabel("Abordaron: ");
        lbPasajerosSub.setBounds(500, 150, 350, 20);
        lbPasajerosSub.setFont(new Font("Arial", Font.BOLD,14));
        add(lbPasajerosSub);
        //Agrega la label para Pasajeros que Abordan
        lbPasajerosBajan= new JLabel("Bajaron: ");
        lbPasajerosBajan.setBounds(500, 200, 350, 20);
        lbPasajerosBajan.setFont(new Font("Arial", Font.BOLD,14));
        add(lbPasajerosBajan);
        //Agrega la label para Pasajeros que Abordan
        lbTotal= new JLabel("Ganancias de la Unidad: ");
        lbTotal.setBounds(500, 250, 350, 20);
        lbTotal.setFont(new Font("Arial", Font.BOLD,14));
        add(lbTotal);

    }
}
