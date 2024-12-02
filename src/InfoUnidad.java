import javax.swing.*;
import java.awt.event.*;

public class InfoUnidad extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
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
        setSize(200,200);
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
        mostrarDatos();
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
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
