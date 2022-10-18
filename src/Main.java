public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada ", "Grande", 1.7, TypeOfBody.HATCHBACK);
        Car audi = new Car("Audi ", null, 3.5, TypeOfBody.SEDAN);
        Car bmw = new Car("BMW", "Z8", 3.5, TypeOfBody.CROSSOVER);
        Car kia = new Car("Kia ", "Sportage 4 поколение", 1.6, TypeOfBody.COUPE);

        Bus bus = new Bus("Ик-008", "Икарус", 8.9, Сapacity.BIG);
        Bus bus1 = new Bus("ЖК-008", "Дэу", 9.5, Сapacity.AVERAGE);
        Bus bus2 = new Bus("ПАЗ", "ТР-208", 9.5, Сapacity.ESPECIALLY_SMALL);
        Bus bus3 = new Bus("ЛИАЗ", "ПР-28", 7.5, Сapacity.SMALL);

        Truck truck = new Truck("Газель", "УТ-008", 3.2, LoadCapacity.N2);
        Truck truck1 = new Truck("Toyota", "ST-8", 3.2, LoadCapacity.N3);
        Truck truck2 = new Truck("BMW", "TY=8", 5.4, LoadCapacity.N1);
        Truck truck3 = new Truck("Газель", "УК-28", 9.8, LoadCapacity.N3);

        Driver<Car> vlad = new Driver<>("Владислав", " с водительскими права категории В, ", 20, bmw);
        vlad.startMoving(bmw);
        Driver<Truck> alex = new Driver<>("Александр", " c водительскими права категории С", 15, truck1);
        alex.stay(truck1);
        Driver<Bus> petr = new Driver<>("Петр", " c водительскими правами категории D", 20, bus2);
        petr.refuelTheCar(bus2);

        boolean success = Data.right("yes", "yes", "yes");
        if (success) {
            System.out.println("данные правильные");
        } else {
            System.out.println("данные не правильные");
        }

        passDiagnostics(kia, lada, bmw, audi,
                truck1, truck, truck3, truck2,
                bus, bus1, bus2, bus);

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
        truck2.bestLapTime();
        truck2.pitStop();
        truck2.maxSpeed();
        truck2.determineTheTypeOfCar();
        lada.determineTheTypeOfCar();
        bus2.determineTheTypeOfCar();
        bus3.determineTheTypeOfCar();
        truck2.determineTheTypeOfCar();
        truck3.determineTheTypeOfCar();
        kia.determineTheTypeOfCar();


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

    private static void passDiagnostics (ACar... aCars) {
        for (ACar aCar : aCars) {
           passDiagnosticsACar(aCar);
        }
    }

    private static void passDiagnosticsACar(ACar aCar) {
        try {
            if (!aCar.passDiagnostics()) {
                throw new RuntimeException("Автомобиль " + aCar.getBrand() + " " + aCar.getModel() + "  не прошёл диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }


}
















