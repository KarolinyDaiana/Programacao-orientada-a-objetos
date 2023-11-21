package Model;

/*
 * @author Karoliny
 */

public class Endereco {

	// ** Atributos */
	private String identificacao, rua, bairro, cidade, uf, numero;

	// ** Construtor */
	public Endereco() {

	}

	// ** Getter e setter para a rua */
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		if (rua.matches("[A-Za-z]*")) {
			this.rua = rua;
		}

	}

	// ** Getter e setter para o cep */
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		if (bairro.matches("[A-Za-z]*")) {
			this.bairro = bairro;
		}

	}

	// ** Getter e setter para a cidade */
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if (cidade.matches("[A-Za-z]*")) {
			this.cidade = cidade;

		}
	}

	// ** Getter e setter para a UF */
	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		if (uf.matches("[A-Z]{2}")) {
			this.uf = uf;
		}

	}

	// ** Getter e setter para o número */
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		if (numero.matches("[0-9]*")) {
			this.numero = numero;
		}

	}

	// ** Getter e setter para a identificação */
	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		if (identificacao.matches("[A-Za-z]*")) {
			this.identificacao = identificacao;
		}

	}

}