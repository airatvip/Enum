import driver.DriverCategoryB;
import driver.DriverCategoryC;
import driver.DriverCategoryD;
import transport.Bus;
import transport.PassengerCar;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        PassengerCar audi = new PassengerCar("AUDI", "A4", 2.0, "Седн");
        PassengerCar bmw = new PassengerCar("BMW", "5 series", 2.0, "Седан");
        PassengerCar mb = new PassengerCar("Mercedes-Benz", "E200", 2.0, "Универсал");

        Truck volvo = new Truck("Volvo", "FH", 12.8, "с полной массой до 3,5 тонн");
        Truck scania = new Truck("Scania", "P-series", 12.7, "с полной массой свыше 3,5 до 12 тонн");
        Truck daf = new Truck("DAF", "XF", 12.0, "с полной массой свыше 3,5 до 12");


        Bus zhongTong = new Bus("Zhong Tong", "Fasion", 7.5, "40-50 мест");
        Bus volgabus = new Bus("Volgabus", "Ситирим", 6.5, "40-50 мест");
        Bus higer = new Bus("Higer", "KLQ 6928", 6.7, "40 мест");



        DriverCategoryB smith = new DriverCategoryB("Smith", true, 10);
        DriverCategoryC alex = new DriverCategoryC("Alex", true, 5);
        DriverCategoryD sam = new DriverCategoryD("Sam", true, 9);
        DriverCategoryD demis = new DriverCategoryD("Demis", false, 0);
//        smith.toControlDriver(audi);
//        alex.toControlDriver(volvo);
//        sam.toControlDriver(higer);
//        demis.toControlDriver(higer);
//        System.out.println(smith.refuelTheTransport());
//        System.out.println(sam);
//        System.out.println(sam.stop());
//        System.out.println(sam.start());
//        System.out.println(sam.refuelTheTransport());
//        System.out.println(audi);
//        System.out.println(bmw);
        System.out.println(daf);
        System.out.println(scania);
        System.out.println(volgabus);
        System.out.println(higer);


    }
}