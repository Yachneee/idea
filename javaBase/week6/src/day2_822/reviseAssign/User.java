package day2_822.reviseAssign;

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

    public Movie[] getBoughtMovies() {
        return boughtMovies;
    }

    public void setBoughtMovies(Movie[] boughtMovies) {
        this.boughtMovies = boughtMovies;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
