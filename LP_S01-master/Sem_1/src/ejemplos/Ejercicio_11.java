package ejemplos;

import javax.swing.*;
public class Ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= Integer.parseInt(JOptionPane.showInputDialog("¿Que operacion desea realizar? \n 1.- Suma \n 2.-Resta \n 3.-Multiplicacion \n 4.-Divición"));
		switch (num) {
		case 1:
			JOptionPane.showMessageDialog(null, "UD. a selecionado  suma");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "UD. a selecionado  resta");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "UD. a selecionado  multiplicacion");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "UD. a selecionado  division");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Selecione una opcion correcta");
			break;
		}
	}

}
