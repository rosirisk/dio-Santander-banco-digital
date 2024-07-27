package br.com.dio.bancodigital;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void emprestar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();

    void imprimirEmprestimo(double valor);
}