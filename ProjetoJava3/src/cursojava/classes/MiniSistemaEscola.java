package cursojava.classes;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class MiniSistemaEscola {
	public static void main(String[]args) {
		/*instanciando objeto*/
		Aluno aluno1 = new Aluno();
		JOptionPane.showMessageDialog(null, " ****** Mini cadastro Escola *******");
		/*solicitando dados do aluno*/
		String aluno = JOptionPane.showInputDialog("digite o nome do aluno");
		aluno1.setNome(aluno);
		String idade = JOptionPane.showInputDialog("digite a idade");
		aluno1.setIdade(Integer.parseInt(idade));
		String genero = JOptionPane.showInputDialog("digite o genero");
		aluno1.setGenero(genero);
		String rg = JOptionPane.showInputDialog("digite o rg");
		aluno1.setRegistroGeral(rg);
		String cpf = JOptionPane.showInputDialog("digite o cpf");
		aluno1.setCpf(cpf);
		String mae = JOptionPane.showInputDialog("digite o nome da mae");
		aluno1.setNomeMae(mae);
		String pai = JOptionPane.showInputDialog("digite o nome do pai");
		aluno1.setNomePai(pai);
		String serie = JOptionPane.showInputDialog("digite a serie matriculada");
		aluno1.setSerieMatriculada(serie);
		String dataMatricula = JOptionPane.showInputDialog("digite a data da matricula");
		aluno1.setDatadaMatricula(dataMatricula);
		String escola = JOptionPane.showInputDialog("digite o nome da escola");
		aluno1.setNomeEscola(escola);
		/*pergunta se quer ver a media*/
		int pergunta = JOptionPane.showConfirmDialog(null, "quer saber se foi aprovado ?");
		if (pergunta == 0) {
			/* pedindo notas*/
			String primeiraNota = JOptionPane.showInputDialog("digite a primeira nota");
			aluno1.setNota1(Double.parseDouble(primeiraNota));
			String segundaNota = JOptionPane.showInputDialog("digite a segunda nota");
			aluno1.setNota2(Double.parseDouble(segundaNota));
			String terceiraNota = JOptionPane.showInputDialog("digite a terceira nota");
			aluno1.setNota3(Double.parseDouble(terceiraNota));
			String quartaNota = JOptionPane.showInputDialog("digite a quarta nota");
			aluno1.setNota4(Double.parseDouble(quartaNota));
			/* condicionais pra saber se passou ou nao*/
			if (aluno1.getMediaNota() >= 7) {
				JOptionPane.showMessageDialog(null, "parabéns voce passou! sua media foi: "+aluno1.getMediaNota());
				JOptionPane.showMessageDialog(null, "CADASTRO CONCLUIDO, ATÉ MAIS");
			}else {
				JOptionPane.showMessageDialog(null, "que pena, voce nao passou! sua media foi: "+aluno1.getMediaNota());
				JOptionPane.showMessageDialog(null, "CADASTRO CONCLUIDO, ATÉ MAIS");
			}
						
		}else {
			JOptionPane.showMessageDialog(null, "CADASTRO CONCLUIDO, ATÉ MAIS");
		}	
	}
}
