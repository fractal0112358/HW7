import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1. Расширить задачу про котов и тарелки с едой DONE
 * 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20) DONE
 * 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true DONE
 * 4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы) DONE
 * 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль DONE
 * 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку DONE
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat boris = new Cat("Борис", 10);
        Cat mike = new Cat("Майк", 12);
        Cat vaska = new Cat("Васька", 12);
        Cat lucky = new Cat("Лаки", 11);
        Cat murka = new Cat("Мурка", 17);

        cats.add(boris);
        cats.add(mike);
        cats.add(vaska);
        cats.add(lucky);
        cats.add(murka);


        Plate plate = new Plate(50);
        plate.info();
        boris.eat(plate);
        mike.eat(plate);
        vaska.eat(plate);
        lucky.eat(plate);
        plate.addFood(100);
        murka.eat(plate);
        Cat.satietyInfo(boris, mike, vaska, lucky, murka);
        plate.info();
    }
}
