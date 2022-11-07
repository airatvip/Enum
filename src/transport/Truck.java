package transport;

public class Truck extends Transport implements Rival {
    public enum Capacity {
        N1("с полной массой до 3,5 тонн"),
        N2("с полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");

        private String capacity;

        Capacity(String capacity) {
            this.capacity = capacity;
        }

        public String getCapacity() {
            return capacity;
        }

        public void setCapacity(String capacity) {
            this.capacity = capacity;
        }
        public static Capacity findCapacity (String capacity) {
            for (Capacity capacity1 : values()) {
                if (capacity1.capacity.equals(capacity)) return capacity1;

            } return null;
        }

        public static String identifyCapacity (Truck truck) {
            return truck.capacity != null ? truck.capacity.capacity: "нет информации";

        }
    }
        private Capacity capacity;

    public Truck(String brand, String model, double engineVolume, String capacity) {
        super(brand, model, engineVolume);
        this.capacity = Capacity.findCapacity(capacity);
    }


    @Override
    public void start() {
        System.out.println("Начать движение");
    }

    @Override
    public void finish() {
        System.out.println("Закончить движение");
    }


    @Override
    public String pitSop() {
        return "грузовому транспорту заехать на пит-стоп";
    }

    @Override
    public String bestLapTime() {
        return "лучшее время круга грузового автомобиля";
    }

    @Override
    public double maxSpeed() {
        return 150;
    }

    @Override
    public String toString() {
        return super.toString() + "Грузопдъемность - " + Capacity.identifyCapacity(this) + "\n";
    }


}


