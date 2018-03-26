//Exercicio 3.12: Modificar a classe Account

public class Account{
    private double balance;//Variável para armazenar o saldo

    public Account(double initialBalance){//Construtor da classe
        if (initialBalance > 0.0){//Confere se o saldo inicial é maior que 0,0
            balance = initialBalance;//Se for, atribui o valor indicado
        }//Se não for, mantém como 0,0 (valor inicial da variável)
    }//Fim do construtor
    
    public double getBalance(){//Getter para o saldo
        return balance;//Retorna o saldo
    }//Fim do getter
    
    public void credit(double amount){//Credita (adiciona) um valor à conta
        balance = balance + amount; //Adiciona o valor ao saldo
    }//Fim do credit

}//Fim da classe Account