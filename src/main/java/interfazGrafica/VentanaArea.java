package interfazGrafica;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class VentanaArea extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel panel_areas;
	JButton btnConductor;
	JButton btnGestor;
	JButton btnJefatura;
	JButton btnSalir;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					VentanaArea frame = new VentanaArea();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public VentanaArea() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		

		setBounds(100, 100, 189, 216);
		panel_areas = new JPanel();
		panel_areas.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel_areas);
		panel_areas.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		iniciarComponentes();
		setTitle("ÁREAS"); // EN LA BARRA DE LA VENTANA
		setResizable(false); // bloquea el tamaño de la ventana

	}

	private void iniciarComponentes() {

		JLabel lblTituloVentana = new JLabel("Selecciona un área:");
		lblTituloVentana.setFont(new Font("Arial", Font.ITALIC, 12));
		panel_areas.add(lblTituloVentana);

		btnConductor = new JButton("CONDUCTOR");
		btnConductor.addActionListener(this);
		panel_areas.add(btnConductor);

		btnGestor = new JButton("GESTOR");
		btnGestor.addActionListener(this);
		panel_areas.add(btnGestor);

		btnJefatura = new JButton("JEFATURA");
		btnJefatura.addActionListener(this);
		panel_areas.add(btnJefatura);

		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setOpaque(true);
		btnSalir.setContentAreaFilled(true);
		btnSalir.setBackground(new Color(255, 182, 193));
		panel_areas.add(btnSalir);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnConductor == e.getSource()) {
			VentanaLoginConductor vlc = new VentanaLoginConductor();
			vlc.setVisible(true);
		} else if (btnGestor == e.getSource()) {

		} else if (btnJefatura == e.getSource()) {

		} else if (btnSalir == e.getSource()) {
			dispose(); // o System.exit(0);
		}

	}

}
