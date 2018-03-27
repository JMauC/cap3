//Exercício 3.15: Criar uma classe para representar uma data

public class Date{
    //Variáveis de instância da classe
    int day, month, year;//Dia, mês e ano são inteiros
    
    public Date(int day, int month, int year){//Construtor da classe
        this.day = day;//Define o dia
        this.month = month;//Define o mês
        this.year = year;//Define o ano
    }//Fim do construtor

    public void displayDate(){//Método para exibição da data
        System.out.printf("%d/%d/%d\n", 
            this.day, this.month, this.year);
    }//Fim de displayDate


    //Setters para cada variável de instância 
    public void setDay(int day){//Setter para o dia
        this.day = day;
    }//Fim do setter

    public void setMonth(int month){//Setter para o mês
        this.month = month;
    }//Fim do setter

    public void setYear(int year){//Setter para o ano
        this.year = year;
    }//Fim do setter


    //Getters para cada variável de instância
    public int getDay(){//Getter para o dia
        return day;
    }//Fim do getter

    public int getMonth(){//Getter para o mês
        return month;
    }//Fim do getter

    public int getYear(){//Getter para o ano
        return year;
    }//Fim do getter
}