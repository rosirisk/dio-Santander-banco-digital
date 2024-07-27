package br.com.dio.bancodigital;

public class ContaCorrente extends Conta implements IConta {
    double emprestimoDisponivel;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.emprestimoDisponivel = 3000;
    }

    @Override
    public void emprestar(double valor) {
        emprestimoDisponivel += valor;
    }
    @Override
    public void imprimirEmprestimo(double valor) {

    }
    @Override
    public void imprimirExtrato() {
        System.out.println("****** Extrato Conta Corrente ******");
        super.imprimirInfosComuns();
        System.out.println("Empréstimo disponível: R$" + emprestimoDisponivel);
    }
}