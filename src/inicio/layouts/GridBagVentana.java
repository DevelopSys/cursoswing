package inicio.layouts;

import javax.swing.*;
import java.awt.*;

import static java.awt.GridBagConstraints.NONE;

public class GridBagVentana extends JFrame {

    JTextField textoPara, textoCopia, textoCopiaO;
    JLabel etiquetaPara, etiquetaCopia, etiquetaCopiaO;
    Container container;
    GridBagConstraints constraints;

    JButton botonComun;

    public GridBagVentana() throws HeadlessException {
        instancias();
        initGUI();
    }

    private void initGUI() {
        configCentral();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void configCentral() {

        container.setLayout(new GridBagLayout());

        configurarConstrait(0, 0, 1, 1, 0.2, 1, GridBagConstraints.CENTER
                , GridBagConstraints.HORIZONTAL, new Insets(20, 20, 20, 20), etiquetaPara);

        configurarConstrait(1, 0, 1, 1, 0.2, 1, GridBagConstraints.CENTER
                , GridBagConstraints.HORIZONTAL, new Insets(20, 20, 20, 20), textoPara);

        configurarConstrait(0, 1, 1, 1, 0.2, 1, GridBagConstraints.CENTER
                , GridBagConstraints.HORIZONTAL, new Insets(20, 20, 20, 20), etiquetaCopia);
        configurarConstrait(1, 1, 1, 1, 0.2, 1, GridBagConstraints.CENTER
                , GridBagConstraints.HORIZONTAL, new Insets(20, 20, 20, 20), textoCopia);

        configurarConstrait(2, 1, 1, 1, 0.2, 1, GridBagConstraints.CENTER
                , GridBagConstraints.HORIZONTAL, new Insets(20, 20, 20, 20), etiquetaCopiaO);
        configurarConstrait(3, 1, 1, 1, 0.2, 1, GridBagConstraints.CENTER
                , GridBagConstraints.HORIZONTAL, new Insets(20, 20, 20, 20), textoCopiaO);

        configurarConstrait(0, 2, 2, 1, 0.2, 1, GridBagConstraints.CENTER
                , GridBagConstraints.NONE, new Insets(20, 20, 20, 20), new JButton());
        configurarConstrait(2, 2, 2, 1, 0.2, 1, GridBagConstraints.CENTER
                , GridBagConstraints.HORIZONTAL, new Insets(20, 20, 20, 20), new JButton());

    }

    private void configurarConstrait(int x, int y, int tx, int ty, double px, double py,
                                     int anchor, int fill, Insets i, Component c) {
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.gridwidth = tx;
        constraints.gridheight = ty;
        constraints.weightx = px;
        constraints.weighty = py;
        constraints.anchor = anchor;
        constraints.fill = fill;
        constraints.insets = i;
        container.add(c, constraints);
    }

    private void instancias() {

        textoPara = new JTextField();
        textoCopia = new JTextField();
        textoCopiaO = new JTextField();
        etiquetaCopia = new JLabel("Copia");
        etiquetaPara = new JLabel("Para");
        etiquetaCopiaO = new JLabel("Copia oculta");
        container = getContentPane();
        constraints = new GridBagConstraints();
        botonComun = new JButton("Común");
    }


}
