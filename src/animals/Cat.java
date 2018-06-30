package animals;

public class Cat extends Animal{

    public Cat(String name, int longRun, int longJump) {
        this.name = name;
        if (longJump> 3) {
            this.longJump = 300;
            System.out.println("Коты не прыгают выше 3 м, установлено значение 3 м.");
        }else if (longJump<1) {
            this.longJump = 100;
            System.out.println("Коты не прыгают ниже 1 м, установлено значение 1 м.");
        } else  this.longJump = longJump;

        if (longRun> 3) {
            this.longRun = 300;
            System.out.println("Коты не бегут больше 300 м, установлено значение 300 м.");
        }else if (longRun<100) {
            this.longRun = 100;
            System.out.println("Коты бегают больше 100 м, установлено значение 100 м.");
        } else  this.longRun = longRun;

        this.longSwim = 0;
    }

    public cat (String name){
        this.name = name;
        this.longJump = 2;
        this.longRun = 200;
        this.longSwim = 0;
    }

    @Override
    public boolean jumpOver(int distance) {
        if (distance>this.longJump) {
            return false;
        } else return true;

    }
    @Override
    public boolean run(int distance) {
        if (distance>this.longRun) {
            return false;
        }else return true;
    }

    @Override
    public boolean swim(int distance){
        System.out.println("Коты не умеют плавать");
        return false;
    }
}
