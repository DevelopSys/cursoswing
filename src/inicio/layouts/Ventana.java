package inicio.layouts;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    JPanel pCentral, pSur, pUno, pDos, pTres, pCuatro;
    JButton boton1, boton2, boton3, boton4;
    Container container;
    CardLayout cardLayout;

    public Ventana() throws HeadlessException {
        instancias();
        initGUI();
        acciones();
    }

    private void acciones() {

    }

    private void instancias() {
        cardLayout = new CardLayout();
        pCentral = new JPanel();
        pSur = new JPanel();
        pUno = new JPanel();
        pUno.setBackground(Color.BLACK);
        pDos = new JPanel();
        pDos.setBackground(Color.GREEN);
        pTres = new JPanel();
        pTres.setBackground(Color.RED);
        pCuatro = new JPanel();
        pCuatro.setBackground(Color.YELLOW);
        boton1 = new JButton("Panel 1");
        boton2 = new JButton("Panel 2");
        boton3 = new JButton("Panel 3");
        boton4 = new JButton("Panel 4");
        container = getContentPane();
    }

    private void initGUI() {

        container.add(configPanelSur(),BorderLayout.SOUTH);
        container.add(configPanelCentral(),BorderLayout.CENTER);
        setVisible(true);
        setTitle("Configuracion CardLayout");
        setLocationRelativeTo(null);
        pack();
    }

    public JPanel configPanelSur() {
        pSur.setLayout(new GridLayout(1, 4, 10, 10));
        pSur.add(boton1);
        pSur.add(boton2);
        pSur.add(boton3);
        pSur.add(boton4);
        return pSur;
    }

    public JPanel configPanelCentral(){
        pCentral.setLayout(cardLayout);
        pCentral.add(pUno,"panel1");
        pCentral.add(pDos,"panel2");
        pCentral.add(pTres,"panel3");
        pCentral.add(pCuatro,"panel4");
        //((CardLayout)pCentral.getLayout())
        cardLayout.show(pCentral,"panel4");
        return pCentral;
    }
}
