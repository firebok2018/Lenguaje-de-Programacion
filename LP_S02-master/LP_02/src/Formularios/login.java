package Formularios;

import javax.swing.*;
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

public class login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtUser;
	private JLabel lblUsuario;
	private JLabel lblContrasea;
	private JButton btnIngresar;
	private JButton btnSalir;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUser = new JTextField();
		txtUser.setBounds(162, 57, 141, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		lblUsuario = new JLabel("Usuario :");
		lblUsuario.setBounds(61, 60, 46, 14);
		contentPane.add(lblUsuario);
		
		lblContrasea = new JLabel("Contrase\u00F1a :");
		lblContrasea.setBounds(61, 106, 91, 14);
		contentPane.add(lblContrasea);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(88, 161, 89, 23);
		contentPane.add(btnIngresar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setBounds(248, 161, 89, 23);
		contentPane.add(btnSalir);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(162, 103, 141, 20);
		contentPane.add(txtpassword);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnSalir) {
			actionPerformedBtnSalir(arg0);
		}
		if (arg0.getSource() == btnIngresar) {
			actionPerformedBtnIngresar(arg0);
		}
	}
	protected void actionPerformedBtnIngresar(ActionEvent arg0) {
		String user = txtUser.getText();
		char contra[] = txtpassword.getPassword();	
		String password=new String(contra);
		if (user.equals("alumno") && password.equals("cibertec")) {
			this.dispose();
			JOptionPane.showMessageDialog(null, "Bienvenido al Sistema");
			registro form = new registro();
			form.setLocationRelativeTo(form);
			form.setVisible(true);
		}
		else{
			JOptionPane.showMessageDialog(null, "Usuario y Contraseña incorrectos");
			txtpassword.setText(null);
			txtUser.setText(null);
			txtUser.requestFocus();
			
		}
		
	}
	protected void actionPerformedBtnSalir(ActionEvent arg0) {
		dispose();
	}
}
