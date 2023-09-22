package day5_818.pm.exer4;

public class Animal {
    private String name;
    private String sound;
    public Animal(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    public void shout(){
        System.out.println(name+"\t"+sound);
    }
}
