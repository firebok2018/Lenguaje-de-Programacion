package Formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Formularios.*;



public class Calculadora extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtNumer1;
	private JTextField txtNumer2;
	private JTextField txtS;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton btnLimpiar;
	private JButton btnSalir;
	private JLabel lblPrimerNumero;
	private JLabel lblSegundoNumero;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	
	
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNumer1 = new JTextField();
		txtNumer1.setBounds(158, 45, 86, 20);
		contentPane.add(txtNumer1);
		txtNumer1.setColumns(10);
		
		txtNumer2 = new JTextField();
		txtNumer2.setBounds(158, 79, 86, 20);
		contentPane.add(txtNumer2);
		txtNumer2.setColumns(10);
		
		txtS = new JTextField();
		txtS.setEnabled(false);
		txtS.setBounds(158, 119, 86, 20);
		contentPane.add(txtS);
		txtS.setColumns(10);
		
		button = new JButton("*");
		button.addActionListener(this);
		button.setForeground(Color.BLACK);
		button.setBounds(59, 210, 57, 23);
		contentPane.add(button);
		
		button_1 = new JButton("-");
		button_1.addActionListener(this);
		button_1.setBounds(162, 210, 57, 23);
		contentPane.add(button_1);
		
		button_2 = new JButton("/");
		button_2.addActionListener(this);
		button_2.setBounds(256, 210, 57, 23);
		contentPane.add(button_2);
		
		button_3 = new JButton("+");
		button_3.addActionListener(this);
		button_3.setBounds(340, 210, 57, 23);
		contentPane.add(button_3);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setBounds(291, 78, 89, 23);
		contentPane.add(btnLimpiar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setBounds(291, 118, 89, 23);
		contentPane.add(btnSalir);
		
		lblPrimerNumero = new JLabel("Primer Numero");
		lblPrimerNumero.setBounds(31, 48, 106, 14);
		contentPane.add(lblPrimerNumero);
		
		lblSegundoNumero = new JLabel("Segundo numero");
		lblSegundoNumero.setBounds(21, 82, 116, 14);
		contentPane.add(lblSegundoNumero);
		
		lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(53, 122, 73, 14);
		contentPane.add(lblResultado);
	}

	modulo calc = new modulo();
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == button_3) {
			actionPerformedButton_3(arg0);
		}
		if (arg0.getSource() == button_2) {
			actionPerformedButton_2(arg0);
		}
		if (arg0.getSource() == button_1) {
			actionPerformedButton_1(arg0);
		}
		if (arg0.getSource() == btnSalir) {
			actionPerformedBtnSalir(arg0);
		}
		if (arg0.getSource() == btnLimpiar) {
			actionPerformedBtnLimpiar(arg0);
		}
		if (arg0.getSource() == button) {
			actionPerformedButton(arg0);
		}
	}
	
	
	
	protected void actionPerformedButton(ActionEvent arg0) {
		int num= Integer.parseInt(txtNumer1.getText());
		int num2= Integer.parseInt(txtNumer2.getText());
		
		txtS.setText(""+calc.multi(num, num2));
	}
	protected void actionPerformedBtnLimpiar(ActionEvent arg0) {
		txtNumer1.setText(null);
		txtNumer2.setText(null);
		txtS.setText(null);
		txtNumer1.requestFocus();
	}
	protected void actionPerformedBtnSalir(ActionEvent arg0) {
	
		
		
	}
	protected void actionPerformedButton_1(ActionEvent arg0) {
		int num= Integer.parseInt(txtNumer1.getText());
		int num2= Integer.parseInt(txtNumer2.getText());
		
		txtS.setText(""+calc.resta(num, num2));
	}
	protected void actionPerformedButton_2(ActionEvent arg0) {
		int num= Integer.parseInt(txtNumer1.getText());
		int num2= Integer.parseInt(txtNumer2.getText());
		
		txtS.setText(""+calc.divi(num, num2));
	}
	protected void actionPerformedButton_3(ActionEvent arg0) {
		int num= Integer.parseInt(txtNumer1.getText());
		int num2= Integer.parseInt(txtNumer2.getText());
		
		txtS.setText(""+calc.sumar(num, num2));
	}
}
