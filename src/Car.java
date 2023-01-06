import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;



public class Car extends Transport implements Competing {
    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void startMoving() {
        System.out.printf("Начать движение  ",
                this.getBrand(), this.getModel());
    }

    public void stopMoving() {
        System.out.printf("Закончить движение    ",
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
        {
            return ThreadLocalRandom.current().nextInt(1, 100);

        }
    }

    public String[] getBodyType() {
        String[] type = new String[bodyType.values().length];
        for (int i = 0; i < type.length; i++) {
            type[i] = bodyType.values()[i].name();

        }
        return type;
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("данных недосаточно");
        } else {
            System.out.println("тип кузова" + bodyType);
        }
    }
           @Override
           public boolean service (){
        return  Math.random() > 0.7;
           }
    @Override
    public void printCapacity() {

    }

    @Override
    public void printWeight() {
    }

                 @Override
        public  void repair(){
                     System.out.println("Машина " + getBrand() + getModel() + "починена");

    }
}