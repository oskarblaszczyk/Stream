import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AddWater extends Event{
    private static List<AddWater> allAddWater = new ArrayList<>();

    public AddWater(String name, LocalDate date, Storage storage, boolean isSuccessful, int amountOfWater) {
        super(name, date, storage, isSuccessful, amountOfWater);
        allAddWater.add(this);
    }


    public static List<AddWater> getAllAddWater() {
        return allAddWater;
    }
}
