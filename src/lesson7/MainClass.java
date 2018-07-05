package lesson7;

public class MainClass {

    public static void main (String[] args) {
        Cat[] cats = new Cat[3];
        Plate plateOne = new Plate(20);
        //
        cats[0] = new Cat("cat1",5);
        cats[1] = new Cat("cat2",10);
        cats[2] = new Cat("cat3",10);
        //
        cats[0].eat(plateOne);
        cats[1].eat(plateOne);
        cats[2].eat(plateOne);
        for (int i=0; i<cats.length; i++) {
            cats[i].info();
        }
        plateOne.addFood(15);
        cats[2].eat(plateOne);
        cats[2].info();
        plateOne.info();
    }
}
