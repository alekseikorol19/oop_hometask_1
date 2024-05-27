package seminar1_oop;

import java.util.List;

public class VendingMachineBottleOfWater implements VendingMachine {

    private List<Product> productList;

    @Override
    public void initProducts(List<Product> productsList) {
        this.productList = productsList;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName() == name) {
                return product;
            }
        }
        return null;
    }

    
}