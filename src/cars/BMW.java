package cars;

public class BMW extends Car {

    String tuning;


    public BMW(String title) {
        super(title);                    // Ссылка на родителя
    }

    @Override
    public void stop() {
        System.out.println(getTitle() + " дисковое торможение");
    }

    @Override
    public void turnOn() {
        System.out.println(getTitle()+ " turn on with key");
    }
}
