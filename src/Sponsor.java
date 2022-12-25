import java.util.ArrayList;

public class Sponsor {
    private final String name;

    private final int amount;

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;

    }
    public void toSponsorRace(){
        System.out.printf("Спонсор %s проспонсировал заезд на %d5n", name, amount);
    }


}
