package Secretaria;

import java.util.Date;

public class Aluno {
	
	/**Classe para representar o aluno
	 * @author Karoliny Daiana Cieply
	 */

	private String nome, endereco, email, responsavel, matricula, cpf;
	private Date dataNascimento;
	private int numero;

	/* Procedimento para validar o nome */
	public void setNome(String pnome) {
		if (pnome.length() > 2 && pnome.matches("[A-Za-z]*")) {
			nome = pnome;
		} else {
			System.out.println("Nome inválido!\n");
		}
	}
	/* Função para enviar o nome */
	public String getNome() {
		return nome;
	}

	/** Procedimento para validar o cpf */
	public void setCpf(String cpff) {
		if (cpff.length() == 11) {
			cpf = cpff;
		} else {
			System.out.println("CPF inválido\n");
		}
	}
	/** Função para enviar o cpf */
	public String getCpf() {
		return cpf;
	}

	/** Procedimento para validar a matrícula */
	public void setMatricula(String matriculaa) {
		if (matriculaa.length() == 10) {
			matricula = matriculaa;
		} else {
			System.out.println("Matrícula inválida\n");
		}
	}
	/** Função para enviar a matrícula */
	public String getMatricula() {
		return matricula;
	}
	
	/** Procedimento para validar o responsável */
	public void setResponsavel(String responsavell) {
		if(responsavell.matches("[A-Za-z]*")) {
			responsavel = responsavell;
		} else {
			System.out.println("Responsável inválido!");
		}
	}
	/** Função para rtornar o responsável */
	public String getResponsavel() {
		return responsavel;
	}

}