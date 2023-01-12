import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing {
    private Weight weight;

    public Bus(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @Override
    public void startMoving() {
        System.out.printf("Начать движение  ",
                this.getBrand(), this.getModel());
    }

    public void stopMoving() {
        System.out.printf("Закончить движение ",
                this.getBrand(), this.getModel());
    }

    @Override
    public void printType() {

    }

    @Override
    public void printCapacity() {

    }

    @Override
    public void printWeight() {
        if (weight== null) {
            System.out.println("данных недосаточно");
        } else {
            System.out.println("вместимость" + weight);
        }
    }


    @Override
    public void pitStop() {
        System.out.printf("пит-стоп ",
                this.getBrand(), this.getModel());
    }

    @Override
    public int bestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 100);

    }

    @Override
    public int maxSpeed() {
        {
            return ThreadLocalRandom.current().nextInt(1, 100);

        }
    }
}
