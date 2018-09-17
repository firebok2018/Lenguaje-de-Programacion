package ejemplos;

import javax.swing.*;
public class Ejercicio_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  num= Integer.parseInt(JOptionPane.showInputDialog("Ingre Su estado Civil  \n 1= soltero \n 2=casasdo"));
		if (num == 1) {
			JOptionPane.showMessageDialog(null, "USted es soltero");
		} else {
			if (num == 2) {
				JOptionPane.showMessageDialog(null, "USted es casado");
			} else {
				JOptionPane.showMessageDialog(null, "Dato no valido");
			}
		}

	}

}
