import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Trucks extends Transport implements Competing{
    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
        {return ThreadLocalRandom.current().nextInt(1, 100);

        }
    }
}