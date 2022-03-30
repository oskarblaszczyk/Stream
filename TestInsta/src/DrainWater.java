import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DrainWater extends Event {
    private static List<DrainWater> allDrains = new ArrayList<>();

    public DrainWater(String name, LocalDate date, Storage storage, boolean isSuccessful, int amountOfWater) {
        super(name, date, storage, isSuccessful, amountOfWater);
        allDrains.add(this);
    }

    public static List<DrainWater> getAllDrains() {
        return allDrains;
    }

}
