package conti.javapro2;

import javax.swing.JOptionPane;

public class MiniExercicioTelasMedia {
	public static void main (String[]args) {
		JOptionPane.showMessageDialog(null, "***** SISTEMA DE CALCULO DE MEDIA *****");
		JOptionPane.showMessageDialog(null,"USE '.' p/ notas com meio ponto" );
		/* solicitando valores*/
		String nota1 = JOptionPane.showInputDialog("digite a primeira nota: ");
		String nota2 = JOptionPane.showInputDialog("digite a segunda nota: ");
		String nota3 = JOptionPane.showInputDialog("digite a terceira nota: ");
		/* conversao de string para double*/
		double nota1Num = Double.parseDouble(nota1);
		double nota2Num = Double.parseDouble(nota2);
		double nota3Num = Double.parseDouble(nota3);
		/* media*/
		float mediaFinal = (float) ((nota1Num +nota2Num+nota3Num)/3);
		/*perguntando se quer ver se foi aprovado ou n. */
		JOptionPane.showMessageDialog(null, "sua media final foi: "+mediaFinal);
		int resposta = JOptionPane.showConfirmDialog(null, "gostaria de saber se você foi aprovado?");
		if (resposta == 0) {
			if (mediaFinal < 7) {
				JOptionPane.showMessageDialog(null,"é uma pena, você não passou");
			}else {
				JOptionPane.showMessageDialog(null, "parabéns você passou!!!!");
			}
		}	
	}
}
