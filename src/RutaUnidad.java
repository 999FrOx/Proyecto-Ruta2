import javax.swing.*;
public class RutaUnidad extends JFrame {
    public RutaUnidad(JComboBox cbUnidades){
        super("Rutas de la unidad");
        setSize(900,600);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setVisible(true);
        cbUnidades.setBounds(50, 30, 200, 30);
        add(cbUnidades);
        AreaDibujo area= new AreaDibujo();
        add(area);
        setVisible(true);
    }
}
