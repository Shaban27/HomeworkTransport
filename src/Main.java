public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada ", "Grande", 1.7);
        Car audi = new Car("Audi ", null, 3.5);
        Car bmw = new Car("BMW", "Z8", 3.5);
        Car kia = new Car("Kia ", "Sportage 4 поколение", 1.6);

        Bus bus = new Bus("Ик-008", "Икарус", 8.9);
        Bus bus1 = new Bus("ЖК-008", "Дэу", 9.5);
        Bus bus2 = new Bus("ПАЗ", "ТР-208", 9.5);
        Bus bus3 = new Bus("ЛИАЗ", "ПР-28", 7.5);

        Truck truck = new Truck("Газель", "УТ-008", 3.2);
        Truck truck1 = new Truck("Toyota", "ST-8", 3.2);
        Truck truck2 = new Truck("BMW", "TY=8", 5.4);
        Truck truck3 = new Truck("Газель", "УК-28", 9.8);

        Driver<Car> vlad = new Driver<>("Владислав", " с водительскими права категории В, ", 20, bmw);
        vlad.startMoving(bmw);
        Driver<Truck> alex = new Driver<>("Александр", " c водительскими права категории С", 15, truck1);
        alex.stay(truck1);
        Driver<Bus> petr = new Driver<>("Петр", " c водительскими правами категории D", 20, bus2);
        petr.refuelTheCar(bus2);


        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(bus);
        printInfo(bus1);
        printInfo(bus2);
        printInfo(bus3);
        printInfo(truck);
        printInfo(truck1);
        printInfo(truck2);
        printInfo(truck3);
        truck3.startMoving();
        truck3.stopMoving();
        truck2.BestLapTime();
        truck2.PitStop();
        truck2.MaxSpeed();

    }

    private static void printInfo(Car car) {
        System.out.println(car);

    }
    private static void printInfo(Bus bus) {
        System.out.println(bus);
    }

    private static void printInfo(Truck truck) {
        System.out.println(truck);
    }

}





