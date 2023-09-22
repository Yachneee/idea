# String字符串

## 基本概念

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230823203733415.png" alt="image-20230823203733415" style="zoom: 50%;" />

​		字符类型(char)是Java中的基本数据类型之一，字符是用单引号引住的单个符号。

​		字符串(String)是一个类（类是引用数据类型之一），用双引号引住的任意个字符，字符串其实就是字符组成的序列。字符串在开发中可以用来表示标题，名称，地址等。

```java
char ch = 'T'; // 声明一个字符类型的变量ch，初始化为T
ch = '5';
ch = 'i';
ch = '你';

// 字符串是字符组成的序列
String name = "snadnlasmkl";

// 文本块 """ 字符内容 """
String text = """
          序号 姓名
          1 张三
          "snadnlasmkl"
          """;
System.out.println(text);
//序号 姓名
1 张三
"snadnlasmkl"
```

### 字符串对象与字面量

字符串的声明：

```java
String 变量名 = "初始值";
String 变量名 = new String("初始值");
```

- 第一种形式使用双引号引住的字符串叫做字面量

- 第二种使用new运算符声明的字符串叫做字符串对象。【第二种形式并不常用，推荐使用第一种形式。】

### 字符串常用的`API`

#### API概述

`API`全称是`Application Program Interface `应用程序接口。可以直接调用别人已经写好的程序。

​		Java官方其实已经给我们写好了很多很多类，每一个类中又提供了一系列方法来解决与这个类相关的问题。

- 比如String类，表示字符串，提供的方法全都是对字符串操作的。

​		像这样的类还有很多，Java把这些类是干什么用的、类中的每一个方法是什么含义，编写成了文档，我们把这个文档称之为`API`文档。

​		在行业中有这么一句话：“不要重复造轮子”。这里所说的轮子就是别人已经写过

的程序。意思就是不要写重复的程序，因为程序是用来解决问题的，如果这个问题别

人已经解决过，并且这个解决方案也得到了市场认可，那就不用再自己重复写这个程

序了。

​		Java已经发展了20多年，在这20多年里，已经积累类了很多问题的解决方案，基本上现在我们遇到的问题，在这20多年里，早就有人解决过。

​		在编程开发中，经常需要对字符串进行各种操作，熟练掌握字符串的各种操作，对提高编程技巧很有帮助。要学习字符串的操作，首先要了解字符串的组成。字符串内部使用`byte`数组（`JDK8`之前是`char`数组）来保存字符串的内容，数组中的每一位存放一个字符，byte数组的长度也就是字符串的长度。

​		字符串中提供了常用操作方法，通过这些方法可以实现对字符串的连接、截取、替换、查找、比较等各种操作。

## String方法

###### 常用方法表

|              方法               |                             作用                             | 返回类型 | 修饰符 |
| :-----------------------------: | :----------------------------------------------------------: | :------: | :----: |
|      `concat(String str)`       |           将指定的字符串`str`连接到此字符串的末尾            |  String  |        |
|      `equals(Object obj) `      |            比较此字符串与指定的对象`obj`是否相等             | boolean  |        |
| `equalsIgnoreCase(String str) ` |       忽略大小写比较此字符串与`str`两个字符串是否相等        | boolean  |        |
|           `length() `           |                       获取字符串的长度                       |   int    |        |
|      `indexOf(String str)`      |       判断传入字符串`str`在原字符串中第一次出现的索引        |   int    |        |
|    `lastIndexOf(String str)`    |      判断传入字符串`str`在原字符串中最后一次出现的位置       |   int    |        |
|   `startsWith(String prefix)`   |           判断此字符串是否以指定的前缀`prefix`开头           | boolean  |        |
|    `endsWith(String suffix)`    |          判断此字符串是否以指定的后缀`suffix`结尾。          | boolean  |        |
|         `toLowerCase()`         |                   用于将字符串变成小写字母                   |  String  |        |
|         `toUpperCase()`         |                   用于将字符串变成大写字母                   |  String  |        |
|      `split(String regex)`      | 用于将一个字符串以给定的分隔符`regex`分割成多个字符串，返回字符串组 | String[] |        |
|       `charAt(int Index)`       |                    获取字符串中的一个字符                    |   char   |        |
|            `trim() `            |                     去掉字符串首尾的空格                     |  String  |        |
|             `strip`             |                                                              |          |        |
|          `stripIndent`          |                                                              |          |        |
|         `stripLeading`          |                                                              |          |        |
|         `stripTrailing`         |                                                              |          |        |
|           `replace()`           |                                                              |          |        |
|        `substring(int)`         |           截取字符串，从传入参数位置开始截取到末尾           |  String  |        |
|           `format()`            |                                                              |          |        |
|          `getBytes()`           |                                                              |          |        |
|           `intern()`            |                                                              |          |        |
|      `compareTo(String) `       |                     判断两个字符串的大小                     |   int    |        |
|      `substring(int,int)`       |          截取字符串，从参数1位置开始截取到参数2位置          |  String  |        |

