package conti.javapro2;

import javax.swing.JOptionPane;

public class OutroExemploDadosIn {
	public static void main(String[]args) {
		String carros = JOptionPane.showInputDialog("digite o tanto de carros: ");
		String pessoas = JOptionPane.showInputDialog("digite o tanto de pessoas: ");
		
		int carroNumero = (int) Double.parseDouble(carros);
		int pessoasNumero = (int) Double.parseDouble(pessoas);
		
		double divisao = carroNumero / pessoasNumero;
		System.out.println("a divisao deu: " +divisao);
	}

}
