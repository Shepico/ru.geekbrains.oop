package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat (Plate p) {
        fullness = p.decreaseFood(appetite);
        if (!fullness) {
            System.out.println(name + " поесть не удалось");
        }

    }

    public void info(){
        System.out.println(name + " сытость - " + fullness);
    }
}
