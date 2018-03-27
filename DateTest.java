//Classe teste do exercício 3.15

public class DateTest{
    public static void main(String[] args) {
        //Criação dos objetos Date
        Date nascimento = new Date(02, 10, 1998);
        Date hoje = new Date(27, 03, 2018);

        System.out.println("Eu nasci em:");
        nascimento.displayDate();
        System.out.println("\nEsse programa foi escrito em:");
        hoje.displayDate();
    }
}