package ejemplos;

import javax.swing.*;
public class Ejercicio_07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  num= Integer.parseInt(JOptionPane.showInputDialog("Ingre un numero"));
		int  num2= Integer.parseInt(JOptionPane.showInputDialog("Ingre otro numero"));
		if (num== num2) {
			int multi =num*num2;
			JOptionPane.showMessageDialog(null, "MULTIPLICACION "+ multi);
		} else {
			int suma =num+num2;
			JOptionPane.showMessageDialog(null, "Suma "+ suma);
		}

	}

}
