package defecto;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class InicioSesion extends JFrame {

	private JPanel contentPane;
	private JTextField contraseniaTexto;
	private JPasswordField passwordField;
	private Niño nene;
	private Rregistrarse reg;
	private RecuperarContraseña rp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
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
	public InicioSesion() {
		setTitle("Inicio de Sesi\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 287);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 75, 204, 143);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(224, 75, 189, 103);
		
		final JRadioButton administrador = new JRadioButton("Administrador");
		
		final JRadioButton ninio = new JRadioButton("Ni\u00F1o");
		final JRadioButton adulto = new JRadioButton("Adulto");
		
		administrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(administrador.isSelected()){
					adulto.setEnabled(false);
					ninio.setEnabled(false);
				}
				else{
					adulto.setEnabled(true);
					ninio.setEnabled(true);
				}
			}
		});
		
		ninio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ninio.isSelected()){
					adulto.setEnabled(false);
					administrador.setEnabled(false);
				}
				else{
					adulto.setEnabled(true);
					administrador.setEnabled(true);
				}
			}
		});
		
		adulto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(adulto.isSelected()){
					ninio.setEnabled(false);
					administrador.setEnabled(false);
				}
				else{
					ninio.setEnabled(true);
					administrador.setEnabled(true);
				}
			}
		});
		final JLabel succes = new JLabel("");
		succes.setForeground(Color.RED);
		passwordField = new JPasswordField();
		contraseniaTexto = new JTextField();
		
		JButton login = new JButton("Inisicar Sesi\u00F3n");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nene= new Niño();
				if((!ninio.isSelected()&&!adulto.isSelected()&&!administrador.isSelected())){
					succes.setText("No has seleccionado un rol");
					
				}
					
					else if(contraseniaTexto.getText().equals("")||passwordField.getText().equals("")){
						
					succes.setText("No hay valores en los campos de texto");
					
				}else{
					nene.setVisible(true);
					
					setVisible(false);
				}
				try {
					this.finalize();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		login.setBounds(224, 213, 122, 23);
		
		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setBounds(143, 11, 171, 48);
		lblBienvenido.setFont(new Font("Sylfaen", Font.PLAIN, 36));
		panel_1.setLayout(null);
		
		
		adulto.setBounds(31, 19, 109, 23);
		panel_1.add(adulto);
		
		
		ninio.setBounds(31, 45, 109, 23);
		panel_1.add(ninio);
		
		
		administrador.setBounds(31, 71, 109, 23);
		panel_1.add(administrador);
		contentPane.setLayout(null);
		panel.setLayout(null);
		
		
		contraseniaTexto.setBounds(30, 30, 151, 20);
		panel.add(contraseniaTexto);
		contraseniaTexto.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(83, 11, 68, 14);
		panel.add(lblNombre);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(76, 61, 89, 14);
		panel.add(lblContrasea);
		
		
		passwordField.setBounds(30, 86, 151, 20);
		panel.add(passwordField);
		contentPane.add(panel);
		
		JButton recuperar = new JButton("Recuperar Contrase\u00F1a");
		recuperar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rp= new RecuperarContraseña();
				rp.setVisible(true);
			}
		});
		recuperar.setBounds(10, 117, 194, 23);
		panel.add(recuperar);
		contentPane.add(panel_1);
		contentPane.add(login);
		contentPane.add(lblBienvenido);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reg = new Rregistrarse();
				reg.setVisible(true);
			}
		});
		btnRegistrarse.setBounds(356, 213, 101, 23);
		contentPane.add(btnRegistrarse);
		
		
		succes.setBounds(224, 188, 189, 14);
		contentPane.add(succes);
	}
}
