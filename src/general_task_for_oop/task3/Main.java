package general_task_for_oop.task3;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Smartphone", 800.00);

        CartItem item1 = new CartItem(product1, 1);
        CartItem item2 = new CartItem(product2, 2);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);
        System.out.println("Shopping Cart Total Price: " + cart.getTotalPrice());
        cart.removeItem(item1);
        System.out.println("Shopping Cart Total Price after remove \"item1\": " + cart.getTotalPrice());

    }
}
