import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RutaVista {
    private JPanel pPrincipal;
    private JTextField tfNoUnidad;
    private JTextField tfPlacas;
    private JButton btAgregar;

    public static void main(String[] args) {
        JFrame frame = new JFrame("RutaVista");
        frame.setContentPane(new RutaVista().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public RutaVista() {
        btAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
