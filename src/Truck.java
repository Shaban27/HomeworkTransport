public class Truck extends ACar implements Competing {
    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public Truck(String model, String brand, double engineVolume) {
        super(model, brand, engineVolume);

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
    public void PitStop() {
        System.out.println(" Поставить грузовик в бокс");
    }

    @Override
    public void BestLapTime() {
        System.out.println("Лучшее время грузовой машины на круге");

    }

    @Override
    public void MaxSpeed() {
        System.out.println("Максимальная скорость грузового автомобиля");

    }
}






