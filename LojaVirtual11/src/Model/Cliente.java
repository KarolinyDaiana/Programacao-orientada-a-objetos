package Model;

/*
 * @author Karoliny
 */

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cliente {

	// ** Atributos */
	private String nome, cpf, dataNascimento, email, login, senha, telefone;
	private ArrayList<Endereco> enderecos = new ArrayList<Endereco>();

	// ** Construtor */
	public Cliente() {

	}

	public void mostrarDados() {
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nCPF: " + cpf + "\nData de nascimento: " + 
	dataNascimento + "\nLogin: " + login + "\nEmail: " + email + "Telefone: " + telefone);
	}

	public String getNome() {
		if (this.nome != null) {
			return nome;
		} else {
			return "Inválido";
		}

	}

	public void setNome(String nome) {
		if (nome.matches("[A-Za-z]*")) {
			this.nome = nome;
		}
	}

	public String getTelefones() {
		if (telefone != null) {
			return telefone;
		}
		return null;
	}

	public void setTelefones(String telefone) {
		if (telefone.matches("[0-9]{2}[0-9]{5}[-][0-9]{4}")) {
			this.telefone = telefone;

		}
	}

	public String getCpf() {
		if (cpf != null) {
			return cpf;
		} else {
			return "Inválido";
		}
	}

	public void setCpf(String cpf) {
		if (cpf.matches("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}")) {
			this.cpf = cpf;
		}
	}

	public String getDataNascimento() {
		if (dataNascimento != null) {
			return dataNascimento;
		} else {
			return "Inválido";
		}
	}

	public void setDataNascimento(String dataNascimento) {
		if (dataNascimento.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}")) {
			this.dataNascimento = dataNascimento;
		}
	}

	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Endereco enderecos) {
		this.enderecos.add(enderecos);
	}

	public String getEmail() {
		if (email != null) {
			return email;
		} else {
			return "Inválido";
		}
	}

	public void setEmail(String email) {
		if (email.matches("([a-z0-9.]+[a-z0-9_\\\\-]*@[.a-z]*)")) {
			this.email = email;
		}
	}

	public String getLogin() {
		if (login != null) {
			return login;
		}
		return "Inválido";
	}

	public void setLogin(String login) {
		if (login.matches("[A-Za-z]*")) {
			this.login = login;
		}
	}

	public String getSenha() {
		if (senha != null) {
			return senha;
		}
		return "Inválido";
	}

	public void setSenha(String senha) {
		if (senha.matches("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}")) {
			this.senha = senha;
		}
	}

}