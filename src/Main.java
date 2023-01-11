
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Mechanic<Car> petr = new Mechanic<>("Петр", "Петров", "РД");
        Mechanic<Trucks> alexey = new Mechanic<>("Алексей", "Петров", "Мишлен");
        Sponsor lukoil = new Sponsor("Лукоил", 3000000);
        Sponsor michlen = new Sponsor("Мишлен", 200000);

        Car car = new Car("Lada ", " Granta", 1.7, BodyType.SEDAN);
        car.addDrivers(new DriverB("Иван Иванов", "B", 20, car));
        car.addMechanic(petr);
        car.addSponsor(lukoil, michlen);

        Car audi = new Car("Audi ", " A8 50L TDI Quattro", 3.0, BodyType.COUPE);
        Car bmw = new Car("BMW ", " Z8", 3.0, BodyType.PICKUP);
        Car kia = new Car("KIA ", " Sortage 4-го поколния", 2.4, BodyType.MINIVAN);
        Trucks trucks = new Trucks("Kamaz", "01", 3.0, Capacity.N1);
        Trucks volvo = new Trucks("Volvo", "02", 5.0, Capacity.N2);
        Trucks daf = new Trucks("DAF", "03", 5.0, Capacity.N3);
        Trucks isuzu = new Trucks("ISUZU", "04", 5.0, Capacity.N2);

        trucks.addDrivers(new Driver<>("Илья Зедгинидзе", "В", 10, trucks));
        trucks.addMechanic(petr);
        trucks.addSponsor(lukoil, michlen);

        Bus hyundai = new Bus("Hyundai", "01", 5.0, Weight.AVERAGE);
        Bus bogdan = new Bus("Bogdan", "02", 5.0, Weight.LARGE);
        Bus ikarus = new Bus("Ikarus", "03", 5.0, Weight.SMALL);
        Bus Kia = new Bus("KIA", "04", 5.0, Weight.SMALL);
        daf.startMoving();

        daf.pitStop();
        Kia.pitStop();
        Kia.stopMoving();
        Kia.bestLapTime();
        Kia.toString();
        trucks.toString();


        List<Transport> transports = List.of(car, trucks, isuzu);
        for (Transport transport : transports) printinfo (transport);

        ServiceStation serviceStation = new ServiceStation();


        serviceStation.addTruck(trucks);
        serviceStation.addCar(car);
        serviceStation.service();
        serviceStation.service();
    }
    private static void printinfo(Transport transport) {
        System.out.println("информ по авто:  " + transport.getBrand() + "" + transport.getModel());
        System.out.println("водители  " + transport.getDrivers());
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.println(driver.getFIO());
        }
        System.out.println("Спонсоры   " + transport.getSponsors());
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(sponsor.getName());
        }
        System.out.println("Механики  " + transport.getMechanics());
        for (Mechanic<?> mechanic : transport.getMechanics()) {
            System.out.println(mechanic.getName() + "  " + mechanic.getSurname() + "  из  " + mechanic.getCompany());
        }
        System.out.println();
    }
}