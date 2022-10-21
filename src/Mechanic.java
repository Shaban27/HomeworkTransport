public class Mechanic<A extends ACar> {

    public final String name;
    public final String surname;
    public final String company;
    private A a;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;

    }

    public boolean passDiagnostics(A a) {
        return a.passDiagnostics();

    }

    public void repairTheCar(A a) {
        a.repairTheCar();


    }


    public void add(Mechanic<?> mechanic) {
    }

    @Override
    public String toString() {
        return  name + " " + surname +"  " + company;


    }}


