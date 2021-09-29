package sistemaVendas;

public class SistemaVendas {

    public static void main(String[] args) {
        System.out.println("\nBEM-VINDO AO SISTEMA DE VENDAS ONLINE \n\nINFORME OS DADOS DO PEDIDO");

        Pessoa p = new Pessoa();
        Funcionario f = new Funcionario();
        Pedido d = new Pedido();
        Cliente c = new Cliente();

        System.out.println("\nRESUMO DA COMPRA \nVendedor: " + f.nome + " | Cliente: " + c.nome + " | Item: " + d.descricaoDoProduto
                + " | Quantidade: " + d.numeroItens + " | Total: " + d.Total());
    }
}
