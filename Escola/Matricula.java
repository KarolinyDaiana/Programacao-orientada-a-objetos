package Secretaria;

import Secretaria.Aluno;

public class Matricula {
	
	public Matricula(Aluno nome, Curso curso) {
		super();
		setNome(nome);
		setCurso(curso);
	}

	/** Procedimento para validar a matr�cula */
	public void setMatricula(String matriculaa) {
		if (matriculaa.matches("[0-9]*")) {
			matricula = matriculaa;
		} else {
			System.out.println("Matr�cula inv�lida\n");
		}
	}

	/** Fun��o para enviar a matr�cula */
	public String getMatricula() {
		return matricula;
	}

}