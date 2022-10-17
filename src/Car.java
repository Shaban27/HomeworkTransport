public class Car extends ACar  {

  private TypeOfBody typeOfBody;
    public Car(String model, String brand, double engineVolume, TypeOfBody typeOfBody ) {
                super(model, brand, engineVolume);
                this.typeOfBody=typeOfBody;
        }


    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + getModel() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", engineVolume=" + getEngineVolume() +
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
    public void pitStop() {
        System.out.println(" Поставить машину в гараж");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время автомобиля на круге");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автомобиля");

    }

    @Override
    public void determineTheTypeOfCar() {
        if (typeOfBody==null){
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Тип авто - " +typeOfBody);
        }

    }
}









