package Secretaria;

public class UnidadeCurricular {

	private String nome;
	private Curso curso;

	/** Construtor */
	public UnidadeCurricular(String nome, Curso curso) {
		super();
		setNomeUC(nome);
		setCurso(curso);
	}

	/** Procedimento para validar o nome da unidade curricular */
	public void setNomeUC(String nomee) {
		if (nomee.matches("[A-Za-z\\s]*")) {
			nome = nomee;
		} else {
			System.out.println("Unidade curricular inválida");
		}
	}

	/** Função para enviar a matrícula */
	public String getNomeUC() {
		return nome;
	}

	/** Procedimento para validar o curso */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}