//Exercício 3.14: Criar uma classe para representar um funcionário

public class Employee{
    //Variáveis de instância
    String name, surname;//Variáveis para o nome do funcionário
    double salary;//Variável para o salário do funcionário
    
    public Employee(String name, String surname, double salary){//Construtor da classe
        this.name = name;//Inicializa o primeiro nome do funcionário
        this.surname = surname;//Inicializa o sobrenome do funcionário

        if(salary >  0.0){//Confere se o salário é um valor positivo
            this.salary = salary;//Se for positivo, inicializa com o valor dado
        }//Se for negativo, mantém como 0.0
    }//Fim do construtor

    public double getAnnualSalary(){//Método para obter o salário anual(desconsiderando um possível 13º)
        double annualSalary = this.salary * 12;//Atribui o salário * 12 à variável local
        return annualSalary;//Retorna o valor calculado
    }//Fim de getAnnualSalary

    public void showEmployeeInfo(){//Método para exibição das informações de cada funcionário
        System.out.printf("\nEmployee info:\nName: %s\nSurname: %s\nMonthly salary: %.2f\nAnnual salary: %.2f\n"
        , this.name, this.surname, this.salary, this.getAnnualSalary());
    }//Fim de showEmployeeInfo


    //Getters para cada variável de instância
    public String getName(){//Getter para o primeiro nome
        return name;
    }//Fim do getter

    public String getSurname(){//Getter para o sobrenome
        return surname;
    }//Fim do getter

    public double getSalary(){//Getter para o salário
        return salary;
    }//Fim do getter


    //Setters para cada variável de instância
    public void setName(String name){//Setter para o primeiro nome
        this.name = name;
    }//Fim do setter
    
    public void setSurname(String surname){//Setter para o sobrenome
        this.surname = surname;
    }//Fim do setter

    public void setSalary(double salary){//Setter para o salário
        this.salary = salary;
    }//Fim do setter
}