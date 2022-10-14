public abstract class ACar implements Competing {
    public String model;
    public String brand;
    public double engineVolume;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public ACar(String model, String brand, double engineVolume) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = model;
        } else {
            this.model = model;
            if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
                this.brand = brand;
            } else {
                this.brand = brand;
            }
            if (engineVolume >0){
                this.engineVolume =0;
            } else {
                this.engineVolume=engineVolume;
            }

        setEngineVolume(engineVolume);

        }
    }

    public abstract void startMoving ();

     public abstract void stopMoving ();


    public abstract void PitStop();

    public abstract void BestLapTime();

    public abstract void MaxSpeed();
}