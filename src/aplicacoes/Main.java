package aplicacoes;

import entidades.Produto;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Entre com os dados do produto.");
        System.out.println("Nome do produto: ");
        produto.nomeDoProduto = scanner.nextLine();
        System.out.println("Valor do produto: ");
        produto.valorDoProduto = scanner.nextDouble();
        System.out.println("Quantidade no estoque: ");
        produto.quantidadeDeProdutos = scanner.nextInt();

        System.out.println(produto);

        System.out.println();
        System.out.println("Digite a quantidade de produtos a serem adicionado ao estoque: ");
        int quantidadeParaAdicionar = scanner.nextInt();
        produto.adicionarProdutos(quantidadeParaAdicionar);
        System.out.println("Atualização: \n"+ produto);

        System.out.println();
        System.out.println("Digite a quantidade de produtos a serem removidos do estoque: ");
        int quantidadeParaRemover = scanner.nextInt();
        produto.removerProdutos(quantidadeParaRemover);
        System.out.println("Atualização: "+produto);
    }
}
