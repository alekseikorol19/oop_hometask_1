package seminar1_oop;
public class Product {
    private int cost;
    private String name;

    public Product(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public int getCost() {
        return cost;
    }
    public String getName() {
        return name;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setName(String name) {
        this.name = name;
    }
}
