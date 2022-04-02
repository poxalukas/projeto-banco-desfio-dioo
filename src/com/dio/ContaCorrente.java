package com.dio;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        System.out.println("conta corrente criada com sucesso!");
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("====== Extrato da Conta Corrente ======");
        super.imprimirInfosComuns();
    }

}