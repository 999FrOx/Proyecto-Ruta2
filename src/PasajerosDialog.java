import javax.swing.*;
import java.awt.event.*;

public class PasajerosDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField tfAbordan;
    private JTextField tfBajan;
    private Unidad unidad;
    private Pasajero pasajero;

    public PasajerosDialog(Unidad unidad) {
        this.unidad = unidad;
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setSize(300,200);
        setLocationRelativeTo(null);


        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        try {
            int abordan = Integer.parseInt(tfAbordan.getText());
            int bajan = Integer.parseInt(tfBajan.getText());

            Pasajero pasajero = unidad.getPasajero();

            if (bajan > pasajero.getPasajerosAbordo()) {
                JOptionPane.showMessageDialog(null, "No hay suficientes pasajeros para bajar.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            pasajero.bajarPasajeros(bajan);

            if (pasajero.getPasajerosAbordo() + abordan <= pasajero.getCapacidadUnidad()) {
                pasajero.abordarPasajeros(abordan);
                JOptionPane.showMessageDialog(null, "Ganancia registrada: $" + pasajero.getUnidad().getGanancias()+
                        "\n Pasageros Abordo: " + pasajero.getPasajerosAbordo());

            } else {
                JOptionPane.showMessageDialog(null, "No hay espacio suficiente para que aborden todos los pasajeros.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        Unidad unidad = new Unidad();
        PasajerosDialog dialog = new PasajerosDialog(unidad);
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
