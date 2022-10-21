import java.util.*;

import static market.Scratch.randomFiling;

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

        lada.addDriver(new CategorydriverB("Владислав", " с водительскими права категории В, ", 20, lada));
        Mechanic<Car> petra = new Mechanic<Car>("Петра", "Иванов", "Звезда");
        lada.addMechanic(petra);
        Sponsor mobilPlus = new Sponsor<>("Мобил плюс", 80_000);
        lada.addMSponsor(mobilPlus);

        truck1.addDriver(new CategorydriverC("Дмитрий", "водительское удостоверение с категией С", 25, truck1));
        Mechanic<Truck> alexa = new Mechanic<Truck>("Алекса", "Петрова", "Медлайн");
        truck1.addMechanic(alexa);
        Sponsor medlain = new Sponsor<>("Медлайн ", 100_000);
        truck1.addMSponsor(medlain);

        bus2.addDriver(new CategorydriverD("Вячеслав", " с водительским удостоверение категории D", 20, bus2));
        Mechanic<Bus> pablo = new Mechanic<Bus>("Пабло", "Смирнов", "Плюс минус");
        bus2.addMechanic(pablo);
        Sponsor plus = new Sponsor<>("Плюс", 500_000);
        bus.addMSponsor(plus);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(lada);
        serviceStation.addTruck(truck3);
        serviceStation.service();
        serviceStation.service();

        List<ACar> aCars = List.of(lada, truck1, bus2);
        for (ACar aCar : aCars) {
            printInfo(aCar);

        }

        boolean success = Data.right("yes", "yes", "yes");
        if (success) {
            System.out.println("данные правильные");
        } else {
            System.out.println("данные не правильные");
        }
        System.out.println("__________");
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        randomFiling(queue1);
        randomFiling(queue2);
        System.out.println("Первая очередь - " + queue1);
        System.out.println("Вторая очередь - " + queue2);

        add("баба Яга", queue1, queue2);
        System.out.println("Первая очередь - " + queue1);
        System.out.println("Вторая очередь - " + queue2);
        System.out.println("_______________");

        remove("баба Яга", queue1, queue2);
        System.out.println("Первая очередь - " + queue1);
        System.out.println("Вторая очередь - " + queue2);
        System.out.println("______________");


        passDiagnostics(lada, truck1, bus2);
        printInfo(lada, truck1, bus2);
        printInfo(audi, truck1, bus2);
        printInfo(bmw, truck1, bus2);
        printInfo(kia, truck1, bus2);
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

    private static void remove(String name, Queue<String> queue1, Queue<String> queue2) {
    }

    private static void add(String name, Queue<String> queue1, Queue<String> queue2) {

    }

    private static void printInfo(Car car, Truck truck1, Bus bus2) {
        System.out.println(car);

    }

    private static void printInfo(Bus bus) {
        System.out.println(bus);
    }

    private static void printInfo(Truck truck) {
        System.out.println(truck);
    }

    private static void passDiagnostics(ACar... aCars) {
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
 private static void printInfo(ACar aCar) {
     System.out.println("Информация по авто" + aCar.getBrand() + aCar.getModel());
     System.out.println("Водитель - ");
     for (Driver<?> driver : aCar.getDriver()) {
         System.out.println(driver.getNameOfTheDriver());
     }
     System.out.println("Механик - ");
     for (Mechanic<?> mechanic : aCar.getMechanic()) {
         System.out.println(mechanic.getName() + mechanic.getSurname() + mechanic.getCompany());
     }
     System.out.println("Спонсоры - ");
     for (Sponsor sponsor : aCar.getSponsor()) {
         System.out.println(sponsor.getName() + sponsor.getSupportAmount());
     }
     System.out.println();

example();
 }
    private  static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add((i +j)%2==1? "●" : "◯");
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }}}



















