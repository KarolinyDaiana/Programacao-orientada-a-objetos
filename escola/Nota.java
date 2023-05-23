package Secretaria;

public class Nota {

	private Aluno aluno;
	private Avaliação avaliacao;
	private double nota;

	/** Construtor */
	public Nota(Aluno aluno, Avaliação avaliacao, double nota) {
		super();
		setNota(nota);
		setAluno(aluno);
		setAva(avaliacao);
	}

	/** Procedimento para validar a matrícula */
	public void setNota(double notaa) {
		if (notaa >= 0 && notaa <= 10) {
			nota = notaa;
		} else {
			System.out.println("Nota inválida!");
		}
	}

	/** Função para retornar a matrícula */
	public double getNota() {
		return nota;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public void setAva(Avaliação avaliacao) {
		this.avaliacao = avaliacao;
	}

}
