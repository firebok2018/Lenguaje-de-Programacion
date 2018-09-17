package Formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menubar extends JFrame implements ActionListener {
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnEdicin;
	private JMenu mnVer;
	private JMenuItem mntmNuevo;
	private JMenuItem mntmGuardar;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConfigurar;
	private JMenuItem mntmVender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menubar frame = new menubar();
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
	public menubar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		mnArchivo.setIcon(new ImageIcon(menubar.class.getResource("/iconos/folder.png")));
		menuBar.add(mnArchivo);
		
		mntmNuevo = new JMenuItem("Nuevo");
		mntmNuevo.setIcon(new ImageIcon(menubar.class.getResource("/iconos/file.png")));
		mnArchivo.add(mntmNuevo);
		
		mntmGuardar = new JMenuItem("Guardar");
		mntmGuardar.setIcon(new ImageIcon(menubar.class.getResource("/iconos/inspection.png")));
		mnArchivo.add(mntmGuardar);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mntmSalir.setIcon(new ImageIcon(menubar.class.getResource("/iconos/cancel.png")));
		mnArchivo.add(mntmSalir);
		
		mnEdicin = new JMenu("Edici\u00F3n");
		mnEdicin.setIcon(new ImageIcon(menubar.class.getResource("/iconos/settings.png")));
		menuBar.add(mnEdicin);
		
		mntmConfigurar = new JMenuItem("Configurar");
		mntmConfigurar.setIcon(new ImageIcon(menubar.class.getResource("/iconos/engineering.png")));
		mnEdicin.add(mntmConfigurar);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.setIcon(new ImageIcon(menubar.class.getResource("/iconos/shipped.png")));
		mnEdicin.add(mntmVender);
		
		mnVer = new JMenu("Ver");
		mnVer.setIcon(new ImageIcon(menubar.class.getResource("/iconos/fine_print.png")));
		menuBar.add(mnVer);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmSalir) {
			actionPerformedMntmSalir(arg0);
		}
	}
	protected void actionPerformedMntmSalir(ActionEvent arg0) {
		dispose();
	}
}
