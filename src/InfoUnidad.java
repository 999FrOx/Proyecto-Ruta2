import javax.swing.*;
import java.awt.event.*;

public class InfoUnidad extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JLabel lbUnidad;
    private JLabel lbGanancia;
    private Unidad unidad;

    RutaVista rutaVista = new RutaVista();
    Pasajero pasajero = new Pasajero();

    public InfoUnidad(Unidad unidad) {
        this.unidad = unidad;
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setSize(250,130);
        setLocationRelativeTo(null);



        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        mostrarDatos();
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    public void mostrarDatos(){
        lbUnidad.setText("Unidad: " + unidad.getNoUnidad() + " - Matrícula: " + unidad.getMatricula());
        lbGanancia.setText("Ganancias: $" + unidad.getGanancias());

    }

    public static void main(String[] args) {
        Unidad unidad = new Unidad();
        InfoUnidad dialog = new InfoUnidad(unidad);
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

}
