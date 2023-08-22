package day2_822.reviseAssign;

import java.util.Objects;

/**
 * @author Administrator
 */
public class Movie {
    private String name;
    private double price;
    private String director;
    private int date;
    private int ticketsCount;
    private int boughtCount=0;

    public int getBoughtCount() {
        return boughtCount;
    }

    public void setBoughtCount(int boughtCount) {
        this.boughtCount = boughtCount;
    }

    public int getTicketsCount() {
        return ticketsCount;
    }
    public void setTicketsCount(int ticketsCount) {
        this.ticketsCount = ticketsCount;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }
    public Movie(){}
    public Movie(String name,double price,String director,int date){
        this.name=name;
        this.price=price;
        this.director=director;
        this.date=date;
    }
    public Movie(String name,double price,String director,int date,int ticketsCount){
        this.name=name;
        this.price=price;
        this.director=director;
        this.date=date;
        this.ticketsCount=ticketsCount;
    }
    public String toString() {
        return "movie{"+
                "电影名称："+name+
                "，价格："+price+
                "，导演："+director+
                "，上映日期："+date+
                "，现有票量："+ticketsCount+
                "}";
    }
    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj instanceof Movie m){ //jdk16后
            return Objects.equals(m.name, this.name)
                    && m.price == this.price
                    && Objects.equals(m.director, this.director)
                    && m.date == this.date;
        }
        return false;
    }
    public String showTicketsInfo(){
        return this+ "，购买票数："+boughtCount;
    }
}
