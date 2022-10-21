import java.util.Arrays;

public class Sponsor<T extends ACar> {
    private String name;
    private final int supportAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSupportAmount() {
        return supportAmount;
    }

    public Sponsor(String name, int supportAmount) {
        this.name = name;
        this.supportAmount = supportAmount;


    }

    public void sponsorARace (){
        System.out.println("Спонсор заезда" + name + supportAmount);
    }

    public void add(Sponsor sponsor) {
    }


    }


