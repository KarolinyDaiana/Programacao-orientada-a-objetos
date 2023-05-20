package Secretaria;

import Secretaria.Aluno;

public class Curso {

	private String nome;
	
	public Curso(String nome) {
		super();
		setNome(nome);
	}
	
	/** Porcedimento para validar o nome do curso */
	public void setNomeCurso(String nomee) {
		if(cursoo.matches("[A-Za-z\\s]*")) {
			nome = nomee;
		} else {
			System.out.println("Curso inv�lido!\n");
		}
	}
	
	/** Fun��o para retornar o nome do curso */
	public String getNomeCurso() {
		return nome;
	}
	
}