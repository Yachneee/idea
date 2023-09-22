package day2_815.Exercise;
/**
 * @author Administrator
 */
public class Pet{}
class Cat {
     private String color;
     private String breed;
     public void eat(){
         System.out.println(color+"的"+breed+"正在吃鱼……\t");
     }
    public void catchMouse(){
        System.out.println(color+"的"+breed+"正在逮老鼠……\t");
    }
    public Cat(){

    }
    public Cat(String color,String breed){
        this.color=color;
        this.breed=breed;
    }
}
class Dog{
    private String color;
    private String breed;
    public void eat(){
        System.out.println(color+"的"+breed+"正在啃骨头……\t");
    }
    public void guardHouse(){
        System.out.println(color+"的"+breed+"正在看家……\t");
    }
    public Dog(String color,String breed){
        this.color=color;
        this.breed=breed;
    }
}
class PetTest{
    public static void main(String[] args) {
        Cat cat=new Cat("花色","波斯猫");
        Dog dog=new Dog("黑色","藏獒");
        cat.eat();
        cat.catchMouse();
        dog.eat();
        dog.guardHouse();
    }
}
