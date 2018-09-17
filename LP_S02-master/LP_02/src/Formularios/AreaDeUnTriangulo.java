package Formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AreaDeUnTriangulo extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblBase;
	private JLabel lblAltura;
	private JLabel lblResultado;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JTextField txtResultado;
	private JButton btnCalcular;
	private JButton btnL;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaDeUnTriangulo frame = new AreaDeUnTriangulo();
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
	public AreaDeUnTriangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblBase = new JLabel("Base :");
		lblBase.setBounds(44, 53, 46, 14);
		contentPane.add(lblBase);
		
		lblAltura = new JLabel("Altura :");
		lblAltura.setBounds(44, 91, 46, 14);
		contentPane.add(lblAltura);
		
		lblResultado = new JLabel("Resultado :");
		lblResultado.setBounds(44, 131, 73, 14);
		contentPane.add(lblResultado);
		
		txtBase = new JTextField();
		txtBase.setBounds(120, 50, 86, 20);
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(120, 88, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setEnabled(false);
		txtResultado.setBounds(120, 128, 86, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(this);
		btnCalcular.setBounds(272, 49, 89, 23);
		contentPane.add(btnCalcular);
		
		btnL = new JButton("limpiar");
		btnL.addActionListener(this);
		btnL.setBounds(272, 87, 89, 23);
		contentPane.add(btnL);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(this);
		btnSalir.setBounds(272, 127, 89, 23);
		contentPane.add(btnSalir);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnSalir) {
			actionPerformedBtnSalir(arg0);
		}
		if (arg0.getSource() == btnL) {
			actionPerformedBtnL(arg0);
		}
		if (arg0.getSource() == btnCalcular) {
			actionPerformedBtnCalcular(arg0);
		}
	}
	protected void actionPerformedBtnCalcular(ActionEvent arg0) {
		int b = Integer.parseInt(txtBase.getText());
		int a = Integer.parseInt(txtAltura.getText());
		
		int area= b*a;
		
		txtResultado.setText(""+area);
		//oto
		txtResultado.setText(String.valueOf(area));

	}
	protected void actionPerformedBtnL(ActionEvent arg0) {
		/*txtAltura.remove(null);
		txtBase.requestFocus();
		
		txtResultado.requestFocus();
		txtBase.setText(null);*/
	}
	protected void actionPerformedBtnSalir(ActionEvent arg0) {
		dispose();
	}
}
