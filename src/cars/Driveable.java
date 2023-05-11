package cars;

public interface Driveable {
     String myClass = "Класс для автомобиля";

    public void drive();

    public void stop();

    default public void fly(){
        System.out.println("Машины не летают, но мы ждем твои решения, Илон Маск");
    }



}
