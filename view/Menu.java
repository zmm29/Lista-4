package view;

import java.util.Scanner;

import model.Docente;
import model.Tecnico;
import model.Terceirizado;

public class Menu {
	
	private String cpf;
	private String nome;
	private String endereco;
	private String dataAdmissao;
	private String titulacao;
	private float salarioBase;
	private Scanner in;

	public Menu() {
		in = new Scanner(System.in);
	}
	
	private void dadosFuncionario() {
		System.out.print("CPF: ");
		cpf = in.nextLine();
		System.out.print("Nome: ");
		nome = in.nextLine();
		System.out.print("Endereco: ");
		endereco = in.nextLine();
		System.out.print("Data de admissao: ");
		dataAdmissao = in.nextLine();
		System.out.print("Titulacao: ");
		titulacao = in.nextLine();
		System.out.print("Salario base: ");
		salarioBase = Float.parseFloat(in.nextLine());
	}
	
	public Docente dadosDocente() {
		this.dadosFuncionario();
		System.out.print("Siape: ");
		String siape = in.nextLine();
		System.out.print("Area: ");
		String area = in.nextLine();
		Docente d = new Docente(cpf, nome, endereco, dataAdmissao, titulacao, salarioBase, siape, area);
		return d;
	}
	
	public Tecnico dadosTecnico() {
		this.dadosFuncionario();
		System.out.print("Siape: ");
		String siape = in.nextLine();
		System.out.print("Departamento: ");
		String departamento = in.nextLine();
		Tecnico t = new Tecnico(cpf, nome, endereco, dataAdmissao, titulacao, salarioBase, siape, departamento);
		return t;
	}
	
	public Terceirizado dadosTerceirizado() {
		this.dadosFuncionario();
		System.out.print("Data de fim de contrato: ");
		String dataFimContrato = in.nextLine();
		System.out.print("Funcao: ");
		String funcao = in.nextLine();
		Terceirizado t = new Terceirizado(cpf, nome, endereco, dataAdmissao, titulacao, salarioBase, dataFimContrato, funcao);
		return t;
	}
	
	public int mainMenu() {
		System.out.println("*** Escolha uma opcao ***");
		System.out.println("[1] - Cadastrar um novo funcionario (Docente, Tecnico ou Terceiro)");
		System.out.println("[2] - Pesquisar por um funcionario e retornar todos os seus dados");
		System.out.println("[3] - Listar todos os funcionarios com todos os seus dados");
		System.out.println("[0] - Sair");
		int opcao = Integer.parseInt(in.nextLine());
		return opcao;
	}
	
	public int menuFuncionario() {
		System.out.println("*** Informe o tipo de funcionario ***");
		System.out.println("[1] - Docente");
		System.out.println("[2] - Tecnico");
		System.out.println("[3] - Terceirizado");
		System.out.println("[0] - Sair");
		int tipo = Integer.parseInt(in.nextLine());
		return tipo;
	}
	
	public String nomeFuncionario() {
		System.out.print("Informe o nome do funcionario: ");
		String nome = in.nextLine();
		return nome;
	}
	
	public void close() {
		in.close();
	}
}
