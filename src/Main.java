
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Mechanic<Car> petr = new Mechanic<>("Петр", "Петров", "РД");
        Mechanic<Trucks> alexey = new Mechanic<>("Алексей", "Петров", "Мишлен");
        Sponsor lukoil = new Sponsor("Лукоил", 3000000);
        Sponsor michlen = new Sponsor("Мишлен", 200000);

        Car Lada = new Car("Lada ", " Granta", 1.7, BodyType.SEDAN);
        Lada.addDrivers(new DriverB("Иван Иванов", "B", 20, Lada));
        Lada.addMechanic(petr);
        Lada.addSponsor(lukoil, michlen);

        Car Audi = new Car("Audi ", " A8 50L TDI Quattro", 3.0, BodyType.COUPE);
        Car BMW = new Car("BMW ", " Z8", 3.0, BodyType.PICKUP);
        Car KIA = new Car("KIA ", " Sortage 4-го поколния", 2.4, BodyType.MINIVAN);
        Trucks Kamaz = new Trucks("Kamaz", "01", 3.0, Capacity.N1);
        Trucks Volvo = new Trucks("Volvo", "02", 5.0, Capacity.N2);
        Trucks DAF = new Trucks("DAF", "03", 5.0, Capacity.N3);
        Trucks Isuzu = new Trucks("ISUZU", "04", 5.0, Capacity.N2);

        Kamaz.addDrivers(new Driver<>("Илья Зедгинидзе", "В", 10, Kamaz));
        Kamaz.addMechanic(petr);
        Kamaz.addSponsor(lukoil, michlen);

        Bus Hyundai = new Bus("Hyundai", "01", 5.0, Weight.AVERAGE);
        Bus Bogdan = new Bus("Bogdan", "02", 5.0, Weight.LARGE);
        Bus Ikarus = new Bus("Ikarus", "03", 5.0, Weight.SMALL);
        Bus Kia = new Bus("KIA", "04", 5.0, Weight.SMALL);
        DAF.startMoving();

        DAF.pitStop();
        Kia.pitStop();
        Kia.stopMoving();
        Kia.bestLapTime();
        Kia.toString();
        Kamaz.toString();


        List<Transport> transports = List.of(Lada, Kamaz, Isuzu);
        for (Transport transport : transports) printinfo (transport);
    }
    private static void printinfo(Transport transport) {
        System.out.println("иноформ по авто" + transport.getBrand() + "" + transport.getModel());
        System.out.println("водители");
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.println(driver.getFIO());
        }
        System.out.println("Спонсоры");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(sponsor.getName());
        }
        System.out.println("Механики");
        for (Mechanic<?> mechanic : transport.getMechanics()) {
            System.out.println(mechanic.getName());
        }
        System.out.println();
    }
}