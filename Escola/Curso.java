package Secretaria;

import Secretaria.Aluno;

public class Curso {

	private String curso;
	
	public Curso(String curso) {
		super();
		setCurso(curso);
	}
	
	/** Porcedimento para validar o nome do curso */
	public void setCurso(String cursoo) {
		if(cursoo.matches("[A-Za-z\\s]*")) {
			curso = cursoo;
		} else {
			System.out.println("Curso inv�lido!\n");
		}
	}
	
	/** Fun��o para retornar o nome do curso */
	public String getCurso() {
		return curso;
	}
	
}