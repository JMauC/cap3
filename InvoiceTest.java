//Classe teste do exercício 3.13

import java.util.Scanner;

public class InvoiceTest{
    public static void main(String[] args) {
        //Criação dos objetos Invoice

        Invoice fatura1 = new Invoice("001", "Venda imaginária nº 1", 15, 20.00);
        Invoice fatura2 = new Invoice("002", "Venda imaginária nº 2", 2, 120.00);
        Invoice fatura3 = new Invoice("", "", 0, 0);

        fatura1.showInvoiceInfo();
        fatura2.showInvoiceInfo();
        fatura3.showInvoiceInfo();

        Scanner input = new Scanner(System.in);

        System.out.printf("Now we'll set the new invoice's details\n");
        System.out.printf("Set invoice ID: ");
        fatura3.setId(input.nextLine());
        System.out.printf("Set invoice description: ");
        fatura3.setDescription(input.nextLine());
        System.out.printf("Set invoice quantity: ");
        fatura3.setQuantity(input.nextInt());
        System.out.printf("Set invoice price: ");
        fatura3.setPrice(input.nextDouble());

        System.out.printf("\nHere's how the new invoice looks like: \n");
        fatura3.showInvoiceInfo();

        input.close();
    }
}