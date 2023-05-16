package Secretaria;

import Secretaria.Aluno;

public class Matricula {
	
	public Matricula(Aluno nome, Curso curso) {
		super();
		setNome(nome);
		setCurso(curso);
	}

	/** Procedimento para validar a matrícula */
	public void setMatricula(String matriculaa) {
		if (matriculaa.matches("[0-9]*")) {
			matricula = matriculaa;
		} else {
			System.out.println("Matrícula inválida\n");
		}
	}

	/** Função para enviar a matrícula */
	public String getMatricula() {
		return matricula;
	}

}