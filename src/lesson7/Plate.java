package lesson7;

public class Plate {
    private int amountFood;

    public Plate (int amountFood){
        this.amountFood = amountFood;
    }

    public boolean decreaseFood(int amountAppetite) {
        if (amountAppetite>amountFood) {
            return false;
        } this.amountFood -=amountAppetite;
        return true;
    }

    public void addFood (int amountAddFood) {
        this.amountFood += amountAddFood;
    }

    public void info(){
        System.out.println("В тарелке - " + amountFood);
    }
}
