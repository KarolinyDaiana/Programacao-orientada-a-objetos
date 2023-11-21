package Model;

/*
 * @author Karoliny
 */

public class Produto {

	private String nome, avaliacao, modelo;
	private int categoria;
	private String preco;
	private String[] categorias = {"----------", "Calçados", "Roupas", "Acessórios", "Infantil"};

	public Produto() {
		
	}
	
	/** Getter e setter para o nome */
	public String getNome() {
		if (nome != null) {
			return nome;
		} else {
			return "Inválido";
		}
	}

	public void setNome(String nome) {
		if (nome.matches("[A-Za-z]*")) {
			this.nome = nome;
		}
	}

	/** Getter e setter para o preco */
	public String getPreco() {
		if (preco != null) {
			return preco;
		}
		return preco;
	}

	public void setPreco(String d) {
		if (d != null) {
			this.preco = d;
		} else {
			this.preco = "Inválido";
		}
	}

	/** Getter e setter para a categoria */
	public String getCategoria() {
		return categorias[categoria];
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	/** Getter e setter para a avaliacao */
	public String getAvaliacao() {
		if (avaliacao != null) {
			return avaliacao;
		}
		return "Inválido";
	}

	public void setAvaliacao(String avaliacao) {
		if (avaliacao != null) {
			this.avaliacao = avaliacao;
		}
	}

	/** Getter e setter para o modelo */
	public String getModelo() {
		if (modelo != null) {
			return modelo;
		}
		return "Inválido";
	}

	public void setModelo(String modelo) {
		if (modelo.matches("[A-Za-z0-9]*")) {
			this.modelo = modelo;
		}

	}

}