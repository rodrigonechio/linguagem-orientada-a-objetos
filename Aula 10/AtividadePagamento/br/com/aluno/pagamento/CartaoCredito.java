
package br.com.aluno.pagamento;

public class CartaoCredito extends Transacao implements Pagamento {

    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public double calcularValorFinal(double valor) {
        // 5% de taxa
        return valor * 1.05;
    }

    @Override
    public void processarPagamento(double valor) throws PagamentoInvalidoException {
        if (valor <= 0) {
            throw new PagamentoInvalidoException("Valor inválido para pagamento com cartão!");
        }
        System.out.println("Pagamento com cartão aprovado: R$ " + calcularValorFinal(valor));
    }

    @Override
    public void exibirResumo() {
        System.out.println("Transação via Cartão de Crédito - Valor: R$ " + getValor());
    }
}
