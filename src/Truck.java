public class Truck extends ACar {


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
        public String toString() {
            return "Truck{" +
                    "model='" + getModel() + '\'' +
                    ", brand='" + getBrand() + '\'' +
                    ", engineVolume=" + getEngineVolume() +
                    '}';
        }

    }


















