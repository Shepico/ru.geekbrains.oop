package lesson6.animals;

public class Cat extends Animal {

    public Cat(String name, int longRun, int longJump) {
        this.name = name;
        if (longJump > 3) {
            this.longJump = 3;
            System.out.println(name +" Коты не прыгают выше 3 м, установлено значение 3 м.");
        } else if (longJump < 1) {
            this.longJump = 1;
            System.out.println(name +" Коты не прыгают ниже 1 м, установлено значение 1 м.");
        } else this.longJump = longJump;

        if (longRun > 300) {
            this.longRun = 300;
            System.out.println(name +" Коты не бегут больше 300 м, установлено значение 300 м.");
        } else if (longRun < 100) {
            this.longRun = 100;
            System.out.println(name +" Коты бегают больше 100 м, установлено значение 100 м.");
        } else this.longRun = longRun;

        this.longSwim = 0;
    }

    public Cat(String name) {
        this.name = name;
        this.longJump = 2;
        this.longRun = 200;
        this.longSwim = 0;
    }

    @Override
    public void jumpOver(int distance) {
        if (distance > this.longJump) {
            task(this.name, "jump", distance,false);
        } else task(this.name, "jump", distance,true);

    }

    @Override
    public void run(int distance) {
        if (distance > this.longRun) {
            task(this.name, "run", distance,false);
        } else task(this.name, "run", distance,true);
    }

    @Override
    public void swim(int distance) {
        task(this.name, "swim", distance,false);
    }
}