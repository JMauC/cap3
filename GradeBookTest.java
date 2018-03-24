//Classe-teste para a classe GradeBook do exercício 3.11

public class GradeBookTest{
    public static void main(  String[] args ){
        //Criação dos objetos GradeBook
        GradeBook gradeBook1 = new GradeBook(
            "CS101 Introduction to Java Programming", "Matt Damon");
        GradeBook gradeBook2 = new GradeBook(
            "CS102 Data Structures in Java", "Keanu Reeves");
        
        //Exibe os valores iniciais de cada objeto
        gradeBook1.displayMessage();
        gradeBook2.displayMessage();

    }//Fim da main
}//Fim da classe-teste