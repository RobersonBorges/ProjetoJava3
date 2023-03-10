package conti.javapro2;

import javax.swing.JOptionPane;
/* a classe JOptionPane é melhor para ser usada em grafico.*/
public class OutroExemploDadosIn {
	public static void main(String[]args) {
		String carros = JOptionPane.showInputDialog("digite o tanto de carros: ");
		String pessoas = JOptionPane.showInputDialog("digite o tanto de pessoas: ");
		/* as duas proximas linhas, convertem a entrada de string acima, para 
		   numero inteiro.*/
		int carroNumero = (int) Double.parseDouble(carros);
		int pessoasNumero = (int) Double.parseDouble(pessoas);
		
		double divisao = carroNumero / pessoasNumero;
		JOptionPane.showMessageDialog(null, "a divisao deu: " +divisao);
	}

}
