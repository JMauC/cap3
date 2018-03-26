//Classe-teste para a classe Account do exercício 3.12

import java.util.Scanner;

public class AccountTest{
    public static void main(String[] args) {//Método main
        Account account1 = new Account(50.00);//Cria o primeiro objeto account
        Account account2 = new Account(-7.53);//Cria o segundo objeto account

        //Exibe o saldo inicial de cada objeto
        System.out.printf("Account1 balance: U$%.2f \n"
            , account1.getBalance());
        System.out.printf("Account2 balance: U$%.2f \n\n"
            , account2.getBalance());

        Scanner input = new Scanner(System.in);//Cria um objeto Scanner para obter entradas do usuário
        double depositAmount;//Quantia a ser depositada pelo usuário

        //Adicionando dinheiro em account1
        System.out.printf("Enter deposit amount for account1: ");//Prompt
        depositAmount = input.nextDouble();//Entrada do usuário
        System.out.printf("\nAdding %.2f to account1 balance\n\n"
            , depositAmount);
        account1.credit(depositAmount);//Adiciona o valor ao saldo de account1

        //Exibe os saldos
        System.out.printf("Account1 balance: U$%.2f \n"
            , account1.getBalance());
        System.out.printf("Account2 balance: U$%.2f \n\n"
            , account2.getBalance());

        //Adicionando dinheiro em account2
        System.out.printf("Enter deposit amount for account2: ");//Prompt #2
        depositAmount = input.nextDouble();//Entrada do usuário
        System.out.printf("\nAdding %.2f to account2 balance\n\n" 
            , depositAmount);
        account2.credit(depositAmount);//Adiciona o valor ao saldo de account2

        //Exibe os saldos
        System.out.printf("Account1 balance: U$%.2f \n"
            , account1.getBalance());
        System.out.printf("Account2 balance: U$%.2f \n"
            , account2.getBalance());

        input.close();
    }
}