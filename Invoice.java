//Exercício 3.13: Criar uma classe para representar faturas de uma loja
//de informática

public class Invoice{
    String id;//Numero da fatura
    String description;//Descrição da fatura
    int quantity;//Quantidade de itens comprados
    double price;//Preço POR ITEM

    public Invoice(String numero, String descricao, int quantidade, double preco){//Construtor da classe
        id = numero;//Inicializa o numero da fatura
        description = descricao;//Inicializa a descrição da fatura
        
        if(quantidade > 0.0){//Se a quantidade for positiva, incializa a variável com o valor recebido
        quantity = quantidade;
        }//Se for negativa, inicializa como zero
        
        if(preco > 0.0){//Se o preço for positivo, incializa a variável com o valor recebido
        price = preco;
        }//Se for negativo, inicializa como zero
    }//Fim do construtor

    public void showInvoiceInfo(){//Método para exibir detalhes da fatura
        System.out.printf("Invoice ID: %s\nInvoice description: %s\nProduct quantity: %d\nProduct price: %.2f\nInvoice amount: %.2f\n\n"
            , id, description, quantity, price, getInvoiceAmount());
    }//Fim de showInvoiceInfo

    //Getters para cada variável de instância
    public String getId(){//Getter para o número da fatura
        return id;
    }//Fim do getter
    
    public String getDescription(){//Getter para a descrição
        return description;
    }//Fim do getter

    public int getQuantity(){//Getter para a quantidade
        return quantity;
    }//Fim do getter

    public double getPrice(){//Getter para o preço
        return price;
    }//Fim do getter

    public double getInvoiceAmount(){//Método para cálculo do valor final da Invoice
        double finalAmount;

        finalAmount = price * quantity;
        return finalAmount;
    }//Fim de getInvoiceAmount

    //Setters para cada variável de instância
    public void setId(String numero){//Setter para o número da fatura
        id = numero;
    }//Fim do setter

    public void setDescription(String descricao){//Setter para para a descrição
        description = descricao;
    }//Fim do setter

    public void setQuantity(int quantidade){//Setter para a quantidade
        quantity = quantidade;
    }//Fim do setter

    public void setPrice(double preco){//Setter para para o preço
        price = preco;
    }//Fim do setter
}