package day3_906.classTest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Administrator
 */
public class RoleManage {
    final static ArrayList al=new ArrayList();
    public RoleManage(){
        al.add(new Role("魈","水","⭐⭐⭐⭐⭐",1,90));
        al.add(new Role("枫原万叶","水","⭐⭐⭐⭐⭐",0,90));
        al.add(new Role("胡桃","火","⭐⭐⭐⭐⭐",1,89));
        al.add(new Role("夜兰","风","⭐⭐⭐⭐⭐",0,89));
        al.add(new Role("雷电将军","电","⭐⭐⭐⭐⭐",0,89));
        al.add(new Role("纳西妲","草","⭐⭐⭐⭐⭐",1,89));
        al.add(new Role("神里绫华","冰","⭐⭐⭐⭐⭐",0,90));
        al.add(new Role("行秋","风","⭐⭐⭐⭐",6,89));
    }
    public void showAllRole(){
        al.forEach(obj-> System.out.println(obj));
    }
    public boolean addRole(Role r){
        return al.add(r);
    }

    /**
     * 按照等级降序
     */
    public void sortByGrade(){
        al.sort((o1, o2) -> {
            Role r1=(Role)o1;
            Role r2=(Role)o2;
            return r2.getGrade()-r1.getGrade();
        });
    }

    /**
     * 按照命座降序
     */
    public void sortByLifeSeat(){
        al.sort((o1, o2) -> {
            Role r1=(Role)o1;
            Role r2=(Role)o2;
            return r2.getLifeSeat()-r1.getLifeSeat();
        });
    }

    /**
     * 按照稀有度降序
     */
    public void sortByRare(){
        al.sort((o1, o2) -> {
            Role r1=(Role)o1;
            Role r2=(Role)o2;
            return r2.getRare().compareTo(r1.getRare());
        });
    }

    /**
     * 按照姓名升序
     */
    public void sortByName(){
        al.sort((o1,o2)->{
            Role r1=(Role)o1;
            Role r2=(Role)o2;
            return r1.getName().compareTo(r2.getName());
        });
    }

    /**
     * 删除等级小于传入等级的角色
     * @param g 传入等级
     */
    public void deleteLessGrade(int g){
        Iterator it = al.iterator();
        while(it.hasNext()){
            Role r=(Role)it.next();
            if(r.getGrade()<g){
                it.remove();
            }
        }
    }
}
