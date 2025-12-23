package general_task_for_oop.task3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> cartItems = new ArrayList<>();

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public void addItem(CartItem cartItem) {
        cartItems.add(cartItem);
    }

    public void removeItem(CartItem cartItem) {
        cartItems.remove(cartItem);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (CartItem item : cartItems) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
