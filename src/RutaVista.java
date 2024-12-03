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
    private List<Unidad> unidades; //Lista de Unidades
    private Unidad unidadSel;

    //Configuracion del Frame Principal
    public static void main(String[] args) {
        JFrame frame = new JFrame("RutaVista");
        frame.setContentPane(new RutaVista().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }

    public RutaVista() {
        unidades = new ArrayList<>();
        unidadSel = null;
        //Guarda la unidad selecionada en el JComboBox
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
                //Verifica si los campos no estan vacios
                if (tfNoUnidad.getText().isEmpty() || tfMatricula.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                //verifica que la unidad no exista
                try {
                    unidad.setNoUnidad(Integer.parseInt(tfNoUnidad.getText()));
                    unidad.setMatricula(tfMatricula.getText());
                    if (tfNoUnidad == null) {
                        JOptionPane.showMessageDialog(null, "Llene los datos", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    int numeroUnidadB= Integer.parseInt(tfNoUnidad.getText());
                    boolean buscarUnidad = buscarUnidad(numeroUnidadB);

                    if (buscarUnidad) {
                        JOptionPane.showMessageDialog(null, "Esta Unidad ya existe." , "Error" , JOptionPane.ERROR_MESSAGE);
                        tfNoUnidad.setText("");
                        tfMatricula.setText("");
                    } else {
                        unidades.add(unidad);
                        agregarUn();
                        tfNoUnidad.setText("");
                        tfMatricula.setText("");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                    tfNoUnidad.setText("");
                    tfMatricula.setText("");
                }


            }
            //metodo para verificar si el numero de unidad existe en la lista
            private boolean buscarUnidad(int numeroUnidad) {
                for (Unidad unidad : unidades) {
                    if (unidad.getNoUnidad() == numeroUnidad) {
                        return true;
                    }
                }
                return false;
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
        //Abre el mapa de paradas
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

}
