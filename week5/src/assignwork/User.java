package assignwork;

public class User {
    private String username;
    private String phone;
    private String password;
    private Movie[] movies;
    int index=0;
    //购买的电影票信息
    private int role;
    //1表示管理员，2表示普通用户
    public User(){}
    public User(String phone,String password){
        this.phone=phone;
        this.password=password;
    }
    public User(String username,String phone,String password){
        this.username=username;
        this.phone=phone;
        this.password=password;
        movies=new Movie[10];
    }

    public User(String username,String phone,String password,int role){
        this.username=username;
        this.phone=phone;
        this.password=password;
        this.role=role;
        movies=new Movie[20];
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

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "user{"+
                "username='"+username+
                "',phone='"+phone+
                "',password='"+password+
                "',role='"+role+"'}";
    }

    /**
     * 比较两个对象是否是同一个对象（电话+密码符合就算一样）
     * @param obj 比较的对象（和当前对象）
     * @return 比较结果（一样/不一样）
     */
    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj instanceof User u){
            if (u.phone != null && u.phone.equals(this.phone)) {
                if (u.password != null) {
                    return u.password.equals(this.password);
                }
            }
        }
        return false;
    }
    public boolean addUserMovie(Movie movie){
        expandUserMovie();
        if(movie==null){
            return false;
        }
        movies[index]=movie;
        index++;
        return true;
    }
    public void expandUserMovie(){
        if(index==movies.length){
            System.out.println("电影票信息组扩容中……");
            Movie[] newMovies=new Movie[movies.length*5];
            System.arraycopy(movies,0,newMovies,0,movies.length);
            movies=newMovies;
            System.out.println("扩容成功，现在的电影票信息组容量为："+movies.length);
        }
    }
}
