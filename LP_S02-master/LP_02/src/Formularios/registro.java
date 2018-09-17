package Formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registro extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblEdad;
	private JComboBox comboBox;
	private JLabel lblSexo;
	private JLabel lblSalario;
	private JTextField txtSalario;
	private JButton btnIngresar;
	private JButton btnSalir;
	private JRadioButton rdbtnMasculino;
	private JRadioButton rdbtnFemenino;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registro frame = new registro();
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
	public registro() {
		setTitle("Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(30, 28, 46, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(96, 25, 310, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(30, 79, 46, 14);
		contentPane.add(lblEdad);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"15-25", "26-35", "36-45"}));
		comboBox.setBounds(163, 76, 107, 20);
		contentPane.add(comboBox);
		
		lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(30, 135, 46, 14);
		contentPane.add(lblSexo);
		
		lblSalario = new JLabel("Salario");
		lblSalario.setBounds(30, 248, 46, 14);
		contentPane.add(lblSalario);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(109, 245, 172, 20);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(67, 324, 89, 23);
		contentPane.add(btnIngresar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setBounds(243, 324, 89, 23);
		contentPane.add(btnSalir);
		/*
		rdbtnMasculino = new JRadioButton("masculino");
		rdbtnMasculino.setBounds(133, 131, 109, 23);
		contentPane.add(rdbtnMasculino);
		
		rdbtnFemenino = new JRadioButton("femenino");
		rdbtnFemenino.setBounds(133, 169, 109, 23);
		contentPane.add(rdbtnFemenino);*/
	
		
		JRadioButton rbtnMasculino= new JRadioButton("txt1", true);
		JRadioButton rbtnFemenino = new JRadioButton("txt2" , false);
		
		rbtnMasculino.setBounds(133, 131, 109, 23);
		rbtnFemenino.setBounds(133, 169, 109, 23);
		
		ButtonGroup genero = new ButtonGroup();
		genero.add(rbtnMasculino);
		genero.add(rbtnFemenino);
		rbtnMasculino.setText("Masculino");
		//rbtnMasculino.setSelected(true);
		rbtnFemenino.setText("Femenino");
		contentPane.add(rbtnFemenino);
		contentPane.add(rbtnMasculino);
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
		
		String name= txtNombre.getText();
		String edad = (String) comboBox.getSelectedItem();
		String genero = rdbtnMasculino.getText();
		double sueldo = Double.parseDouble(txtSalario.getText());
		if (rdbtnMasculino.isSelected()==true) {
			//String genero= "masculino";
			
		}
		
		JOptionPane.showMessageDialog(null, name+" tiene un rango de edad "+edad + ", es de genero "+ genero+ " y tiene un salario de "+ sueldo);
		
	}
	protected void actionPerformedBtnSalir(ActionEvent arg0) {
		dispose();
	}
}
