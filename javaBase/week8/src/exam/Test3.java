package exam;

/**
 * @author Administrator
 */
public class Test3 {
    public static void main(String[] args) {
        int[] nums ={1,2,3,1};
        int k=3;
        System.out.println(judgeSameIndex(nums,k));
        int[] nums2={1,0,1,1};
        int k2=1;
        System.out.println(judgeSameIndex(nums2,k2));
        int[] nums3={1,2,3,1,2,3};
        int k3=2;
        System.out.println(judgeSameIndex(nums3,k3));
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
}
