package cursoemvideo.olamundo;

import javax.swing.*;
import java.awt.event.*;

public class OlaMundoSwing extends JDialog {
    private JPanel contentPane;
    private JButton btnClick;
    private JLabel lblMensagem;

    public OlaMundoSwing() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnClick);

        btnClick.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // adicione seu código aqui
        lblMensagem.setText("Olá Mundo!!");
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        OlaMundoSwing dialog = new OlaMundoSwing();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
