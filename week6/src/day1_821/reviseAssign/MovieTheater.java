package day1_821.reviseAssign;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author Administrator
 */
public class MovieTheater {
    private Movie[] movies;
    private int moviesIndex;
    private User[] users;
    private int usersIndex;


    public MovieTheater(int a, int b){
        movies=new Movie[2+a];
        movies[0]=new Movie("消失的她",42.9,"饶晓志",20230622,10);
        movies[1]=new Movie("满江红",19.9,"张艺谋",20230122,10);
        moviesIndex=2;
        users=new User[3+b];
        users[0]=new User("manager","111111","manager",1,10);
        users[1]=new User("administrator","222222","admin",1,10);
        users[2]=new User("user","333333","user",2,10);
        usersIndex=3;
    }

    /**
     * 根据输入的name查询电影信息
     * @param name 要查询的电影名
     * @return 若找到返回电影对象，若没有返回空
     */
    public Movie selectMovieByName(String name){
        for (int i = 0; i < moviesIndex; i++) {
            if(Objects.equals(movies[i].getName(),name)){
                return movies[i];
            }
        }
        return null;
    }

    /**
     * 显示所有电影信息
     */
    public void showAllMovies(){
        for (int i = 0; i < moviesIndex; i++) {
            System.out.println(movies[i]+"\t余票数量："+movies[i].getTicketsCount());
        }
    }

    /**
     * 查找用户（根据电话，密码，身份）
     * @param user 要查询的用户
     * @return 若有返回用户，没有返回null
     */
    public User selectUser(User user){
        for (int i = 0; i < usersIndex; i++) {
            if(Objects.equals(users[i].getPhone(),user.getPhone())
            &&Objects.equals(users[i].getPassword(),user.getPassword())
            &&Objects.equals(users[i].getRole(),user.getRole())){
                return users[i];
            }
        }
        return null;
    }

    /**
     * 根据电话查找用户
     * @param phone 要查询的电话
     * @return 若有返回用户，没有返回null
     */
    public User selectUser(String phone){
        for (int i = 0; i < usersIndex; i++) {
            if(Objects.equals(users[i].getPhone(),phone)){
                return users[i];
            }
        }
        return null;
    }
    /**
     * 显示所有用户信息
     */
    public void showAllUsers(){
        for (int i = 0; i < usersIndex; i++) {
            System.out.println(users[i]);
        }
    }
    /**
     * 新增电影
     * @param movie 要添加的电影对象
     */
    public void addMovie(Movie movie){
        growMovies();
        movies[moviesIndex]=movie;
        moviesIndex++;
    }

    /**
     * 新增用户
     * @param user 要添加的用户对象
     */
    public void addUser(User user){
        growUsers();
        users[usersIndex]=user;
        usersIndex++;
    }
    /**
     * 扩容存储电影信息的对象数组
     */
    public void growMovies(){
        if(moviesIndex==movies.length){
            Movie[] newMovies=new Movie[movies.length*2];
            System.arraycopy(movies,0,newMovies,0,movies.length);
            movies=newMovies;
        }
    }
    /**
     * 扩容存储用户信息的对象数组
     */
    public void growUsers(){
        if(usersIndex==users.length){
            User[] newUsers=new User[users.length*2];
            System.arraycopy(users,0,newUsers,0,users.length);
            users=newUsers;
        }
    }

    /**
     * 根据电影名删除电影
     * @param name 要删除的电影名
     */
    public boolean deleteMovie(String name) {
        int index=-1;
        for (int i = 0; i < moviesIndex; i++) {
            if(Objects.equals(name,movies[i].getName())){
                index=i;
                break;
            }
        }
        if(index==-1){
            return false;
        }
        System.arraycopy(movies,0,movies,0,index);
        System.arraycopy(movies,index+1,movies,index,moviesIndex-index-1);
        moviesIndex--;
        return true;
    }
}
