package Secretaria;

public class Matricula {

	private String codigo;
	private Aluno aluno;
	private Curso curso;

	/** Construtor */
	public Matricula(String codigo, Aluno aluno, Curso curso) {
		super();
		setCodigo(codigo);
		setAluno(aluno);
		setCurso(curso);
	}

	/** Procedimento para validar a matrícula */
	public void setCodigo(String codigoo) {
		if (codigoo.matches("S{1}[0-9]{5}")) {
			codigo = codigoo;
		} else {
			System.out.println("Matrícula inválida");
		}
	}

	/** Função para enviar a matrícula */
	public String getCodigo() {
		return codigo;
	}

	/* Procedimento para validar o aluno */
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	/** Procedimento para validar o nome do curso */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}