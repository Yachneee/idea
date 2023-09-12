package day2_912.practice;

import java.io.File;

/**
 * @author Administrator
 */
public class Pra4Delete {
    public static void main(String[] args) {
        File file=new File("D:\\fileTest\\deleteTest");
        deleteSubFile(file);

    }
    public static void deleteSubFile(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.delete()){
                System.out.println(f.getName()+" 删除成功！");
            }else {
                System.out.println(f.getName()+" 文件夹非空，先删除子文件: ");
                deleteSubFile(f);
                System.out.println(" 再次删除 "+f.getName()+(f.delete()?" 成功":" 失败"));
            }
        }
    }
}
