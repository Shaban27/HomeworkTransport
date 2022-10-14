public class Bus extends ACar implements Competing {

    @Override
    public String toString() {
        return "Bus{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public Bus(String model, String brand, double engineVolume) {
        super(model, brand, engineVolume);
    }

    public void startMoving() {
        System.out.println("Начать движение с гаража");
    }

    public void stopMoving() {
        System.out.println("Законичить движение в гараже");
    }


    @Override
    public void PitStop() {
        System.out.println(" Поставить автобус на обочине");

    }

    @Override
    public void BestLapTime() {
        System.out.println("Лучшее время автобуса на круге");

    }

    @Override
    public void MaxSpeed() {
        System.out.println("Максимальная скорость автобуса");


    }


}









