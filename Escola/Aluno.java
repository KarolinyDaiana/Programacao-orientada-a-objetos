package Secretaria;

import java.util.Date;

public class Aluno {

	/**
	 * Classe para representar o aluno
	 * 
	 * @author Karoliny Daiana Cieply
	 */

	private String nome, email, responsavel, cpf, numero, endereco;

	public Aluno(String nome) {
		setNome(nome);
	}
	
	public Aluno(String nome, String cpf, String endereco, String numero, String email, String responsavel) {
		setNome(nome);
		setCpf(cpf);
		setEndereco(endereco);
		setNumero(numero);
		setEmail(email);
		setResponsavel(responsavel);
	}

	/* Procedimento para validar o nome */
	public void setNome(String pnome) {
		if (pnome.length() > 0 && pnome.matches("[A-Za-z]*")) {
			nome = pnome;
		} else {
			System.out.println("Nome inválido!\n");
		}
	}

	/* Função para enviar o nome */
	public String getNome() {
		return this.nome;
	}

	/** Procedimento para validar o cpf */
	public void setCpf(String cpff) {
		if (cpff.length() == 11 && cpff.length().matches([0-9] {3})) {
			cpf = cpff;
		} else {
			System.out.println("CPF inválido\n");
		}
	}

	/** Função para enviar o cpf */
	public String getCpf() {
		return cpf;
	}

	/** Procedimento para validar o responsável */
	public void setResponsavel(String responsavell) {
		if (responsavell.matches("[A-Za-z]*")) {
			responsavel = responsavell;
		} else {
			System.out.println("Responsável inválido!\n");
		}
	}

	/** Função para rtornar o responsável */
	public String getResponsavel() {
		return responsavel;
	}

	/** Procedimento para validar o email */
	public void setEmail(String emaill) {
		if (emaill.matches("([a-z0-9.]+[a-z0-9_\\-.]*@[.a-z]*)")) {
			email = emaill;
		} else {
			System.out.println("Email inválido!\n");
		}
	}

	/** Função para retornar o email */
	public String getEmail() {
		return email;
	}
	
	/** Procedimento para validar o número */
	public void setNumero(String numeroo) {
		if(numeroo.matches("(\\([0-9]{2}\\)[0-9]{5}[-]+[0-9]{4})")) {
			numero = numeroo;
		} else {
			System.out.println("Número inválido!\n");
		}
	}
	/** Função para retornar o número */
	public String getNumero() {
		return numero;
	}
	
	/** Procedimento para validar o endereco */
	public void setEndereco(String enderecoo) {
		if (enderecoo.length() > 0) {
			endereco = enderecoo;
		} else {
			System.out.println("Responsável inválido!\n");
		}
	}

	/** Função para rtornar o endereco */
	public String getEndereco() {
		return endereco;
	}
	
}
