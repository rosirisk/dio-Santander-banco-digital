package br.com.dio.bancodigital;


public class Main {

    public static void main(String[] args) {
        Cliente pedro = new Cliente();
        pedro.setNome("Pedro");

        Conta cc = new ContaCorrente(pedro);
        Conta poupanca = new ContaPoupanca(pedro);


        cc.depositar(1000);
        cc.transferir(200, poupanca);
        cc.emprestar(0);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


        Emprestimo emprestimo = new Emprestimo(pedro);
        emprestimo.imprimirExtrato();
    }
}