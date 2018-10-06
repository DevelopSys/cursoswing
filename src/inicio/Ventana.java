package inicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static javax.swing.SwingConstants.CENTER;

public class Ventana extends JFrame implements ActionListener, WindowListener {

    JLabel etiqueta0, etiqueta1;
    JButton boton0, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton10, boton11;
    Container contenedor;
    JPanel panelSuperior, panelIzquierda, panelDerecha;

    final static String TAG_ACC_B1 = "accion_cerrar";

    public Ventana() throws HeadlessException {
        instancias();
        initGUI();
        acciones();
    }

    private void acciones() {
        // mismo método setOnClickListener();
        boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Accion
            }
        });

        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);
        boton5.addActionListener(this);
        boton6.addActionListener(this);
        boton7.addActionListener(this);
        boton8.addActionListener(this);
        boton9.addActionListener(this);
        boton10.addActionListener(this);
        boton11.addActionListener(this);
        this.addWindowListener(this);
        boton1.addFocusListener(new ManejoFoco());
    }

    private void instancias() {
        etiqueta0 = new JLabel("Etiqueta de ejemplo");
        boton0 = new JButton("boton 0");
        boton1 = new JButton("boton 1");
        boton1.setActionCommand(TAG_ACC_B1);
        boton2 = new JButton("boton 2");
        boton3 = new JButton("boton 3");
        boton4 = new JButton("boton 4");
        boton5 = new JButton("boton 5");
        boton6 = new JButton("boton 6");
        boton7 = new JButton("boton 7");
        boton8 = new JButton("boton 8");
        boton9 = new JButton("boton 9");
        boton10 = new JButton("boton 10");
        boton11 = new JButton("boton 11");
        contenedor = getContentPane();
        etiqueta0 = new JLabel("Centro");
        etiqueta1 = new JLabel("Parte baja");
        panelSuperior = new JPanel();
        panelIzquierda = new JPanel();
        panelDerecha = new JPanel();
    }

    private void initGUI() {
        configuracionesPanelCentral();

        setTitle("Ejemplo inicial");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 300);
        //setResizable(false);
        setLocationRelativeTo(null);
        //setLocation(50,50);
        pack();
    }

    private void configuracionesPanelCentral() {
        //contenedor.setLayout(new GridLayout(1,2,50,50));
        //contenedor.setLayout(new FlowLayout());
        //contenedor.add(etiqueta);
        contenedor.setLayout(new BorderLayout());
        etiqueta0.setHorizontalAlignment(SwingUtilities.CENTER);
        etiqueta1.setHorizontalAlignment(SwingUtilities.CENTER);
        contenedor.add(etiqueta1,BorderLayout.SOUTH);
        contenedor.add(etiqueta0,BorderLayout.CENTER);
        contenedor.add(configurarCentro(),BorderLayout.NORTH);
        contenedor.add(configurarIzquierda(),BorderLayout.WEST);
        contenedor.add(configurarDerecha(),BorderLayout.EAST);

    }

    public JPanel configurarCentro(){
        panelSuperior.add(boton4);
        panelSuperior.add(boton5);
        panelSuperior.add(boton6);
        panelSuperior.add(boton7);
        return panelSuperior;
    }

    public JPanel configurarIzquierda(){
        // JPANEL por defecto FlowLayout
        panelIzquierda.setLayout(new GridLayout(4,1));
        panelIzquierda.add(boton0);
        panelIzquierda.add(boton1);
        panelIzquierda.add(boton2);
        panelIzquierda.add(boton3);
        return panelIzquierda;
    }

    public JPanel configurarDerecha(){
        // JPANEL por defecto FlowLayout
        panelDerecha.setLayout(new GridLayout(4,1));
        panelDerecha.add(boton8);
        panelDerecha.add(boton9);
        panelDerecha.add(boton10);
        panelDerecha.add(boton11);
        return panelDerecha;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //ACCION
        /*if (e.getSource() == boton2){

        }else if (e.getSource() == boton3){

        }else if (e.getSource() == boton4){

        }else if (e.getSource() == boton5){

        }else if (e.getSource() == boton6){

        }else if (e.getSource() == boton7){

        }else if (e.getSource() == boton8){

        }else if (e.getSource() == boton9){

        }else if (e.getSource() == boton10){

        }else if (e.getSource() == boton11){

        }*/

        if (e.getActionCommand().equals(TAG_ACC_B1)){

        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        //ACCION
    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    class ManejoFoco extends FocusAdapter{
        @Override
        public void focusGained(FocusEvent e) {
            super.focusGained(e);
            //Accion
        }
    }
}
