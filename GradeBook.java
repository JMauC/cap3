//Exercicio 3.11: Modificar a classe GradeBook

public class GradeBook{
    private  String courseName; //Nome do curso

    public GradeBook(String name){//Construtor da classe
        courseName = name; //Inicializa o "livro" com o nome fornecido ao construtor
    }//Fim do construtor

    public void setCourseName(String name){//Setter para a variável courseName
        courseName = name; //Define o nome do curso
    }//Fim do setter

    public String getCourseName(){//getter para a variável courseName
        return courseName;
    }//Fim do getter

    public void displayMessage(){//Exibe uma mensagem de boas-vindas para o usuário
        System.out.printf("Welcome to the GradeBook for\n%s!\n", getCourseName());
        //A função utiliza o getter para exibir o nome do curso na mensagem
    }//Fim do displayMessage
}//Fim da classe GradeBook