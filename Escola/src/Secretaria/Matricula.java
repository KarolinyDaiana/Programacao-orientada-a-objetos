package Secretaria;

import Secretaria.Aluno;
import Secretaria.Curso;

public class Matricula {
	
	private String codigo;

	public Matricula(Aluno string, Curso string2) {
		super();
		Aluno alunoo;
		Curso cursoo;
	}

	/** Procedimento para validar a matr�cula */
	public void setCodigo(String codigoo) {
		if (codigoo.matches("[A-Za-z]*{1}[0-9]{5}")) {
			codigo = codigoo;
		} else {
			System.out.println("Matr�cula inv�lida\n");
		}
	}

	/** Fun��o para enviar a matr�cula */
	public String getCodigo() {
		return codigo;
	}

}