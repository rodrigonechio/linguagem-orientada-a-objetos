
package br.com.aluno.pagamento;

public class Pix extends Transacao implements Pagamento {

    public Pix(double valor) {
        super(valor);
    }

    @Override
    public double calcularValorFinal(double valor) {
        // 3% de desconto
        return valor * 0.97;
    }

    @Override
    public void processarPagamento(double valor) throws PagamentoInvalidoException {
        if (valor <= 0) {
            throw new PagamentoInvalidoException("Valor inválido para pagamento via PIX!");
        }
        System.out.println("Pagamento via PIX concluído: R$ " + calcularValorFinal(valor));
    }

    @Override
    public void exibirResumo() {
        System.out.println("Transação via PIX - Valor: R$ " + getValor());
    }
}

