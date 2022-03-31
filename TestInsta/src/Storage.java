import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Storage {
    private String name;
    private int capacity;
    private int actualFill;
    private List<Event> events = new ArrayList<>();
    private static List<Storage> allStorages = new ArrayList<>();

    public Storage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;

        allStorages.add(this);
    }

    public void addWater(int amount) {
        if (amount <= capacity - actualFill) {
            new AddWater("addWater", LocalDate.now(), this, true, amount);
            actualFill += amount;
        } else {
            new AddWater("addWater", LocalDate.now(), this, false, amount);
        }
    }

    public void drainWater(int amount) {
        if (amount <= actualFill) {
            new DrainWater("drainWater", LocalDate.now(), this, true, amount);
            actualFill -= amount;
        } else {
            new DrainWater("drainWater", LocalDate.now(), this, false, amount);
        }
    }


    public void addWaterFrom(Storage storage, int amount) {
        if (amount <= capacity - actualFill && amount <= storage.getActualFill()) {
            storage.drainWater(amount);
            addWater(amount);
            System.out.println("przelano wode");
        }else{
            System.out.println("nie przelano wody");
        }
    }

    public static Storage mostWater(List<Storage> storages) {
        if (storages == null || storages.isEmpty()) {
            throw new IllegalArgumentException("Nie moze byc null");
        }
        Storage storage = storages.get(0);
        int tempFill = storage.actualFill;
        for (Storage s : storages) {
            if (s.actualFill > tempFill) {
                storage = s;
                tempFill = s.actualFill;
            }
        }
        return storage;
    }

    public static Storage mostWater2(List<Storage> storages) {
        Storage result = storages
                .stream()
                .max(Comparator.comparing(Storage::getActualFill))
                .get();
        return result;
    }

    public static Storage mostFilled(List<Storage> storages) {
        Storage result = storages
                .stream()
                .min((s1, s2) -> (s1.actualFill * 100) / s1.getCapacity())// ja nie wiem co robie s1 ? s2?
                .get();
        return result;
    }

    public static List<Storage> allEmptyStorages(List<Storage> storages) {
        List<Storage> result = storages
                .stream()
                .filter(storage -> storage.actualFill == 0)
                .collect(Collectors.toList());

        return result;
    }

    public boolean verivyState() {
        int countOf = 0;
        for (Event event : getEvents()) {
            if(event.isSuccesfull() && event.getName().equals("addWater")){
                countOf += event.getAmountOfWater();
            }else if(event.isSuccesfull() && event.getName().equals("drainWater")){
                countOf -= event.getAmountOfWater();
            }
        }
        return (countOf == actualFill);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getActualFill() {
        return actualFill;
    }

    public void setActualFill(int actualFill) {
        this.actualFill = actualFill;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static List<Storage> getAllStorages() {
        return allStorages;
    }

    public List<Event> getEvents() {
        return events;
    }

    @Override
    public String toString() {
        return name + " " + capacity;
    }
}
