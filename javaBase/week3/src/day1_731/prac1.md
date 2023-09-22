> ### 1. 利用Java输出自我介绍

格式如下：

【基本信息】

姓名：  喵星人      性别：  男

年龄：  24岁       身高： 1.85m

java源程序：

```java
import java.util.Scanner;
public class Introduce{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("请输入姓名");
	String name = input.next();
	System.out.println("请输入性别");
	String gender = input.next();
	System.out.println("请输入年龄");
	int age = input.nextInt();
	System.out.println("请输入身高");
	double height = input.nextDouble();
	//输出自我介绍
	System.out.println("【基本信息】");
	System.out.print("姓名: "+name);
	System.out.print("  ");
	System.out.println("性别: "+gender);
	System.out.print("年龄: "+age);
	System.out.print("岁  ");
	System.out.print("身高:  "+height);
	System.out.print("m  ");
	input.close();
	}
}
```

编译及运行 ：

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230731194954470.png" alt="image-20230731194954470" style="zoom:50%;" />

> ### 2. 实现输出等腰三角形，运行结果如下

```java
    *
   ***
  *****
 *******
*********
```

java源程序

```java
public class IsocelesTriangle{
	public static void main(String[] args){
	System.out.println("    *");
	System.out.println("   ***");
	System.out.println("  *****");
	System.out.println(" *******");
	System.out.println("*********");
	}
}
```

编译及运行：

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230731200553347.png" alt="image-20230731200553347" style="zoom:100%;" />

> ### 3. 通过练习总结System.out.print()和System.out.println()的区别

​     System.out.println() 在输出后换行，而System.out.print()不换行

测试源代码：

```java
public class Demo2{
	public static void main(String[] args){
	//测试System.out.print和System.out.println区别
	System.out.print('.');
	System.out.print('a');
	System.out.print("0eE你");
	System.out.print('.');
	System.out.print('。');
	System.out.println("hi");
	System.out.print("你好");
	System.out.println("hi");
	}
}
```

编译及运行：

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230731213250431.png" alt="image-20230731213250431" style="zoom: 80%;" />

> ### 4. 二进制和八进制、十进制、十六进制的相互转换

1. 将二进制数`110110`转换为十进制数。
   $$
   1*2^5+1*2^4+0+1*2^2+1*2^1+0=54
   $$

2. 将十进制数`73`转换为二进制数。0b`1001001`
   $$
   73 = 64 + 8 + 1 = 2^6 + 2^3 +2^0 = 0b1001001
   $$

   | 被除数/2 | 商   | 余   |
   | -------- | ---- | ---- |
   | 73       | 36   | 1    |
   | 36       | 18   | 0    |
   | 18       | 9    | 0    |
   | 9        | 4    | 1    |
   | 4        | 2    | 0    |
   | 2        | 1    | 0    |
   | 1        | 0    | 1    |

3. 将八进制数`37`转换为十进制数。  `31`
   $$
   0o37=3*8^1+7*8^0=31
   $$

4. 将十六进制数 `1A7` 转换为二进制数。

   (1).16进制转换为十进制 `423`
   $$
   0x1A7=1*16^2+10*16^1+7*16^0=256+160+7=423
   $$
   十进制转换为二进制   0b`1 1010 0111`
   $$
   423=256+167=256+128+39=256+128+32+4+2+1=2^8+2^7+2^5+2^2+2^1+2^0=0b110100111
   $$
   | 被除数/2 | 商   | 余   |
   | -------- | ---- | ---- |
   | 423      | 211  | 1    |
   | 211      | 105  | 1    |
   | 105      | 52   | 1    |
   | 52       | 26   | 0    |
   | 26       | 13   | 0    |
   | 13       | 6    | 1    |
   | 6        | 3    | 0    |
   | 3        | 1    | 1    |
   | 1        | 0    | 1    |

   (2). 直接转换`1A7`

   十六进制转换为二进制——从左向右每一位转换为（4位的）二进制  0x`000110100111`
   $$
   1=0001，A=10=1*2^3+0+1*2^1+0=1010，7=0+1*2^2+1*2^1+1*2^0=0111
   $$

5. 将二进制数 `101010` 转换为八进制数。 0o` 52`
   $$
   二进制数从右向左每3位为8进制的1位：   0b010= 0+1*2^1+0=2 ，0b101 = 1*2^2+0+1*2^0=5   
   $$
   所以0b`101010`=0o`52`

6. 将十进制数`255`转换为十六进制数。0x`FF`
   $$
   255=240+15=15*16+15=0xFF
   $$

7. 将八进制数`675`转换为二进制数。0b`110111101`
   $$
   6=1*2^2+1*2^1=110，7=1*2^2+1*2^1+1*1^0=111，5=1*2^2+1*2^0=101
   $$

8. 将十六进制数`FFE`转换为十进制数。`4094`
   $$
   FFE=15*16^2+15*16^1+14*16^0=3840+240+14=4096
   $$


>
> ### 5. 分析一下代码的输出结果

```java
System.out.println("I’m lucky" + 123 + 456.58);
```

> 结果：I'm lucky123456.58
>
> `+`：将字符串连接（不是计算）
>
> 先将字符串I'm lucky和整型数字123连接，再与浮点数子456.58连接
