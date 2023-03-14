package cursojava.classes;

public class Aluno {
	/* atributos do aluno, caracteristicas*/
	String nome;
	int idade;
	String genero;
	String registroGeral;
	String cpf;
	String nomeMae;
	String nomePai;
	String serieMatriculada;
	String datadaMatricula;
	String nomeEscola;
	
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
	public Aluno () {
		
	}
	/* metodo set e get dos objetos*/
	/*set adiciona ou recebe dados para os atributos */
	/*get resgata ou obtem o valor do atributo*/
	/* metodo set é para adicionar valor ao atributo, o this, é para apontar para o atributo nome*/
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}	
}
