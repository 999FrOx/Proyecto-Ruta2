import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RutaUnidad extends JFrame {
    private JLabel lbUnidad;
    private JButton OK;
    private Unidad unidad;
    //Confg del JFrame
    public RutaUnidad(Unidad unidad){
        super("Rutas de la unidad");
        setSize(560,600);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setVisible(true);
        //Desplegar el AreaDibujo
        AreaDibujo area = new AreaDibujo(unidad);
        add(area);
        this.unidad = unidad;
        //Agrega la label para la unidad
        lbUnidad = new JLabel("Seleccionar Parada: ");
        lbUnidad.setBounds(55, 55, 200, 20);
        lbUnidad.setFont(new Font("Arial", Font.BOLD,18));
        add(lbUnidad);
        PasajerosDialog pasajerosDialog = new PasajerosDialog(unidad);
        //Boton ok para cerrar el frame
        OK = new JButton("Ok");
        OK.setBounds(160,520,200,20);
        OK.setFont(new Font("Arial", Font.BOLD,18));
        add(OK);
        OK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

    }
}
