package defecto;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class Rregistrarse extends JFrame {

	private JPanel contentPane;
	private JTextField nombrecmp;
	private JTextField contracmp;
	private JTextField rcontracmp;
	private JTextField corrcmp;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rregistrarse frame = new Rregistrarse();
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
	public Rregistrarse() {
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 27, 236, 155);
		contentPane.add(panel);
		
		nombrecmp = new JTextField();
		nombrecmp.setColumns(10);
		nombrecmp.setBounds(10, 11, 86, 20);
		panel.add(nombrecmp);
		
		contracmp = new JTextField();
		contracmp.setColumns(10);
		contracmp.setBounds(10, 41, 106, 20);
		panel.add(contracmp);
		
		rcontracmp = new JTextField();
		rcontracmp.setColumns(10);
		rcontracmp.setBounds(10, 70, 106, 20);
		panel.add(rcontracmp);
		
		corrcmp = new JTextField();
		corrcmp.setColumns(10);
		corrcmp.setBounds(10, 124, 167, 20);
		panel.add(corrcmp);
		
		final JLabel nombre = new JLabel("Nombre");
		nombre.setBounds(126, 14, 46, 14);
		panel.add(nombre);
		
		final JLabel contrasenia = new JLabel("Contrase\u00F1a");
		contrasenia.setBounds(126, 44, 100, 14);
		panel.add(contrasenia);
		
		final JLabel Rcontrasenia = new JLabel("Repita contrase\u00F1a");
		Rcontrasenia.setBounds(126, 73, 100, 14);
		panel.add(Rcontrasenia);
		
		final JLabel correo = new JLabel("Correo electr\u00F3nico");
		correo.setBounds(56, 102, 107, 14);
		panel.add(correo);
		
		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(265, 28, 146, 64);
		contentPane.add(panel_1);
		
		final JRadioButton menor = new JRadioButton("Menor de 18 a\u00F1os");
	
		
		final JRadioButton mayor = new JRadioButton("Mayor de 18 a\u00F1os");
		mayor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mayor.isSelected()&&menor.isSelected()){
					menor.setSelected(false);
				}
			}
		});
		
		menor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mayor.isSelected()&&menor.isSelected()){
					mayor.setSelected(false);
				}
			}
		});
		
		mayor.setBounds(6, 7, 134, 23);
		panel_1.add(mayor);
		
		
		menor.setBounds(6, 33, 134, 23);
		panel_1.add(menor);
		
		final JLabel error = new JLabel("");
		error.setForeground(Color.RED);
		error.setBounds(36, 203, 210, 14);
		contentPane.add(error);
		final JRadioButton rdbtnAdministrador = new JRadioButton("Administrador");
		
		JButton button = new JButton("Registrarse");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nombrecmp.getText().equals("")||contracmp.getText().equals("")||rcontracmp.getText().equals("")||corrcmp.getText().equals("")){
					error.setText("Falta alg�n campo por rellenar");
				}
				else if(!mayor.isSelected()&&(!menor.isSelected())){
					error.setText("No has seleccionado edad");
				}
				else{
					dispose();
				}
				
				
			}
		});
		button.setBounds(76, 228, 117, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Atras");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button_1.setBounds(240, 228, 89, 23);
		contentPane.add(button_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(265, 117, 146, 100);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(20, 56, 98, 23);
		passwordField.setVisible(false);
		panel_2.add(passwordField);
		
		final JLabel lblClave = new JLabel("Clave");
		lblClave.setBounds(20, 37, 46, 14);
		lblClave.setVisible(false);
		panel_2.add(lblClave);
		
		
		rdbtnAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnAdministrador.isSelected()){
					passwordField.setVisible(true);
					lblClave.setVisible(true);
				}
				else{
					passwordField.setVisible(false);
					lblClave.setVisible(false);
				}
			}
		});
		rdbtnAdministrador.setBounds(6, 7, 109, 23);
		panel_2.add(rdbtnAdministrador);
		
		
		
		
	}

}
