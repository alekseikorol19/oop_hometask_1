package seminar1_oop;
import java.util.List;

public interface VendingMachine {

    void initProducts(List<Product> productList);

    void addProduct(Product product);

    Product getProduct(String name);
    
}