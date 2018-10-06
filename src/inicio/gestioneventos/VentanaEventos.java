package inicio.gestioneventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaEventos extends JFrame implements ActionListener {

    Container component;
    JButton botonAceptar, botonCancelar;
    JTextField campoTexto;
    JPanel panelGeneral;
    private static String TAG_ACEPTA = "Acepta";

    public VentanaEventos() {
        init();
        actions();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void actions() {
        Component[] components = panelGeneral.getComponents();
        for (Component c : components
        ) {
            c.addMouseListener(new EventosMouse());
        }
        botonCancelar.addActionListener(this);
        botonAceptar.addActionListener(this);

    }

    private void init() {
        component = getContentPane();
        panelGeneral = new JPanel();
        botonAceptar = new JButton("Aceptar");
        botonAceptar.setActionCommand(TAG_ACEPTA);
        botonCancelar = new JButton("Cancelar");
        campoTexto = new JTextField("Campo de texto");
        colocacionGeneral();
    }

    private void colocacionGeneral() {
        component.add(panelGeneral);
        FlowLayout fLayout = new FlowLayout(FlowLayout.CENTER, 20, 20);
        panelGeneral.setLayout(fLayout);
        panelGeneral.add(botonAceptar);
        panelGeneral.add(botonCancelar);
        panelGeneral.add(campoTexto);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonCancelar) {
            System.exit(0);
        }
        if (e.getActionCommand() == TAG_ACEPTA) {
            System.out.println("Pulsado aceptar");
        }
    }

    // personaliza la interfaz listener, sobreescribiendo los métodos que sean necesarios
    class EventosMouse extends MouseAdapter {

        @Override
        public void mouseEntered(MouseEvent e) {
            Object o = e.getSource();
            if (e.getSource() == botonAceptar) {
                ((JButton) o).setToolTipText("Pulsa para aceptar");
            } else if (e.getSource() == botonCancelar) {
                ((JButton) o).setToolTipText("Pulsa para cancelar");
            }

        }
    }


}
