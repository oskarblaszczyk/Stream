import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Event {
    private String name;
    private LocalDate date;
    private Storage storage;
    private boolean isSuccesfull;
    private int amountOfWater;

    private static List<Event> allEvents = new ArrayList<>();

    public Event(String name, LocalDate date, Storage storage, boolean isSuccessful, int amountOfWater) {
        this.name = name;
        this.date = date;
        this.storage = storage;
        this.isSuccesfull = isSuccessful;
        this.amountOfWater = amountOfWater;

        allEvents.add(this);
        storage.getEvents().add(this);
    }

    public static Storage mostUnsuccessfulEvent(List<Event> events){
        return events.get(0).getStorage();
    }
    public static Storage mostEvents(List<Event> events, String name){
        return events.get(0).getStorage();
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public Storage getStorage() {
        return storage;
    }

    public boolean isSuccesfull() {
        return isSuccesfull;
    }

    public int getAmountOfWater() {
        return amountOfWater;
    }

    public static List<Event> getAllEvents() {
        return allEvents;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Event event = (Event) o;
//        return name.equals(event.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
}
