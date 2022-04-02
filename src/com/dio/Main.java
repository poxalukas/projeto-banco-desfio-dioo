package com.dio;

import java.util.Scanner;
import java.io.*;
import java.lang.Thread;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("Lucas");

        Conta cc = new ContaCorrente(c1);
        Conta poupanca = new ContaPoupanca(c1);

        cc.depositar(100);
        cc.transferir(90, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}




//apossivel atualizaçao do programa onde vai ter um menu, e mais responsivo
//public class Main {
//        public static void main(String[] args) {
//            String opcao = "";
//            List<Conta> contas = new ArrayList<Conta>();
//            boolean sair = false;
//
//            Scanner teclado = new Scanner(System.in);
//
//            System.out.println("*------------------------------------------------------------*");
//            System.out.println("|Bem vindo!                                                  |");
//            System.out.println("*------------------------------------------------------------*");
//
//            do{
//
//                System.out.println("*------------------------------------------------------------*");
//                System.out.println("|1 - Criar Conta                                             |");
//                System.out.println("|2 - Sacar                                                   |");
//                System.out.println("|3 - Depositar                                               |");
//                System.out.println("|4 - Transferir                                              |");
//                System.out.println("|9 - Sair                                                    |");
//                System.out.println("*------------------------------------------------------------*");
//                System.out.print("Qual a opção desejada: ");
//                opcao = teclado.nextLine();
//
//                switch (opcao){
//                    case "1":
//                        System.out.println("-> CRIANDO CONTA");
//                        Cliente c1 = new Cliente();
//                        System.out.print("Nome do titular: ");
//                        c1.setNome(teclado.nextLine());
//                        System.out.println("1-Conta corrente");
//                        System.out.println("2-Conta Poupanca");
//                        System.out.print("Informe Tipo da conta: \n1-Conta Corrente\n2-Conta Poupança");
//                        int tipoconta=teclado.nextInt();
//                        Conta conta = new Conta(c1);
//                        contas.add(conta);
//                        break;
//                    case "2":
//                        System.out.print("digite o valor a ser sacado");
//                        double valor=teclado.nextDouble();
//                                c1.sacar(valor);
//                                System.out.println("novo saldo: "+ c1.getSaldo());
//                                try{Thread.currentThread().sleep(1000);}catch (Exception erro){}
//                                break;
//                            case 2:
//                                System.out.print("digite o valor a ser sacado");
//                                double valor=teclado.nextDouble();
//                                poupanca.sacar(valor);
//                                System.out.println("novo saldo: "+ c1.getSaldo());
//                                try{Thread.currentThread().sleep(1000);}catch (Exception erro){}
//                                break;
//                            default:
//                                break;
//                        }
//
//
//                }
//
//
//            }while (!sair);
//
////            c1.setNome("Lucas");
////
////
////            cc.imprimirExtrato();
////            cc.depositar(100);
////            cc.imprimirExtrato();
////
////            cc.transferir(101, poupanca);
////            cc.imprimirExtrato();
////            poupanca.imprimirExtrato();
//        }
//
//    }
//
