package inicio.layouts;

import javax.swing.*;
import java.awt.*;

public class GridBagEjemplo extends JFrame {

    JTextField textoNombre, textoApellido1, textoApellido2, textoDireccion,
            textoVia, textoNumero, textoPuerta, textoCiudad, textoPais;
    JSpinner spTratamiento, spVia, spPago;
    JButton botonAceptar, botonCancelar;
    Container container;
    GridBagConstraints constraints;
    JPanel panelDireccion;


    public GridBagEjemplo() throws HeadlessException {
        instancias();
        botonAceptar.setIcon(new ImageIcon(getClass().getResource("/src/recurso/down_press.png")));
        initGUI();
        pack();
    }

    private void initGUI() {
        configCentral();
        setTitle("Formulario de registro");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(new Dimension(300,900));
    }

    private void configCentral() {

        container.setLayout(new GridBagLayout());
        configurarConstrait(2, 0, 1, 1, 0, 0, GridBagConstraints.EAST
                , GridBagConstraints.NONE, new Insets(20, 20, 20, 20), new JLabel("Tratamiento"), container);
        configurarConstrait(3, 0, 1, 1, 0.5, 0, GridBagConstraints.EAST
                , GridBagConstraints.NONE, new Insets(20, 20, 20, 20), spTratamiento, container);
        configurarConstrait(0, 0, 1, 1, 0, 0, GridBagConstraints.WEST
                , GridBagConstraints.NONE, new Insets(20, 20, 20, 20), new JLabel("Nombre"), container);
        configurarConstrait(1, 0, 1, 1, 0.5, 0, GridBagConstraints.WEST
                , GridBagConstraints.HORIZONTAL, new Insets(20, 20, 20, 20), textoNombre, container);
        configurarConstrait(0, 1, 1, 1, 0, 0, GridBagConstraints.WEST
                , GridBagConstraints.NONE, new Insets(20, 20, 20, 20), new JLabel("Apellido"), container);
        configurarConstrait(1, 1, 1, 1, 0, 0, GridBagConstraints.WEST
                , GridBagConstraints.HORIZONTAL, new Insets(20, 20, 20, 20), textoApellido1, container);
        configurarConstrait(2, 1, 2, 1, 0, 0, GridBagConstraints.WEST
                , GridBagConstraints.HORIZONTAL, new Insets(20, 20, 20, 20), textoApellido2, container);
        configurarConstrait(0, 2, 1, 1, 0, 0, GridBagConstraints.WEST
                , GridBagConstraints.NONE, new Insets(20, 20, 20, 20), new JLabel("Dirección"), container);
        configurarConstrait(1, 2, 3, 1, 0, 0, GridBagConstraints.WEST
                , GridBagConstraints.HORIZONTAL, new Insets(20, 20, 20, 20), textoDireccion, container);
        configurarConstrait(0, 3, 1, 1, 0, 0, GridBagConstraints.WEST
                , GridBagConstraints.NONE, new Insets(20, 20, 20, 20), new JLabel("Numero"), container);
        configurarConstrait(1, 3, 1, 1, 0, 0, GridBagConstraints.WEST
                , GridBagConstraints.HORIZONTAL, new Insets(20, 20, 20, 20), textoNumero, container);
        configurarConstrait(2, 3, 1, 1, 0, 0, GridBagConstraints.EAST
                , GridBagConstraints.NONE, new Insets(20, 20, 20, 20), new JLabel("Puerta"), container);
        configurarConstrait(3, 3, 1, 1, 0, 0, GridBagConstraints.WEST
                , GridBagConstraints.HORIZONTAL, new Insets(20, 20, 20, 20), textoPuerta, container);
        configurarConstrait(0, 4, 1, 1, 0, 0, GridBagConstraints.WEST
                , GridBagConstraints.NONE, new Insets(20, 20, 20, 20), new JLabel("Ciudad"), container);
        configurarConstrait(1, 4, 1, 1, 0, 0, GridBagConstraints.WEST
                , GridBagConstraints.HORIZONTAL, new Insets(20, 20, 20, 20), textoCiudad, container);
        configurarConstrait(2, 4, 1, 1, 0, 0, GridBagConstraints.EAST
                , GridBagConstraints.NONE, new Insets(20, 20, 20, 20), new JLabel("Pais"), container);
        configurarConstrait(3, 4, 1, 1, 0, 0, GridBagConstraints.WEST
                , GridBagConstraints.HORIZONTAL, new Insets(20, 20, 20, 20), textoPais, container);
        configurarConstrait(0, 5, 1, 1, 0, 0, GridBagConstraints.WEST
                , GridBagConstraints.NONE, new Insets(20, 20, 20, 20), new JLabel("Forma de pago"), container);
        configurarConstrait(1, 5, 1, 1, 0, 0, GridBagConstraints.WEST
                , GridBagConstraints.NONE, new Insets(20, 20, 20, 20), spPago, container);
        configurarConstrait(0, 6, 4, 3, 0, 1, GridBagConstraints.WEST
                , GridBagConstraints.BOTH, new Insets(20, 20, 20, 20), new JTextArea(), container);
        configurarConstrait(0, 9, 4, 1, 0, 0, GridBagConstraints.CENTER
                , GridBagConstraints.BOTH, new Insets(20, 20, 20, 20), configurarPanelBotones(), container);


    }

    private JPanel configurarPanelBotones() {
        JPanel pBotones = new JPanel();
        pBotones.add(new JButton("Aceptar"));
        pBotones.add(new JButton("Cancelar"));
        return pBotones;
    }

    private void configurarConstrait(int x, int y, int tx, int ty, double px, double py,
                                     int anchor, int fill, Insets i, Component c, Container cont) {
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.gridwidth = tx;
        constraints.gridheight = ty;
        constraints.weightx = px;
        constraints.weighty = py;
        constraints.anchor = anchor;
        constraints.fill = fill;
        constraints.insets = i;
        cont.add(c, constraints);
    }

    private void instancias() {

        textoApellido1 = new JTextField(10);
        textoApellido2 = new JTextField(10);
        textoCiudad = new JTextField(5);
        textoDireccion = new JTextField(15);
        textoNombre = new JTextField(5);
        textoNumero = new JTextField(5);
        textoPais = new JTextField(5);
        textoPuerta = new JTextField(5);
        container = getContentPane();
        constraints = new GridBagConstraints();
        botonAceptar = new JButton("Aceptar");
        botonCancelar = new JButton("Cancaler");
        spTratamiento = new JSpinner();
        spVia = new JSpinner();
        spPago = new JSpinner();
        panelDireccion = new JPanel();
    }


}
