package animals;

abstract class Animal {
    String name;
    int longJump;
    int longRun;
    int longSwim;

    abstract boolean run();

    abstract boolean swim();

    abstract boolean jumpOver();

}
