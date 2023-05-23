public class Order extends AbstractEntity {

    private final String orderInfo;

    public Order(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    @Override
    public Object getObject() {
        return new Order(orderInfo);
    }

    @Override
    public boolean processValidation() {
        System.out.println("Order Validation process started: ");
        return true;
    }

    @Override
    public boolean saveInformationRequest(String information) {
        System.out.println("Order information saved: " + information);
        return true;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderInfo='" + orderInfo + '\'' +
                '}';
    }

    @Override
    void addSomeLogic() {
        super.addSomeLogic();
        System.out.println("OrderInfo Json: " + orderInfo);
    }

}
