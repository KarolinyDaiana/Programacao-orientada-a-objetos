package Secretaria;

import java.util.Date;

public class Aluno {

	/**
	 * Classe para representar o aluno
	 * 
	 * @author Karoliny Daiana Cieply
	 */

	private String nome, email, responsavel, cpf, telefone, endereco;

	public Aluno(String nome) {
		setNome(nome);
	}
	
	public Aluno(String nome, String cpf, String endereco, String telefone, String email, String responsavel) {
		setNome(nome);
		setCpf(cpf);
		setEndereco(endereco);
		setNumero(telefone);
		setEmail(email);
		setResponsavel(responsavel);
	}

	/* Procedimento para validar o nome */
	public void setNome(String pnome) {
		if (pnome.length() > 0 && pnome.matches("[A-Za-z]*")) {
			nome = pnome;
		} else {
			System.out.println("Nome inv�lido!\n");
		}
	}

	/* Fun��o para enviar o nome */
	public String getNome() {
		return this.nome;
	}

	/** Procedimento para validar o cpf */
	public void setCpf(String cpff) {
		if (cpff.length() == 14 && cpff().matches("[0-9]){3}.[0-9]{3}.[0-9]{3}-[0-9]")) {
			cpf = cpff;
		} else {
			System.out.println("CPF inv�lido\n");
		}
	}

	/** Fun��o para enviar o cpf */
	public String getCpf() {
		return cpf;
	}

	/** Procedimento para validar o respons�vel */
	public void setResponsavel(String responsavell) {
		if (responsavell.matches("[A-Za-z]*")) {
			responsavel = responsavell;
		} else {
			System.out.println("Respons�vel inv�lido!\n");
		}
	}

	/** Fun��o para rtornar o respons�vel */
	public String getResponsavel() {
		return responsavel;
	}

	/** Procedimento para validar o email */
	public void setEmail(String emaill) {
		if (emaill.matches("([a-z0-9.]+[a-z0-9_\\-.]*@[.a-z]*)")) {
			email = emaill;
		} else {
			System.out.println("Email inv�lido!\n");
		}
	}

	/** Fun��o para retornar o email */
	public String getEmail() {
		return email;
	}
	
	/** Procedimento para validar o telefone */
	public void setTelefone(String telefonee) {
		if(telefonee.matches("(\\([0-9]{2}\\)[0-9]{5}[-]+[0-9]{4})")) {
			telefone = telefonee;
		} else {
			System.out.println("Telefone inv�lido!\n");
		}
	}
	/** Fun��o para retornar o telefone */
	public String getTelefone() {
		return telefone;
	}
	
	/** Procedimento para validar o endereco */
	public void setEndereco(String enderecoo) {
		if (enderecoo.length() > 0) {
			endereco = enderecoo;
		} else {
			System.out.println("Respons�vel inv�lido!\n");
		}
	}

	/** Fun��o para rtornar o endereco */
	public String getEndereco() {
		return endereco;
	}
	
}
