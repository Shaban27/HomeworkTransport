public class Truck extends ACar {

private LoadCapacity loadCapacity;
    public Truck(String model, String brand, double engineVolume, LoadCapacity loadCapacity) {
        super(model, brand, engineVolume);
        this.loadCapacity=loadCapacity;

    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Начать движение с бокса");
    }

    @Override
    public void stopMoving() {
        System.out.println("Законичить движение на базе");

    }

    @Override
    public void pitStop() {
        System.out.println(" Поставить грузовик в бокс");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время грузовой машины на круге");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузового автомобиля");
    }

    @Override
    public void determineTheTypeOfCar() {
        if (loadCapacity==null) {
            System.out.println("Данных недостаточно");
        } else {
            String from = loadCapacity.getFrom() ==null?" " : " от " + loadCapacity.getFrom()+  " т. ";
            String to = loadCapacity.getFrom()== null?  "  "  : " до "+ loadCapacity.getTo() + " т.";
            System.out.println("Грузоподъемность грузовика - " +from + to);


        }

    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() >0.8;
    }


    @Override
    public String toString() {
        return "Truck{" +
                "model='" + getModel() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", engineVolume=" + getEngineVolume() +
               "loadCapacity=" + loadCapacity +
                '}';
    }
}




















