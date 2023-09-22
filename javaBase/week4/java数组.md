------

**8.7 (Java数组初始化，数组在计算机中的存储原理)**

# 一、数组

​		数组是具有相同数据类型且按一定次序排列的一组变量的集合体。即用一个变量名表示一批数据。Java为数组在内存中分配一段连续的空间，这段空间中存储数据的个数是固定的，数组就是一个容器，用来存一批同种类型的数据的。

- 数组元素：构成数组的每一个元素
- 数组下标：下标就是数组元素在数组中的位置。下标从0开始，依次累加1，也称为索引。
- 数组大小：数组中元素的个数，也称为数组的长度。

为什么还要有数组呢？

​		eg：做一个点名器

如果用变量来做，代码繁琐：大量变量的定义。实现需求繁琐；

如果用数组来做的话，代码简洁，逻辑清晰。

​		总结：遇到批量数据的存储和操作时，数组比变量更适合

## 1. 数组的定义和访问

Java中定义数组有两种语法格式： `数据类型 数组名[];` 或`数据类型[] 数组名;`

例如： `String names[]` 或 `String[] names` 推荐第二种方式

语法解析：

- 数组是什么数据类型，数组的元素就是什么数据类型

- 数组的特征是[ ]

- 数组是引用类型

> 数组有两种初始化的方式，一种是静态初始化、一种是动态初始化。

### 1.1 静态初始化数组

定义数组、为数组元素分配内存、数组元素初始化，这三步可以合并在一起写，例如:

`int[] scores = new int[]{12,56,34,78};`

或  `int[] scores = {12,56,34,78};`

在定义数组时直接给数组中的数据赋值这种方式称为静态初始化。标准格式是

```java
数据类型[] 变量名 = new 数据类型[]{元素1,元素2,元素3};
简化为：
数据类型[] 变量名 = {元素1,元素2,元素3};
```



###### 2.1.1 数组在计算机中的基本原理

以 `int[] ages = {12,24,36}; `为例，它在计算机中的做的事情（原理）：

- 首先，左边 `int[] ages` 表示定义了一个数组类型的变量，变量名叫ages；

- 其次，右边 `{12,24,36}` 表示创建一个数组对象，可以理解为一个能装数据的东西。这个对象在内存中会有一个地址值 `[I@4c873330` ，每次创建一个数组对象都会有不用的地址值；

- 然后，把右边的地址值 `[I@4c873330` 赋值给左边的ages变量；

- 所以，ages变量就可以通过地址值，找到数组这个东西；

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807224434339.png" alt="image-20230807224434339" style="zoom: 33%;" />

###### 2.1.2 数组的元素访问

​		`访问`——>获取数组中数据的值、或者给数组中的数据赋值。

​		数组中存储的数据我们叫做元素；而且数组中的每一个元素都有一个编号与之对应，我们把这个编号叫做索引，这个索引是从0依次递增的整数。

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807224642600.png" alt="image-20230807224642600" style="zoom: 33%;" />

要想访问数组中的元素，格式如下

```java
// 数组名可以找到数组对象的地址，再通过索引就可以定位到具体的元素了
数组名[索引] // 索引 0 --> 长度 - 1
```

eg:

```java
// 索引： 0 1 2
int[] arr = {12, 24, 36}; // 静态初始化
// 1、访问数组的全部数据
System.out.println(arr[0]); // 12
System.out.println(arr[1]); // 24
System.out.println(arr[2]); // 36
// 下面代码没有3索引，会出现ArrayIndexOutOfBoundsException 索引越界异常
// System.out.println(arr[3]);
// 2、修改数组中的数据
arr[0] = 66;
arr[2] = 100;
System.out.println(arr[0]); //66
System.out.println(arr[1]); 0
System.out.println(arr[2]); //100
```

获取数组中元素的个数(数组的长度)

```java
// 3、访问数组的元素个数：数组名.length
System.out.println(arr.length);
// 技巧：获取数组的最大索引: arr.length - 1(前提是数组中存在数据)
System.out.println(arr.length - 1);
int[] arr2 = {};
// arr2[arr2.length - 1]
System.out.println(arr2.length - 1);
```

###### 2.1.3 数组的遍历		

数组遍历就是将数组中的元素一个一个的取出来。

使用for循环从`0`开始一直遍历到`长度-1`的位置，就可以获取所有的索引；获取到每一个索引,就获取到每一个元素。

eg:

```java
int[] ages = {12, 24, 36};
for (int i = 0; i < ages.length; i++) {
// i的取值 = 0, 1, 2
System.out.println(ages[i]);
}
```

静态初始化例子：

```java
需求：某部门5名员工的销售额分别是：16、26、36、6、100，请计算出他们部门的总
销售额。
需求分析：
1.看到有16、26、36、6、100这5个数据数据，而且数据值很明确;
1)想到,可以使用数组静态初始化把这5个数据存起来
2.请计算出他们部门的总销售额（这不就是求数组中数据的和吗？）
2)必须先将数组中所有的元素遍历出来
3)想要求和，得先有一个求和变量sum
4)再将每一个元素和求和变量sum进行累加（求和思想）
    
    
// 1、定义一个数组存储5名员工的销售额
//索引 0 1 2 3 4
int[] money = {16, 26, 36, 6, 100};
// 3、定义一个变量用于累加求和
int sum = 0;
// 2、遍历这个数组中的每个数据。
for (int i = 0; i < money.length; i++) {
// i = 0 1 2 3 4
sum += money[i];
}
System.out.println("员工的销售总额：" + sum);   
```

### 1.2 数组的动态初始化

​		动态初始化不需要我们写出具体的元素，而是指定元素类型和长度就行。格式如下

`数据类型[] 数组名;`

`数组名 = new 数据类型[数组长度];`

eg:      `string[] names;`

​         `names = new String[5];`

定义数组和为数组元素分配内存，这两步可以合并在一起写，例如：

`String[] names = new String[5];`

```java
// 数据类型[] 数组名 = new 数据类型[长度];
int[] arr = new int[3];
```

