package seminar1_oop;

public class Program {
    public static void main(String[] args) {
        HotBeverage hotbev1 = new HotBeverage(14, "Coffee", 500, 30);
        HotBeverage hotbev2 = new HotBeverage(15, "Tea", 300, 80);
        HotBeverage hotbev3 = new HotBeverage(16, "Cacao", 250, 60);
        HotBeverage hotbev4 = new HotBeverage(17, "Water", 1000, 50);

        VendingMachine vm = new VendingMachineHotBeverage();
        vm.addProduct(hotbev4);
        vm.addProduct(hotbev1);
        vm.addProduct(hotbev2);
        vm.addProduct(hotbev3);

        vm.getProduct("Coffee");
    }
}