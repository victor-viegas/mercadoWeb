package model.bean;

import java.util.ArrayList;
import java.util.List;

public class CartSingleton {

    private static CartSingleton instance;
    private List<CartDTO> cartItens;

    private CartSingleton() {
        cartItens = new ArrayList<>();
    }

    public static CartSingleton getInstance() {
        if (instance == null) {
            instance = new CartSingleton();
        }
        return instance;
    }

    public List<CartDTO> getCarrinhoItens() {
        return cartItens;
    }

    public void adicionarItem(CartDTO item) {
        cartItens.add(item);
    }

    public void limparCarrinho() {
        cartItens.clear();
    }
}
