package SEM_02;

import javax.swing.*;
public class EJERCICIO_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String recibir ;
		int opcion;
		
		modulo obj = new modulo();
		recibir = JOptionPane.showInputDialog("¿Que operacion desea Realizar \n1.- Suma \n2.-Resta \n3.-Multiplicacion \n4.-Divición \n5.- Salir" );
		opcion = Integer.parseInt(recibir);
		
		switch (opcion) {
		case 1:
			int dato1= Integer.parseInt(JOptionPane.showInputDialog("Ingre un Numero "));
			int dato2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro Numero"));
			JOptionPane.showMessageDialog(null, "La suma es: "+obj.sumando(dato1,dato2));
			break;

		case 2:
			int num1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero"));
			int num2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro Numero"));
			JOptionPane.showMessageDialog(null, "la resta es: "+obj.restando(num1,num2));
			//obj.resta(num1, num2);
			break;
			
		case 3:
			int nu1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero"));
			int nu2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro Numero"));
			JOptionPane.showMessageDialog(null, "la Multiplicacion es: "+obj.multi(nu1,nu2));
			break;
		case 4:
			int n1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero"));
			int n2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro Numero"));
			JOptionPane.showMessageDialog(null, "la División es: "+obj.divi(n1,n2));
			break;
			
		case 5:
			break;
	}
			
	}

}
