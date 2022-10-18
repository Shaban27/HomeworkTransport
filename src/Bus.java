public class Bus extends ACar {
    private Сapacity сapacity;

    public Bus(String model, String brand, double engineVolume, Сapacity сapacity) {
        super(model, brand, engineVolume);
        this.сapacity = сapacity;
    }

    public Сapacity getСapacity() {
        return сapacity;
    }

    public void setСapacity(Сapacity сapacity) {
        this.сapacity = сapacity;
    }

    public void startMoving() {
        System.out.println("Начать движение с гаража");
    }

    public void stopMoving() {
        System.out.println("Законичить движение в гараже");
    }

    public void pitStop() {
        System.out.println(" Поставить автобус на обочине");

    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время автобуса на круге");

    }

    @Override
    public String toString() {
        return "Bus{" +
                "model='" + getModel() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                '}';
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса");


    }

    @Override
    public void determineTheTypeOfCar() {
        if (сapacity == null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Вместимость автобуса - от " + сapacity.getFrom() + "чел " + " до " + сapacity.getTo());


        }
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Автобус" + getBrand() + getModel() + "в диагностике не требуется");
        return true;
    }

}















