package day5_818.pm.exer4;

public class Dog extends Animal{
    private String sound="汪汪";

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getSound(){
        return sound;
    }
    @Override
    public void setSound(String sound) {
        this.sound = sound;
    }
    public void shout(){
        System.out.println(this.getName()+"\t在\t"+sound);
    }
}
