public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    Plate p = new Plate();

    public void eat(Plate p) {
        if(appetite <= p.food) {
            p.decreaseFood(appetite);
            satiety = true;
        } else {
            System.out.println("Недостаточно еды для удовлетворения аппетита всем котам");
        }
    }

    public static void satietyInfo(Cat cat, Cat cat1, Cat cat2, Cat cat3, Cat cat4) {
        System.out.println("Статус сытости кота " + cat.name + ": " + cat.satiety);
        System.out.println("Статус сытости кота " + cat1.name + ": " + cat1.satiety);
        System.out.println("Статус сытости кота " + cat2.name + ": " + cat2.satiety);
        System.out.println("Статус сытости кота " + cat3.name + ": " + cat3.satiety);
        System.out.println("Статус сытости кота " + cat4.name + ": " + cat4.satiety);
    }
}
