interface Animal {
    void eat();
    void sleep();
}

class Mammal implements Animal {
    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Mammal {
    @Override
    public void eat() {
        System.out.println("Eating dog food...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping in a dog bed...");
    }
}

class Bird implements Animal {
    @Override
    public void eat() {
        System.out.println("Eating seeds...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping in a nest...");
    }
}

class Parrot extends Bird {
    @Override
    public void eat() {
        System.out.println("Eating fruits and nuts...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping on a perch...");
    }
}

public class hybridInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();

        Parrot parrot = new Parrot();
        parrot.eat();
        parrot.sleep();
    }
}
