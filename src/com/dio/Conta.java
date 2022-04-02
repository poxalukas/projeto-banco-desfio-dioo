package com.dio;

public abstract class Conta implements AConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

//    public String getTipoconta() {
//        if(conta==1) {
//            return "conrrente";
//        }else{
//            return "poupanca";
//        }
//    }

    public void setTipoconta(int tipoconta) {
        this.tipoconta = tipoconta;
    }

    private int tipoconta;

    public Conta(Cliente cliente) {
        this.tipoconta = tipoconta;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("depositado com sucesso o valor de " +valor+ " reais na conta "+this.numero);
    }

    @Override
    public void transferir(double valor, AConta contaDestino) {
        System.out.println("verificando saldo...");
        if(valor<saldo){
            if(contaDestino!=null){
                this.sacar(valor);
                contaDestino.depositar(valor);
                System.out.println("valor foi transferido com sucesso, novo saldo de "+this.saldo);
            }else System.out.println("conta nao existe");
        }else System.out.println("Saldo insuficiente");
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        //System.out.println(String.format("Saldo: %.2f", /*getTipoconta*/()));
    }

//    @Override
//    public void imprimirExtrato() {
//        System.out.println("===== Extrato da Conta Poupança =====");
//        super.imprimirInfosComuns();
//    }
//}
}