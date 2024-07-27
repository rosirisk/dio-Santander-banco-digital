package br.com.dio.bancodigital;
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void emprestar(double valor) {

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("****** Extrato Conta Poupança ******");
        super.imprimirInfosComuns();
    }

    @Override
    public void imprimirEmprestimo(double emprestimo) {

    }
}