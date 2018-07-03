package animals;

abstract class Animal {
    String name;
    int longJump;
    int longRun;
    int longSwim;

    abstract void run(int distance);

    abstract void jumpOver(int distance);

    abstract void swim(int distance);

    public void task (String name, String motion, float distance, boolean luck) {
        System.out.println(name+"." + motion + "(" + distance+")-->результат:"+motion+":"+luck);
    }
}
