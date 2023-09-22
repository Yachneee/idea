package examination;

public class Float {
    public static void main(String[] args) {
        float b= 9.8F;
        System.out.println(b);
//        int[] a={1,2,3};
//        System.out.println(a[3]);
        int[] arr1 = new int[]{11, 22, 33};

        // 把int类型的数组变量arr1赋值给int类型的数组变量arr2
        int[] arr2 = arr1;
        int[] arr3 = new int[]{11, 22, 33};

        System.out.println(arr1); // 地址
        System.out.println(arr2); // 地址(arr1的地址) 1 == 2
        System.out.println(arr3); // 地址(新分配的堆地址) 3

        arr2[1] = 99;
        System.out.println(arr1[1]); // 99 arr2中存储arr1的堆内地址，改变arr2[1],就是改变arr1[1]

        arr2 = null; // 拿到的数组变量中存储的值是null
        System.out.println(arr2);

//        System.out.println(arr2[0]);
//        System.out.println(arr2.length);

        int[] arr = {15, 9000, 10000, 20000, 9500, -5};
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        System.out.println(max);
    }
}
