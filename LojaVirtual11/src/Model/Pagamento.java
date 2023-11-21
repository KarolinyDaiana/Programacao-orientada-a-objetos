package Model;

public class Pagamento {

	private String forma;
	private int parcelamento;
	private double desconto, total, frete;
	private Venda venda;

	public Pagamento(){
		
	}
	
	
	/** Getter e setter para a forma de pagamento */
	public String getForma() {
		if (forma != null) {
			return forma;
		}
		return "Inválido";
	}

	public void setForma(String forma) {
		if (forma.matches("Pix") || forma.matches("Boleto") || forma.matches("Cartão")) {
			this.forma = forma;
		}
	}

	/** Getter e setter para parcelamento */
	public int getParcelamento() {
		if (parcelamento != 0) {
			return parcelamento;
		}
		return 0;
	}

	public void setParcelamento(int parcelamento) {
		if (parcelamento > 0) {
			this.parcelamento = parcelamento;
		}
	}

	/** Getter e setter para o desconto */
	public double getDesconto() {
		if (desconto > 0) {
			return desconto;
		}
		return 0;
	}

	public void setDesconto(double d) {
		if (d > 0) {
			this.desconto = d;
		}
	}

	/** Getter e setter para o total */
	public double getTotal() {
		if(total > 0) {
			return total;
		}
		return 0;
	}

	public void setTotal(double total) {
		if(total > 0) {
			this.total = total;	
		}
	}

	/** Getter e setter para o frete */
	public double getFrete() {
		if(frete >= 0) {
			return frete;
		}
		return 0;
	}

	public void setFrete(double frete) {
		if(frete >= 0) {
			this.frete = frete;	
		}
	}

	/** Getter e setter para a nota fiscal */
	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

}