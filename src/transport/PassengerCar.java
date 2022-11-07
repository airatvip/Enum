package transport;

public class PassengerCar extends Transport implements Rival {
    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        SW("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP_TRUCK("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;

        }

        public String getBodyType() {
            return bodyType;
        }

        public void setBodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public static BodyType findByBodyType (String bodyType) {
            for (BodyType type : values()) {
                if (type.bodyType.equals(bodyType)) return type;

            } return null;
        }

        public static String identifyBodyType (PassengerCar passengerCar) {
            return passengerCar.bodyType != null ? passengerCar.bodyType.bodyType: "нет информации";

        }


    }


    private BodyType bodyType;

    public PassengerCar(String brand, String model, double engineVolume, String bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = BodyType.findByBodyType(bodyType);
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
        return "легковому транспорту заехать на пит-стоп";
    }

    @Override
    public String bestLapTime() {
        return "лучшее время круга легкового автомобиля";
    }

    @Override
    public double maxSpeed() {
        return 150;
    }

    @Override
    public String toString() {
        return super.toString() + "Кузов - " + BodyType.identifyBodyType(this) + "\n";
    }

}
