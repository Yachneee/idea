package day2_822.reviseAssign;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class MovieTheater {
    private final Scanner S=new Scanner(System.in);
    private User login;
    private Movie[] movies;
    private int moviesIndex;
    private User[] users;
    private int usersIndex;


    public MovieTheater(){
        movies=new Movie[10];
        movies[0]=new Movie("消失的她",42.9,"饶晓志",20230622,10);
        movies[1]=new Movie("满江红",19.9,"张艺谋",20230122,10);
        moviesIndex=2;
        users=new User[10];
        users[0]=new User("manager","111111","manager",1,10);
        users[1]=new User("administrator","222222","admin",1,10);
        users[2]=new User("user","333333","user",2,10);
        usersIndex=3;
    }

    /**
     * 系统界面
     */
    public void open(){
        System.out.println("********欢迎来到开发喵影院********");
        while(true){
            menu();
            System.out.print("请输入操作选项：");
            int type = S.nextInt();
            switch (type){
                case 1->selectMovie();
                case 2->showAllMovie();
                case 3->login(1);
                case 4->login(2);
                case 5->register();
                case 0-> {
                    System.out.println("退出成功，再见！");
                    return;
                }
            }
        }

    }
    /**
     * 系统菜单
     */
    private void menu(){
        System.out.println("-+---------------------------+-");
        System.out.println("1.查询电影信息");
        System.out.println("2.显示所有电影信息");
        System.out.println("3.管理员登陆");
        System.out.println("4.用户登录");
        System.out.println("5.用户注册");
        System.out.println("0.退出");
        System.out.println("-+----------------------------+-");
    }
    /**
     * 系统功能1，查询电影信息
     */
    private void selectMovie() {
        System.out.print("请输入电影名称：");
        String name = S.next();
        Movie movie=selectMovieByName(name);
        if(movie==null){
            System.out.println("暂时没有该电影信息");
        }else{
            System.out.println(movie);
        }
    }
    /**
     * 系统功能2，显示所有电影信息
     */
    private void showAllMovie() {
        showAllMovies();
    }
    /**
     * 系统功能3,4，登录
     */
    private void login(int role) {
        System.out.print("请输入电话：");
        String phone=S.next();
        System.out.print("请输入密码：");
        String password=S.next();
        User user=new User(phone,password,role);
        login=selectUser(user);
        if(login==null){
            System.out.println("登陆失败");
            menu();
        }else{
            System.out.println("登陆成功！");
            System.out.println(login.getUsername()+"，欢迎您！");
        }
        if(role==1){
            managerOpe();
        }else{
            userOpe();
        }
    }
    /**
     * 系统功能5，用户注册
     */
    private void register() {
        System.out.println("------开始注册-------");
        System.out.print("请设置用户名称：");
        String username=S.next();
        System.out.print("请设置登陆手机号：");
        String phone=S.next();
        // 验证电话号码是否被注册了 电话号码长度在11位  length() 可以获取字符串的长度  数组中是 length 属性
        // 电话号码是11位
        phone=checkPhone(phone);
        System.out.print("请输入密码：");
        String password=S.next();
        password=checkPassword(password);
        User user=new User(username,phone,password,2,10);
        addUser(user);
        System.out.println("注册成功，可以去登录了");
    }
    /**
     * 检查电话号码是11位，且没有被注册
     * @param phone 要检查的电话号码
     * @return 11位且没有被注册的号码
     */
    private String checkPhone(String phone){
        while(phone.length()!=11){
            System.out.print("电话号码输入有误，请重新输入：");
            phone=S.next();
        }
        while(selectUser(phone)!=null){
            System.out.print("电话号码已被注册，请重新输入：");
            phone=S.next();
        }
        return phone;
    }

    /**
     * 检查两次输入的密码一致
     * @param password 第一次输入的密码
     * @return 两次输入一致的密码
     */
    private String checkPassword(String password){
        System.out.print("请再次输入密码：");
        String pass=S.next();
        while(!Objects.equals(password,pass)){
            System.out.println("两次密码不一致，请重新设置密码!");
            System.out.print("请输入密码：");
            password=S.next();
            System.out.print("请再次输入密码：");
            pass=S.next();
        }
        return password;
    }

    /**
     * 管理员界面
     */
    private void managerOpe(){
        while(true){
            managerMenu();
            System.out.print("请输入你要操作的编号：");
            int num= S.nextInt();
            switch (num){
                case 1-> addMovie();
                case 2-> deleteMovie();
                case 3-> updateMovie();
                case 4-> showAllMovies();
                case 5-> showAllUsers();
                case 0-> {
                    System.out.println("退出管理员界面成功");
                    return;
                }
            }
        }
    }
    /**
     * 管理员菜单
     */
    private void managerMenu(){
        System.out.println("-+-----------------------------+-");
        System.out.println("1. 新增电影");
        System.out.println("2. 删除电影");
        System.out.println("3. 修改电影");
        System.out.println("4. 显示所有电影");
        System.out.println("5. 显示所有用户");
        System.out.println("0. 退出");
        System.out.println("-+-----------------------------+-");
    }
    /**
     * 管理员操作1，新增电影
     */
    private void addMovie() {
        System.out.print("请输入电影的名称：");
        String name=S.next();
        System.out.print("请输入电影的价格：");
        double price=S.nextDouble();
        System.out.print("请输入电影的导演：");
        String director=S.next();
        System.out.print("请输入电影的上映时间：");
        int date=S.nextInt();
        System.out.print("请输入电影的票量：");
        int tickets=S.nextInt();
        Movie movie=new Movie(name,price,director,date,tickets);
        addMovie(movie);
        System.out.println("添加成功！"+movie);
    }
    /**
     * 管理员操作2，删除电影
     */
    private void deleteMovie() {
        System.out.print("请输入电影名称：");
        String name=S.next();
        if(deleteMovie(name)){
            System.out.println("删除成功！");
        }else{
            System.out.println("删除失败，你删除的电影可能不存在！");
        }
    }
    /**
     * 管理员操作3，修改电影
     */
    private void updateMovie() {
        System.out.print("请输入电影名称：");
        String name=S.next();
        Movie movie=selectMovieByName(name);
        if(movie!=null){
            System.out.println(movie);
            System.out.print("请选择你要修改的内容(请输入对应编号：1.价格/2.上映时间/3.票量/0.退出)：");
            int i = S.nextInt();
            switch (i) {
                case 1 -> {
                    System.out.print("请输入新的价格：");
                    double price = S.nextDouble();
                    movie.setPrice(price);
                    System.out.println("修改价格成功！");
                }
                case 2 -> {
                    System.out.print("请输入新的上映时间：");
                    int date = S.nextInt();
                    movie.setDate(date);
                    System.out.println("修改上映时间成功！");
                }
                case 3 -> {
                    System.out.print("请输入新的票量：");
                    int ticketsCount = S.nextInt();
                    movie.setTicketsCount(ticketsCount);
                    System.out.println("修改票量成功！");
                }
                case 0 -> System.out.println("退出成功!");
            }
        }else{
            System.out.println("暂时没有该电影！");
        }
    }
    /**
     * 管理员操作4，显示所有电影
     */
    private void showAllMovies() {
        for (int i = 0; i < moviesIndex; i++) {
            System.out.println(movies[i]);
        }

    }
    /**
     * 管理员操作5，显示所有用户
     */
    private void showAllUsers() {
        for (int i = 0; i < usersIndex; i++) {
            System.out.println(users[i]);
        }
    }

    /**
     * 用户界面
     */
    private void userOpe(){
        while (true){
            userMenu();
            System.out.print("请输入你要操作的编号：");
            int num= S.nextInt();
            switch (num){
                case 1-> updateUser();
                case 2-> showUserInfo();
                case 3-> showAllMovies();
                case 4-> buyTicket();
                case 5-> showBoughtTickets();
                case 0-> {
                    System.out.println("退出用户界面成功");
                    return;
                }
            }
        }
    }

    /**
     * 用户菜单
     */
    private void userMenu(){
        System.out.println("-+------------------+-");
        System.out.println("1.修改用户信息");
        System.out.println("2.查询用户信息");
        System.out.println("3.显示所有电影");
        System.out.println("4.购买电影票");
        System.out.println("5.显示购买的所有电影票");
        System.out.println("0.退出");
        System.out.println("-+------------------+-");
    }
    /**
     * 用户操作1，修改用户信息
     */
    private void updateUser() {
        System.out.println("1->用户名,2->密码,3->电话号码,0->取消");
        System.out.print("你要修改哪些内容？");
        int type=S.nextInt();
        switch (type){
            case 1->{
                System.out.print("请输入新的用户名：");
                String name=S.next();
                login.setUsername(name);
                System.out.println("用户名修改成功！");
            }
            case 2->{
                System.out.print("请输入新的密码：");
                String password=S.next();
                password=checkPassword(password);
                login.setPassword(password);
                System.out.println("密码修改成功！");
            }
            case 3->{
                System.out.print("请输入新的电话号码：");
                String phone=S.next();
                phone=checkPhone(phone);
                login.setPhone(phone);
                System.out.println("电话号码修改成功！");
            }
            case 0-> System.out.println("取消成功！");
        }
    }
    /**
     * 用户操作2，查询用户信息
     */
    private void showUserInfo() {
        System.out.println(login);
    }
    /**
     * 用户操作4，购买电影票
     */
    private void buyTicket() {
        System.out.print("请输入你购买的电影名：");
        String name=S.next();
        Movie movie=selectMovieByName(name);
        if(movie==null){
            System.out.println("没有找到此电影！");
        } else if (movie.getTicketsCount()==0) {
            System.out.println("抱歉，《"+name+"》已售光！");
        }else{
            System.out.print("请输入购买张数：");
            int count=S.nextInt();
            if(!buyTickets(movie,count)){
                System.out.println("抱歉，《"+movie.getName()+"》 余票不足！");
            }else{
                System.out.println("购买"+count+"张《"+name+"》成功！");
            }
        }
    }

    /**
     *用户操作5，显示所有购买的电影票
     */
    private void showBoughtTickets() {
        if(login.getIndex()==0){
            System.out.println("查询不到购买的电影票信息！");
            return;
        }
        for (int i = 0; i < login.getIndex(); i++) {
            System.out.println(login.getBoughtMovies()[i].showTicketsInfo());
        };
    }
    /**
     * 根据输入的name查询电影信息
     * @param name 要查询的电影名
     * @return 若找到返回电影对象，若没有返回空
     */
    private Movie selectMovieByName(String name){
        for (int i = 0; i < moviesIndex; i++) {
            if(Objects.equals(movies[i].getName(),name)){
                return movies[i];
            }
        }
        return null;
    }
    /**
     * 查找用户（根据电话，密码，身份）
     * @param user 要查询的用户
     * @return 若有返回用户，没有返回null
     */
    private User selectUser(User user){
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
    private User selectUser(String phone){
        for (int i = 0; i < usersIndex; i++) {
            if(Objects.equals(users[i].getPhone(),phone)){
                return users[i];
            }
        }
        return null;
    }

    /**
     * 新增电影
     * @param movie 要添加的电影对象
     */
    private void addMovie(Movie movie){
        growMovies();
        movies[moviesIndex]=movie;
        moviesIndex++;
    }

    /**
     * 新增用户
     * @param user 要添加的用户对象
     */
    private void addUser(User user){
        growUsers();
        users[usersIndex]=user;
        usersIndex++;
    }
    /**
     * 扩容存储电影信息的对象数组
     */
    private void growMovies(){
        if(moviesIndex==movies.length){
            Movie[] newMovies=new Movie[movies.length*2];
            System.arraycopy(movies,0,newMovies,0,movies.length);
            movies=newMovies;
        }
    }
    /**
     * 扩容存储用户信息的对象数组
     */
    private void growUsers(){
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
    private boolean deleteMovie(String name) {
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
    /**
     * 购买电影票
     * @param movie 要购买的电影
     * @param boughtCount 购买的数量
     * @return 若余票充足则购买成功返回是，否则返回否
     */
    public boolean buyTickets(Movie movie, int boughtCount){
        growBoughtTickets();
        int remain=movie.getTicketsCount();
        if(boughtCount<=remain){
            remain-=boughtCount;
            for (int i = 0; i < login.getIndex(); i++) {
                int count=login.getBoughtMovies()[i].getBoughtCount();
                if(login.getBoughtMovies()[i].equals(movie)){
                    login.getBoughtMovies()[i].setBoughtCount(count+boughtCount);
                    movie.setTicketsCount(remain);
                    return true;
                }
            }
            login.getBoughtMovies()[login.getIndex()]=movie;
            login.getBoughtMovies()[login.getIndex()].setBoughtCount(boughtCount);
            movie.setTicketsCount(remain);
            login.setIndex(login.getIndex()+1);
            return true;
        }
        return false;
    }

    /**
     * 购买电影票组扩容
     */
    public void growBoughtTickets(){
        if(login.getIndex()==login.getBoughtMovies().length){
            Movie[] newBoughtMovies=new Movie[login.getBoughtMovies().length*2];
            System.arraycopy(login.getBoughtMovies(),0,newBoughtMovies,0,login.getIndex());
            login.setBoughtMovies(newBoughtMovies);
        }
    }
}
