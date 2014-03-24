package defecto;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Registrarse extends JInternalFrame {
	private JTextField Nombre;
	private JTextField Contrasenia;
	private JTextField RContrasenia;
	private JTextField Correo;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrarse frame = new Registrarse();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registrarse() {
		setTitle("Registro");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(57, 237, 89, 23);
		getContentPane().add(btnRegistrarse);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(252, 237, 89, 23);
		getContentPane().add(btnAtras);
		
		JPanel panel = new JPanel();
		panel.setBounds(24, 36, 236, 155);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		Nombre = new JTextField();
		Nombre.setBounds(10, 11, 86, 20);
		panel.add(Nombre);
		Nombre.setColumns(10);
		
		Contrasenia = new JTextField();
		Contrasenia.setBounds(10, 41, 106, 20);
		panel.add(Contrasenia);
		Contrasenia.setColumns(10);
		
		RContrasenia = new JTextField();
		RContrasenia.setBounds(10, 70, 106, 20);
		panel.add(RContrasenia);
		RContrasenia.setColumns(10);
		
		Correo = new JTextField();
		Correo.setBounds(10, 124, 167, 20);
		panel.add(Correo);
		Correo.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(126, 14, 46, 14);
		panel.add(lblNombre);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(126, 44, 100, 14);
		panel.add(lblContrasea);
		
		JLabel lblRepitaContrasea = new JLabel("Repita contrase\u00F1a");
		lblRepitaContrasea.setBounds(126, 73, 100, 14);
		panel.add(lblRepitaContrasea);
		
		JLabel lblCorreoElectrnico = new JLabel("Correo electr\u00F3nico");
		lblCorreoElectrnico.setBounds(56, 102, 107, 14);
		panel.add(lblCorreoElectrnico);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(278, 36, 146, 64);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnMayorDe = new JRadioButton("Mayor de 18 a\u00F1os");
		rdbtnMayorDe.setBounds(6, 7, 134, 23);
		panel_1.add(rdbtnMayorDe);
		
		JRadioButton rdbtnMenorDe = new JRadioButton("Menor de 18 a\u00F1os");
		rdbtnMenorDe.setBounds(6, 33, 134, 23);
		panel_1.add(rdbtnMenorDe);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(277, 111, 147, 76);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
	    passwordField = new JPasswordField();
		passwordField.setBounds(27, 45, 88, 20);
		passwordField.setVisible(false);
		panel_2.add(passwordField);
		
		final JLabel lblClave = new JLabel("Clave");
		lblClave.setBounds(27, 31, 46, 14);
		lblClave.setVisible(false);
		panel_2.add(lblClave);
		
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("Administrador");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton.isSelected()){
					lblClave.setVisible(true);
					passwordField.setVisible(true);
				}
				else{
					lblClave.setVisible(false);
					passwordField.setVisible(false);
				}
			}
		});
		rdbtnNewRadioButton.setBounds(6, 7, 109, 23);
		panel_2.add(rdbtnNewRadioButton);
		
	
		
		JLabel error = new JLabel("");
		error.setBounds(60, 202, 46, 14);
		getContentPane().add(error);

	}

}