### 字符串的连接

###### `concat(String str)`

字符串可以进行加法运算，作用是将两个字符串连接在一起，也可以将字符串与基本类型变量做加法运算，系统会先将基本类型转换为字符串型后进行连接操作。

在Java中将两个字符串连接在一起可以使用加号`+`连接，也可以使用 `concat()` 方法连接。

### 字符串的比较

###### `equals(Object obj)`

字符串也可以进行是否相等的比较，但不能直接使用 `==` 运算符，而是要使用

`equals()` 方法进行比较。忽略大小写的用 `equalsIgnoreCase() `方法比较。

> 在Java中，`equals()`和`==`都是用于比较两个对象的操作，但它们有着不同的含义和使用场景:
>
> 1. `==`操作符用于比较两个对象的==引用==是否指向同一内存地址。如果两个对象的引用指向相同的内存地址，则结果为true。
> 2. 另一方面，`equals()`方法用于比较两个对象的值是否相等。默认情况下，equals()方法比较两个对象的引用是否相等，但可以通过重写该方法来实现自定义的相等比较逻辑。
> 3. 需要注意的是，对于`基本数据类型`的比较（如int、double等），`==`操作符比较的是它们的值，而不是引用.

### 字符串的长度

###### `length()`

String类的 `length()` 方法可以获取字符串是由多少个字符构成的。

> 在数组中length属于数组的属性，而在字符串中length()是字符串的方法，注意进行区分。

### 字符串查找

###### `indexOf(String str)`

 用于在一个字符串中从前向后查找传入字符串`str`，如果找到了就返回传入字符串`str`（第一个字符）的下标，找不到就返回-1。

###### `lastIndexOf(String str)` 

用于在一个字符串中从后向前查找传入字符串`str`，如果找到了就返回传入字符串`str`（第一个字符）的下标，找不到就返回-1。

###### `startsWith(String prefix)`

 用于判断原字符串是否以传入字符串`prefix`开头

###### `endsWith(String suffix)`

 用于判断原字符串中是否以传入字符串`suffix`结尾

###### `toLowerCase()`

用于将字符串变成小写字母。

###### `toUpperCase()`

用于将字符串变成大写字母。

###### `split(String regex)`

用于将一个字符串以给定的分隔符分割成多个字符串，并将分割后的字符串保存到一个数组中，返回这个数组

###### `charAt(int Index)`

### 去掉空格

###### `trim`

###### `strip`

###### `stripIndent`

###### `stripLeading`

###### `stripTrailing`

### 字符串内容替换

###### `replace()`

String类的 replace() 方法用于将字符串中指定的内容替换成其他内容

### 字符串截取

###### `subString(int,int)`

String类的 subString(int,int) 方法用于字符串内容的截取，第一个参数是从第几位开始截取，第二个参数是截取到第几位，如果没有给定第二个参数，默认截取到最后一位。

