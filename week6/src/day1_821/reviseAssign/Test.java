package day1_821.reviseAssign;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Test {
    static final Scanner S=new Scanner(System.in);
    static final MovieTheater mt=new MovieTheater(10,10);
    static User login;
    public static void main(String[] args) {
        System.out.println("********欢迎来到开发喵影院********");
        menu();
    }

    /**
     * 进入系统界面
     */
    public static void menu(){
        System.out.println("-+---------------------------+-");
        System.out.println("1.查询电影信息");
        System.out.println("2.显示所有电影信息");
        System.out.println("3.管理员登陆");
        System.out.println("4.用户登录");
        System.out.println("5.用户注册");
        System.out.println("0.退出");
        System.out.println("-+----------------------------+-");
        System.out.print("请输入操作选项：");
        int type = S.nextInt();
        switch (type){
            case 1->selectMovie();
            case 2->showAllMovie();
            case 3->login(1);
            case 4->login(2);
            case 5->register();
            case 0-> System.out.println("退出成功，再见！");
            default -> menu();
        }
    }


    /**
     * 系统功能1，查询电影信息
     */
    private static void selectMovie() {
        System.out.print("请输入电影名称：");
        String name = S.next();
        Movie movie=mt.selectMovieByName(name);
        if(movie==null){
            System.out.println("暂时没有该电影信息");
        }else{
            System.out.println(movie);
        }
        menu();
    }
    /**
     * 系统功能2，显示所有电影信息
     */
    private static void showAllMovie() {
        mt.showAllMovies();
        menu();
    }
    /**
     * 系统功能3,4，登录
     */
    private static void login(int role) {
        System.out.print("请输入电话：");
        String phone=S.next();
        System.out.print("请输入密码：");
        String password=S.next();
        User user=new User(phone,password,role);
        login=mt.selectUser(user);
        if(login==null){
            System.out.println("登陆失败");
            menu();
        }else{
            System.out.println("登陆成功！");
            System.out.println(login.getUsername()+"，欢迎您！");
        }
        if(role==1){
            managerMenu();
        }else{
            userMenu();
        }
    }

    /**
     * 管理员菜单
     */
    private static void managerMenu() {
        System.out.println("-+-----------------------------+-");
        System.out.println("1. 新增电影");
        System.out.println("2. 删除电影");
        System.out.println("3. 修改电影");
        System.out.println("4. 显示所有电影");
        System.out.println("5. 显示所有用户");
        System.out.println("0. 退出");
        System.out.println("-+-----------------------------+-");
        System.out.print("请输入你要操作的编号：");
        int num= S.nextInt();
        switch (num){
            case 1-> addMovie();
            case 2-> deleteMovie();
            case 3-> updateMovie();
            case 4-> showAllMovies(1);
            case 5-> showAllUsers();
            case 0-> {
                System.out.println("退出管理员界面成功");
                menu();
            }
            default -> managerMenu();
        }
    }

    /**
     * 管理员操作1，新增电影
     */
    private static void addMovie() {
        System.out.print("请输入电影的名称：");
        String name=S.next();
        System.out.print("请输入电影的价格：");
        double price=S.nextDouble();
        System.out.print("请输入电影的导演：");
        String director=S.next();
        System.out.print("请输入电影的上映时间(形如: 20230101)：");
        int date=S.nextInt();
        Movie movie=new Movie(name,price,director,date);
        mt.addMovie(movie);
        System.out.println("添加成功！"+movie);
        managerMenu();
    }

    /**
     * 管理员操作2，删除电影
     */
    private static void deleteMovie() {
        System.out.print("请输入电影名称：");
        String name=S.next();
        if(mt.deleteMovie(name)){
            System.out.println("删除成功！");
        }else{
            System.out.println("删除失败，你删除的电影可能不存在！");
        }
        managerMenu();
    }

    /**
     * 管理员操作3，修改电影
     */
    private static void updateMovie() {
        System.out.print("请输入电影名称：");
        String name=S.next();
        Movie movie=mt.selectMovieByName(name);
        if(movie!=null){
            System.out.println(movie);
            System.out.print("请选择你要修改的内容(请输入对应编号：1.价格/2.上映时间/0.退出)：");
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
                case 0 -> managerMenu();
            }
        }else{
            System.out.println("暂时没有该电影！");
        }
        managerMenu();
    }

    /**
     * 管理员操作4，显示所有电影
     */
    private static void showAllMovies(int i) {
        mt.showAllMovies();
        if(i==1){
            managerMenu();
        }else{
            userMenu();
        }
    }

    /**
     * 管理员操作5，显示所有用户
     */
    private static void showAllUsers() {
        mt.showAllUsers();
        managerMenu();
    }

    /**
     * 用户菜单
     */
    private static void userMenu() {
        System.out.println("-+------------------+-");
        System.out.println("1.修改用户信息");
        System.out.println("2.查询用户信息");
        System.out.println("3.显示所有电影");
        System.out.println("4.购买电影票");
        System.out.println("5.显示购买的所有电影票");
        System.out.println("0.退出");
        System.out.println("-+------------------+-");
        System.out.print("请输入你要操作的编号：");
        int num= S.nextInt();
        switch (num){
            case 1-> updateUser();
            case 2-> showUserInfo();
            case 3-> showAllMovies(2);
            case 4-> buyTicket();
            case 5-> showBoughtTickets();
            case 0-> {
                System.out.println("退出用户界面成功");
                menu();
            }
            default -> userMenu();
        }
    }

    /**
     * 用户操作1，修改用户信息
     */
    private static void updateUser() {
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
            default -> userMenu();
        }
        userMenu();
    }

    /**
     * 用户操作2，查询用户信息
     */
    private static void showUserInfo() {
        System.out.println(login);
        userMenu();
    }

    /**
     * 用户操作4，购买电影票
     */
    private static void buyTicket() {
        System.out.print("请输入你购买的电影名：");
        String name=S.next();
        Movie movie=mt.selectMovieByName(name);
        if(movie==null){
            System.out.println("没有找到此电影！");
        } else if (movie.getTicketsCount()==0) {
            System.out.println("抱歉，《"+name+"》已售光！");
        }else{
            System.out.print("请输入购买张数：");
            int count=S.nextInt();
            if(!login.buyTickets(movie,count)){
                System.out.println("抱歉，《"+movie.getName()+"》 余票不足！");
            }else{
                System.out.println("购买"+count+"张《"+name+"》成功！");
            }
        }
        userMenu();
    }

    /**
     *用户操作5，显示所有购买的电影票
     */
    private static void showBoughtTickets() {
        login.showBoughtTickets();
        userMenu();
    }

    /**
     * 系统功能5，用户注册
     */
    private static void register() {
        System.out.println("------开始注册-------");
        System.out.print("请设置用户名称：");
        String username=S.next();
        System.out.print("请设置登陆手机号：");
        String phone=S.next();
        // TODO 验证电话号码是否被注册了 电话号码长度在11位  length() 可以获取字符串的长度  数组中是 length 属性
        // 电话号码是11位
        phone=checkPhone(phone);
        System.out.print("请输入密码：");
        String password=S.next();
        password=checkPassword(password);
        User user=new User(username,phone,password,2,10);
        mt.addUser(user);
        System.out.println("注册成功，可以去登录了");
        menu();
    }

    /**
     * 检查电话号码是11位，且没有被注册
     * @param phone 要检查的电话号码
     * @return 11位且没有被注册的号码
     */
    public static String checkPhone(String phone){
        while(phone.length()!=11){
            System.out.print("电话号码输入有误，请重新输入：");
            phone=S.next();
        }
        while(mt.selectUser(phone)!=null){
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
    public static String checkPassword(String password){
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
}
