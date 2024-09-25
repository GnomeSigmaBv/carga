package calendario;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VENTA extends JFrame {

    JPanel panelInicio = new JPanel();
    JTextField txtEspacio1 = new JTextField();
    JTextField txtEspacio2 = new JTextField();
    JTextField txtEspacio3 = new JTextField();

    public VENTA() {
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void insertarPanel() {
        this.getContentPane().add(panelInicio);
        panelInicio.setLayout(null); //descativar organizacion automatica
    }

    public void LetrasGuias() {
        JLabel lblLetra1 = new JLabel("Telefono");
        lblLetra1.setBounds(40, 40, 70, 50);
        panelInicio.add(lblLetra1);

        JLabel lblLetra2 = new JLabel("Nombre");
        lblLetra2.setBounds(40, 100, 70, 50);
        panelInicio.add(lblLetra2);

        JLabel lblLetra3 = new JLabel("Correo");
        lblLetra3.setBounds(40, 160, 70, 50);
        panelInicio.add(lblLetra3);

    }

    public void EspaciosBlancos() {
        txtEspacio1.setBounds(110, 40, 200, 30);
        panelInicio.add(txtEspacio1);
        txtEspacio1.repaint();

        txtEspacio2.setBounds(110, 100, 200, 30);
        panelInicio.add(txtEspacio2);
        txtEspacio2.repaint();
       
        txtEspacio3.setBounds(110, 160, 200, 30);
        panelInicio.add(txtEspacio3);
        txtEspacio3.repaint();
    }
   
}