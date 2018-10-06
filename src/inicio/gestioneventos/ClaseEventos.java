package inicio.gestioneventos;

import javax.swing.*;
import java.awt.event.*;

public class ClaseEventos extends KeyAdapter implements ActionListener{

    JButton botonOk;
    JButton botonCancel;
    JButton botonDefault;
    JTextField campoTexto;
    final String TAG_ACTION_OK = "pulsado_boton_ok";
    final String TAG_ACTION_CANCEL = "pulsado_boton_cancel";
    final String TAG_ACTION_DEFAULT = "pulsado_boton_default";

    public ClaseEventos() {
        init();
        actions();
    }

    private void init() {
        botonOk = new JButton("OK");
        botonOk.setActionCommand(TAG_ACTION_OK);
        botonCancel = new JButton("CANCEL");
        botonCancel.setActionCommand(TAG_ACTION_CANCEL);
        botonDefault = new JButton("CLOSE");
        botonDefault.setActionCommand(TAG_ACTION_DEFAULT);
        campoTexto = new JTextField("Campo de texto");
    }

    private void actions() {
        botonOk.addActionListener(this);
        campoTexto.addKeyListener(this);
        campoTexto.addFocusListener(new ManejoEventosFoco());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String TAG_ACTION = e.getActionCommand();
        switch (TAG_ACTION) {
            case TAG_ACTION_OK:
                break;
            case TAG_ACTION_CANCEL:
                break;
            case TAG_ACTION_DEFAULT:
                break;
        }

        // ó

        if (e.getActionCommand().equals(TAG_ACTION_OK)) {

        }else if (e.getActionCommand().equals(TAG_ACTION_CANCEL)){

        }else if (e.getActionCommand().equals(TAG_ACTION_DEFAULT)){

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
    }

    class ManejoEventosFoco extends FocusAdapter{
        @Override
        public void focusGained(FocusEvent e) {
            super.focusGained(e);
        }
    }
}