### 转义字符

| 转义字符 | 说明   |
| -------- | ------ |
| `\\`     | 输出\  |
| `\t`     | 制表位 |
| `\n`     | 换行   |

### 字符串格式化

###### `format() `

String类的 `format() `方法用于创建格式化的字符串以及连接多个字符串对象。format方法定义是 `format(String format, Object... args)`; 第一个参数是被格式化的字符串，第二个参数是替换格式符的字符串，第二个参数中的`…`表示方法可变参数，即参数的个数根据格式符的个数来确定。字符串格式化就是使用第二个可变参数中的值按照顺序替换第一个参数中的格式符。format方法的格式符定义如下:

| 格式符 | 说明                                  | 示例     |
| ------ | ------------------------------------- | -------- |
| %s     | 字符串类型                            | "开发喵" |
| %c     | 字符类型                              | 'm'      |
| %b     | 布尔类型                              | true     |
| %d     | 整数类型（十进制）                    | 100      |
| %x     | 整数类型（十六进制）                  | FF       |
| %o     | 整数类型（八进制）                    | 77       |
| %f     | 浮点类型 (%和f中间+int保留的小数位数) | 99.9     |

```java
public static void main(String[] args) {
    String str = String.format("见过,%s及%s", "晁天王", "众位头领");
    System.out.println(str);
    str = String.format("字母a的大写是：%c", 'A');
    System.out.println(str);
    str = String.format("3 > 7的结果是：%b", 3 > 7);
    System.out.println(str);
    str = String.format("100的一半是：%d", 100 / 2);
    System.out.println(str);

    // 使用printf()方法代替format方法来格式化字符串
    System.out.printf("50元的书打8.5折扣是：%f 元", 50 * 0.85);
}
```

###### `getBytes()`

使用平台的默认字符集将字符串编码为 byte 序列，并将结果存储到一个新的 byte 数组中。

```java
char[] chs = {'让', '编', '程', '变', '简', '单'};
String str = new String(chs, 3, 4);
System.out.println(str);

// 用系统默认编码
System.out.println(Charset.defaultCharset());

// 自定义编码
Charset charset = Charset.forName("gbk");// gbk 编码对象

// charset = StandardCharsets.UTF_8;
// byte[] bytes = "原神".getBytes("gbk");
byte[] bytes = "原神".getBytes(charset);
System.out.println(Arrays.toString(bytes));

// 自定义编码
str = new String(bytes, charset);
System.out.println(str);
```

## **String**的注意事项

前面我们学习了字符串的一些常用方法，在实际工作中用这些方法解决字符串的常见问题是完全足够的，但是在面试时可能会问一些原理性的东西。

在Java中，字符串是不可变的，这意味着一旦创建了一个字符串对象，它的内容就不能被修改。当你对一个字符串进行操作时（比如连接、替换、截取等），实际上是创建了一个新的字符串对象，而原始的字符串对象保持不变。

这种不可变性有以下几个关键特点：

1. 字符串对象是不可修改的： 一旦创建了一个字符串对象，就无法更改它的内容。例如，如果你有一个字符串“hello”，你无法直接修改内存里面存储的值为“help”，而是在内存中重新产生一个新的字符串对象来表示“help”。
2. 线程安全： 由于字符串是不可变的，多个线程可以同时访问和共享相同的字符串对象，而不会出现并发修改的问题。这使得字符串在多线程环境中更安全。
3. 字符串池： Java中的字符串常量池（String Pool）是字符串不可变性的一个体现。当你创建一个字符串常量时，`JVM`会首先检查字符串常量池是否已经存在相同内容的字符串，如果存在，则直接返回对这个已存在字符串的引用，而不会重新创建一个新的对象。这样可以节省内存空间并提高性能。
4. 安全性： 字符串不可变性确保字符串对象在被传递给其他方法时，不会被修改，从而避免了在传递参数时意外修改字符串内容的情况。字符串不可变性的一个常见实例是使用字符串连接操作符（"+"）来拼接字符串。在这个例子中，通过字符串连接操作符连接`str1`和`str2`，实际上创建了一个新的字符串对象，而原始的`str1`和`str2`保持不变。总的来说，字符串不可变性在Java中是一个重要的概念，它带来了安全性、线程安全性和性能优化等方面的好处。因此，当需要频繁对字符串进行操作时，最好使用`StringBuilder`或`StringBuffer`类，它们提供了可变的字符串操作。但在不需要频繁修改字符串的情况下，使用不可变的字符串可以带来更多的好处。

