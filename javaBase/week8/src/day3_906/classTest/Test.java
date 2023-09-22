package day3_906.classTest;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class Test {
    static RoleManage myRM=new RoleManage();
    static Scanner sc=new Scanner(System.in);
    private static void Menu(){
        System.out.println("=======================");
        System.out.println("1.添加角色");
        System.out.println("2.浏览所有角色");
        System.out.println("3.按照等级排序");
        System.out.println("4.按照命座排序");
        System.out.println("5.按照稀有度排序");
        System.out.println("6.按照角色名排序");
        System.out.println("7.删除所有等级不满90级的角色");
        System.out.println("0.退出");
        System.out.println("=======================");
        System.out.print("请选择你要进行的操作：");
        int type=sc.nextInt();
        switch (type){
            case 1-> addRole();
            case 2-> myRM.showAllRole();
            case 3-> {
                myRM.sortByGrade();
                myRM.showAllRole();
            }
            case 4-> {
                myRM.sortByLifeSeat();
                myRM.showAllRole();
            }
            case 5-> {
                myRM.sortByRare();
                myRM.showAllRole();
            }
            case 6-> {
                myRM.sortByName();
                myRM.showAllRole();
            }
            case 7->{
                myRM.deleteLessGrade(90);
                myRM.showAllRole();
            }
            case 0->System.exit(1);
        }
    }
    private static void addRole(){
        System.out.println("请输入角色信息：");
        System.out.print("角色名称：");
        String name=sc.next();
        System.out.print("角色属性：");
        String attribute=sc.next();
        System.out.print("稀有度：");
        String rare=sc.next();
        System.out.print("命座：");
        int lifeSeat=sc.nextInt();
        System.out.print("等级：");
        int grade=sc.nextInt();
        Role r=new Role(name,attribute,rare,lifeSeat,grade);
        myRM.addRole(r);
    }

    public static void main(String[] args) {
        while (true){
            Menu();
        }
    }
}
