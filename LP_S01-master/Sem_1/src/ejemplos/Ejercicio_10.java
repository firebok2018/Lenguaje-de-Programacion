package ejemplos;

import javax.swing.*;
public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));
		if (edad>=0 && edad<18) {
			JOptionPane.showMessageDialog(null, "Menor de edad");
		}
		else if (edad>=18 && edad<60) {
			JOptionPane.showMessageDialog(null, "Mayor de edad");
		}
		else {
			JOptionPane.showMessageDialog(null, "Adulto mayor");
		}

	}

}
