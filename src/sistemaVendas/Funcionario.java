package sistemaVendas;

import java.util.Scanner;

public class Funcionario extends Pessoa{
    // Atributo específico da subclasse:
    int matricula;

    // Construtores:
    Funcionario() {
        Scanner s = new Scanner(System.in);

        System.out.printf("Vendedor: ");
        this.nome = s.nextLine();
    }

    Funcionario(String nome, String cpf, int matricula){
        super(nome, cpf);
        this.matricula = matricula;
    }

    // Métodos:

}
