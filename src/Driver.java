public class Driver<D extends ACar & Competing> {

    public String nameOfTheDriver;
    public String havingADriversLicense;
    public int experience;
    private D motorcar;


    public String getNameOfTheDriver() {
        return nameOfTheDriver;
    }

    public void setNameOfTheDriver(String nameOfTheDriver) {
        this.nameOfTheDriver = nameOfTheDriver;
    }

    public String getHavingADriversLicense() {
        return havingADriversLicense;
    }

    public void setHavingADriversLicense(String havingADriversLicense) {
        this.havingADriversLicense = havingADriversLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public D getMotorcar() {
        return motorcar;
    }

    public void setMotorcar(D motorcar) {
        this.motorcar = motorcar;
    }

    public Driver(String nameOfTheDriver, String havingADriversLicense, int experience, D motorcar) {
        if (nameOfTheDriver != null && !nameOfTheDriver.isEmpty() && !nameOfTheDriver.isBlank()) {
            this.nameOfTheDriver = nameOfTheDriver;
        } else {
            this.nameOfTheDriver = nameOfTheDriver;
        }
        if (havingADriversLicense != null && !havingADriversLicense.isEmpty() && !havingADriversLicense.isBlank()) {
            this.havingADriversLicense = havingADriversLicense;
        } else {
            this.havingADriversLicense = havingADriversLicense;
        }
        this.experience = experience;
        if (motorcar != null) {
            this.motorcar = motorcar;
        }
    }

    public void startMoving(Car bmw) {
        System.out.println("Водитель А " + nameOfTheDriver + " управляет автомобилем Б " + motorcar.model + " и будет участвовать в заезде ");
        System.out.println(nameOfTheDriver + havingADriversLicense + "с водительским стажем " +
                experience + " лет" + " начинает движение на автомобиле " + motorcar.getModel() + motorcar.getBrand()
                + " с мощностью двигателя " + motorcar.engineVolume);

    }

    public void stay(Truck truck1) {
        System.out.println(nameOfTheDriver + havingADriversLicense + " с водительским стажем, " + experience + " лет " + " остановит грузовик " +
                motorcar.getModel() + motorcar.getBrand() + " с мощностью двигателя " + motorcar.engineVolume);
    }

    public void refuelTheCar(Bus bus2) {
        System.out.println(nameOfTheDriver + havingADriversLicense + " с водительским стажем, " + experience + " лет " +
                " заправит автобус " + motorcar.getModel() + motorcar.getBrand() + " с мощностью двигателя " + motorcar.engineVolume);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "nameOfTheDriver='" + nameOfTheDriver + '\'' +
                ", havingADriversLicense='" + havingADriversLicense + '\'' +
                ", experience=" + experience +
                ", motorcar=" + motorcar +
                '}';


    }


}

