import java.util.ArrayList;
import java.util.List;

public class Tank extends Storage {

    private static List<Tank> allTanks = new ArrayList<>();

    public Tank(String name, int capacity) {
        super(name, capacity);

        allTanks.add(this);
    }

    public static List<Tank> getAllTanks() {
        return allTanks;
    }
}