​		下面是动态初始化数组的原理图。我们发现 int[] arr 其实就是一个变量，它记录了数组对象的地址值，而且数组中的元素默认值是0。

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807233126850.png" alt="image-20230807233126850" style="zoom: 33%;" />

> 注意：使用动态初始化定义数组时，根据元素类型不同，默认值也有所不同。

| 数组元素类型           | 默认初始值         |
| ---------------------- | ------------------ |
| byte，short，int，long | 0                  |
| float，double          | 0.0                |
| char                   | '\u0000'（空字符） |
| boolean                | false              |
| 引用数据类型           | null               |

数组动态初始化例子：

```java
案例需求：
某歌唱比赛，需要开发一个系统：可以录入6名评委的打分，录入完毕后立即输出平均分做为选手得分
需求分析：
1.需要录入6名评委的分数，可以用一个数组来保存。
    因为在评委没有录入分数之前，还不确定数组中应该存哪些数据。所以可以使用数组的动态初始化
2.遍历数组中的每一个位置，并录入分数，将分数存入数组中
3.遍历数组中的每一个元素，对元素求和
    
public static void main(String[] args) {
	double[] scores = new double[6];
	Scanner sc = new Scanner(System.in);
	for (int i = 1; i <= 6; i ++) {
		System.out.println("请输入第" + i + "个评委的成绩：");
		double score = sc.nextDouble();
		scores[i - 1] = score;
	}
	double sum = 0;
	double avg = 0;
	for (int i = 0; i < scores.length; i++) {
		System.out.println(scores[i]);
		sum += scores[i];
	}
	avg = sum / scores.length;
	System.out.println("选手的成绩是" + avg);
}
```

使用数组实现斐波拉切数列

```java
public class ArrayFibonacci {
    public static void main(String[] args) {
        // 输入num  输出前num个数 存储到数组 再输出
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入你想要的数列长度：");
        int num = sc.nextInt();
        int Fibo[]=new int[num];
        Fibo[0]=1; //第一个值
        if(num>=2){
            Fibo[1]=1; //第二个值
            for (int i = 2; i < num; i++) {
                Fibo[i]=Fibo[i-2]+Fibo[i-1];
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println(Fibo[i]);
        }

    }
}
```



### 1.3 数组使用过程可能出现的问题

```java
public class ArrayDemo03{
	public static void main(String[] args){
		int[] scores = {32,45,45,76};
		System.out.println(scores[5]); // 下标越界
		
        int[] ages = {32,43,444,32,'a'};
		System.out.println(ages[4]); // 97 (char 会自动转换成 int )
		
        int[] ages1 = {32,43,444,32L};  // 初始化时报错
		ages1[2] = 100;
		ages[2] = 100L;
		System.out.println(ages1[3]); 
	}
}
```

- 如果在数组中保存的元素可以自动提升(自动类型转化)为数组自己的类型，则可以保存的

- 数组下标越界

## 2. 数组在计算机中的执行原理

​		数组是一个容器，变量也是一个容器，但执行原理不同。

### 2.1 数组的执行原理，**Java**程序的执行原理

程序在内存中执行。Java程序把编译后的字节码加载到Java虚拟机中执行。

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230813204410572.png" alt="image-20230813204410572" style="zoom:50%;" />

Java为了便于虚拟机执行Java程序，将虚拟机的内存划分为 方法区、栈、堆、本地方法栈、寄存器 这5块区域。

重点关注 方法区、栈、堆。

- 方法区：字节码文件先加载到这里

  ```java
  Random rand = new Random();
  Scanner sc = new Scanner(System.in);
  ```

- 栈：方法运行时所进入的内存区域，由于变量在方法中，所以变量也在这一块区域中

- 堆：存储new出来的东西，并分配地址。由于数组是new 出来的，所以数组也在这块区域。

eg:

```java
public class ArrayDemo1 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a); // 10
		int[] arr = new int[]{11, 22, 33}; // 静态初始化
		System.out.println(arr); // 地址
		System.out.println(arr[1]); // 22
		arr[0] = 44;
		arr[1] = 55;
		arr[2] = 66;
		System.out.println(arr[0]); // 44
		System.out.println(arr[1]); // 55
		System.out.println(arr[2]); // 66
	}
}
```

例子执行的内存原理如下图所示，按照① ② ③ ④ ⑤ ⑥ 的标记的顺序：

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230813204835831.png" alt="image-20230813204835831" style="zoom:50%;" />

 

`int a = 10 `与 `int[] arr = new int[]{11,22,33}`的区别：

- **a**是一个变量，在栈内存中，**a**变量中存储的数据就是**10**这个值。

- **arr**也是一个变量，在栈中，存储的是数组对象在堆内存中的地址值

```java
// 这里的int a是一个基本类型变量，存储的是一个数值
int a = 10 ;
//这里的int[] arr是一个引用类型的变量，存储的是一个地址值
int[] arr = new int[]{44,55,66};
```



### 2.2 多个变量指向同一个数组的问题

数组类型的变量，指向的是堆内存中数组对象的地址。

在实际开发中可能存在一种特殊情况——多个变量指向同一个数组对象的形式

```java
public class ArrayDemo2 {
	public static void main(String[] args) {
		// 目标：认识多个变量指向同一个数组对象的形式，并掌握其注意事项。
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
		System.out.println(arr2); // null

        //System.out.println(arr2[0]); //NullPointerException: Cannot load from int array because "arr2" is null at...
        //System.out.println(arr2.length); //NullPointerException: Cannot read the array length because "arr2" is null at...
	}
}
```

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230813212209460.png" alt="image-20230813212209460" style="zoom: 33%;" />

