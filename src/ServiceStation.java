import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private final Queue<ACar> aCars = new ArrayDeque<>();

    private void add(ACar aCar) {
        aCars.offer(aCar);
    }
    public void addCar(Car car) {
        add(car);
    }

    public void addTruck(Truck truck) {
        add(truck);
    }
        public void service(){
        if (!aCars.isEmpty()){
            ACar aCar= aCars.poll();
            boolean result = aCar.passDiagnostics();
            if (!result) {
                aCar.repairTheCar();
            }
        }

    }}

