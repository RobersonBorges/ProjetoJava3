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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getSerieMatriculada() {
		return serieMatriculada;
	}
	public void setSerieMatriculada(String serieMatriculada) {
		this.serieMatriculada = serieMatriculada;
	}
	public String getDatadaMatricula() {
		return datadaMatricula;
	}
	public void setDatadaMatricula(String datadaMatricula) {
		this.datadaMatricula = datadaMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}	
	
}
