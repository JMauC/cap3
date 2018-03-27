//Classe teste do exercício 3.14

public class EmployeeTest{
    public static void main(String[] args) {
        //Criação e inicialização dos dois objetos Employee
        Employee func1 = new Employee("John", "Marston", 954.00);
        Employee func2 = new Employee("Niko", "Bellic", 1500.00);
    
        //Exibindo as informações de cada funcionário
        func1.showEmployeeInfo();
        func2.showEmployeeInfo();

        //Dando o aumento de 10% para cada funcionário
        System.out.println("\nIncreasing each employee's salary in 10%");
        func1.setSalary((func1.salary + (func1.salary * 0.1)));
        func2.setSalary((func2.salary + (func2.salary * 0.1)));
        
        //Exibindo as informações de cada funcionário após o aumento
        func1.showEmployeeInfo();
        func2.showEmployeeInfo();
    }
}