package cars;

import cars.Car;

public class Lamborghini extends Car {

    int places;

    public Lamborghini(String title) {
        super(title);
    }

    @Override
    public void stop() {
        System.out.println(getTitle() + " карбонная керамика все остановит");

    }

    @Override
    public void turnOn() {
        System.out.println(getTitle() + " turn on with button");
    }
}
