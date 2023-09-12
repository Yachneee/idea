package day2_912;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        int[] nums ={1,2,3,1};
        int k=3;
        System.out.println(judgeSameIndex(nums,k));
        System.out.println(judgeSameIndex1(nums,k));
        System.out.println();
        int[] nums2={1,0,1,1};
        int k2=1;
        System.out.println(judgeSameIndex(nums2,k2));
        System.out.println(judgeSameIndex1(nums2,k2));
        System.out.println();
        int[] nums3={1,2,3,1,2,3};
        int k3=2;
        System.out.println(judgeSameIndex(nums3,k3));
        System.out.println(judgeSameIndex1(nums3,k3));
        System.out.println();
    }
    public static boolean judgeSameIndex(int[] nums,int k){
        for (int i = 0; i < nums.length; i++) {
            int current=nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]==current&&Math.abs(j-i)<=k){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean judgeSameIndex1(int[] nums,int k){
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.add(nums[i])){
                if(set.size()>k){
                    set.remove(nums[i-k]);
                }
            } else if (set.size()<=k) {
                return true;
            }
        }
        return false;
    }
}
