package cars;

import cars.Driveable;

public abstract class Car implements Driveable {

    private String title;

    public Car(String title) {
        this.title = title;
    }

    public abstract void stop();

    public final void drive(){                     // Метод нельзя переопределять
        System.out.println(title + " is driving");
    }

    public abstract void turnOn();

    public String getTitle() {
        return title;
    }
}
