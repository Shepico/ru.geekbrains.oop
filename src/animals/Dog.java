package animals;

public class Dog extends  Animal{

    public Dog (String name, int longRun, int longJump, int longSwim) {
        this.name = name;
        if (longRun<400) {
            System.out.println(name +" Собаки не бегают меньше 400 м. Установлено 400 м.");
            this.longRun = 400;
        }else if (longRun>600) {
            System.out.println(name +" Собаки не бегают больше 600 м. Установлено 600 м.");
            this.longRun = 600;
        } else this.longRun = longRun;

        if (longJump<0){
            System.out.println(name +" Установлен прыжок 0 м.");
            this.longJump =0;
        }else if (longJump>2) {
            System.out.println(name +" Собаки не прыгаю выше 2 м. Установлено 1.5 м.");
            this.longJump =2;
        } else this.longJump = longJump;

        if (longSwim<9) {
            System.out.println(name +" Собаки не плавают меньше 9м. Установлено 9 м.");
            this.longSwim = 9;
        }else if(longSwim>11) {
            System.out.println(name +" Собаки не плавают больше 11 м. Установлено 11 м.");
            this.longSwim = 11;
        } else this.longSwim = longSwim;
    }

    public Dog (String name) {
        this.name = name;
        this.longRun = 500;
        this.longJump = 1;
        this.longSwim = 10;
    }

    @Override
    public void run (int distance){
        if (distance > this.longRun) {
            task(this.name, "run", distance,false);
        } else task(this.name, "run", distance,true);
    }

    @Override
    public void jumpOver(int distance) {
        if (distance > this.longJump) {
            task(this.name, "jump", distance,false);
        } else task(this.name, "jump", distance,true);

    }

    @Override
    public void swim(int distance) {
        if (distance > this.longSwim) {
            task(this.name, "swim", distance,false);
        } else task(this.name, "swim", distance,true);
    }

}
