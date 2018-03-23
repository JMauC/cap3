//Exercicio 3.11: Modificar a classe GradeBook

public class GradeBook{
    private String courseName; //Nome do curso
    private String instructorName; //Nome do instrutor

    public GradeBook(String course, String instructor){//Construtor da classe
        courseName = course; //Inicializa o "livro" com o nome fornecido ao construtor
        instructorName = instructor;
    }//Fim do construtor

    public void setCourseName(String name){//Setter para a variável courseName
        courseName = name; //Define o nome do curso
    }//Fim do setter

    public String getCourseName(){//Getter para a variável courseName
        return courseName; //Retorna o nome do curso
    }//Fim do getter

    public void setInstructorName(String name){//Setter para a variável instructorName
        instructorName = name; //Define o nome do instrutor
    }//Fim do setter

    public String getInstructorName(){//Getter para a variável instructorName
        return instructorName; //Retorna o nome do instrutor
    }//Fim do getter

    public void displayMessage(){//Exibe uma mensagem de boas-vindas para o usuário
        System.out.printf("Welcome to the GradeBook for\n%s!\n", getCourseName());
        System.out.printf("This course is presented  by: %s\n", getInstructorName());
        //A função utiliza o getter para exibir o nome do curso na mensagem
    }//Fim do displayMessage
}//Fim da classe GradeBook