package day2_905.pm;

/**
 * @author Administrator
 */
public class Constellation {
    private String name;
    private int month;

    public Constellation(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Constellation{" +
                "name='" + name + '\'' +
                ", month=" + month +
                '}';
    }
}
