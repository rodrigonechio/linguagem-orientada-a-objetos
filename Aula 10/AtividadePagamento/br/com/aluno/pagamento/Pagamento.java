package br.com.aluno.pagamento;

public interface Pagamento {
    double calcularValorFinal(double valor);
    void processarPagamento(double valor) throws PagamentoInvalidoException;
}