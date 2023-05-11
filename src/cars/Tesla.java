package cars;

import cars.Car;

public class Tesla extends Car {

    public Tesla(String title) {
        super(title);      // Вызов конструктора родительского класса
    }

    @Override
    public void stop() {
        System.out.println("Остановились");

    }

    @Override
    public void fly() {
      //  super.fly();  ссылка на родительский метод
       System.out.println("Начинаем полет");     // Переопределяем метод
    }

    @Override
    public void turnOn() {
         System.out.println("Заводится ключом");
    }

    public void madeIn(){
        System.out.println("Сделано Tesla");
    }

    @Override
    public String toString() {
        return "Класс Tesla : " + super.getTitle();
    }
}
