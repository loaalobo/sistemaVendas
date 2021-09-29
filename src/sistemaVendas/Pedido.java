package sistemaVendas;

import java.util.Scanner;

public class Pedido {
    // Atributos:
    String descricaoDoProduto;
    double valorUnitario;
    int numeroItens;
    int idPedido;

    //Construtores:
    Pedido (){
        Scanner s = new Scanner(System.in);

        System.out.printf("Nome do produto: ");
        this.descricaoDoProduto = s.nextLine();

        System.out.printf("Valor unitário: R$ ");
        this.valorUnitario = s.nextDouble();

        System.out.printf("Quantidade de itens: ");
        this.numeroItens = s.nextInt();

        System.out.printf("Id do pedido: ");
        this.idPedido = s.nextInt();
    }

    Pedido (String d, int n, double v, int id) {
        this.descricaoDoProduto = d;
        this.numeroItens = n;
        this.valorUnitario = v;
        this.idPedido = id;
    }

    // Métodos:
    double Total(){
        return this.numeroItens * this.valorUnitario;
    }
}
