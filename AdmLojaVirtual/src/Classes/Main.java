package Classes;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Produto> listaDeProdutos = new ArrayList<>();
    public static ArrayList<Cliente> listaDeClientes = new ArrayList<>();

    public static void main(String[] args) {

        criarProdutos();
        criarClientes();

        for (int i = 0; i < listaDeClientes.size(); i++) {
            Cliente c = listaDeClientes.get(i);
            c.enviarEmail();
            Produto p = listaDeProdutos.get(i);
            if (p.getEstoque() >= i) {
                fazerCompra(c, p, i + 5);
            }
        }
    }

    public static void criarProdutos() {
        Produto p = new Produto(79310, "Notebook", 2299.90, 50);
        listaDeProdutos.add(p);
        Produto p1 = new Produto(10379, "Computador", 3299.90, 25);
        listaDeProdutos.add(p1);
        Produto p2 = new Produto(73190, "Mesa", 299.90, 20);
        listaDeProdutos.add(p2);
    }

    public static void criarClientes() {
        Cliente c = new Cliente("Rodrigo", "123.456.789-01", "rodriguinho@gmail.com", true);
        listaDeClientes.add(c);
        Cliente c1 = new Cliente("João", "098.765.432-10", "joaozinho@hotmail.com", false);
        listaDeClientes.add(c1);
        Cliente c2 = new Cliente("Pedro", "654.321.098-76", "pedrinhomatador@estudante.sc.senai.br", true);
        listaDeClientes.add(c2);
    }

    public static void fazerCompra(Cliente cliente, Produto produto, int quantidade) {
        double precoFinal = produto.getPreco() * quantidade;
        Pagamento pagamento = new Pagamento(precoFinal, "PIX", 1);
        pagamento.calcularValorParcelas();

        Envio envio = new Envio("89.255-123", "Na casa da mãe Joana");

        Pedido novoPedido = new Pedido(123, produto, quantidade, cliente, pagamento, envio);

        cliente.adicionarPedido(novoPedido);

        novoPedido.emitirNotaFiscal();

        produto.removerEstoque(quantidade);

        envio.avisoEntrega();
    }

}
