package day2_905.pract;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author Administrator
 */
public class Pra2 {
    static Vector foodsPrice=new Vector();
    public static double priceAverage(){
        double sum=0;
        for (Object o : foodsPrice) {
            sum += (double) o;
        }
        return sum/foodsPrice.size();
    }

    public static void main(String[] args) {
        foodsPrice.add(29.9);
        foodsPrice.add(19.9);
        foodsPrice.add(39.9);
        foodsPrice.add(9.9);
        System.out.println("商品价格平均值："+priceAverage());
    }
}
