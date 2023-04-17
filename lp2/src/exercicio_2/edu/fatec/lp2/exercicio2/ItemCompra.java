package exercicio_2.edu.fatec.lp2.exercicio2;

public class ItemCompra implements Calculavel{

    private int quantidade;
    private double desconto;
    private Produto produto;

    public ItemCompra(double desconto, Produto produto) {
        this.desconto = desconto;
        this.produto = produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public double calcularPreco() {
        double preco = this.produto.getPreco() * this.quantidade;
        double valorDesconto = preco * (this.desconto / 100);
        return preco - valorDesconto;
    }

}
