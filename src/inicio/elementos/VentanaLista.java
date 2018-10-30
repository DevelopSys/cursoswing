package inicio.elementos;

import inicio.Persona;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class VentanaLista extends JFrame implements ListSelectionListener {

    Container container;
    JList lista;
    DefaultListModel modeloDatosLista;
    JScrollPane scrollPane;
    JPanel panelCentro = new JPanel();

    public VentanaLista() throws HeadlessException {

        instancias();
        initGIU();
        acciones();

    }

    private void acciones() {
        lista.addListSelectionListener(this);
    }

    private void initGIU() {
        configurarLista();
        container.setLayout(new BoxLayout(container,BoxLayout.Y_AXIS));
        container.add(scrollPane);
        container.add(panelCentro);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private void configurarLista() {
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Persona persona1 = new Persona("asd", "asd", 123);
        Persona persona2 = new Persona("sdfs", "asd", 123);
        Persona persona3 = new Persona("sdfsdf", "asd", 123);
        modeloDatosLista.addElement(persona1);
        modeloDatosLista.addElement(persona2);
        modeloDatosLista.addElement(persona3);
        //lista.setModel(modeloDatosLista);
    }

    private void instancias() {
        container = getContentPane();
        modeloDatosLista = new DefaultListModel();
        lista = new JList(modeloDatosLista);
        scrollPane = new JScrollPane(lista);
        panelCentro.setBackground(Color.BLACK);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        //System.out.println("Elemento pulsado");
        if (e.getValueIsAdjusting()){

            Persona p = (Persona) modeloDatosLista.get(lista.getSelectedIndex());
            System.out.println(p.getTelefono());


        }

    }
}