![image-20230813213132699](https://gitee.com/Yachnee/images/raw/master/images/image-20230813213132699.png)

刚执行完`int[] arr1 = {11,22,33};`时，内存原理如下：

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230813213408339.png" alt="image-20230813213408339" style="zoom:50%;" />

当执行完 `int[] arr2 = arr1; `后，内存原理如下：

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230813213452555.png" alt="image-20230813213452555" style="zoom:50%;" />

当执行到 `arr2[1]=99;`时 ，内存原理如下：

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230813213539405.png" alt="image-20230813213539405" style="zoom:50%;" />

总结:

- 两个变量指向同一个数组时，两个变量记录的是同一个地址值。

- 当一个变量修改数组中的元素时，另一个变量去访问数组中的元素，元素已经被修改过了。

## 3. 数组专项练习

### 3.1 数组求最值

> 需求：定义一个int类型数组，求数组中元素的最大值，并打印最大值 

先看选美比赛是怎么选出颜值最高的人的，然后以此思路来写代码，找出数组中元素的最大值。

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230813213942777.png" alt="image-20230813213942777" style="zoom:50%;" />

数组求最大值思路：

​		1) 先找出数组中0索引的元素，假设为最大值，用max表示【擂主】

​		2) 遍历后面的每一个元素和max比较，把较大的元素值重新赋值给max(擂主换人)

​		3) 最后max就是所有元素的最大值(最后站在台上的擂主)

```java
int[] arr = {15, 9000, 10000, 20000, 9500, -5};
int max=arr[0];
for (int i = 1; i < arr.length; i++) {
    max = max > arr[i] ? max : arr[i];
}
System.out.println(max);
```

### 3.2 使用增强**for**循环遍历数组

`JDK1.5`及其之后的版本中提供了增强for循环语句，实现了`Iterable`接口的类都可以使用增强for循环进行元素的迭代。增强for循环的语法规则如下：

```java
for (元素类型 变量名 : 要迭代的对象) {
	System.out.println(变量名);
}

int[] arr = {15, 9000, 10000, 20000, 9500, -5};
for (int e : arr) {
	System.out.println(e);
}

for (int i = 0; i < arr.length; i ++) {
	System.out.println(arr[i]);
}

for (;;) {
    
}
```

语法解析：

- 元素类型是指数组或集合中的元素的类型。
- 变量名在循环时用来保存每个元素的值。
- 冒号后面是要遍历的数组或集合的名称。

------

**8.8 (数组元素反转，选择排序、插入排序)**

### 3.3 数组元素反转

```java
// 现有一个 int 数组，数组中有十个元素。将数组反转后输出。
	int[] arr = new int[]{9, 1, 3, 4, 54, 56, 23, 22, 20, 43};
```

只需将第一个和最后一个元素互换、第二个和倒数第二个互换、依次内推.... 

1. 每次交换，需要有左右两边的两个索引，我们可以用i和j表示刚开始i=0，j=数组长度-1;

2. 每次让i和j索引位置的两个元素互换位置，arr[i]和arr[j]互换位置

3. 每次还完位置之后，让i+1  往右移动一位，让j-1  往前移动一位

具体代码如下：

```java
public static void main(String[] args) {
	// 现有一个 int 数组，数组中有十个元素。将数组反转后输出。
	int[] arr = new int[]{9, 1, 3, 4, 54, 56, 23, 22, 20, 43};
	// for (int i = arr.length - 1; i >= 0; i--) {
	// System.out.println(arr[i]);
	// }
	for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++,j--) {
		// int temp = arr[i];
		// arr[i] = arr[j];
		// arr[j] = temp;
		arr[i] = arr[i] ^ arr[j]; // 1100 0000 1100 1100 0000
		arr[j] = arr[i] ^ arr[j]; // arr[i]^arr[j]^arr[j] = arr[i]^0 = arr[i]
    	arr[i] = arr[i] ^ arr[j]; // arr[i]^arr[j]^arr[i] = 0^arr[j] = arr[j]
	}
	for (int a : arr) {
		System.out.println(a);
	}
}
```

### 3.4 排序

