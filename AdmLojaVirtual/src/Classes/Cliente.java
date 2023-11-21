package Classes;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String cpf;
    private String email;
    private ArrayList<Pedido> historicoDePedidos;
    private boolean enviarEmails;

    public Cliente(String nome, String cpf, String email, boolean enviarEmails){
        setNome(nome);
        setCpf(cpf);
        setEmail(email);
        setEnviarEmails(enviarEmails);
        historicoDePedidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Pedido> getHistoricoDePedidos() {
        return historicoDePedidos;
    }

    public void setHistoricoDePedidos(ArrayList<Pedido> historicoDePedidos) {
        this.historicoDePedidos = historicoDePedidos;
    }

    public boolean isEnviarEmails() {
        return enviarEmails;
    }

    public void setEnviarEmails(boolean enviarEmails) {
        this.enviarEmails = enviarEmails;
    }

    public void enviarEmail() {
        System.out.println("E-mail enviado para: " + this.email);
    }

    public void adicionarPedido(Pedido novoPedido) {
        historicoDePedidos.add(novoPedido);
    }
}