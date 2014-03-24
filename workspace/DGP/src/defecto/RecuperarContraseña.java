package defecto;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RecuperarContraseña extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecuperarContraseña frame = new RecuperarContraseña();
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
	public RecuperarContraseña() {
		setTitle("Recuperar Contrase\u00F1a");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(97, 72, 211, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		final JLabel succes = new JLabel("");
		JLabel lblNewLabel = new JLabel("Introduzca su correo electr\u00F3nico");
		lblNewLabel.setBounds(97, 47, 292, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnRecuperar = new JButton("Recuperar");
		btnRecuperar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("")){
						succes.setText("No se ha encontrado correo");
				}
				else{
					dispose();
				}
			}
		});
		btnRecuperar.setBounds(146, 138, 135, 23);
		contentPane.add(btnRecuperar);
		
		
		succes.setBounds(135, 103, 254, 14);
		contentPane.add(succes);
	}

}
