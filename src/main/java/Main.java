public class Main {

    public static void main(String[] args) {
        User user = new User("user@gmail.com", "userData");
        Order order = new Order("orderInfo");
        Product product = new Product("productInfo");

        user.updateInformation("newUserData");
        user.updateInformation("newuser@gmail.com");
        order.updateInformation("newOrderInfo");
        product.updateInformation("newProductInfo");
    }

}
