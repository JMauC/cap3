//Classe-teste para a classe GradeBook

public class GradeBookTest{
    public static void main(  String[] args ){
        //Criação dos objetos GradeBook
        GradeBook gradeBook1 = new GradeBook(
            "CS101 Introduction to Java Programming", "Matt");
        GradeBook gradeBook2 = new GradeBook(
            "CS102 Data Structures in Java", "John");
        
        //Exibe os valores iniciais de cada objeto
        System.out.printf("gradebook1 course name is: %s\n", 
            gradeBook1.getCourseName());
        System.out.printf("gradebook2 course name is: %s\n", 
            gradeBook2.getCourseName());

    }//Fim da main
}//Fim da classe-teste