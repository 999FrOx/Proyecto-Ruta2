import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class RutaVista {
    private JPanel pPrincipal;
    private JTextField tfNoUnidad;
    private JTextField tfMatricula;
    private JButton btAgregar;
    private List<Unidad> unidades;

    public static void main(String[] args) {
        JFrame frame = new JFrame("RutaVista");
        frame.setContentPane(new RutaVista().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
    }

    public RutaVista() {
        unidades = new ArrayList<>();
        btAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Unidad unidad = new Unidad();
                unidad.setNoUnidad(Integer.parseInt(tfNoUnidad.getText()));
                unidad.setMatricula(tfMatricula.getText());
                    unidades.add(unidad);
            }

        });
    }
}
