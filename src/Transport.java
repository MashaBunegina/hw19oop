public abstract class Transport {
    private final String brand;
    private final String model;
    private final  double engineVolume;
    public Transport( String brand,String model, double engineVolume) {
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
    public abstract void startMoving();

    public abstract void stopMoving();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume(){
        return engineVolume;
    }
}
