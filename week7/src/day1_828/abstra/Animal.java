package day1_828.abstra;

/**
 * @author Administrator
 */
public abstract class Animal {
    private String name;
    public String getName(){
        return name;
    }
    Animal(String name){
        this.name=name;
    }
    /**
     * 实现不同动物，发出不同的声音
     * @return 叫声
     */
    abstract String makeSound();

}
class Dog extends Animal{

    @Override
    String makeSound() {
        return "汪汪";
    }
    Dog(String name){
        super(name);
    }
}
class Cat extends Animal{

    @Override
    String makeSound() {
        return "喵喵";
    }
    Cat(String name){
        super(name);
    }
}
class Cow extends Animal{

    @Override
    String makeSound() {
        return "哞哞";
    }
    Cow(String name){
        super(name);
    }
}
class Zoo{
    private Animal[] animals;
    Zoo(Animal[] animals){
        this.animals=animals;
    }
    void showSounds(){
        for (Animal a : animals) {
            System.out.println(a.getName()+" "+a.makeSound());
        }
    }
}
class Test{
    public static void main(String[] args) {
        Animal[] animals={new Dog("小黄"),new Cat("汤姆"),new Cow("牛魔王")};
        Zoo zoo=new Zoo(animals);
        zoo.showSounds();
    }
}
