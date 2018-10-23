package inicio.elementos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame implements ActionListener, FocusListener, ItemListener {


    Container container;
    JButton botonImagenes;
    JToggleButton botonTog;
    JButton botonGrupo1, botonGrupo2;
    ButtonGroup grupoBotones;

    public Ventana() throws HeadlessException {
        instancias();
        initGUI();
        acciones();
    }

    private void acciones() {
        botonImagenes.addActionListener(this);
        botonImagenes.addFocusListener(this);
        botonTog.addItemListener(this);
    }

    private void initGUI() {
        container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
        botonImagenes.setBorder(null);
        botonImagenes.setBorderPainted(false);
        botonImagenes.setFocusPainted(false);
        botonImagenes.setBackground(null);
        botonImagenes.setIcon(new ImageIcon(getClass().getResource("./recursos/up.png")));
        botonImagenes.setPressedIcon(new ImageIcon(getClass().getResource("./recursos/up_press.png")));
        botonImagenes.setRolloverIcon(new ImageIcon(getClass().getResource("./recursos/down.png")));
        botonImagenes.setToolTipText("Raton por encima del elemento");
        container.add(botonImagenes);

        botonTog.setBorderPainted(false);
        botonTog.setFocusPainted(false);
        botonTog.setBackground(null);
        botonTog.setIcon(new ImageIcon(getClass().getResource("./recursos/down.png")));
        botonTog.setSelectedIcon(new ImageIcon(getClass().getResource("./recursos/down_press.png")));
        container.add(botonTog);
        container.add(botonGrupo1);
        container.add(botonGrupo2);

        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
    }

    private void instancias() {
        container = getContentPane();
        botonImagenes = new JButton("Ejemplo");
        botonTog = new JToggleButton();
        botonGrupo1 = new JButton("opcion 1");
        botonGrupo2 = new JButton("opcion 2");
        grupoBotones = new ButtonGroup();
        grupoBotones.add(botonGrupo1);
        grupoBotones.add(botonGrupo2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void focusGained(FocusEvent e) {
        //botonImagenes.setIcon(new ImageIcon(getClass().getResource("./recursos/down.png")));
    }

    @Override
    public void focusLost(FocusEvent e) {
        //botonImagenes.setIcon(new ImageIcon(getClass().getResource("./recursos/down_press.png")));
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        //Toolkit.getDefaultToolkit()
        System.out.println(Thread.currentThread());
    }
}
