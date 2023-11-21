package Classes;
public class Pagamento {

    private double precoFinal;
    private String metodoPagamento;
    private int parcelas;

    public Pagamento(double precoFinal, String metodoPagamento, int parcelas) {
        setPrecoFinal(precoFinal);
        setMetodoPagamento(metodoPagamento);
        setParcelas(parcelas);
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    // o sistema deve permitir o dono da loja virtual dar a bunda

    public void calcularValorParcelas(){
        System.out.println("O valor de cada parcela será: R$" + (precoFinal / parcelas));
    }

}

