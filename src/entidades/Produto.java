package entidades;

public class Produto {
    public String nomeDoProduto;
    public double valorDoProduto;
    public int quantidadeDeProdutos;

    public double valorTotalDeProdutos() {
        return valorDoProduto * quantidadeDeProdutos;
    }

    public void adicionarProdutos(int quantidadeDeProdutos) {
        this.quantidadeDeProdutos += quantidadeDeProdutos;
    }

    public void removerProdutos(int quantidadeDeProdutos) {
        this.quantidadeDeProdutos -= quantidadeDeProdutos;
    }

    @Override
    public String toString() {
        return "Dados do produto: "
                + nomeDoProduto
                + ", $ "
                + String.format("%.2f", valorDoProduto)
                + ", "
                + quantidadeDeProdutos
                + " unidades, total: $ "
                + String.format("%.2f", valorTotalDeProdutos());
    }
}
