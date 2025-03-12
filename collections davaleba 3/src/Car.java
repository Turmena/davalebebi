import java.util.Comparator;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int mileage;
    private Engine engine;

    public Car(String brand, String model, int year, int mileage, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return brand + " " + model + " | Year: " + year + " | Mileage: " + mileage + " | Engine: " + engine;
    }
}

class Engine {
    private String fuelType;
    private int cylinders;
    private double volume;

    public Engine(String fuelType, int cylinders, double volume) {
        this.fuelType = fuelType;
        this.cylinders = cylinders;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return fuelType + " " + cylinders + " Cyl | " + volume + "L";
    }
}

class CarByYear implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}

class CarByMileage implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o1.getMileage(), o2.getMileage());
    }
}

class CarByEngineVolume implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return Double.compare(o1.getEngine().getVolume(), o2.getEngine().getVolume());
    }
}
