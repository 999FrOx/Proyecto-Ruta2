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
    private JComboBox cbUnidades;
    private JButton quitarUnidadButton;
    private JButton infoUnidadButton;
    private JButton gestionarUnidadButton;
    private List<Unidad> unidades;
    private Unidad unidadSel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("RutaVista");
        frame.setContentPane(new RutaVista().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 250);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }

    public RutaVista() {
        unidades = new ArrayList<>();
        unidadSel = null;
        cbUnidades.setVisible(true);
        //Definir la unidad actual
        cbUnidades.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                unidadSel = (Unidad) cbUnidades.getSelectedItem();
            }
        });
        //agrega unidades a la lista
        btAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Unidad unidad = new Unidad();
                if (tfNoUnidad.getText().isEmpty() || tfMatricula.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                unidad.setNoUnidad(Integer.parseInt(tfNoUnidad.getText()));
                unidad.setMatricula(tfMatricula.getText());
                unidades.add(unidad);
                agregarUn();
                tfNoUnidad.setText("");
                tfMatricula.setText("");

            }

            //Agregar unidades para atender al Jcbbox
            public void agregarUn() {
                if (!unidades.isEmpty()) {
                    Unidad ultUnidad = unidades.get(unidades.size() - 1);
                    cbUnidades.addItem(ultUnidad);
                }
            }
        });
        //Mosatrar info de la Unidad seleccionada
        infoUnidadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Verificar si se ha elegido una unidad
                if (unidadSel == null) {
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione una unidad.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                InfoUnidad infoUnidad = new InfoUnidad(unidadSel);
                infoUnidad.setVisible(true);
            }
        });
        //Boton para quitar unidades de la lista
        quitarUnidadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String unidadEl = JOptionPane.showInputDialog("Ingrese el número de unidad a eliminar:");
                    if (unidadEl == null || unidadEl.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Llene los datos", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    int numeroUnidadEl = Integer.parseInt(unidadEl);
                    boolean eliminada = eliminarUnidad(numeroUnidadEl);

                    if (eliminada) {
                        JOptionPane.showMessageDialog(null, "La unidad fue eliminada con éxito.");
                        actualizarOpciones();
                    } else {
                        JOptionPane.showMessageDialog(null, "La unidad no existe.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }


            //Compara si el numero ingresado esta en la lista y lo elimina
            private boolean eliminarUnidad(int numeroUnidad) {
                for (Unidad unidad : unidades) {
                    if (unidad.getNoUnidad() == numeroUnidad) {
                        unidades.remove(unidad);
                        return true;
                    }
                }
                return false;
            }
            //Actualiza en JCombobox
            public void actualizarOpciones() {
                cbUnidades.removeAllItems();
                for (Unidad unidad : unidades) {
                    cbUnidades.addItem(unidad);
                }
            }
        });

        gestionarUnidadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                unidadSel = (Unidad) cbUnidades.getSelectedItem();
                if (unidadSel != null) {
                    RutaUnidad rutaUnidad = new RutaUnidad(unidadSel);
                    rutaUnidad.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione una unidad.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    public String getUniadSeleccionada() {
        return (String) cbUnidades.getSelectedItem();
    }
}
