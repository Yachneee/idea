package assignwork;

/**
 * @author Administrator
 */
public class MovieTheater {
    private Movie[] movies;
    int index1;
    private User[] users;
    int index2=0;
    public MovieTheater(int a,int b){
        movies=new Movie[2+a];
        movies[0]=new Movie("消失的她",42.9,"饶晓志",20230622,5);
        movies[1]=new Movie("满江红",19.9,"张艺谋",20230122,5);
        index1=2;
        users=new User[3+b];
        users[0]=new User("manager","111111","man111111",1);
        users[1]=new User("administrator","666666","admin666666",1);
        users[2]=new User("user","222222","user222222",2);
        index2=3;
    }

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    /**
     * 根据电影名称查询电影组中的电影
     * @param name
     * @return查询到的电影
     */
    public Movie findMovie(String name){
        for (int i = 0; i < index1; i++) {
            if(name==null){
                return null;
            }else if(movies[i].getName().equals(name)){
                return movies[i];
            }
        }
        return null;
    }

    /**
     * 显示所有电影信息
     */
    public void showAllMovies(){
        for (int i = 0; i < index1; i++) {
            System.out.println(movies[i].toString());
        }
    }

    /**
     * 往电影组里添加电影
     * @param movie
     * @return添加结果（成功/失败）
     */
    public boolean addMovie(Movie movie){
        expandMovie();
        if(movie==null){
            return false;
        }
        movies[index1]=movie;
        index1++;
        return true;
    }

    /**
     * 电影组扩容
     */
    public void expandMovie(){
        if(index1==movies.length){
            System.out.println("电影组扩容中……");
            Movie[] newMovies=new Movie[movies.length*5];
            System.arraycopy(movies,0,newMovies,0,movies.length);
            movies=newMovies;
            System.out.println("扩容成功，现在的电影组容量为："+movies.length);
        }
    }

    /**
     * 往用户组里添加用户
     * @param user
     * @return添加结果（成功/失败）
     */
    public boolean addUser(User user){
        expandUser();
        if(user==null){
            return false;
        }
        users[index2]=user;
        index2++;
        return true;
    }

    /**
     * 用户组扩容
     */
    public void expandUser(){
        if(index2==users.length){
            System.out.println("用户组扩容中……");
            User[] newUsers=new User[users.length*5];
            System.arraycopy(users,0,newUsers,0,users.length);
            users=newUsers;
            System.out.println("扩容成功，现在的用户容量为："+users.length);
        }
    }

    /**
     * 查找用户组中是否有该用户
     * @param user
     * @return有就返回用户，否则返回null
     */
    public User findUser(User user){
        for (int i = 0; i < index2; i++) {
            if(users[i].equals(user)){
                return users[i];
            }
        }
        return null;
    }

    /**
     * 显示所有用户信息
     */
    public void showAllUsers(){
        for (int i = 0; i < index2; i++) {
            System.out.println(users[i].toString());
        }
    }

}
