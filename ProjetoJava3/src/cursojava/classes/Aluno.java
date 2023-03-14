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
	
	double nota1;
	double nota2;
	double nota3;
	double nota4;
	
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
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}	
	/* metodo que calcula media das notas, pegando os atributos na propria classe*/
	public double getMediaNota() {
		return (nota1+nota2+nota3+nota4)/4;
	}
}
