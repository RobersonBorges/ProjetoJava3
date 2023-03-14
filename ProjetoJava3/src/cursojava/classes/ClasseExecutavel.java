package cursojava.classes;

import cursojava.classes.Aluno;

public class ClasseExecutavel {
	
	public static void main (String[] args) {
		/* Objeto sendo criado*/
		
		/* o new Aluno(); é uma instancia (criação do objeto)*/
		/* o aluno1 é uma referencia para o objeto aluno*/
		Aluno aluno1 = new Aluno("doutor", 33);
		Aluno aluno2 = new Aluno();
		aluno2.nome = "roberson";
		Aluno aluno3 = new Aluno();
		aluno3.setNome("leo");
		System.out.println("o nome do aluno 3 é: " +aluno3.getNome());
		
		
	}
}
