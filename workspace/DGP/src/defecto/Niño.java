package defecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class Niño extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Niño frame = new Niño();
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
	public Niño() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 609);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Juego");
		mnNewMenu.setIcon(new ImageIcon("C:\\Users\\lrdzero\\Pictures\\signo-de-interrogacion-imagenes-predisenadas_426288.jpg"));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNuevoJuego = new JMenuItem("Nuevo juego");
		mnNewMenu.add(mntmNuevoJuego);
		
		JMenuItem mntmReseterarPuntuacion = new JMenuItem("Reseterar puntuaci\u00F3n");
		mnNewMenu.add(mntmReseterarPuntuacion);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnNewMenu.add(mntmSalir);
		
		JMenu Ayuda = new JMenu("Ayuda");
		Ayuda.setIcon(new ImageIcon("C:\\Users\\lrdzero\\Pictures\\signo-de-interrogacion-imagenes-predisenadas_426288.jpg"));
		menuBar.add(Ayuda);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sobre el juego");
		Ayuda.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Pistas");
		Ayuda.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(72, 45, 147, 109);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Niño.class.getResource("/Imagenes/donald.jpg")));
		label.setBounds(10, 11, 131, 86);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(72, 178, 147, 109);
		contentPane.add(panel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Niño.class.getResource("/Imagenes/donald.jpg")));
		label_1.setBounds(10, 11, 131, 86);
		panel_1.add(label_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(72, 305, 147, 109);
		contentPane.add(panel_2);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Niño.class.getResource("/Imagenes/donald.jpg")));
		label_2.setBounds(10, 11, 131, 86);
		panel_2.add(label_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(314, 45, 147, 109);
		contentPane.add(panel_3);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Niño.class.getResource("/Imagenes/donald.jpg")));
		label_3.setBounds(10, 11, 131, 86);
		panel_3.add(label_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(314, 178, 147, 109);
		contentPane.add(panel_4);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Niño.class.getResource("/Imagenes/donald.jpg")));
		label_4.setBounds(10, 11, 131, 86);
		panel_4.add(label_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(314, 305, 147, 109);
		contentPane.add(panel_5);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(Niño.class.getResource("/Imagenes/donald.jpg")));
		label_5.setBounds(10, 11, 131, 86);
		panel_5.add(label_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBounds(72, 428, 147, 109);
		contentPane.add(panel_6);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(Niño.class.getResource("/Imagenes/donald.jpg")));
		label_6.setBounds(10, 11, 131, 86);
		panel_6.add(label_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBounds(314, 425, 147, 109);
		contentPane.add(panel_7);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(Niño.class.getResource("/Imagenes/donald.jpg")));
		label_7.setBounds(10, 11, 131, 86);
		panel_7.add(label_7);
	}
}
