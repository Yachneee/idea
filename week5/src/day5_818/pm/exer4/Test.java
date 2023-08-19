package day5_818.pm.exer4;

public class Test {
    public static void main(String[] args) {
        Animal animal=new Animal("animal");
        animal.shout();
        Animal dog=new Dog("dog");
        dog.shout();
        Animal cat=new Cat("cat");
        cat.shout();
        Animal cow=new Cow("cow");
        cow.shout();
    }
}
