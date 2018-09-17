package ejemplos;

import javax.swing.*;
public class Ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		/*while (x<=5) {
			JOptionPane.showMessageDialog(null, "Bienevenido al curso de java");
			x=x+1;
		}
		*/
		do {
			x=x+1;
			JOptionPane.showMessageDialog(null, "Bienevenido al modulo 2");
			//JOptionPane.ERROR_MESSAGE
		} while (x<=5);
		for (int i = 1; i <=5; x=x+1) {
			JOptionPane.showMessageDialog(null, "ARRIA PERU");
		}
	}

}
