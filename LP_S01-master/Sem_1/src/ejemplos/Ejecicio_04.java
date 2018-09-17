package ejemplos;

import javax.swing.*;
public class Ejecicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String numOne = "";
		String numTwo = "";
		int numer1, numer2;
		numOne=JOptionPane.showInputDialog("Ingrese un numero");
		numTwo=JOptionPane.showInputDialog("Ingrese otro numero");
		numer1=Integer.parseInt(numOne);
		numer2=Integer.parseInt(numTwo);
		int Suma = numer1+numer2;
		JOptionPane.showMessageDialog(null, "La suma es : "+Suma);
		*/
		int numer1 =Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
		int numer2 =Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero"));
		int Suma = numer1+numer2;
		JOptionPane.showMessageDialog(null, "La suma es : "+Suma);
	}

}
//sumando dos numeros obtenidos de un mensaje de dialogo