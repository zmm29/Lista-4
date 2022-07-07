package model;

public class Tecnico extends Funcionario {

	private String siape;
	private String departamento;
	
	public Tecnico(String cpf, String nome, String endereco, String dataAdmissao, String titulacao, float salarioBase, String siape, String departamento) {
		super(cpf, nome, endereco, dataAdmissao, titulacao, salarioBase);
		this.siape = siape;
		this.departamento = departamento;
	}
	
	public void setSiape(String siape) {
		this.siape = siape;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getSiape() {
		return this.siape;
	}
	
	public String getDepartamento() {
		return this.departamento;
	}
	
	@Override
	public float calculaSalario() {
		if (this.getTitulacao().equalsIgnoreCase("Mestre")) {
			return this.getSalarioBase() * 1.15f;
		} else if (this.getTitulacao().equalsIgnoreCase("Doutor")) {
			return this.getSalarioBase() * 1.30f;
		}
		return this.getSalarioBase();
	}
	
	@Override
	public String dadosFormatados() {
		String dadosFuncionario = super.dadosFormatados();
		String dadosTecnico = String.format("Siape: %s\nDepartamento: %s", this.siape, this.departamento);
		return dadosFuncionario + dadosTecnico;
	}
}
