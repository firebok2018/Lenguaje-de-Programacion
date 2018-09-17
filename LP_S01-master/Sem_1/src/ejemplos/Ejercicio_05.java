package ejemplos;

import javax.swing.*;
public class Ejercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precio= Double.parseDouble(JOptionPane.showInputDialog("Ingrese El precio"));
		double igv= precio*0.18;
		JOptionPane.showMessageDialog(null, "PRecio A pags" + igv);
	}

}
