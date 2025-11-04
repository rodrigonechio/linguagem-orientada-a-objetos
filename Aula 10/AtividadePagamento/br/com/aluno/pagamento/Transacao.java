package br.com.aluno.pagamento;

public abstract class Transacao {
    private double valor;

    public Transacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract void exibirResumo();
}