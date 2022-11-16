public class Main {
    public static void main(String[] args) {

        Car Lada = new Car("Lada ", " Granta", 1.7);

        Car Audi = new Car("Audi ", " A8 50L TDI Quattro", 3.0);
        Car BMW = new Car("BMW ", " Z8", 3.0);
        Car KIA = new Car("KIA ", " Sortage 4-го поколния", 2.4);
        Trucks Kamaz = new Trucks("Kamaz", "01", 3.0);
        Trucks Volvo = new Trucks("Volvo", "02",5.0);
        Trucks DAF = new Trucks("DAF", "03", 5.0);
        Trucks Isuzu = new Trucks("ISUZU", "04", 5.0);

        Bus Hyundai = new Bus("Hyundai", "01", 5.0);
        Bus Bogdan = new Bus("Bogdan", "02", 5.0);
        Bus Ikarus = new Bus("Ikarus", "03", 5.0);
        Bus Kia = new Bus("KIA", "04", 5.0);
        DAF.startMoving();

        DAF.pitStop();
        Kia.pitStop();
        Kia.stopMoving();
        Kia.bestLapTime();
        Kia.toString();
        Kamaz.toString();
    }

}
