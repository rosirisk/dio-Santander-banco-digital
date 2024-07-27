package br.com.dio.bancodigital;

import java.text.MessageFormat;

public class Emprestimo extends ContaCorrente {

    public Emprestimo(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("****** Empréstimo disponível ******");
        super.imprimirInfosComuns();
        System.out.println(MessageFormat.format("Empréstimo disponível: R${0}", + emprestimoDisponivel));
    }

    // Adicione o método para emprestar
    public void emprestar(double valor) {
        saldo += valor;
    }
}