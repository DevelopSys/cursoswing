package inicio.dinamica;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {

    JPanel pArriba, pCentro, pCentroUno, pCentroDos;
    JButton b1, b2;
    Container c;


    public Ventana() throws HeadlessException {
        instancias();
        initGUI();
        acciones();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    private void acciones() {
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    private void instancias() {
        c = getContentPane();
        b1 = new JButton("Panel1");
        b2 = new JButton("Panel2");
        pArriba = new JPanel(new FlowLayout());
        pCentro = new JPanel();
        pCentro.setLayout(new BoxLayout(pCentro,BoxLayout.X_AXIS));
        pCentroUno = new JPanel();
        pCentroUno.setBackground(Color.BLUE);
        //pCentroUno.setPreferredSize(new Dimension(300,600));
        pCentroDos = new JPanel();
        pCentroDos.setBackground(Color.YELLOW);
        //pCentroDos.setMinimumSize(new Dimension(pCentroUno.getWidth()*2,pCentroUno.getHeight()));
        pCentroDos.setPreferredSize(new Dimension(400,400));

    }

    private void initGUI() {
        c.add(configurarArriba(), BorderLayout.NORTH);
        c.add(configurarCentro(), BorderLayout.CENTER);
        configurarpCentroDos();
    }

    private JPanel configurarCentro() {
        pCentroUno.add(new JLabel("Etiqueta del boton uno"));
        pCentro.add(pCentroUno);
        return pCentro;
    }

    private JPanel configurarArriba() {
        pArriba.add(b1);
        pArriba.add(b2);
        return pArriba;
    }

    private void configurarpCentroDos(){
        pCentroDos.add(new JLabel("Etiqueta del boton uno"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {

            if (pCentro.getComponents().length>1){
                pCentro.remove(pCentroDos);

                pack();
            }
        } else if (e.getSource() == b2) {

            if (pCentro.getComponents().length==1){
                pCentro.add(pCentroDos);
                pack();
            }

        }

    }
}
