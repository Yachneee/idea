package day4_907.practice;

/**
 * @author Administrator
 */
public class Card implements Comparable{
    private String number;
    private String type;
    private int num;
    public Card(String number,String type,int num){
        this.number=number;
        this.type=type;
        this.num=num;
    }

    @Override
    public int compareTo(Object o) {
        return this.num-((Card)o).num;
    }

    @Override
    public String toString() {
        return  number + type + ' ';
    }
}
