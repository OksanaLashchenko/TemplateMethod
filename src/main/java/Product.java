public class Product extends AbstractEntity {

    private final String productInfo;

    public Product(String productInfo) {
        this.productInfo = productInfo;
    }

    @Override
    public Object getObject() {
        return new Product(productInfo);
    }

    @Override
    public boolean processValidation() {
        System.out.println("Product Validation process started: ");
        int validationCode = (int) (Math.random() * 2);
        if (validationCode == 1) {
            System.out.println("Validation passed. Code: " + validationCode);
            return true;
        } else {
            System.out.println("Validation not passed. Sending message to the administartor...");
            return false;
        }
    }

    @Override
    public boolean saveInformationRequest(String information) {
        System.out.println("Product information saved: " + information);
        return true;
    }

}
