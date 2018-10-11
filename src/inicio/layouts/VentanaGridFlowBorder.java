package inicio.layouts;

import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.CENTER;

public class VentanaGridFlowBorder extends JFrame {

    JPanel pCentra, pIzquierda, pDerecha;
    Container container;

    public VentanaGridFlowBorder() throws HeadlessException {
        instancias();
        initGUI();

    }

    private void instancias() {
        pCentra = new JPanel();
        pDerecha = new JPanel();
        pIzquierda= new JPanel();
        container = getContentPane();
    }

    private void initGUI() {

        container.setLayout(new BorderLayout());
        container.add(configurarCentro(),BorderLayout.CENTER);
        container.add(configurarArriba(),BorderLayout.NORTH);
        container.add(configurarDerecha(),BorderLayout.EAST);
        container.add(configuraIzquierda(),BorderLayout.WEST);
        container.add(configurarAbajo(),BorderLayout.SOUTH);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Layouts Grid Border y Flow");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
    }

    private JComponent configurarCentro() {

        JLabel label = new JLabel("Etiqueta centro");
        label.setHorizontalAlignment(CENTER);
        return label;
    }
    private JComponent configurarArriba() {

        JLabel label = new JLabel("Etiqueta arriba");
        label.setHorizontalAlignment(CENTER);
        return label;
    }
    private JComponent configurarDerecha() {

        JButton b1 = new JButton("Boton d1");
        JButton b2 = new JButton("Boton d2");
        JButton b3 = new JButton("Boton d3");
        JButton b4 = new JButton("Boton d4");
        pDerecha.setLayout(new GridLayout(4,1,10,0));
        pDerecha.add(b1);
        pDerecha.add(b2);
        pDerecha.add(b3);
        pDerecha.add(b4);
        return pDerecha;
    }
    private JComponent configuraIzquierda() {

        JButton b1 = new JButton("Boton i1");
        JButton b2 = new JButton("Boton i2");
        JButton b3 = new JButton("Boton i3");
        JButton b4 = new JButton("Boton i4");
        pIzquierda.setLayout(new GridLayout(4,1,10,0));
        pIzquierda.add(b1);
        pIzquierda.add(b2);
        pIzquierda.add(b3);
        pIzquierda.add(b4);


        pIzquierda.setLayout(new FlowLayout());
        ((FlowLayout)pIzquierda.getLayout()).setAlignment(FlowLayout.CENTER);
        ((FlowLayout)pIzquierda.getLayout()).setHgap(20);
        ((FlowLayout)pIzquierda.getLayout()).setVgap(20);



        return pIzquierda;
    }
    private JComponent configurarAbajo() {

        JLabel label = new JLabel("Etiqueta abajo");
        label.setHorizontalAlignment(CENTER);
        return label;
    }
}
