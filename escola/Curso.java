package Secretaria;

import Secretaria.Aluno;

public class Curso {

	private String nome;

	/** Construtor */
	public Curso(String nome) {
		super();
		setNomeCurso(nome);
	}

	/** Procedimento para validar o nome do curso */
	public void setNomeCurso(String nomee) {
		if (nomee.matches("[A-Za-z\\s]*")) {
			nome = nomee;
		} else {
			System.out.println("Curso inválido!");
		}
	}

	/** Função para retornar o nome do curso */
	public String getNomeCurso() {
		return nome;
	}

}