package inicio.elementos;

import javafx.scene.control.Spinner;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Ventana extends JFrame implements ActionListener, FocusListener, ItemListener, ChangeListener {


    Container container;
    JButton botonImagenes;
    JToggleButton botonTog;
    JButton botonGrupo1, botonGrupo2;
    ButtonGroup grupoBotones, grupoRadio;
    JCheckBox checkBox;
    JRadioButton radioButton, radiog1, radiog2;
    JSpinner spinner;
    SpinnerNumberModel modeloNumeros;
    SpinnerListModel modeloDatos;
    JTextField texto;
    final static String TAG_HINT_TEXT = "hint";
    JFormattedTextField textoNumeros;
    NumberFormat formatoNumero;

    public Ventana() throws HeadlessException {
        instancias();
        initGUI();
        acciones();
    }

    private void acciones() {
        botonImagenes.addActionListener(this);
        botonImagenes.addFocusListener(this);
        botonTog.addItemListener(this);
        checkBox.addItemListener(this);
        radioButton.addItemListener(this);
        grupoRadio.getSelection().addItemListener(this);
        spinner.addChangeListener(this);
        texto.addFocusListener(this);
        texto.addKeyListener(new ManejoPulsaciones());
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

        checkBox.setSelectedIcon(new ImageIcon(getClass().getResource("./recursos/up_press.png")));
        container.add(checkBox);
        checkBox.setSelected(false);
        System.out.println(checkBox.isSelected());

        radioButton.setSelectedIcon(new ImageIcon(getClass().getResource("./recursos/down_press.png")));
        container.add(radioButton);
        radioButton.isSelected();
        radioButton.setSelected(true);


        container.add(radiog1);
        container.add(radiog2);

        container.add(spinner);
        modeloNumeros.getValue();
        spinner.getModel().getValue();
        spinner.getModel().setValue(90);

        ArrayList lista = new ArrayList();
        lista.add("Dato 1");
        lista.add("Dato 2");
        lista.add("Dato 3");
        modeloDatos.setList(lista);
        spinner.setModel(modeloDatos);
        spinner.getModel().getValue();
        //spinner.getModel().setValue(1);
        lista.add("Dato nuevo");

        container.add(texto);

        container.add(textoNumeros);


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
        checkBox = new JCheckBox("Opción",
                new ImageIcon(getClass().getResource("./recursos/up.png")), true);

        radioButton = new JRadioButton("Opción radio",
                new ImageIcon(getClass().getResource("./recursos/down.png")), true);
        radiog1 = new JRadioButton("Opción 1", false);
        radiog2 = new JRadioButton("Opción 2", true);
        grupoRadio = new ButtonGroup();
        grupoRadio.add(radiog1);
        grupoRadio.add(radiog2);
        modeloNumeros = new SpinnerNumberModel();
        modeloNumeros.setMaximum(100);
        modeloNumeros.setMinimum(50);
        modeloNumeros.setStepSize(5);
        modeloNumeros.setValue(75);
        spinner = new JSpinner(modeloNumeros);
        // en constructor poner la lista de datos a mostrar
        modeloDatos = new SpinnerListModel();
        texto = new JTextField(TAG_HINT_TEXT, 10);
        formatoNumero = NumberFormat.getIntegerInstance();
        formatoNumero.setMinimumIntegerDigits(3);
        textoNumeros = new JFormattedTextField(new NumberFormatter(formatoNumero));

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void focusGained(FocusEvent e) {
        //botonImagenes.setIcon(new ImageIcon(getClass().getResource("./recursos/down.png")));
        if (e.getSource() == texto) {
            if (texto.getText().equals(TAG_HINT_TEXT)) {
                texto.setText("");
            }
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        //botonImagenes.setIcon(new ImageIcon(getClass().getResource("./recursos/down_press.png")));
        if (e.getSource() == texto) {
            if (texto.getText().isEmpty()) {
                texto.setText(TAG_HINT_TEXT);
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        //Toolkit.getDefaultToolkit()
        //System.out.println(Thread.currentThread());
        if (e.getSource() == botonTog) {

        } else if (e.getSource() == checkBox) {
            //System.out.println(checkBox.isSelected());
            if (e.getStateChange() == ItemEvent.SELECTED) {
                System.out.println("Activado");

            } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                System.out.println("Desactivado");
            }
        } else if (e.getSource() == radioButton) {
            //System.out.println(radioButton.isSelected());
            if (e.getStateChange() == ItemEvent.SELECTED) {
                System.out.println("Activado");

            } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                System.out.println("Desactivado");
            }
        } else if (e.getSource() == grupoRadio) {
            //System.out.println(radioButton.isSelected());
            if (e.getStateChange() == ItemEvent.SELECTED) {
                System.out.println(grupoRadio.getSelection().getActionCommand());

            } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                System.out.println("Desactivado");
            }
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        System.out.println(spinner.getModel().getValue().toString());
        ((JSpinner) e.getSource()).getModel().getValue().toString();
    }

    class ManejoPulsaciones extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent e) {
            super.keyTyped(e);
            Character c = e.getKeyChar();
            if (!Character.isDigit(c)|| texto.getText().length()>9){
                //System.out.println("Es digito");
                e.consume();
            }
        }
    }
}
