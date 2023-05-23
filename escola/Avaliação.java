package Secretaria;

public class Avaliação {

	private String nome;
	private UnidadeCurricular uniCur;

	/** Construtor */
	public Avaliação(String nome, UnidadeCurricular uniCur) {
		super();
		setAvaliacao(nome);
		setUnidadeCurricular(uniCur);
	}

	/** Procedimento para validar o nome da unidade curricular */
	public void setAvaliacao(String nomee) {
		if (nomee.matches("[A-Za-z\\s]*")) {
			nome = nomee;
		} else {
			System.out.println("Avaliação inválida");
		}
	}

	/** Função para enviar a matrícula */
	public String getAvaliacao() {
		return nome;
	}

	/** Procedimento para validar o curso */
	public void setUnidadeCurricular(UnidadeCurricular uniCur) {
		this.uniCur = uniCur;
	}

}