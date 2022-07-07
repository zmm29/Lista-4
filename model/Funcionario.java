package model;

public abstract class Funcionario {

	private String cpf;
	private String nome;
	private String endereco;
	private String dataAdmissao;
	private String titulacao;
	private float salarioBase;
	
	public Funcionario(String cpf, String nome, String endereco, String dataAdmissao, String titulacao, float salarioBase) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.dataAdmissao = dataAdmissao;
		this.titulacao = titulacao;
		this.salarioBase = salarioBase;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public String getDataAdmissao() {
		return this.dataAdmissao;
	}
	
	public String getTitulacao() {
		return this.titulacao;
	}
	
	public float getSalarioBase() {
		return this.salarioBase;
	}
	
	public abstract float calculaSalario();
	
//	Não abstrato
//	public float calculaSalario() {
//		return this.salarioBase;
//	}
	
	public String dadosFormatados() {
		return String.format("CPF: %s\nNome: %s\nEndereco: %s\nData de admissao: %s\nTitulacao: %s\nSalario base: R$%.2f\n", this.cpf, this.nome, this.endereco, this.dataAdmissao, this.titulacao, this.salarioBase);
	}
}
