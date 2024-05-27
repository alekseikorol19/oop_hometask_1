package seminar1_oop;

public class HotBeverage extends BottleOfWater {

    int temperature;

    public HotBeverage(int cost, String name, int volume, int temperature) {
        super(cost, name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
               "name='" + super.getName() + '\'' +
               "volume='" + super.getVolume() + '\'' +
               ", cost=" + super.getCost() + ", temperature=" + this.temperature +
               '}';
    }
}
