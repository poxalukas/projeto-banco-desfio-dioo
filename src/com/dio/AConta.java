package com.dio;

public interface AConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, AConta contaDestino);

    void imprimirExtrato();
}