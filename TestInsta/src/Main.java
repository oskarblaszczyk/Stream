public class Main {
    public static void main(String[] args) {

        Tank t1 = new Tank("Zbiornik1", 100);
        t1.addWater(100);
        t1.addWater(100);
        t1.addWater(100);
        t1.addWater(100);
        Tank t2 = new Tank("Zbiornik2", 500);
        t2.addWater(100);
        t2.addWater(100);
        t2.addWater(100);
        t2.addWater(100);
        System.out.println(t2.getActualFill());
        Tank t3 = new Tank("Zbiornik3", 400);
        t3.addWaterFrom(t2,300);
        System.out.println(t3.getActualFill());
        System.out.println(t2.getActualFill());
        System.out.println(Event.getAllEvents());
        System.out.println(Storage.mostFilled(Storage.getAllStorages()) + " i posiada " + Storage.mostFilled(Storage.getAllStorages()).getActualFill());
    }
}
