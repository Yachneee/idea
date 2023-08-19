package day5_818.pm.exer4;

public class Cow extends Animal{
    private String sound="哞哞";

    public Cow(String name) {
        super(name);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    public void shout(){
        System.out.println(this.getName()+"\t在\t"+sound);
    }
}
