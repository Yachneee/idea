package day1_821.reviseAssign;

import java.util.Objects;

/**
 * @author Administrator
 */
public class User {
    private String username;
    private String phone;
    private String password;
    private int role;
    private Movie[] boughtMovies;
    private int index=0;
    //1表示管理员，2表示普通用户
    public User(){}

    public User(String username,String phone,String password,int role,int capacity){
        this.username=username;
        this.phone=phone;
        this.password=password;
        this.role=role;
        boughtMovies=new Movie[capacity];
    }
    public User(String phone,String password,int role){
        this.phone=phone;
        this.password=password;
        this.role=role;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "用户名：'" + username + '\'' +
                ", 电话：'" + phone + '\'' +
                ", 密码：'" + password + '\'' +
                ", 身份：" + (role==1 ? "管理员" : "用户")+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return role == user.role
                && Objects.equals(username, user.username)
                && Objects.equals(phone, user.phone)
                && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, phone, password, role);
    }

    /**
     * 购买电影票
     * @param movie 要购买的电影
     * @param boughtCount 购买的数量
     * @return 若余票充足则购买成功返回是，否则返回否
     */
    public boolean buyTickets(Movie movie,int boughtCount){
        growBoughtTickets();
        int remain=movie.getTicketsCount();
        if(boughtCount<=remain){
            remain-=boughtCount;
            for (int i = 0; i < index; i++) {
                int count=boughtMovies[i].getBoughtCount();
                if(boughtMovies[i].equals(movie)){
                    boughtMovies[i].setBoughtCount(count+boughtCount);
                    movie.setTicketsCount(remain);
                    return true;
                }
            }
            boughtMovies[index]=movie;
            boughtMovies[index].setBoughtCount(boughtCount);
            movie.setTicketsCount(remain);
            index++;
            return true;
        }
        return false;
    }

    /**
     * 购买电影票组扩容
     */
    public void growBoughtTickets(){
        if(index==boughtMovies.length){
            Movie[] newBoughtMovies=new Movie[boughtMovies.length*2];
            System.arraycopy(boughtMovies,0,newBoughtMovies,0,index);
            boughtMovies=newBoughtMovies;
        }
    }
    public void showBoughtTickets(){
        if(index==0){
            System.out.println("查询不到购买的电影票信息！");
            return;
        }
        for (int i = 0; i < index; i++) {
            System.out.println(boughtMovies[i].showTicketsInfo());
        }
    }
}
