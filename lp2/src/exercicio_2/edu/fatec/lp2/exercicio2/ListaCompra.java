package exercicio_2.edu.fatec.lp2.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class ListaCompra {

    private int qtdeMax;
    private List<ItemCompra> itensCompra;

    public ListaCompra(int qtdeMax) {
        this.qtdeMax = qtdeMax;
        this.itensCompra = new ArrayList<>();
    }

    public boolean addItemCompra(ItemCompra itensCompra) {
        if (this.itensCompra.size() < this.qtdeMax) {
            this.itensCompra.add(itensCompra);
            return true;
        }
        return false;
    }

    public double calcularPreco() {
        double precoTotal = 0;
        for (ItemCompra item : this.itensCompra) {
            precoTotal += item.calcularPreco();
        }
        return precoTotal;
    }

    public List<ItemCompra> getItensCompra() {
        return this.itensCompra;
    }

}
