public class Array1 {
    public static void main(String[] args) {
        // 需求：某部门5名员工的销售额分别是：16、26、36、6、100，请计算出他们部门的总销售额。
        // 1. 定义一个数组存储 5名员工的销售额
        // 2. 获取每个员工的销售额
        // 3. 相加
        int sell[]={16,26,36,6,100};
        int sum=0;
        for (int i = 0; i < sell.length; i++) {
            sum+=sell[i];
        }
        System.out.println("部门总销售额为："+sum);
    }
}
