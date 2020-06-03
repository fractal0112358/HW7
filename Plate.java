public class Plate {
    int food;

    public Plate() {
    }

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
            food -= n;
    }
    public void info() {
        System.out.println("Остаток в тарелке: " + food);
    }

    public void addFood(int a) {
        food += a;
    }
}


