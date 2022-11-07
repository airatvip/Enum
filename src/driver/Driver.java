package driver;

import transport.Transport;

import java.util.Objects;

public abstract class Driver<T extends Transport>  {

    private String name;

    private boolean driversLicense;

    private int experience;


    public Driver(String name, boolean driversLicense, int experience) {
        if (name == null || name.isEmpty() || name.isBlank())
            this.name = "no information about the driver";
        else this.name = name;


        this.driversLicense = driversLicense;

        if (experience < 0) {
            this.experience = Math.abs(experience);
        } else
            this.experience = experience;


    }


    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final boolean isDriversLicense() {
        return driversLicense;
    }

    public final void setDriversLicense(boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    public final int getExperience() {
        return experience;
    }

    public final void setExperience(int experience) {
        this.experience = experience;
    }


    public abstract String start();

    public abstract String stop();

    public abstract String refuelTheTransport();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driversLicense == driver.driversLicense && experience == driver.experience && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driversLicense, experience);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driversLicense=" + driversLicense +
                ", experience=" + experience +
                '}';
    }
}

