package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private final Animal animal;
    private final Timer timer;

    public AnimalsCage(@Qualifier("dog") Animal animal, Timer timer) {
        this.animal = animal;
        this.timer = timer;
    }
 // метод whatAnimalSay() будет использовать существующий бин Timer, переданный в конструктор AnimalsCage,
 // вместо создания нового объекта Timer. Это обеспечит правильное время при каждом вызове метода.
    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        //System.out.println(new Timer().getTime());
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }
}
