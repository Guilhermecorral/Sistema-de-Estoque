import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Produto> produtos = new ArrayList<Produto>();

    public void addProduct(Produto produto) {
        produtos.add(produto);
    }

    public Produto searchProduct(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
    public void listProducts () {
        if (produtos.isEmpty()) {
            System.out.println("No products found");
            return;
        }
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
