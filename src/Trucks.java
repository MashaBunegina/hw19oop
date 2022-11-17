import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Trucks extends Transport implements Competing{
    private Capacity capacity;

    public Trucks(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }
        public void setCapacity(Capacity capacity) {
            this.capacity = capacity;
        }



    @Override
    public void startMoving() {
        System.out.printf("Начать движение  ",
                this.getBrand(), this.getModel());
    }

    public void stopMoving() {
        System.out.printf("Закончить движение  ",
                this.getBrand(), this.getModel());
    }

    @Override
    public void printType() {

    }

    @Override
    public void printCapacity() {
            if (capacity == null) {
                System.out.println("данных недосаточно");
            } else {
                System.out.println("тип объема" + capacity);
            }
        }

    @Override
    public void printWeight() {

    }


    @Override
    public void pitStop() {
        System.out.printf("пит-стоп  ",
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
