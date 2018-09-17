package ejemplos;

import javax.swing.*;
public class Ejercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prom= Integer.parseInt(JOptionPane.showInputDialog("Ingresar promedio"));
		
		if (prom >=13) {
			JOptionPane.showMessageDialog(null, "Alummno aprobado");
		}
		else {
			JOptionPane.showMessageDialog(null, "Alumno desaprobado");
		}

	}

}
