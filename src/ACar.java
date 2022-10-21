import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ACar implements Competing {
    private final String model;
    private final String brand;
    private double engineVolume;

    public List<Driver<?>> getDriver() {
        return driver;
    }

    public List<Mechanic<?>> getMechanic() {
        return mechanic;
    }

    public List<Sponsor> getSponsor() {
        return sponsor;
    }

    private List<Driver<?>> driver = new ArrayList<>();
    private List<Mechanic<?>> mechanic = new ArrayList<>();
    private  List<Sponsor> sponsor = new ArrayList<>();


    public ACar(String model, String brand, double engineVolume) {
        this.model = model;
        this.brand = brand;
        setEngineVolume(engineVolume);

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
        this.engineVolume = engineVolume;
    }

    public void addDriver (Driver<?> driver ){
        this.driver.addAll(Arrays.asList(driver));
    }
    public void addMechanic (Mechanic<?> ... mechanic ) {
        this.mechanic.addAll(Arrays.asList(mechanic));
    }

    public void addMSponsor (Sponsor sponsor){
        this.sponsor.addAll(Arrays.asList(sponsor));
        }
    public abstract void startMoving();

    public abstract void stopMoving();


    public abstract void pitStop();

    public abstract void bestLapTime();

    public abstract void maxSpeed();


    public abstract void determineTheTypeOfCar();

    public abstract boolean passDiagnostics();


    public abstract void repairTheCar();

    public abstract void offer(ACar aCar);
}
