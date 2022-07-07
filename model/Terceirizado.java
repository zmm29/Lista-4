package model;

public class Terceirizado extends Funcionario {

	private String dataFimContrato;
	private String funcao;
	
	public Terceirizado(String cpf, String nome, String endereco, String dataAdmissao, String titulacao, float salarioBase, String dataFimContrato, String funcao) {
		super(cpf, nome, endereco, dataAdmissao, titulacao, salarioBase);
		this.dataFimContrato = dataFimContrato;
		this.funcao = funcao;
	}
	
	public void setDataFimContrato(String dataFimContrato) {
		this.dataFimContrato = dataFimContrato;
	}
	
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public String getDataFimContrato() {
		return this.dataFimContrato;
	}
	
	public String getFuncao() {
		return this.funcao;
	}
	
	@Override
	public float calculaSalario() {
		if (this.funcao.equalsIgnoreCase("professor") && this.getTitulacao().equalsIgnoreCase("Mestre")) {
			return this.getSalarioBase() + 500f;
		} else if (this.funcao.equalsIgnoreCase("professor") && this.getTitulacao().equalsIgnoreCase("Doutor")) {
			return this.getSalarioBase() + 1000f;
		}
		return this.getSalarioBase();
	}
	
	@Override
	public String dadosFormatados() {
		String dadosFuncionario = super.dadosFormatados();
		String dadosTerceirizado = String.format("Data de fim de contrato: %s\nFuncao: %s", this.dataFimContrato, this.funcao);
		return dadosFuncionario + dadosTerceirizado;
	}
}
