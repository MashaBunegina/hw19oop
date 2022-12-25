import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();
    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "o";
        } else {
            this.model = model;
        }
        this.engineVolume = engineVolume;

    }

    public void addDrivers(Driver<?>... driver) {
        this.drivers.addAll(Arrays.asList(driver));
    }
    public void addMechanic(Mechanic<?>... mechanic) {
        this.mechanics.addAll(Arrays.asList(mechanic));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }
    public abstract void startMoving();

    public abstract void stopMoving();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public abstract void printType();

    public abstract void printCapacity();

    public abstract void printWeight();

    public boolean service() {
        return false;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public void repair() {
    }
}