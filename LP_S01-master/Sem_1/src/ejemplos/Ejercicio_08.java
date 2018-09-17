package ejemplos;

import javax.swing.*;
public class Ejercicio_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  num= Integer.parseInt(JOptionPane.showInputDialog("Ingre un numero"));
		int  num2= Integer.parseInt(JOptionPane.showInputDialog("Ingre otro numero"));
		int  num3= Integer.parseInt(JOptionPane.showInputDialog("Ingre otro numero mas"));
		
		if (num>num2 && num>num3) {
			JOptionPane.showMessageDialog(null, "El numero mayor es"+num);
		}
		else if (num2>num && num2>num3) {
			JOptionPane.showMessageDialog(null, "El numero mayor es"+num2);
		}
		else {
			JOptionPane.showMessageDialog(null, "El numero mayor es"+num3);
		}

	}

}
