package br.com.aluno.pagamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o valor da transação: ");
            double valor = sc.nextDouble();

            System.out.println("Escolha o tipo de pagamento: (1) Cartão | (2) PIX");
            int opcao = sc.nextInt();

            Transacao t;
            if (opcao == 1) {
                t = new CartaoCredito(valor);
            } else {
                t = new Pix(valor);
            }

            Pagamento p = (Pagamento) t;
            p.processarPagamento(valor);
            t.exibirResumo();

        } catch (PagamentoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}