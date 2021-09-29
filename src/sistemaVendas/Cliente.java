package sistemaVendas;

import java.util.Scanner;

public class Cliente extends Pessoa {
    // Atributo específico da subclasse:
    Pedido idPedido;

    // Construtores:
    Cliente() {
        Scanner s = new Scanner(System.in);

        System.out.printf("Nome do cliente: ");
        this.nome = s.nextLine();
    }

    Cliente(String nome, String cpf, Pedido idPedido) {
        super(nome, cpf);
        this.idPedido = idPedido;
    }

    // Métodos:

}
