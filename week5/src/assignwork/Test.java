package assignwork;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class Test {
    static Scanner sc=new Scanner(System.in);
    static User man2;
    static MovieTheater cinema=new MovieTheater(10,20);
    public static void main(String[] args) {
        while(true){
            menu();
            System.out.print("请输入操作数：");
            int num = sc.nextInt();
            switch (num){
                case 1-> findMovie();
                case 2-> showAllMovies();
                case 3-> logManager();
                case 4-> logUser();
                case 5-> regisUser();
                case 6-> {
                    System.out.println("退出成功！");
                    return;
                }
            }
        }
    }

    /**
     * 进入系统后显示的功能列表
     */
    public static void menu(){
        System.out.println("-+---------------------------+-");
        System.out.println("1.查询电影信息");
        System.out.println("2.显示所有电影信息");
        System.out.println("3.管理员登陆");
        System.out.println("4.用户登录");
        System.out.println("5.用户注册");
        System.out.println("6.退出");
        System.out.println("-+----------------------------+-");
    }

    /**
     *（系统界面功能1）查询电影信息
     */
    public static void findMovie(){
        System.out.print("请输入电影名称：");
        String name = sc.next();
        Movie movie=cinema.findMovie(name);
        if(movie==null){
            System.out.println("暂时没有该电影!");
        }else{
            System.out.println(movie);
        }
    }

    /**
     * （系统界面功能2）显示所有电影信息(按照日期降序显示)
     */
    public static void showAllMovies(){
        sortDate(cinema.getMovies());
        cinema.showAllMovies();
    }

    /**
     * 按照日期降序排序电影组
     * @param movies
     */
    public static void sortDate(Movie[] movies){
        for (int i = 1; i < cinema.index1; i++) {
            int j=i-1;
            Movie current=movies[i];
            for(;j>=0 && current.getDate()>movies[j].getDate();j--){
                movies[j+1]=movies[j];
            }
            movies[j+1]=current;
        }
    }

    /**
     * （系统界面功能3）管理员登陆（先在用户组查找用户，再查看其是否为管理员（role=1））
     */
    public static void logManager(){
        System.out.print("请输入phone：");
        String phone=sc.next();
        System.out.print("请输入password：");
        String password=sc.next();
        User man=new User(phone,password);
        User man1=cinema.findUser(man);
        if(man1==null || man1.getRole()==2){
            System.out.println("你可能不是管理员，请查看输入信息是否正确！");
        }else{
            System.out.println("管理员登陆成功！");
            managerOpe();
        }
    }

    /**
     * （系统界面功能4）用户登录（在用户组中查找用户）
     */
    public static void logUser(){
        System.out.print("请输入phone：");
        String phone=sc.next();
        System.out.print("请输入password：");
        String password=sc.next();
        User man=new User(phone,password);
        User man1=cinema.findUser(man);
        man2=man1;
        if(man1==null){
            System.out.println("登陆失败，请查看输入信息是否正确！");
        }else{
            System.out.println("用户登陆成功！");
            userOpe();
        }
    }

    /**
     * （系统界面功能5）用户注册
     */
    public static void regisUser(){
        System.out.println("开始注册");
        System.out.print("请设置用户名称：");
        String username=sc.next();
        System.out.print("请设置登陆手机号：");
        String phone=sc.next();
        while(true){
            System.out.print("请设置密码：");
            String password=sc.next();
            System.out.print("请再次输入你设置的密码：");
            String pass=sc.next();
            if((!(password==null))&&(!(pass==null))&&password.equals(pass)){
                User user=new User(username,phone,password);
                if(cinema.addUser(user)){
                    System.out.println("注册成功！");
                    break;
                }
            }else{
                System.out.println("密码设置失败，请重新设置密码");
            }
        }

    }

    /**
     * 管理员界面功能列表
     */
    public static void managerList(){
        System.out.println("-+----------------------------------------------------------------------------------------+-");
        System.out.println("1. 新增电影");
        System.out.println("2. 删除电影");
        System.out.println("3. 修改电影");
        System.out.println("4. 显示所有电影");
        System.out.println("5. 查看所有用户信息");
        System.out.println("6. 退出");
        System.out.println("-+-----------------------------+-");
    }

    /**
     * 管理员操作
     */
    public static void managerOpe(){
        while(true){
            managerList();
            System.out.print("请输入你要操作的编号：");
            int num= sc.nextInt();
            switch (num){
                case 1-> addMovie();
                case 2-> deleteMovie();
                case 3-> changeMovie();
                case 4-> showAllMovies();
                case 5-> showAllUsers();
                case 6-> {
                    System.out.println("退出管理员界面成功");
                    return;
                }
            }
        }
    }

    /**
     * （管理员界面功能1）新增电影
     */
    public static void addMovie(){
        System.out.print("请输入电影的名称：");
        String name=sc.next();
        System.out.print("请输入电影的价格：");
        double price=sc.nextDouble();
        System.out.print("请输入电影的导演：");
        String director=sc.next();
        System.out.print("请输入电影的上映时间(形如: 20230101)：");
        int date=sc.nextInt();
        System.out.print("请输入电影票数量：");
        int ticketCount=sc.nextInt();
        Movie movie=new Movie(name,price,director,date,ticketCount);
        if(cinema.addMovie(movie)){
            System.out.println("新增电影成功！");
        }else{
            System.out.println("新增电影失败！");
        }
    }
    /**
     * （管理员界面功能2）删除电影（输入电影名称，删除对应电影）
     */
    public static void deleteMovie(){
        System.out.print("请输入电影名称：");
        String name=sc.next();
        cinema.deleteMovie(name);
    }
    /**
     * （管理员界面功能3）修改电影（输入电影名称，展示电影信息，选择要修改的内容（价格/上映时间），输入内容，修改已存储的电影信息）
     */
    public static void changeMovie(){
        System.out.print("请输入电影名称：");
        String name=sc.next();
        Movie movie=cinema.findMovie(name);
        if(movie==null){
            System.out.println("没有找到电影");
        }else{
            System.out.println("找到电影：\t"+ movie);
            System.out.print("请选择你要修改的内容(请输入对应编号：1.价格/2.上映时间)：");
            int i = sc.nextInt();
            if(i==1){
                System.out.print("请输入价格：");
                double price=sc.nextDouble();
                movie.setPrice(price);
                System.out.println("成功修改价格");
            }else{
                System.out.print("请输入上映时间(形如20230101)：");
                int date = sc.nextInt();
                movie.setDate(date);
                System.out.println("成功修改上映时间");
            }

        }

    }
    /**
     * （管理员界面功能5）查看所有用户信息
     */
    public static void showAllUsers(){
        cinema.showAllUsers();
    }

    /**
     * 用户界面功能列表
     */
    public static void userList(){
        System.out.println("-+------------------+-");
        System.out.println("1.修改用户信息");
        System.out.println("2.查询用户信息");
        System.out.println("3.显示所有电影");
        System.out.println("4.购买电影票");
        System.out.println("5.显示购买的所有电影票信息");
        System.out.println("6.退出");
        System.out.println("-+------------------+-");
    }

    /**
     * 用户操作
     */
    public static void userOpe(){
        while(true){
            userList();
            System.out.print("请输入你要操作的编号：");
            int num= sc.nextInt();
            switch (num){
                case 1-> changeUser();
                case 2-> showUserInfo();
                case 3-> showAllMovies();
                case 4-> buyTicket();
                case 5-> showBoughtTickets();
                case 6-> {
                    System.out.println("退出用户界面成功");
                    return;
                }
            }
        }
    }

    /**
     * （用户界面功能1）修改用户信息（选择要修改的内容（username/phone/password/role），输入内容，修改信息）
     */
    public static void changeUser(){
        while(true){
            System.out.print("请输入你要修改的内容(1->username,2->phone,3->password,4->role,5->退出)：");
            int num=sc.nextInt();
            switch (num){
                case 1-> {
                    System.out.print("请输入新的username：");
                    String username=sc.next();
                    man2.setUsername(username);
                    System.out.println("修改username成功！");
                }
                case 2-> {
                    System.out.print("请输入新的phone：");
                    String phone=sc.next();
                    man2.setPhone(phone);
                    System.out.println("修改phone成功！");
                }
                case 3-> {
                    System.out.print("请输入新的password：");
                    String password=sc.next();
                    man2.setPassword(password);
                    System.out.println("修改password成功！");
                }
                case 4-> {
                    System.out.print("请输入新的role：");
                    int role=sc.nextInt();
                    man2.setRole(role);
                    System.out.println("修改role成功！");
                }
                case 5-> {
                    System.out.println("退出成功！");
                    return;
                }
            }

        }
    }
    /**
     * （用户界面功能2）查询用户信息（展示当前登录用户信息）
     */
    public static void showUserInfo(){
        System.out.println(man2.toString());
    }
    /**
     * （用户界面功能4）选择要购买的电影票，存储到用户的movies字段，相应的电影票数量减少
     */
    public static void buyTicket(){
        System.out.print("请输入你要购买的电影票名称：");
        String name=sc.next();
        Movie movie=cinema.findMovie(name);
        if(movie==null){
            System.out.println("没有找到此电影！");
        }else if(movie.getTicketCount()==0){
            System.out.println("sorry，电影票已售光！！");
        }else{
            movie.setTicketCount(movie.getTicketCount()-1);
            if(man2.addUserMovie(movie)){
                System.out.println("购买电影票成功！");
            }else{
                System.out.println("购买电影票失败");
            }
        }
    }
    /**
     * （用户界面功能5）显示购买的所有电影票信息
     */
    public static void showBoughtTickets(){
        if(man2.index==0){
            System.out.println("你还没有购买过电影票");
        }else{
            for (int i = 0; i < man2.index; i++) {
                System.out.println(man2.getMovies()[i].toString());
            }
        }
    }
}
