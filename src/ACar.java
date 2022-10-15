public abstract class ACar implements Competing {
    private final String model;
    private final String brand;
    private double engineVolume;


    public ACar(String model, String brand, double engineVolume) {
        this.model = model;
        this.brand = brand;
        this.engineVolume = engineVolume;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = 0;
        } else {
            this.engineVolume = engineVolume;
        }


    }


    public abstract void startMoving();

    public abstract void stopMoving();


    public abstract void PitStop();

    public abstract void BestLapTime();

    public abstract void MaxSpeed();
}