​		[排序算法](十大经典排序算法最强总结（含Java代码实现） - 张凯的文章 - 知乎 https://zhuanlan.zhihu.com/p/34894768) 有多种，常用的排序算法有冒泡排序、插入排序、选择排序、快速排序、

堆排序、归并排序、希尔排序、二叉树排序、计数排序等。

#### 3.4.1 `选择排序`

​		表现最稳定的排序算法之一，因为无论什么数据进去都是**O(** **n<sup>2</sup>)**的时间复杂度，所以用到它的时候，数据规模越小越好。唯一的好处可能就是不占用额外的内存空间。理论上讲，选择排序可能也是平时排序一般人想到的最多的排序方法。

选择排序(Selection-sort)是一种简单直观的排序算法。它的工作原理：

​		首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。

​		n个记录的直接选择排序可经过n-1趟直接选择排序得到有序结果。具体算法描述如下：(升序)

- 初始状态：无序区为R[1..n]，有序区为空；


- 第 i 趟排序 (i=1,2,3…n-1) 开始时 ， 当前有序区和无序区分别为 R(1..i-1) 和R(i..n）。该趟排序从当前无序区中选出关键字最小的记录 R[k]，将它与无序区的第1个记录R交换，使R[1..i]和R[i+1..n)分别变为记录个数增加1个的新有序区和记录个数减少1个的新无序区；


- n-1趟结束，数组有序化了。

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230813223811212.png" alt="image-20230813223811212" style="zoom:50%;" />

```java
//选择排序
        for (int i = 0; i < a.length; i++) {  //遍历数组，每次从排序好的数组的下一个开始
            int current=a[i];
            int minIndex=i;
            for (int j = i+1; j < a.length; j++) {  //从a[i]的下一个开始和a[minIndex]比较，找到最小数的下标，
                if(a[minIndex]>a[j]){
                    minIndex=j;  //改变minIndex为较小值的下标，再用a[minIndex]和后面的数再比较
                }
            }
            a[i]=a[minIndex];  //交换current与a[minIndex]
            a[minIndex]=current;
        }
```



#### 3.4.2 `插入排序`

​		插入排序的算法描述是一种简单直观的排序算法。它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。插入排序在实现上，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。算法描述:(升序)

- 从第一个元素开始，该元素可以认为已经被排序；

- 取出下一个元素，在已经排序的元素序列中从后向前扫描；

- 如果该元素（已排序）大于新元素，将该元素移到下一位置；

- 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；

- 将新元素插入到该位置后；

- 重复步骤2~5。

![image-20230813224831398](https://gitee.com/Yachnee/images/raw/master/images/image-20230813224831398.png)

```java
int[] a=new int[]{3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        //进行插入排序
        for (int i = 1; i < a.length; i++) {    //从下标为1开始向右取值（遍历），每次取值a[i]，左边的元素都已按升序完成排序
            int current=a[i];
            int prevIndex=i-1;
            for(;prevIndex>=0 && current<a[prevIndex];prevIndex--){    //从i-1开始向左取值，和a[i]比较，若 j<0 | a[j]>a[i] 停止for循环
                a[prevIndex+1]=a[prevIndex];   //向右移一位（进入循环，说明比a[i]小，要向右移一位）
            }
            a[prevIndex+1]=current;  //比a[i]小的所有向右移后，j还会减一，所以把a[i]放到j+1处
        }
```

------

**8.9 (冒泡排序、二分查找、随即排名、多维数组)**

#### 3.4.3 `冒泡排序`

​		它重复地走访过要排序的数组，一次比较两个元素，如果它们的顺序错误就把它们交换过来。走访数组的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。

![image-20230813225319917](https://gitee.com/Yachnee/images/raw/master/images/image-20230813225319917.png)

```java
for (int i = 0; i < a.length-1; i++) {
	for (int j = 0; j < a.length-1-i; j++) {
        if(a[j]>a[j+1]){
            a[j]=a[j]^a[j+1];
            a[j+1]=a[j]^a[j+1];
            a[j]=a[j]^a[j+1];
        }
    }
}
```



### 3.5 二分查找

​		二分查找（Binary Search）算法，也叫折半查找算法。二分查找的思想非常简单，有点类似分治的思想。二分查找针对的是一个**有序**的数据集合，每次都通过跟区间的中间元素对比，将待查找的区间缩小为之前的一半，直到找到要查找的元素，或者区间被缩小为 0。

![image-20230813225455292](https://gitee.com/Yachnee/images/raw/master/images/image-20230813225455292.png)

```java
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int[] arr={11,23,45,68,69,70};
     System.out.print("请输入一个数字：");
     int num=sc.nextInt();
     int index=-1;
     int start=0;
     int end=arr.length-1;
     while(start<=end){
     	int mid=(start+end)/2;
        if(num<arr[mid]){
        	end=mid-1;
        } else if (num>arr[mid]) {
        	start=mid+1;
        }else{
        	index=mid;
     	}
     }
     System.out.print(num+"在arr中的下标为："+index);
```

### 3.6 随机排名

​		通过数组元素反转的案例，学会了如何对两个数据进行交换。接下来，再学习随机排名案例，将数据交换的思路巩固。

需求：某公司开发部5名开发人员，要进行项目进展汇报演讲，现在采取随机排名后进行汇报。请先依次录入5名员工的工号，然后展示出一组随机的排名顺序。

分析：

1. 在程序中录入5名员工的工号存储起来 ---> 使用动态初始化数组的方式。

2. 依次遍历数组中的每个数据。

3. 每遍历到一个数据，都随机一个索引值出来，让当前数据与该索引位置处的数据进行交换。

如下图所示，每次遍历到一个元素，随机将当前位置元素和随机索引元素换位置。

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230813230657667.png" alt="image-20230813230657667" style="zoom: 50%;" />

```java

import java.util.Random;
import java.util.Scanner;

public class SortRandom {
    public static void main(String[] args) {
        // 目标：完成随机排名
        // 1、定义一个动态初始化的数组用于存储5名员工的工号
        int[] codes = new int[5];
        // 2、提示用户录入5名员工的工号。
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            // i = 0 1 2 3 4
            System.out.println("请您输入第" + (i + 1) + "个员工的工号：");
            int code = sc.nextInt();
            codes[i] = code;
        }
        // 3、打乱数组中的元素顺序。
        // [12, 33, 54, 26, 8]
        // i index
        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {
            // codes[i]
            // 每遍历到一个数据，都随机一个数组索引范围内的值。
            //然后让当前遍历的数据与该索引位置处的值交换。
            int index = r.nextInt(codes.length); // 0 - 4
            // 定义一个临时变量记住index位置处的值
            int temp = codes[index];
            // 把i位置处的值赋值给index位置处
            codes[index] = codes[i];
            // 把index位置原来的值赋值给i位置处
            codes[i] = temp;
        }
        // 4、遍历数组中的工号输出即可
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + " ");
        }
    }
}
```

## 4. 多维数组

​		在 Java 中，可以使用多维数组来存储多个数据值，以便更好地组织和访问这些数据。Java 中的多维数组是一种数组的数组，即一个数组的元素也是一个数组。Java 中的多维数组可以包含任意数量的维度。在处理多维数组时，需要注意数组下标的范围，以避免数组越界异常。同时，还可以使用循环嵌套来遍历多维数组中的所有元素。

### 4.1 二维数组

Java中定义和操作多维数组的语法与一维数组类似。在实际应用中，三维及其以上的数组使用很少，主要使用二维数组。使用二维数组同一维数组的步骤，（1）定义数组、（2）为数组元素分配内存、（3）数组元素初始化、（4）使用数组。

#### 4.1.1  定义二维数组

定义二维数组的语法规则如下：

​		`数据类型[ ][ ] 数组名;`		或者		`数据类型 数组名[ ][ ];`

语法解析：

`[][]` 表示二维数组，前面的[ ]表示第一维，后面的[ ]表示第二维。

`[][]` 放在数组名的前面或后面都是正确的。

#### 4.1.2 分配内存

```java
int[][] arr = new int[3][4];
```

#### 4.1.3 数组元素初始化

```java
// 二维数组初始化
int[][] arr = new int[3][4]; // 动态初始化
arr[0][0] = 1;
int[][] arr1 = new int[][]{ // 静态初始化
	{1, 2, 3},
	{2, 3},
	{3, 4, 5, 4}
};
```

#### 4.1.4 二维数组的迭代

```java
for (int i = 0; i < arr1.length; i++) {
	System.out.println(arr1[i]);
	for (int i1 = 0; i1 < arr1[i].length; i1++) {
		System.out.println(arr1[i][i1]);
	}
}
for (int[] t : arr1) {
	for (int a : t) {
		System.out.println(a);
	}
}
```

练习：

```java
// 需求：打印杨辉三角形(行数可以键盘录入)
// 1 0
// 1 1 1
// 1 2 1 2
// 1 3 3 1 3
// 1 4 6 4 1 4
// 1 5 10 10 5 1 5
// 分析：看这种图像的规律
// A:任何一行的第一列和最后一列都是1
// B:从第三行开始，每一个数据是它上一行的前一列和它上一行的本列之和。
// 步骤：
// A: 首先定义一个二维数组。行数如果是n，我们把列数也先定义为n。
// 这个n的数据来自于键盘录入。
// B: 给这个二维数组任何一行的第一列和最后一列赋值为1
// C: 按照规律给其他元素赋值
// 从第三行开始，每一个数据是它上一行的前一列和它上一行的本列之和。
// D: 遍历这个二维数组。

public class PanscleTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入行数：");
        int n=sc.nextInt();
        int[][] tr=new int[n][n];
        for (int i = 0; i < tr.length; i++) {
			for (int j = 0; j <i+1; j++) {
                if(j==0||j==i){
                    tr[i][j]=1;
                }else{
                    tr[i][j]=tr[i-1][j]+tr[i-1][j-1];
                }
            }

        }
        for (int[] r : tr) {
            for (int c : r) {
                if(c!=0){
                    System.out.print(c+"\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

public class PanscleTriangle1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入行数：");
        int n=sc.nextInt();
        int[][] tr=new int[n][];
        for (int i = 0; i < tr.length; i++) {
            tr[i]=new int[i+1];
            for (int j = 0; j < tr[i].length; j++) {
                if(j==0||j==tr[i].length-1){
                    tr[i][j]=1;
                }else{
                    tr[i][j]=tr[i-1][j]+tr[i-1][j-1];
                }
            }
        }
        for (int[] r : tr) {
            for (int c : r) {
                System.out.print(c+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}

```

------

**8.10 (数组工具类+方法)**

## 5. 数组工具类

### 5.1 **Arrays**类

​		JDK中提供了一个专门用于操作数组的工具类，即Arrays类，位于java.util包中。该类提供了一些列方法来操作数组，如排序、复制、比较、填充等，用户直接调用这些方法即可，不需要自己编码实现，降低了开发难度。Arrays类的常用方法

| 方法                                              | 返回类型            | 说明                                                         |
| ------------------------------------------------- | ------------------- | ------------------------------------------------------------ |
| `equals(array1,array2) `                          | boolean             | 比较两个数组是否相等                                         |
| `sort(array) `                                    | void                | 对数组array的元素进行排序                                    |
| `toString(array) `                                | String              | 将一个数组array转换成一个字符串                              |
| `fill(array,val) `                                | void                | 把数组array的所有元素都赋值成val                             |
| `copyOf(array,length)`                            | 与array数据类型一致 | 把数组array复制成一个长度为length的新数组                    |
| `binarySearch(array,val) `                        | int                 | 查询元素值val在数组array中的下标                             |
| `compare(array1,array2) `                         | int                 | 按字典顺序比较数组，前面的数组大，返回大于0的值，反之返回小于0的值 |
| `copyOfRange(arr,start,end)`                      | 与array数据类型一致 | 将指定数组的指定范围复制到新数组中。                         |
| `fill(arr,start,end, val) `                       | void                | 将指定的值分配给指定数组的指定范围的每个元素。               |
| `mismatch(array1,array2) `                        | int                 | 查找并返回两个数组之间第一个不匹配的索引，如果未找到不匹配，则返回 -1。 |
| `mismatch(array1,start1,end1,array2,start2,end2)` | int                 | 查找并返回指定范围内两个数                                   |

### 5.2 **Arrays**类的应用

#### 5.2.1比较两个数组是否相等

Arrays类的equals()方法用于比较两个数组是否相等。

只有当两个数组长度相等，对应位置的元素也一一相等时，该方法返回true，否则返回false。

#### 5.2.2 对数组元素进行升序排序

Arrays类的sort()方法对数组的元素进行升序排序。

#### 5.2.3 将数组转换成字符串

Arrays类中提供了专门输出数组内容的`toString()`方法。

该方法用于将一个数组转换成一个字符串。它按顺序把多个数组元素连在一起，多个数组元素之间使用英文逗号和空格隔开。利用这种方法可以很清楚地观察到各个数组元素的值。

#### 5.2.4 将数组所有元素赋值为相同的值

Arrays类的fill(array,val)方法用于把数组array的所有元素都赋值为val。

#### 5.2.5 将数组赋值成一个长度为设定值的新数组

Arrays类的`copyOf()`方法把数组复制成一个长度为设定值的新数组。

> Arrays类的`copyOf(array,length)`方法可以进行数组复制，把原数据复制成一个新数组，其中length是新数组的长度。如果length小于原数组的长度，则新数组就是原数组的前面length个元素；如果length大于原数组的长度，则新数组前面的元素就是原数组的所有元素，后面的元素是按照数组类型补充的默认值，如整数补充0，浮点数补充0.0等。

`System.arraycopy() `方法从指定的源数组复制一个数组，从指定位置开始，到目标数组

的指定位置。该方法声明如下：

```java
public static void arrcopy(Object src, int srcPos, Object dest, int destPos, int length)
```

参数解析：

- `src`：这是源数组。

- `srcPos`：这是源数组中的起始位置。

- `dest`：这是目标数组。

- `destPos`：这是目标数据中的起始位置。

- `length`: 这是要复制的数组元素的数量。

数组组件的子序列从 `src `引用的源数组复制到` dest `引用的目标数组。复制的组件数等于 length 参数。源数组中位置`srcPos`到`srcPos + length - 1`的元素被复制到目标数组的`destPos` 到 `destPos + length - 1`的位置。

#### 5.2.6 查询元素在数组中的下标

Arrays类的`binarySearch(Object[],Object key)`方法用于查询数组元素在数组中的下标。

调用该方法时要求数组中的元素已经按升序排列。如果key在数组中，则返回搜索值的索引；如果key不在数组中，返回值-1或“-”（插入点）。插入点的值有如下四种情况。

1. 搜索值是数组元素，从0开始计数，得搜索值的索引值；
2. 搜索值不是数组元素，且在数组范围内，从1开始计数，得“ - 插入点索引值”；
3. 搜索值不是数组元素，且大于数组内元素，索引值为 – (length + 1);
4. 搜索值不是数组元素，且小于数组内元素，索引值为 – 1。

练习

```java
// 定义一个5*5的二维数组并初始化，找出数组中的最大值的坐标。
int[][] arr = {
{56, 6, 3, 7, 5},
{34, 10, 5, 10, 4},
{354, 435, 34, 23, 54},
{325, 56, 98, 454, 3},
{3, 5, 7, 6, 4},
};
int a=0;
int b=0;
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        if(arr[i][j]>arr[a][b]){
            a=i;
            b=j;
        }
    }
}
System.out.println("最大值的坐标为："+a+" "+b);

// 定义一个5*5的二维数组并初始化，找出最小值的坐标，计算出该坐标周边的所有元素
之和。
public class Exercise2_1 {
    public static void main(String[] args) {
//        定义一个5*5的二维数组并初始化，找出最小值的坐标，计算出该坐标周边所有元素之和
        int[][] arr = {
                {56, 6, 3, 7, 5},
                {34, 10, 5, 10, 4},
                {354, 435, 34, 23, 54},
                {325, 56, 98, 454, 3},
                {3, 5, 7, 6, 4},
        };
        int a=0;
        int b=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]<arr[a][b]){
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println("最小值的坐标为："+a+" "+b);
        int sum1=0;
        for (int i = a-1; i <= a+1; i++) {
            for (int j =b-1; j <= b+1; j++) {
                if(!(i<0 || j<0 || i> arr.length-1 || j>arr[i].length-1 || (i==a&&j==b))) {
                    sum1+= arr[i][j];
                }
            }
        }
        int sum2=0;
        if(a-1>=0){
            sum2+=arr[a-1][b];
        }
        if(b-1>=0){
            sum2+=arr[a][b-1];
        }
        if(b+1<arr[a].length){
            sum2+=arr[a][b+1];
        }
        if(a+1<arr.length){
            sum2+=arr[a+1][b];
        }
        System.out.println("其对应数值为："+arr[a][b]+"，周边所有元素之和为："+sum1);
        System.out.println("其对应数值为："+arr[a][b]+"，上下左右所有元素之和为："+sum2);
    }
}
```

# 二、方法

方法也是Java语言中一个很重要的组成部分，在实际开发中几乎每时每刻都在使用方法。

## 1. 方法概述

​		方法是一种语法结构，它可以把一段代码封装成一个功能，以便重复调用。把一段功能代码围在一起，别人都可以来调用它。

### 1.1 方法的定义格式

下图是方法的完整格式：

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230814000723233.png" alt="image-20230814000723233" style="zoom:50%;" />

​		比如现在张工、李工两个人都需要求两个整数的和。不使用方法，代码如下：

```java
// 1、李工。
int a = 10;
int b = 20;
int c = a+b;
System.out.println("和是：" + c);
// 2、张工。
int a1 = 11;
int b1 = 20;
int c1 = a1+b1;
System.out.println("和是：" + c1);
```

​		两次求和的代码中，除了求和的数据不一样，代码的组织结构完全一样。

​		像这种做相同事情的代码，就可以用方法进行封装。需要用到这段代码功能时，让别人调用方法就行。代码如下:

```java
//目标：掌握定义方法的完整格式，搞清楚使用方法的好处。
public class MethodDemo1 {
	public static void main(String[] args) {
		// 需求：假如现在很多程序员都要进行2个整数求和的操作。
		// 1、李工。
		int rs = sum(10, 20);
		System.out.println("和是：" + rs);
		// 2、张工。
		int rs2 = sum(30, 20);
		System.out.println("和是：" + rs2);
	}
	public static int sum(int a, int b) {
		int c = a + b;
		return c;
	}
}
```

### 1.2 方法的执行流程

当调用一个方法时，执行流程，按照下列序号执行：

​	① 通过sum方法名找到sum方法

​	② 把10传递给方法中的参数a

​	③ 把20传递给方法中的参数b；

​	④ 执行方法中的代码，此时 `int c=a+b;` ; 相当于 `int c = 10+20 ; `c的值为30`return c` 的含义是，把c的结果返回给调用处。 也就是调用sum方法的结果为30

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230814001208029.png" alt="image-20230814001208029" style="zoom:50%;" />

### 1.3 定义方法的注意点

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230814001239447.png" alt="image-20230814001239447" style="zoom:50%;" />

1. 方法的修饰符：暂时都使用public static 修饰。（目前看做是固定写法，后面是可以改动的)
2. 方法申明了具体的返回值类型，内部必须使用return返回对应类型的数据。
3. 形参列表可以有多个，甚至可以没有； 如果有多个形参，多个形参必须用“，”隔开，且不能给初始化值。

### 1.4 什么是形参和实参

修饰符（Modifier）是一种关键字，用于修饰类、方法、变量等各种程序元素的声明。Java中常用的修饰符包括以下几种：

​	① 访问修饰符：用于控制程序元素的访问权限，包括public、protected、private和默认（不写任何修饰符）四种。

​	② 非访问修饰符：用于控制程序元素的行为，包括static、final、abstract、synchronized、volatile等。

​	③ 其他修饰符：包括transient、native、strictfp等。在Java中，一个程序元素可以同时拥有多个修饰符，它们的顺序可以任意排列。例如，一个方法可以同时使用public、static、final、synchronized等多个修饰符来限定它的访问权限、行为和线程安全性。

### 1.5 使用方法的好处

1. 提高了代码的复用性，提高了开发效率。
2. 让程序的逻辑更清晰。

如下图所示：写好一个方法之后，每一个人都可以直接调用，而不用再重复写相同的代码。所以是提高了代码的复用性，不用写重复代码，自然也提高了开发效率。

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230814001554498.png" alt="image-20230814001554498" style="zoom:50%;" />

后期会用所学习的技术，做一个ATM系统，ATM系统中有查看账户、存钱、取钱、修改密码等功能，到时

候我们可以把每一个功能都写成一个方法。如下图所示，这样程序的逻辑就更加清晰了。

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230814001819115.png" alt="image-20230814001819115" style="zoom:50%;" />

> 1.什么是方法？
>
> 答：方法是一种语法结构，它可以把一段代码封装成一个功能，以便重复调用
>
> 2.方法的完整格式是什么样的？
>
> ```java
> //格式如下：
> 
> 修饰符 返回值类型 方法名( 形参列表 ){
> 
> 	方法体代码(需要执行的功能代码)
> 
> 	return 返回值;
> 
> }
> ```
>
> 3.方法要执行必须怎么办？
>
> 必须调用才执行;
>
> ```java
> //调用格式:
> 
> 方法名(...);
> ```
>
> 4.使用方法有什么好处？
>
> 答：提高代码的复用性，提高开发效率，使程序逻辑更清晰。

------

**8.11 (方法)**

## 2. 方法的其他形式

前面是定义完整格式的方法。但是实际开发中，需要按照方法解决的实际业务需求，设计出合理的方法形式来解决问题。

实际上设计一个合理的方法，需要重点关注下面两点：

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230814002242404.png" alt="image-20230814002242404" style="zoom:50%;" />

### 2.1 设计一个合理的方法的原则如下：

- 如果方法不需要返回数据，返回值类型必须申明成void（无返回值申明）, 此时方法内部不可以使用return返回数据。

- 方法如果不需要接收外部传递进来的数据，则不需要定义形参，且调用方法时也不可以传数据给方法。

- 没有参数，且没有返回值类型（void）的方法，称为值无参数、无返回值方法。此时调用方法时不能传递数据给方法。

### 2.2 根据实际需求定义出合理的方法

###### 需求**1**：写一个方法，打印**3**个**"Hello World"**

分析：需求已经非常明确，打印的是3个`HelloWorld`，在方法中直接循环3次就可以完成需求。不需要外部给方法传递数据，所以不需要参数。

```java
// 打印3个“hello world”
public static void printHelloWorld() {
	for (int i = 1; i <= 3; i ++) {
		System.out.println("Hello World");
	}
}
printHelloWorld();
```

###### 需求**2**：写一个方法，打印若干个**"Hello World"**，具体多少个，由调用者指定

分析：需求不明确打印`HelloWorld`的个数，而是需要调用者指定。也就是说，调用者调用方法时需要给方法传递打印`HelloWorld`的个数。那么定义方法时，就需要写一个参数，来接收调用者传递过来的个数。

```java
// 打印n个“Hello World”，n的值由调用者指定
public static void printHelloWorld(int n) {
	for (int i = 1; i <= n; i ++) {
		System.out.println("Hello World");
	}
}
printHelloWorld(2);
printHelloWorld(3);
```

## 3. 方法使用常见的问题

- 方法在类中没有先后顺序，但是不能把一个方法定义在另一个方法中。

- 方法的返回值类型写void（无返回申明）时，方法内不能使用 return 返回数据，如果方法的返回值类型写了具体类型，方法内部必须使用 return 返回对应类型的数据。

- return语句的下面，不能编写代码，属于无效的代码，执行不到这儿。

- 方法不调用就不会执行, 调用方法时，传给方法的数据，必须严格匹配方法的参数情况。

- 调用有返回值的方法，有3种方式：

  ① 可以定义变量接收结果

  ② 或者直接输出调用，

  ③ 甚至直接调用；

- 调用无返回值的方法，只有1种方式： 只能直接调用。

## 4. 方法的案例

### 方法案例**1**

![image-20230814003004379](https://gitee.com/Yachnee/images/raw/master/images/image-20230814003004379.png)

```java
/*
分析：
需要求1~n的和，由于n不确定是多少，所以就把n写成形式参数，n的具体值由调用
者指定。
在方法中把n当做一个确定的数据来使用就行。
*/
public static int sum(int n) {
	int sum = 0;
	for (int i = 1; i <= n; i++) {
		sum +=i;
	}
	return sum;
}
```

定义好方法之后，在main方法中调用

```java
public static void main(String[] args){
    int s = sum(10);
}
```



### 方法案例**2**

![image-20230814003120922](https://gitee.com/Yachnee/images/raw/master/images/image-20230814003120922.png)

```java
/*
分析：
	需求中，是要判断一个数是奇数还是偶数，但是并没有明确说，是哪一个数。
	也就是说这个数可能是奇数，也可以能是偶数，是一个能够变化的数。
	把这个数写成方法的形式参数，就可以达到这个目的。因为调用方法时，调用者可以传递奇数，也可以传递偶数。
*/
public static String isOdd(int number) {
	return number % 2 == 0 ? "偶数" : "奇数";
}
```

定义好方法之后，在main方法中调用

```java
public static void main(String[] args){
    System.out.println(10+"是："+isOdd(10));
}
```

## 5. 方法在计算机中的执行原理

Java程序的运行，都是在内存中执行的，而内存区域又分为栈、堆和方法区。

Java的方法是在栈内存中执行。 每次调用方法，方法都会进栈执行；执行完后，又会弹栈出去。

方法进栈和弹栈的过程，就类似于手枪子弹夹，上子弹和击发子弹的过程。最后上的一颗子弹是，第一个打出来的；第一颗上的子弹，是最后一个打出来的。

假设在main方法中依次调用A方法、B方法、C方法，在内存中的执行流程如下：

- 每次调用方法，方法都会从栈顶压栈执行没执行

- 每个方法执行完后，会从栈顶弹栈出去

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230814003815327.png" alt="image-20230814003815327" style="zoom:50%;" />

### 有返回值的方法，内存分析

eg：求两个整数和的代码，在内存中的执行原理。

```java
public class MethodDemo {
	public static void main(String[] args) {
		int rs = sum(10, 20);
		System.out.println(rs);
	}
	public static int sum(int a, int b ){
		int c = a + b;
		return c;
	}
}
```

如下图所示：以上代码在内存中的执行过程，按照①②③④⑤⑥⑦的步骤执行

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230814003947395.png" alt="image-20230814003947395" style="zoom:50%;" />

### 无返回值的方法，内存分析

分析无返回值、无参数的内存原理：

```java
public class Demo2Method {
	public static void main(String[] args) {
		study();
	}
	public static void study(){
		eat();
		System.out.println("学习");
		sleep();
	}
	public static void eat(){
		System.out.println("吃饭");
	}
	public static void sleep(){
		System.out.println("睡觉");
	}
}
```

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230814004217428.png" alt="image-20230814004217428" style="zoom:50%;" />

总结：

1. 方法的运行区域在哪里？

答：栈内存。

2. 栈有什么特点？方法为什么要在栈中运行自己？

答：先进后出。保证一个方法调用完另一个方法后，可以回来继续执行。

## 6. 方法参数的传递机制

参数是基本类型时、和参数是引用类型时的区别

**Java**的参数传递机制都是：值传递

所谓值传递：指的是在传递实参给方法的形参的时候，传递的是实参变量中存储的值的副本。 请看下面这个张图：

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230814004427812.png" alt="image-20230814004427812" style="zoom: 67%;" />

#### 6.1 参数传递的基本类型数据

方法参数传递是基本类型数据时，内存执行分析：

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230814004539679.png" alt="image-20230814004539679" style="zoom:67%;" />

#### 6.2 参数传递的是引用数据类型

方法的参数是引用类型的数据时，内存执行分析：

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230814004633764.png" alt="image-20230814004633764" style="zoom:67%;" />

调用change方法时参数是引用类型，实际上也是值传递，只不过参数传递存储的地址值。此时change方法和main方法中两个方法中各自有一个变量`arrs`，这两个变量记录的是同一个地址值`[I@4c873330`，change方法把数组中的元素改了，main方法在访问时，元素已经被修改了。

总结：

> 基本类型和引用类型的参数在传递的时候有什么不同？
>
> = 都是值传递
>
> \- 基本类型的参数传递存储的数据值。
>
> \- 引用类型的参数传递存储的地址值。

## 7. 可变长度参数

​		在 Java 中，可变长度参数，也称为可变参数或不定参数，可以在方法声明中使用，用于接受不确定数量的参数。

​		使用可变长度参数时，需要在参数类型之后加上三个连续的点（...），表示这是一个可变长度参数。在方法内部，可变长度参数会被当作一个数组处理，开发者可以像操作数组一样操作这个参数。需要注意的是， `每个方法只能有一个可变长度参数，而且必须是最后一个参数`。

```java
public class Test05 {
	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3, 4, 5));
		System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9));
	}
	public static int sum(int... nums) {
		int result = 0;
		for (int num : nums) {
			result += num;
		}
		return result;
	}
}
```

​		可变长度参数只能用于方法的最后一个参数位置，并且不能和数组作为参数同时存在，否则会编译错误。在实际开发中，可变长度参数经常用于编写简化代码的`API`，以及可以接受任意数量参数的方法。

## 8. 方法重载

开发中很重要的一个方法的形式——叫方法重载。

所谓方法重载指的是：一个类中，出现多个相同的方法名，但是它们的形参列表是不同的，那么这些方法就称为方法重载了。

- 参数列表不同的情况
  - 长度不一样

  - 类型不一样

下面案例中有多个test方法，但是参数列表都不一样，它们都是重载的方法。调用时只需要通过参数来区分即可。

```java
public class MethodOverLoadDemo1 {
	public static void main(String[] args) {
		// 目标：认识方法重载，并掌握其应用场景。
		test();
		test(100);
	}
	public static void test(){
		System.out.println("===test1===");
	}
	public static void test(int a){
	System.out.println("===test2===" + a);
	}
	
    void test(double a){
	}

    void test(double a, int b){
	}

    void test(int b, double a){
	}

    int test(int a, int b){
	return a + b;
	}
}
```

一般在开发中，我们经常需要为处理一类业务，提供多种解决方案，此时用方法重载来设计是很专业的。

需求：开发武器系统，功能需求如下：

- 可以默认发一枚武器。

- 可以指定地区发射一枚武器。

- 可以指定地区发射多枚武器。

上面的几个需求中，不管以什么样的方式发武器，其实最终的目的都是发武器。

所以我们可以设计几个名称相同的方法，这样调用者调用起来就不用记那么多名字了

```java
public class MethodTest2 {
	public static void main(String[] args) {
		// 目标：掌握方法重载的应用场景。
		fire();
		fire("岛国2");
		fire("米国", 999);
	}
	public static void fire(){
		fire("岛国");
	}
	public static void fire(String country){
		fire(country, 1);
	}
	public static void fire(String country, int number){
		System.out.println("发射了" + number + "枚武器给" +
		country);
	}
}
```

总结：

1. 什么是方法重载？

答：一个类中，多个方法的名称相同，但它们形参列表不同。

2. 方法重载需要注意什么？
   - 一个类中，只要一些方法的名称相同、形参列表不同，那么它们就是方法重载了，其它的都不管（如：修饰符，返回值类型是否一样都无所谓）。
   -  形参列表不同指的是：形参的个数、类型、顺序不同，不关心形参的名称。

3. 方法重载有啥应用场景？

答：开发中我们经常需要为处理一类业务，提供多种解决方案，此时用方法重载来设

计是很专业的。

总结：`细节决定成败`

1. 注意：给float类型的变量赋值时要在数字后加F/f
2. 注意引用数据类型变量与基本数据类型变量的区别
3. 注意方法返回值的类型
4. 注意`return`后语句无效，类似`return(i--)`语句中的自增自减也无效（++，--在变量后）
5. 注意方法参数是值传递（eg: 基本数据类型变量的值，引用数据类型变量的堆地址）
6. 注意方法重载：方法名相同+参数列表不同（数据类型不同/参数的个数不同/参数的顺序不同），其它的: 参数名称，返回值类型、修饰符是否相同无所谓
