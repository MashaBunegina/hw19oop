import java.util.Objects;

public class Driver<T extends  Transport> {
    private final String FIO;
    public final String driversLicense;
    public final int workExperience;
    private final T car;

    public String getFIO() {
        return FIO;
    }

    public Driver(String FIO, String driversLicense, int workExperience, T car) {
        this.FIO = FIO;
        this.driversLicense = driversLicense;
        this.workExperience = workExperience;
        this.car = car;
    }
    public void startMoving() {
        System.out.println("Начать движение");
    }

    public void stopMoving() {
        System.out.println("Закончить движение");
    }
    public void refil(){
        System.out.println("Заправить авто");
    }


    public void drive(Competing Bus){
        System.out.println("Начать соревнование" );
    }


    public String getDriversLicense() {
        return driversLicense;
    }


    public int getWorkExperience() {
        return workExperience;
    }

    @Override
    public String toString(){
        return FIO + "  стаж вождения:  " + driversLicense + ".  категория:  " + workExperience;
    }
    @Override
    public int hashCode() {
        return Objects.hash(FIO, driversLicense, workExperience, car);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return workExperience == driver.workExperience && Objects.equals(FIO, driver.FIO) && Objects.equals(driversLicense, driver.driversLicense) && Objects.equals(car, driver.car);
    }
}
