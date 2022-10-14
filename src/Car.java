public class Car extends ACar implements Competing {
    public Car(String model, String brand, double engineVolume) {
        super(model, brand, engineVolume);
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    @Override
    public void stopMoving() {
        System.out.println("Законичить движение");
    }

    @Override
    public void startMoving() {
        System.out.println("Начать движение");
    }

    @Override
    public void PitStop() {
        System.out.println(" Поставить машину в гараж");
    }

    @Override
    public void BestLapTime() {
        System.out.println("Лучшее время автомобиля на круге");

    }

    @Override
    public void MaxSpeed() {
        System.out.println("Максимальная скорость автомобиля");

    }
}







