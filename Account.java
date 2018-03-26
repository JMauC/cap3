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

    public void debit(double amount){//Retira um valor da conta
        if(amount <= balance){//Checa se o valor a ser retirado é menor ou igual ao saldo 
            balance = balance - amount;//Se sim, atualiza o saldo retirando o valor indicado
        }else if(amount > balance){//Se for maior que o saldo, avisa que o valor não pôde ser retirado
            System.out.println("Debit amount exceeded account balance\n");
        }//Fim do if/else
    }//Fim do debit

}//Fim da classe Account