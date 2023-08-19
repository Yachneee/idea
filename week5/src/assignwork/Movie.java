package assignwork;

public class Movie {
    private String name;
    private double price;
    private String director;
    private int ticketCount;
    //电影票数量
    private int date;
    //2023年1月1日写成20230101
    private double score;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    public Movie(){}
    public Movie(String name,double price,String director,int date,int ticketCount){
        this.name=name;
        this.price=price;
        this.director=director;
        this.date=date;
        this.ticketCount=ticketCount;
    }
    @Override
    public String toString() {
        return "movie{"+
                "name='"+name+
                "',price='"+price+
                "',director='"+director+
                "',date='"+date+
                "',score='"+score+
                "',ticketCount='"+ticketCount+
                "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj instanceof Movie m){
            if((m.name==null&&this.name==null)||(m.name.equals(this.name))){
                if((m.director==null &&this.director==null)||(m.director.equals(this.director))){
                    return m.date==this.date;
                }
            }
        }
        return false;
    }
}
