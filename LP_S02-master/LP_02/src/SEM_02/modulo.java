package SEM_02;

import javax.swing.*;
public class modulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public void suma(int x, int y){
		int r= x+y;
		JOptionPane.showMessageDialog(null, "La suma es: " + r);
	}
	/*public void resta(int x, int y){
		int r=x-y;
		JOptionPane.showMessageDialog(null,"la resta es: "+r);
	}*/
	public int restando(int x, int y){
		int r=x-y;
		return r;
	}
	public int sumando(int x, int y){
		int s= x+y;
		return s;
	}
	public int multi(int x,int y){
		int m = x*y;
		return m;
	}
	public int divi(int x,int y){
		int d = x/y;
		return d;
	}

}
