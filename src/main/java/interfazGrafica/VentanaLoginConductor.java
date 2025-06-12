package interfazGrafica;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import conductor.GpConductores;
import lecturaEscritura.Utilities;
import lecturaEscritura.Validador;
import principal.Conductor;

public class VentanaLoginConductor extends JFrame {

	private static final long serialVersionUID = 1L;
	//private JPanel contentPane;
	private JTextField campoNik;
    private JPasswordField campoPin;
    private JButton btnLogin;

    public VentanaLoginConductor() {
        setTitle("Login Conductor");
        setSize(300, 180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 5, 5));

        add(new JLabel("NIK:"));
        campoNik = new JTextField();
        add(campoNik);

        add(new JLabel("PIN:"));
        campoPin = new JPasswordField();
        add(campoPin);

        btnLogin = new JButton("Iniciar sesión");
        add(new JLabel()); // celda vacía
        add(btnLogin);

        btnLogin.addActionListener(e -> {
            String nik = campoNik.getText();
            String pin = new String(campoPin.getPassword());

            try {
                GpConductores gpC = new GpConductores(); // si lo tienes como instancia en otro lado, pásalo
                Utilities u = new Utilities();
                Validador v = new Validador();

                Conductor c = gpC.validarLoginConductor(nik, pin, u, v);

                JOptionPane.showMessageDialog(this, "Sesión iniciada correctamente: " + c.getNombre());
                dispose(); // cerrar ventana de login

                // Aquí podrías abrir la siguiente ventana del conductor

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Login fallido", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

}