- 注意事项**1**：**`String`**类的对象是不可变的对象

```java
public static void main(String[] args) {
String name = "开发喵";
name += "程序员";
name += "喵喵";
System.out.println(name);
}
```

String是不可变对象的含义。

需要注意的是：只要是以 `""` 方式写出的字符串对象，会在堆内存中的字符串常量池中存储。

执行第一句话时，会在堆内存的常量池中，创建一个字符串对象 “开发喵” ，然后把“开发喵” 的地址赋值给 String name；当执行第二句话时，又会在堆内存的常量池中创建一个字符串 “程序员” ，和 “开发喵” 拼接，拼接之后还会产生一个新的字符串对象 ”开发喵程序员“ ，然后将新产生的“开发喵程序员” 对象的地址赋值给 String name 变量。此时你会发现，之前创建的字符串对象 “开发喵” 内容确实是没有改变的。所以说String的对象是不可变的。

- 注意事项**2**：字符串字面量和**new**出来字符串的区别
  1. 只要是以 `""` 方式写出的字符串对象，会存储到字符串常量池，且相同内容的字符串只存储一份
  2. 但通过 new 方式创建字符串对象，每new一次都会产生一个新的对象放在堆内存中。



```java
public static void main(String[] args) {
    String a = "a";
    String b = "b";
    String c = "ab";
    String d = "a" + "b";
    String e = a + "b";
    String f = "a" + b;
    String g = a + b;
    String h = new String("ab");
    System.out.println(c == d); // true
    System.out.println(c == e); // false
    System.out.println(c == f); // false
    System.out.println(c == g); // false
    System.out.println(c == h); // false
    System.out.println("-------------------");
    System.out.println(d == e); // false
    System.out.println(e == f); // fasle
    System.out.println(e == g); // fasle
    System.out.println(f == g); // false
    // String j = h.intern();
    // System.out.println(j == c);
}
```

###### `intern()`

```java
public static void main(String[] args) {    
	String str= "abc";
	String s=new String("abc");
	String s1=s.intern();
	System.out.println(s==s1);  //false
	System.out.println(s1==str);//true 
	System.out.println(s==str); //false
}    
```

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230823230633832.png" alt="image-20230823230633832" style="zoom:50%;" />

```java
public static void main(String[] args) {
	String s=new String("abc");
	String s1=s.intern();
	String str= "abc";
	System.out.println(s==s1);  //false
	System.out.println(s1==str);//true 
	System.out.println(s==str); //false
} 
```

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230823230653560.png" alt="image-20230823230653560" style="zoom: 50%;" />

```java
public static void main(String[] args) {	
	String a="a";
	String s= new String(a + "bc");
	String s1=s.intern();
	String str="abc";
	System.out.println(s==s1);  //true
	System.out.println(s1==str);//true
	System.out.println(s==str); //true
}    
```
<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230823230736821.png" alt="image-20230823230736821" style="zoom:50%;" />

```java
public static void main(String[] args) {	
	String a="a";
	String s=new String(a + "bc");
	String str="abc";
	String s1=str1.intern();
	System.out.println(s==s1);//false
	System.out.println(s1==str);  //true
	System.out.println(s==str);//false
}    
```

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230823230802899.png" alt="image-20230823230802899" style="zoom:50%;" />







