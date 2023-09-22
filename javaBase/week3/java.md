# *7.31(走进Java+数据类型与运算符)*

## 1 走进Java

#### 1.1 Java简介及安装

###### 1.1.1 Java简介

1. Java是什么？

答：Java是一门高级编程语言

2. Java是哪家公司的产品？

答：Java以前是Sun公司的产品，现在Java是属于Oracle公司的产品

3. Java之父是谁？

答：詹姆斯●高斯林

4. Java主流的开发方向是什么？

答：企业级互联网应用开发

5. Java技术平台有哪些？

答：JavaSE（标准版）、JavaEE（企业版）、JavaME（小型版）

> Java的技术体系，Java为了满足不同的应用场景提供了不同的技术版本，主要有三个版本。
>
> - Java SE（Java Standard Edition）：叫做标准版，它是后面两个版本的基础，也就是学习后面两个版本必须先学习JavaSE。我们现阶段学习的就是这个版本中的技术。
> - Java EE（Java Enterprise Edition）: 叫做企业版，它是为企业级应用开发提供的一套解决方案。在后面的课程中主要学习这个版本中的技术。
> - Java ME（Java Micro Edition）：叫做小型版，它为开发移动设备的应用提供了一套解决方案。目 前 已 经 不 被 市 场 认 可 （ 淘 汰 ） ， 取 而 代 之 的 是 基 于**Android**系统的应用开发。

###### 1.1.2 Java开发环境搭建

> `Java的开发环境`是Java官方提供的一个软件，叫做JDK（全称是Java Develop Kit），翻译过来意思就是Java开发工具包。
>
> 我们先要到官网上去下载**JDK**，然后安装在自己的电脑上，才可以在自己的电脑上使用**JDK**来开发**Java**程序

> *公司 ->JDK8（2014年）;  学习 -> JDK17（新特性）（2021.9.14）*
>
> *LTS标识的是长期支持版本，意思就是Oracle会不定期更新）*

JDK下载和安装

  - 下载 （zip解压免安装版）

  JDK官网： https://www.oracle.com/java/technologies/downloads/#jdk17-windows 

  - 验证是否安装成功

    第一步：在JDK的bin目录，地址栏输入cmd，回车；

    第二步：在命令行窗口中输入 java -version 回车；

Windows系统常见的命令以及作用:

*注意：每敲完一条命令之后，马上敲回车就表示执行这条命名*

```java
E: //切换到E盘
cd [目录] //进入指定的目录
cd .. //退回到上一级目录
cd / //退回到根目录
dir //显示当前目录下所有的内容
cls //清空屏幕
exit //退出命令提示符窗口
find // 在一个或多个文件中搜索字符串
goto // 将命令处理程序定向到带有指定标签的行
ipconfig // 显示网络配置信息
more // 逐页显示输出 
type//显示文本文件的内容    
```



#### 1.2 编写第一个Java程序*

> 开发Java程序的步骤如下：
>
> ![image-20230804232145075](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20230804232145075.png)
>
> 1. 创建源文件：任何一个文本编辑器都可以写代码，如Windows系统自带的记事本
> 2. 编译源文件：将人能看懂的源代码（.java文件）转换为Java虚拟机能够执行的字节码文件（.class文件）
> 3. 运行字节码文件：将字节码文件交给Java虚拟机执行

###### 1.2.1 完成第一个Java入门程序的编写、编译、运行

1. 编写代码

新建一个后缀为.java的文本文件 Helloworld.java ，用记事本编写代码如下。

```java
public class Helloworld {
	public static void main(String[] args) {
		System.out.println("hello world");
	}
}
```

 2. 编译代码

进入 HelloWorld.java 文件所在目录，在地址栏输入cmd回车，即可在此处打开命令行窗口。

编译：在命令行窗口输入编译命令 javac HelloWorld 完成编译，编译后会生成一个HelloWorld.class 文件。

```java
javac HelloWorld.java
```

 3. 运行代码

```java
 java HelloWorld
```

#### 1.3 **Java**程序中常见的问题

> - 文件扩展名没有打开
> - 文件名和类名不一致
> - 单词大小写错误    *注意：`String`与`System`*
> - 主方法写错了
> - 标点符号写错了   *注意：使用英文符号*

#### 1.4 JDK的组成*

JDK由JVM、核心类库、开发工具组成，如下图所示

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807002718439.png" alt="image-20230807002718439" style="zoom: 80%;" />

JDK每个部分的作用：

```java
- 什么是JVM?
答：JDK最核心的组成部分是JVM（Java Virtual Machine），它是Java虚拟机，真正运行Java程序的地方。
- 什么是核心类库？
答：它是Java本身写好的一些程序，给程序员调用的。 Java程序员并不是凭空开始写代码，是要基于核心类库提供的一些基础代码，进行编程。
- 什么是JRE?
答：JRE（Java Runtime Enviroment），意思是Java的运行环境；它是由JVM和核心类库组成的；如果你不是开发人员，只需要在电脑上安装JRE就可以运行Java程
序。
- 什么是开发工具呢？
答：Java程序员写好源代码之后，需要编译成字节码，这里会提供一个编译工具叫做javac.exe，编写好源代码之后，想要把class文件加载到内存中运行，这里需要用到运行工具java.exe。
除了编译工具和运行工具，还有一些其他的反编译工具、文档工具等待...
```

​	*用JDK开发程序，交给JRE运行*

#### 1.5 JDK环境变量配置

- 什么是**Path**环境变量？

  Path环境变量是让系统程序的路径，方便程序员在命令行窗口的任意目录下启动程序；

- 将**JDK**配置到**Path**路径下

  把JDK的bin目录配置到Path环境变量下，这样就可以在任意目录下启动javac和java命令来完成编译和运行了。

  第一步：找到JDK的bin目录`D:\Enviroments\jdk-17.0.32，复制一下

  第二步：将JDK的bin目录粘贴在Path环境变量后面

  第三步：检测否配置成功

  ```java
  1.按住Win+R输入cmd 回车，打开命令行创建
  2.输入javac -version 看提示信息是否显示你安装JDK的版本号
  输入java -version 看提示信息是否显示你安装JDK的版本号
  【如果显示版本号都是JDK17就表示配置安装成功】
  ```

方法一： 直接配置到bin目录(如上)

方法二：配置一个 JAVA_HOME ，然后再配置

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807003658592.png" alt="image-20230807003658592" style="zoom:50%;" />

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807003717879.png" alt="image-20230807003717879" style="zoom:50%;" />

#### 1.6 API文档` docs` 目录下的 `index.html`

​		在开发过程中，如果遇到疑难问题，除了可以在互联网中查询解决办法外，还可以在Java API帮助文档（以下称为“API文档”）中查找答案。API文档是由Oracle公司提供的一整套文档资料，包括Java各种技术的详细资料和JDK中提供的各种类的帮助说明。API文档被视为Java开发人员必备的权威参考资料，类似于字典一样。在开发过程中，要养成查阅API文档的习惯，以在其中寻找答案和解决方案。

#### 1.7 javadoc

​		文档注释（Documentation Comments）是一种特殊的注释格式，用于为 Java 程序中的类、方法、字段等元素提供文档说明。文档注释以 /** 开始，以 */ 结束，可以包含多行描述性文本和标记。

​		文档注释是一种标准的注释格式，在使用工具生成 API 文档时可以被提取出来，用于生成详细的程序文档。它们提供了对代码的解释、使用示例、参数说明、返回值说明等重要信息，帮助其他开发者理解和使用代码。

```java
/**
* 这是一个简单的计算器类，用于执行基本的数学运算。
*/
public class Calculator {
/**
* 将两个整数相加并返回结果。
*
* @param a 第一个整数
* @param b 第二个整数
* @return 两个整数的和
*/
public int add(int a, int b) {
return a + b;
}
/**
* 将两个整数相乘并返回结果。
*
* @param a 第一个整数
* @param b 第二个整数
* @return 两个整数的乘积
*/
public int multiply(int a, int b) {
return a * b;
}
}
```

​		Javadoc是由SUN公司提供的一种工具，它可以从程序源代码中提取类、方法、成员等的注释，并生成与源代码配套的API帮助文档。换句话说，只需在编写程序时使用特定的标签注释，在程序编写完成后，通过javadoc就可以生成程序的API帮助文档。

​		javadoc能够识别文档注释中的一些特殊标签，这些标签通常以@符号开头，后跟一个特定的名称，有些标签也以{@符号开头，以}符号结束。

​		下表列出了javadoc能够识别的标签：

| 标签         | 作用                                                   |
| ------------ | ------------------------------------------------------ |
| @author      | 标识一个类的作者                                       |
| @param       | 方法的参数                                             |
| @return      | 标明返回值类型，一般用于方法注释，不能出现在构造方法中 |
| {@value}     | 显示常量的值，该常量必须是 static 属性                 |
| @since       | 版本号，标明从哪个版本起开始有这个函数                 |
| @version     | 指定类的版本                                           |
| @exception   | 可能抛出异常的说明，一般用于方法注释                   |
| @throws      | 也是可能抛出异常的说明                                 |
| @serial      | 说明一个序列化属性                                     |
| @serialData  | 说明通过 writeObject() 和 writeExternal() 方法写的数据 |
| @serialField | 说明一个 ObjectStreamField 组件                        |

javadoc 命令语法格式如下：

```java
javadoc [options] [packagenames] [sourcefiles]
```

格式说明：

（1）options 表示 javadoc 命令的选项；

（2）packagenames 表示包名；

（3）sourcefiles 表示源文件名。

在 打 开 控 制 台 后 ， 切 换 到 Calculator.java 文 件 所 在 目 录 下 ， 可 以 使 用 javadoc

Calculator.java命令。

#### 1.8 jlink命令

​		在JDK 8之后，默认不再提供单独的JRE。如果在项目中仍希望以JRE的形式发布软件，可以使用jlink命令生成自定义的JRE。jlink命令的格式如下：

```java
jlink [options] --module-path modulepath --add-modules [,module...]--output outputpath
```

参数解析：

（1） modulepath：路径

（2） module：模块名称

（3） outputpath：输出路径

例如，可以在JDK目录下执行以下命令来使用jlink命令生成JRE：

```java
jlink --module-path jmods --add-modules java.base,java.desktop --
output jre
```

该命令将会添加指定的模块，并生成一个包含这些模块的JRE。

生成后，使用` jre\bin\java --list-modules` 来查看JRE中添加的模块。

#### 1.9 Java跨平台原理

​		Java程序的执行依赖于Java虚拟机，因为有了Java虚拟机所以Java程序有一个重要的特性叫做跨平台性。

- 什么是跨平台运行呢？

所谓跨平台指的是用Java语言开发的程序可以在多种操作系统上运行，常见的操作系统有Windows、Linux、MacOS系统。

如果没有跨平台性，同一个应用程序，想要在多种操作系统上运行，需要针对各个操作系统单独开发应用。比如微信有Windows版本、MacOS版本、Android版本、IOS版本

- 为什么**Java**程序可以跨平台呢？

跨平台性的原理是因为在不同版本的操作系统中安装有不同版本的**Java**虚拟机，Java程序的运行只依赖于Java虚拟机，和操作系统并没有直接关系。从而做到一处编译，处处运行。

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807005207718.png" alt="image-20230807005207718" style="zoom:50%;" />

#### 1.10 Java反编译

​		在Java程序部署时，只需提供.class字节码文件即可运行，无需提供.java源文件。.class字节码文件无法直接打开查看，如果想学习某个只有.class字节码文件的Java程序，可以使用反编译工具将.class字节码文件反编译为.java源文件，从而可以查看源代码进行学习。

​		将源文件（.java）转换为字节码文件（.class）的过程称为编译，将字节码文件（.class）转换回源文件（.java）的过程称为反编译。常用的反编译工具包括JD、FrontEnd Plus等。jd-gui-0.3.4反编译工具的使用方法：

下载该软件并解压缩，双击“jd-gui.exe”图标运行程序，启动JD反编译工具

###### `常见命令`

> Windows的cmd常用命令如下：
>
> 1. CHCP：显示或设置活动代码页数。
>
> 2. CHDIR：显示当前目录的名称或将其更改。
>
> 3. CHKDSK：检查磁盘并显示状态报告。
>
> 4. CHKNTFS：显示或修改启动时间磁盘检查。
>
> 5. COLOR：设置默认控制台前景和背景颜色。
>
> 6. COMMAND：打开另一个 Windows 命令解释程序窗口。
>
> 7. DATE：显示或设置日期。
>
> 8. DEL：删除至少一个文件。
>
> 9. DISKCOMP：比较两个软盘的内容。
>
> 10. DISKCOPY：将一个软盘的内容复制到另一个软盘。
>
> 11. DOSKEY：编辑命令行、调用 Windows 命令并创建宏。
>
> 12. ECHO：显示消息，或将命令回显打开或关上。
>
> 13. ENDLOCAL：结束批文件中环境更改的本地化。
>
> 14. ERASE：删除至少一个文件。
>
> 15. FIND：在文件中搜索文字字符串。
>
> 16. FINDSTR：在文件中搜索字符串。
>
> 17. FOR：为一套文件中的每个文件运行一个指定的命令。
>
> 18. Format：格式化磁盘，以便跟 Windows 使用。
>
> 19. GOTO：将 Windows 命令解释程序指向批处理程序 中某个标明的行。
>
> 20. LABEL：创建、更改或删除磁盘的卷标。
>
> 21. MD：创建目录。
>
> 22. MKDIR：创建目录。
>
> 23. MODE：配置系统设备。
>
> 24. MORE：一次显示一个结果屏幕。
>
> 25. MOVE：将文件从一个目录移到另一个目录。
>
> 26. PATH：显示或设置可执行文件的搜索路径。
>
> 27. PAUSE：暂停批文件的处理并显示消息。
>
> 28. POPD：还原 PUSHD 保存的当前目录的上一个值。
>
> 29. PROMPT：更改Windows 命令提示符。
>
> 30. PUSHD：保存当前目录，然后对其进行更改。
>
> 31. RD：删除目录。
>
> 32. RECOVER：从有问题的磁盘恢复可读信息。
>
> 33. REN：重命名文件。
>
> 34. TYPE：查看文件中的内容。
>
> 35. NET：用户可以使用net命令获取特定信息。
>
> 36. Cls：清除屏幕。
> 37. Exit：退出CMD.EXE程序。
> 38. Cd：显示当前目录的名称或将其更改。
> 39. Cd C： 显示当前驱动器的盘符。
> 40. Dir：显示一个目录中的文件和子目录。
> 41. Copy：将文件从一个目录复制到另一个目录。
> 42. Move：将文件或文件夹从一个位置移动到另一个位置。
> 43. Delete：删除文件或文件夹。
> 44. Ren：重命名文件或文件夹。
> 45. Type：查看文本文件的内容。
> 46. Net：用于管理网络配置和连接。
> 47. Ipconfig：显示IP配置信息。
> 48. Ping：测试网络连接。
> 49. Tracert：跟踪路由。
> 50. Path：显示可执行文件的搜索路径。
> 51. Set：显示系统环境变量。
> 52. Reg：用于管理注册表配置。
>
> Linux的cmd常用命令如下：
>
> 1. `ls`：查询当前文件夹内所有文件的列表。
> 2. `cd`：切换当前路径，到达目的文件夹。
> 3. `mkdir`：创建新的文件夹。
> 4. `touch`：创建新的文件。
> 5. `rm`：删除文件或文件夹。
> 6. `cat`：查看文件内容，支持合并和拼接多个文件。
> 7. grep：在文件中搜索指定内容。 
> 8. find：在指定目录下查找文件或文件夹。 
> 9. tar：压缩和解压文件或文件夹。
> 10. chown：修改文件或文件夹的所有者。
> 11. `ps`：显示当前正在运行的进程。 
> 12. top：显示当前系统资源的使用情况。 
> 13. df：显示磁盘空间使用情况。 
> 14. du：显示指定文件或目录的大小。 
> 15. `ping`：测试网络连接。 
> 16. `ipconfig`：显示网络接口的信息。 
> 17. netstat：显示网络连接状态。

## 2 Java的基础语法**

想要编写Java代码，就必须学习Java的语法，学习语法最主要做到下面两点：

- 记住语法格式

- 明确这种语法格式能达到什么效果

#### 2.1 注释

1. 什么是注释？
   注释是解释说明程序的问题，方便自己和别人阅读代码

2. 注释的种类及格式：

   ```java
   1.单行注释：
   // 后面跟解释文字
   2.多行注释
   /*
   这里写注释文字
   可以写多行
   */
   3.文档注释
   /**
   这里写文档注释
   也可以写多行，文档注释可以利用JDK的工具生成帮助文档（javadoc生成API文档）
   */
   ```

3. 哈哈哈

   ```java
   /**
   目标：学会使用注释
   这是程序的讲解注释
   */
   public class NoteDemo{
   	// 这是程序的主方法，是程序的入口
   	public static void main(String[] args){
   		System.out.println("我开始学习Java程序，好嗨皮~~");
   		/*
   		窗前明月光
   		疑是地上霜
   		举头望明月
   		低头思故乡
   		*/
   		// 窗前明月光
   		// 疑是地上霜
   		// 举头望明月
   		// 低头思故乡
   		System.out.println("开发喵");
       	System.out.println("云创动力");
   	}
   }
   ```

使用快捷键加注释

```java
Ctrl + / 单行注释（对当前行进行注释）
Ctrl + Shift + / 对选中的代码进行多行注释。
```

#### 2.2 字面量

- 什么是字面量？

字面量其实就是告诉程序员数据在程序中的书写格式。下面是常用的数据在程序中的书写格式

| 常用数据 | 生活中的写法 | 程序中的写法  | 说明                                   |
| -------- | ------------ | ------------- | -------------------------------------- |
| 整数     | 666，-88,  0 | 666，-88,  0  | 写法一致                               |
| 小数     | 13.14，-5.21 | 13.14，-5.21  | 写法一致                               |
| 字符     | A,0,我       | 'A','0'，'我' | 程序中必须使用单引号，有且仅能一个字符 |
| 字符串   | 开发喵       | "开发喵","0"  | 程序中必须使用双引号，内容可有可无     |
| 布尔值   | 真，假       | true\false    | 只有两个值，true表示真，false表示假    |
| 空值     |              | 值是null      | 一个特殊的值，空值                     |

- 编写程序，在命令行打印输出各种类型的字面值

  ```java
  public class Demo{
  	public static void main(String[] args){
  		//1.整数
  		System.out.println(666);
      	
          //2.小数
  		System.out.println(3.66);
  		
          //3.字符: 字符必须用单引号引起来
  		System.out.println('a');
  		System.out.println('0');
  		System.out.println('中');
  		System.out.println(' '); //空格也算字符
  		// 特殊字符：\t表示制表符 \n表示换行
  		System.out.println('\t'); //这相当于一个tab键，专业叫做制表符
  		System.out.println('\n'); //这是换行的意思
  		
          //4.字符串：字符串是双引号引起来的
  		System.out.println("我爱你中国abc00.@#$%");
  		
          //5.布尔值：只有两个值true和false
  		System.out.println(true);
  		System.out.println(false);
  	}
  }
  ```

#### 2.3 变量

- 什么是变量？

  变量是用来记录程序中的数据的。其本质上是内存中的一块区域，可以把这块区域理解成一个小盒子。

  <img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807011005863.png" alt="image-20230807011005863" style="zoom:50%;" />

  变量的定义格式：` 数据类型 变量名 = 初始值;`

  <img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807011047171.png" alt="image-20230807011047171" style="zoom:50%;" />

  变量记录的数据程序运行过程中是可以发生改变的： 变量名 = 值;

```java
int age = 20;
System.out.println(age); // 18
System.out.println(age); // 18
System.out.println(age); // 18
System.out.println(age); // 18
```

​		当执行 `int age = 18;` 这句代码时，JVM会在内存中申请一块区域，在这个区域中存储了一个整数18，给这个区域取的名字叫age； 相当于在盒子中存了一个数据18，这个盒子的名字是age，当我们打印age时，就是从盒子中把盒子中的数据取出来再打印。

- 为什么要用变量呢？

  使用变量来记录数据，对于数据的管理更为灵活。比如我们有多个地方用到一个整数10,

  ```java
  //1.假设4多个地方用到整数10; 现在我想把10改为20，这时你得一条语句一条语句的
  修改
  System.out.println(10);
  System.out.println(10);
  System.out.println(10);
  System.out.println(10);
  //2.同样这里还是在多个地方用到整数10，你可以先用一个变量记录这个整数10
  int x = 10;
  //然后在需要用到整数10的地方，用x代替就行；
  //如果我们把x值改了，那么后面用到x的值的地方就都一起改变了
  System.out.println(x);
  System.out.println(x);
  System.out.println(x);
  System.out.println(x);
  ```

- 变量有应用场景?

  变量的应用场景无处不在，只要是程序中能发生变化的数据，都可以用变量存储。比如：你微信钱包中的余额，你微信的昵称，你微信的个性签名； 余额随着你花钱是不是在变少，昵称和个性签名也可以经常修改。

  ```java
  //比如：你现在有188.8元，一会要发100元，再收20元。
  double money = 188.8;
  //发100元
  money = money - 100;
  //再收20元
  money = money + 20;
  //再打印money记录的值是多少
  System.out.println(money); // 108.8
  // 再比如：公交车大人2元，小孩一元，公交车经过2站
  // 第一站：3个大人1个小孩上车 3 * 2 + 1
  // 第二站：1个大人1个小孩上车 1 * 2 + 1
  // 请问一共上了多少人，一共收入多少钱？
  // 刚开始公交车箱子里没有钱，用money2表示箱子里的钱
  int money2 = 0;
  //刚开始公交车上也没有人，用count变量表示上车的人数
  int count = 0;
  //经过两站的人数：第一站3人，第二站1人，总的人数是3+1
  count = 3 + 1;
  count = count + 1 + 1;
  //经过两站的钱数：
  money2 = money2+ 3*2+1; // 经过第一站后
  money2 = money2+2+1; // 经过第二站后
  // 打印人数和钱数
  System.out.println(count); // 6
  System.out.println(money); // 10
  ```

  - 变量的注意事项

    ```java
    1.变量定义在哪个{}范围内，就只在哪个大括号内有效。变量的有效范围称之为变量的作
    用域
    	{
    		int a = 10;
    		System.out.println(a); //这是是对的
    	}
    	System.out.println(a); //这里会出错
    2.在同一个作用域内，不能有两个同名的变量
    	{
    		int a = 10;
    		int a = 20; //这里会出错
    	}
    3. 变量没有初始化，不能直接使用
    	int a; // 仅仅定义了变量，但是没有初始值
    	System.out.println(a); // 这里会出错
    4.变量可以定义在同一行
    	如：int a=10, b=20; // a和b都是int类型
    	// int a,b; // 定义变量
    	// 一堆代码
    	int a = 10; // 赋值
    	int b = 20; // 赋值
    ```

    

#### 2.4 标志符

​		在Java中，标识符用来为程序中的常量、变量、方法、类、接口和包命名。标识符的

命名需要遵循一定的规则，包括以下四个规则：

​	（1）标识符由字母（ A~Z 和 a~z ）、数字（0~9）、下划线（_）、美元符号（$）

以及部分Unicode字符集（各符号之间没有空格）组成。

​	（2）标识符的首字母以字母、下划线或美元符号开头，后面可以是任何字母、数

字、美元符号或下划线，但不能以数字开头。

​	（3）标识符的命名不能是关键字、布尔值（true、false）和null。

​	（4）标识符区分大小写，没有长度限制。

```java
$name、_name、name、(✓)
1name、@name、null(✕)
```

#### 2.5 关键字

- 什么是关键字？

关键字是java语言中有特殊含义的单词。比如用int表示整数，用double表示小数，等等！

- 关键字有哪些？

学习Java的语法其本质就是学习这些关键字的含义，一共有51个关键字

51个关键字:

| **abstract**   | **assert**       | **boolean**   | **break**      | **byte**   |
| -------------- | ---------------- | ------------- | -------------- | ---------- |
| **case**       | **catch**        | **char**      | **class**      | **const**  |
| **continue**   | **default**      | **do**        | **double**     | **else**   |
| **enum**       | **extends**      | **final**     | **finally**    | **float**  |
| **for**        | **goto**         | **if**        | **implements** | **import** |
| **instanceof** | **int**          | **interface** | **long**       | **native** |
| **new**        | **package**      | **private**   | **protected**  | **public** |
| **return**     | **strictfp**     | **short**     | **static**     | **super**  |
| **switch**     | **synchronized** | **this**      | **throw**      | **throws** |
| **transient**  | **try**          | **void**      | **volatile**   | **while**  |
| _              |                  |               |                |            |

关键字的特点：

1. 关键字都是小写的

eg: 下图中红色框住的单词都是关键字；

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807013117743.png" alt="image-20230807013117743" style="zoom:50%;" />

> alibaba《Java开发手册》
>
> （1）代码中的命名均不能以下划线或美元符号开始，也不能以下划线或美元符号结束。
>
> （2）所有编程相关的命名严禁使用拼音与英文混合的方式，更不允许直接使用中文的。
>
> （3）使用 UpperCamelCase 风格，每个单词首字母都大写，在Java中，类名、接口名、枚举名都使用该风格，该风格还被称为帕斯卡命名法。`大驼峰`HelloWorld
>
> （4）方法名、参数名、成员变量、局部变量都统一使用 LowerCamelCase风格，第一个单词首字母小写，其余字母单词首字母都大写。`小驼峰` helloWorld

## 3 Java的基本数据类型

#### 3.1 数据类型

数据类型详解

> 整数在计算机中的存储原理

任何数据在计算机中都是以二进制表示的，二进制就是一种数据的表示形式，特点是逢2进1。

数据的表示形式除了二进制（逢2进1），八进制（逢8进1）、还有十进制（逢10进1）、十六进制（逢10进1）等。

十进制对应二进制的方法：除**2**取余法

```java
1.做法：让十进制数据（及商）连续除以2，直到商为0，余数反转（从下到上即为二进制）
2.例1：把十进制6转换为二进制
			商  余数
	6/2	 	3 	0
	3/2	 	1	1
	1/2 	0 	1
	然后把余数反转：6对应的二进制是110
3.例2： 把十进制13转换为二进制
			商  余数
	13/2	6	1
	6/2 	3 	0
	3/2 	1 	1
	1/2 	0 	1
	然后把余数反转：10对应的二进制是1101
```

- 二进制转十进制

  在二进制中如果把二进制的每一位从右往左从0开始编一个号，假设某一位数字是a（0，1）, 那么这一位数表示的值就是：a*2^n；

- 二进制转八进制

  运算规则：

  把二进制的每三位（从右到左）一组合，然后把每三位分别转为十进制，最后拼接到一起

  原因：因为111的值是7, 再大于7就需要往左进位了。

- 二进制转十六进制

  运算规则：

  把二进制的每四位（从右到左）一组合，然后把每四位分别转为十进制，最后拼接到一起

  原因：因为1111，的值是15, 再大1满16了就需要往进位了。

> 不同进制在**Java**程序中的书写格式：

```java
System.out.pirntln('a'+1); //98			A——65，a——97
System.out.pirntln(0b01100001); //97	0b——二进制
System.out.pirntln(0141); //97			0o——八进制
System.out.pirntln(0x61); //97			0x——十六进制
```

- 计算机的最小存储单位

计算机中最小的存储单位是字节（**Byte**），一个字节占**8**位（**bit**），即使这个数据不足8位也需要用8位来存储

 eg： 在计算机中存储一个整数6，转换为二进制是110，存储00000110。

​       						  <img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807015554736.png" alt="image-20230807015554736" style="zoom:50%;" />

​		文件的大小都是以字节为单位的。

​		在定义变量时我们是要声明数据类型的，这里的数据类型是用来规定变量存储什么类型的数据。

比如 int a = 10; 这里的 int 就是限制变量只能存储整数。

​		除了int这种数据类型，Java还提供了很多其他的数据类型。Java的数据类型整体上来说分为两大类： 基本数据类型、引用数据类型。

###### 3.1.1 基本数据类型

​		基本数据类型一共有4类8种，，每一种数据类型占用的内存空间不一样，能够表示的数据范围也不一样。如下表：

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807020008152.png" alt="image-20230807020008152" style="zoom: 67%;" />

注意：随便写一个整数或者小数的字面量，它也是有默认数据类型的

> \- 比如23，它默认就为int类型；如果加上后缀L，则为long类型；
>
> \- 比如23.8，它默认为double类型；如果加上后缀F，则为float类型;

eg: 

```java
public class TypeDemo1 {
	public static void main(String[] args) {
		// 目标：掌握8种基本数据类型，用来定义变量。
		// 1、整型
		byte number = 98;
		System.out.println(number);
		short number2 = 9000;
		int number3 = 12323232; // 默认
		// 注意：随便写一个整型字面量，默认是int类型的，73642422442424虽然没有超过long的范围，但是它超过了本身int的范围了。
		// 如果希望随便写一个整型字面量是long类型的，需要在其后面加上L/l
		long number4 = 73642422442424L;
		// 2、浮点型
		// 注意:
		// 随便写一个小数字面量，默认当成double类型对待的，
		// 如果希望这个小数是float类型的，需要在后面加上：F/f
		float score1 = 99.5F;
		double score2 = 99.8; // 默认定义方案。
		// 3、字符型
		char ch1 = 'a';
		char ch2 = '中';
		char ch3 = '国';
		// 4、布尔型
		boolean b1 = true;
		boolean b2 = false;
		// 引用数据类型：String.
		
	}
}
```



###### 3.1.2 引用数据类型

字符串、枚举

```java
public class TypeDemo1 {
	public static void main(String[] args) {
		// String代表的是字符串类型，定义的变量可以用来表示字符串。
		String name = "黑马 KFM";
		System.out.println(name);
    }
}
```

#### 3.2 数据类型转换

​		在实际开发中可能存在将某种类型变量的值，赋值给另一个类型的变量；也可能存在多种数据类型的数据一起运算的情况，这些情况中都会涉及到类型转换。

​		类型转换的形式总体分为2种，一种是自动类型转换（扩展原始转换），一种是强制类型转换（缩小原始转换）

###### 3.2.1 自动类型转换

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807020822479.png" alt="image-20230807020822479" style="zoom:50%;" />

​		自动类型转换指的是，数据范围小的变量可以直接赋值给数据范围大的变量

```java
byte a = 12;
int b = a; // 这里就发生了自动类型转换(把byte类型转换int类型)
```

- 自动类型转换的原理：

自动类型转换其本质就是在较小数据类型数据前面，补了若干个字节 

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807021029382.png" alt="image-20230807021029382" style="zoom:67%;" />

除了byte和int之间的转换之外，其他类型也可以转换，转换顺序如下图所示：

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807021103110.png" alt="image-20230807021103110" style="zoom:67%;" />

eg:

```java
public class TypeConversionDemo1 {
	public static void main(String[] args) {
		// 目标：理解自动类型转换机制。
		byte a = 12; // 8位
		int b = a; // 32位
		System.out.println(a); // 12
		System.out.println(b); // 12
		int c = 100; // 32位
		double d = c; // 64位
		System.out.println(d); // 100
		char ch = 'a'; // 16位
		int i = ch; // 32位
		System.out.println(i); // 97
	}
}
```

- 表达式的自动类型转换

表达式指的是几个变量或者几个数据一起参与运算的式子。

如果同一个表达式中，出现不同类型的变量或者数据一起运算，这种情况下需要遵守下面的两条运算规则：

> 多种数据类型参与运算，其结果以大的数据类型为准
>
> byte,short,char 三种类型数据在和其他类型数据运算时，都会转换为int类型再运算

```java
public class TypeConversionDemo2 {
	public static void main(String[] args) {
		// 目标：掌握表达式的自动类型转换机制。
		byte a = 10;
		int b = 20;
		long c = 30;
		long rs = a + b + c; 
		System.out.println(rs); // 60
		double rs2 = a + b + 1.0;
		System.out.println(rs2);  // 31.0
		byte i = 10;
		short j = 30;
		int rs3 = i + j;
		System.out.println(rs3);  // 40
		//
		short s = 1;
		s = s + 1; // short ==> int 去进行运算的 结果是 int 类型的
		System.out.println(s); // 报错
		// 分析下面的程序运行结果
		byte b = 1;
		short s = 2;
		short x = b + s; // byte + short = int
		System.out.println(x); // 报错
		short s = 1;
		s = 18 + 1;
		System.out.println(s); // 19
	}
}
```

###### 3.2.2 强制类型转换

将数据范围大的数据直接赋值给数据范围小的变量，会报错。

因为数据范围大的数据，赋值给数据范围小的变量，它有可能装不下；就像把一个大桶的水倒入一个小桶中，有溢出的风险。

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807022820450.png" alt="image-20230807022820450" style="zoom:67%;" />

​		但是你强行将范围大的数据，赋值给范围小的变量也是可以的，这里就需要用到强制

类型转换。下面是强制类型转换的格式：

```java
目标数据类型 变量名 = (目标数据类型)被转换的数据;
int a = 10;
byte b = (byte)a;
int a = 128;
byte b = (byte)a;
```

eg:

```java
public class TypeConversionDemo3 {
	public static void main(String[] args) {
		// 目标：掌握强制类型转换。
		int a = 20;
		byte b = (byte) a;
		System.out.println(a);
		System.out.println(b);
		int i = 1500;
		byte j = (byte) i;
		System.out.println(j);
		double d = 99.5;
		int m = (int) d; // 强制类型转换
		System.out.println(m); // 丢掉小数部分，保留整数部分
	}
}
```

- 强制类型转换的原理

强制类型转换的原理，其实就是强行把前面几个字节砍掉，但是有数据丢失的风险

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807023320208.png" alt="image-20230807023320208" style="zoom:67%;" />

> 字符在计算机中的存储原理
>
> 其实字符并不是直接存储的，而是把每一个字符编为一个整数，存储的是字符对应整数的二进制形式。美国人有一套字符和整数的对应关系表，叫做ASCII编码表。

```java
ASCII编码表中字符编码的规律：
1.字符0对应48，后面的1,2,3,4...9 对应的十进制整数依次往后顺延
2.字符a对应97，后面的b,c,d,e...z 对应的十进制整数依次往后顺延
3.字符A对应65，后面的B,C,D,E...Z 对应的十进制整数依次往后顺延
```

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807023750892.png" alt="image-20230807023750892" style="zoom:80%;" />

*注意：在ASCII编码表中是不包含汉字的，汉字在其他编码表中*

## 4 表达式——Scanner类介绍

键盘录入这个事情，其实并不是我们自己做的，而是**Java**本身就提供了这样的功能，我们按照它的要求，去调用就行。

我们在安装JDK的时候，其实JDK中就已经包含了一些Java写好的代码，我们把Java写好的代码直接拿过来用就行。

比如：Scanner就是Java提供给我们用于键盘录入数据的类，为了录入不同类型的数据，还提供了不同的功能，每一个功能会有不同的名称，我们只需要调用Scanner提供的功能就可以完成键盘录入数据

> Scanner类是一个用于扫描输入文本的实用程序，可以方便地获取用户的输入，实现程序和人之间的交互。

```java
【第1步】：在class类上导包：一般不需要我们自己做，ide工具会自动帮助我们导包
的。
import java.util.Scanner;
【第2步】：得到一个用于键盘扫描器对象（照抄代码就行，固定格式）
// Scanner是键盘扫描器对象(你就把它理解成一个东西)，这个东西有录入的功
能
// sc是给这个东西取的名字
Scanner sc = new Scanner(System.in);
【第3步】：开始调用sc的功能，来接收用户键盘输入的数据。
// sc这个东西有键盘录入整数的功能，这个功能的名字叫nextInt()
// .表示表示调用的意思
int age = sc.nextInt();
System.out.println("我的年龄是:"+age);
// sc这个东西还有键盘录入字符串的功能，这个功能的名字叫next
String name = sc.next();
System.out.println("我的姓名是:"+name);
```

使用Scanner类步骤

(1) 导入Scanner类：

在使用Scanner类之前，需要导入java.util包中的Scanner类。可以使用以下语句进行导入：

```java
import java.util.Scanner
```

(2) 创建Scanner对象：

接下来，需要创建一个Scanner对象，用于扫描用户的输入。可以使用以下语句创建Scanner对象：

```java
Scanner input = new Scanner(System.in);
```

(3) 获取用户输入的数据：

通过new Scanner对象，我们可以使用常用的方法来获取用户从键盘上输入的不同类型的数据，如整点、浮点数、字符串等。

下面列出了Scanner类常用的方法，通过这些方法可以接受用户从键盘上输入的整数、浮点数、字符串等数据。

| 方法名称            | 说明                                                         |
| ------------------- | ------------------------------------------------------------ |
| String next()       | 获得一个字符串                                               |
| String nextLine()   | 获取一个字符串                                               |
| int nextInt()       | 获得一个整数                                                 |
| double nextDouble() | 获得一个双精度浮点数                                         |
| boolean hasNext()   | 判断是否有输入数据，如果有输入数据，则返回true，否则返回false |

> 注意：next()方法与nextLine()方法的区别
>
> next()方法：
>
> (1) 一定要读取到有效字符后才可以结束输入。
>
> (2) 对输入有效字符之间遇到的空白字符，next()方法会自动将其去除。
>
> (3) 只有在输入有效字符后，才将其后面输入的空白字符作为分割符或结束符。
>
> (4) next()方法无法获取带有空格的字符。
>
> nextLine()方法：
>
> (1)`enter`作为结束符
>
> (2)next()方法可以获取带有空格的字符。



# *8.1(表达式——常用运算符 + )*

## 1 常用运算符

计算机是用来处理数据的，处理数据就少不了对数据的计算，想要对数据进行计算就必须用到运算符。

运算符就是参与运算的符号。Java提供的运算符有很多种，可以分为下面几种

- 基本算术运算符

- 自增自减运算符

- 赋值运算符

- 关系运算符

- 逻辑运算符

- 三元运算符

#### 1.1 算数运算符

算术运算符有` +` ` - ` `* ` `/ ` `%` ，其中 `*` 表示乘法，` / `表示除法， `%` 表示取余数

需要我们注意以下几点：

> /: 两个整数相除，结果也是一个整数
>
> %: 表示两个整数相除，取余数

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807024827663.png" alt="image-20230807024827663" style="zoom: 67%;" />

注意：`+` 符号除了用于加法运算，还可以作为连接符。` +` 符号与字符串运算的时候是用作连接符的，其结果依然是一个字符串。

```java
public class OperatorDemo1 {
	public static void main(String[] args) {
		// 目标：掌握基本的算术运算符的使用。
		int a = 10;
		int b = 2;
		System.out.println(a + b); // 12
		System.out.println(a - b); // 8
		System.out.println(a * b); // 20
		System.out.println(a / b); // 5 整数 / 整数 = 整数
		System.out.println(5 / 2); // 2
		System.out.println(5.0 / 2); // 2.5
		int i = 5;
		int j = 2;
		System.out.println(1.0 * i / j); // 2.5
		System.out.println(a % b); // 0
		System.out.println(3 % 2); // 1
		System.out.println("---------------------------------------");

        // 目标2：掌握使用+符号做连接符的情况。
		int a2 = 5;
		System.out.println("abc" + a2); // abc5
		System.out.println(a2 + 5); // 10
		System.out.println("kaifamiao" + a2 + 'a'); //kaifamiao5a
		System.out.println(a2 + 'a' + "kaifamiao"); //5akaifamiao 102kaifamiao
	}
}
```



#### 1.2 自增自减运算符

`++` 读作自增， `-- `读作自减； 运算规则如下:

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807025147734.png" alt="image-20230807025147734" style="zoom:67%;" />

注意：自增自减只能对变量进行操作，不能操作字面量。具体使用时也分为两种情况，如下:

```java
1.单独使用：++或者-- 放在变量前面没有区别
int a = 10;
a++; // 11
--a; // 10
System.out.println(a); // 10

2.混合使用：++或者-- 放在变量或者前面运算规则稍有不同 
    ++ 在后 先赋值 再自增； ++ 在前 先自增再赋值
int a = 10;
int b = a++;
int c = ++a;
System.out.println(a); // 12
System.out.println(b); // 10
System.out.println(c); // 12

int x = 10;
int y = --x; // x = 9, y = 9
```

#### 1.3 赋值运算符

基本的赋值运算符其实就是 `=` 号，意思就是把右边的数据赋值给左边的变量

```java
int a = 10; // 将数据10赋值给左边的变量a
```

除了基本的赋值运算符，还有扩展的赋值运算符。有 `+=`  `-=`  `*=`  `/=`  `%=`

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807025714156.png" alt="image-20230807025714156" style="zoom:67%;" />

eg:

```java
public class OperatorDemo3 {
public static void main(String[] args) {
// 目标：掌握扩展赋值运算符的使用。
// +=
double a = 9.5;
int b = 520;
a += b; // a = (double)(a + b);
System.out.println(a); // 529.5
// -= 需求：发红包
double i = 600;
double j = 520;
i -= j; // i = (double)(i - j);
System.out.println(i); // 80
int m = 10;
int n = 5;
// m *= n; // 等价形式： m = (int)(m * n)
// m /= n; // 等价形式： m = (int)(m / n)
m %= n; // 等价形式： m = (int)(m % n)
System.out.println(m); // 0
}
}
```

eg:

```java
问题1：下面的代码否有问题？
byte x = 10;
byte y = 30;
x = x + y; // byte char short 转换成int类型进行计算
System.out.println(x); // 报错
问题2：下面的代码是否有问题？
byte x = 10;
byte y = 30;
// x += 3;
x += y; // x = (byte) (x + y);
System.out.println(x); // 40
```



#### 1.4 关系运算符

关系运算符（也叫比较运算符）

下图是每一种关系运算符的符号及作用，每一个关系运算符的结果都是boolean值（true、false）

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807025945597.png" alt="image-20230807025945597" style="zoom:67%;" />

关系运算符在程序中常用于条件判断，根据条件判断的结果是true还是false，来决定后续该执行哪些操作。

#### 1.5 逻辑运算符

​		逻辑运算符用于将多个条件(布尔类型)放在一起运算，并返回一个布尔值(true或false)作为结果。它们用于组合和操作布尔表达式，以便进行逻辑判断和控制流程。

| 运算符 | 含义     | 例子         | 运算规则                                                     |
| ------ | -------- | ------------ | ------------------------------------------------------------ |
| &      | 逻辑与   | 2>1 & 3<2    | 多个条件必须是true，结果才是true；有一个是false，结果就是false |
| \|     | 逻辑或   | 2>1 \| 3>5   | 多个条件中只要有一个是true，结果就是true                     |
| ^      | 逻辑异或 | !(2>1)       | 就是取反：你真我假，你假我真                                 |
| !      | 逻辑非   | 2>1 ^ 3>1    | 前后条件的结果相同，就直接返回false，前后条件不同，才返回true |
| &&     | 短路与   | 2>10 && 3>2  | 判断结果与“ & ”一样，过程不同：左边为false，右边就不执行     |
| \|\|   | 短路或   | 2>1 \|\| 3<5 | 判断结果与“ \| ”一样，过程不同：左边为true，右边就不执行     |

案例：

1.  手机

需求1：要求手机必须满足尺寸大于等于6.95，且内存必须大于等于8
需求2：要求手机要么满足尺寸大于等于6.95，要么内存必须大于等于8

   Java源代码：

```java
import java.util.Scanner;
public class Telephone{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入手机尺寸：");
		double size=input.nextDouble();
		System.out.println("请输入手机内存：");
		double storage=input.nextDouble();
		//需求1：要求手机必须满足尺寸大于等于6.95，且内存必须大于等于8
        boolean res1= size >= 6.95 && storage >= 8;
		//需求2：要求手机要么满足尺寸大于等于6.95，要么内存必须大于等于8
        boolean res2= size >= 6.95 || storage >= 8;
		System.out.println("需求1：" +res1);
		System.out.println("需求2：" +res2);
    	input.close();
	}
}
```

   编译及运行：<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230801143558960.png" alt="image-20230801143558960" style="zoom:50%;" />

2. 闰年

   Java源代码：

```java
//键盘输入一个年份，判断是否是闰年
import java.util.Scanner;
public class IsLeap{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = input.nextInt();
     	//能被4整除但不能被100整除，或者被400整除
        boolean res= year%4==0 && year%100!=0 || year%400==0 ;
		System.out.println("您输入的年份"+year+"是闰年吗？" +res);
		input.close();
    }
}
```
​		编译：<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20230801154703052.png" alt="image-20230801154703052" style="zoom:50%;" />

​		运行：<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230801154625780.png" alt="image-20230801154625780" style="zoom:50%;" />

> 逻辑运算符在程序中常用于组合几个条件判断，根据条件判断的结果是true还是false，来决定后续该执行哪些操作。

3. 练习：键盘输入一个数字，判断是否是奇数。

   Java源代码：

```java
import java.util.Scanner;
public class OddNumber{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int num = input.nextInt();
     	//模2余1	
        boolean res= num % 2 == 1;
		System.out.println("您输入的数字"+num+"是奇数吗？" +res);
        input.close();
	}
}
```
​		编译及运行：

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230801144200754.png" alt="image-20230801144200754" style="zoom:50%;" />

#### 1.6 位运算符

在计算机内部，数据以二进制位（0和1）的形式存储和处理。计算机通过将数据转换为二进制形式，将其存储在内存中，并对其进行操作和计算。不同的数据类型在内存中占据不同长度的二进制位，以便正确地表示和处理数据。

1. 原码

原码是一种最简单的机器数表示法，其中最高位表示符号位，其余位表示该数的二进制的绝对值。

2. 反码

正数的反码与原码相同，而负数的反码是其原码除符号位外，按位取反的结果。

3. 补码

正数的补码等于其原码，而负数的补码等于其反码加1

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807030155364.png" alt="image-20230807030155364" style="zoom:67%;" />

#### 1.7 三元运算符

三元运算符的格式：

```java
数据类型 变量名 = 关系表达式 ? 值1 : 值2;
```

三元运算的执行流程：首先计算关系表达式的值，如果关系表达式的值为true，则返回值1；如果关系表达式的值为false, 则返回值2；

eg：判断学生的成绩是否>=60，如果为true，就考试通过；如果为false，就成绩不合格。

```java
public class OperatorDemo6 {
public static void main(String[] args) {
// 目标：掌握三元运算符的基本使用。
double score = 58.5;
String rs = score >= 60 ? "成绩及格" : "成绩不及格";
System.out.println(rs);
// 需求2：找出2个整数中的较大值，并输出。
int a = 99;
int b = 69;
int max = a > b ? a : b;
System.out.println(max);
// 需求3：找3个整数中的较大值。
int i = 10;
int j = 45;
int k = 34;
// 找出2个整数中的较大值。
int temp = i > j ? i : j;
// 找出temp与k中的较大值。
int max2 = temp > k ? temp : k;
System.out.println(max2);
}
}    
```

## 2.运算优先级

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807030406874.png" alt="image-20230807030406874" style="zoom:67%;" />

从图中我们发现，&&运算比||运算的优先级高，所以&&和||同时存在时，是先算&&再算||；

eg:

```java
// 这里&&先算 相当于 true || false 结果为true
System.out.println(10 > 3 || 10 > 3 && 10 < 3); // true
```

在实际开发中，很少考虑运算优先级， 因为如果想让某些数据先运算，加 () 就可以，这样阅读性更高。

```java
//有括号先算 相当于 true && false 结果为false
System.out.println((10 > 3 || 10 > 3) && 10 < 3); //false
```



# *8.2(分支结构)*

<u>**程序流程控制**</u>

程序流程控制就是控制程序的执行顺序。

程序的流程控制一般分为3种：顺序结构、分支结构、循环结构

- 顺序结构：就是不加任何控制，代码从main方法开始自上而下执行

- 分支结构：就是根据条件判断是true还是false，有选择性的执行哪些代码。在Java语言中提供了两个格式if 、 switch

- 循环结构：就是控制某一段代码重复执行。在Java语言中提供了三种格式，for、while、do-while还有1.5新增的for-each循环，可以迭代（遍历）数组

  <img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807030858761.png" alt="image-20230807030858761" style="zoom:67%;" />

## 1. if分支

`if` 作用，是用于对条件进行判断，判断的结果只可能有两个值true或者false，然后根据条件判断的结果来决定执行那段代码

**if**分支的格式：在Java中if分支有三种格式

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807031105934.png" alt="image-20230807031105934" style="zoom: 50%;" />

#### 1.1 if单分支

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807035107600.png" alt="image-20230807035107600" style="zoom:50%;" />

```java
// 需求：测量用户体温，发现体温高于37度就报警。
double temp = 38;
if (temp > 37) {
System.out.println("这个人体温不正常，快把他抓走");
System.out.println("这个人体温不正常，快把他抓走");
System.out.println("这个人体温不正常，快把他抓走");
}
System.out.println("我是代码的剩余部分");
```

#### 1.2 if双分支

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807035125730.png" alt="image-20230807035125730" style="zoom:50%;" />

```java
// 需求2：发红包，你的钱包余额是99元，现在要发出90元
// 如果钱够触发发红包的动作，如果钱不够，则提示：余额不足。
public static void main(String[] args) {
	// 需求2：发红包，你的钱包余额是99元，现在要发出90元
	// 如果钱够触发发红包的动作，如果钱不够，则提示：余额不足。
	System.out.println("我要开始发红包了");
	double balance = 89;
	if (balance > 90) {
		balance -= 90;
		System.out.println("你的余额是" + balance);
	} else {
		System.out.println("余额不足");
	}
	
    System.out.println("继续执行main方法");
}
```

#### 1.3 if多分支

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807035149653.png" alt="image-20230807035149653" style="zoom:50%;" />

```java
// 需求3：某个公司有一个绩效系统，根据员工的打分输出对应的绩效级别。[0,60) D [60,80) C [80,90) B [90,100] A
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入员工打分成绩");
	double score = sc.nextDouble();
	if (score >= 0 && score < 60) {
		System.out.println("员工绩效级别：D");
	} else if (score < 80) {
		System.out.println("员工绩效级别：C");
	} else if (score < 90) {
		System.out.println("员工绩效级别：B");
	} else if (score <= 100) {
		System.out.println("员工绩效级别：A");
	} else {
		System.out.println("你输入的成绩不合理");
	}
	System.out.println("继续执行main方法");
}
```



#### 1.4 if嵌套

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807035213507.png" alt="image-20230807035213507" style="zoom:50%;" />

**if** 使用的几个常见问题:

- 第1个问题：if的()后面不能写分号 ; 否则if下面的语句与if无关

```java
double t = 36.9;
if (t > 37); {
	System.out.println("这个人的温度异常，把他赶紧拉走吧");
}
```

- 第2个问题：if后面的大括号，如果只有一行代码，大括号可以省略

```java
double t = 36.9;
if (t > 37)
System.out.println("这个人的温度异常，把他赶紧拉走吧");
```



## 2. switch分支

#### 2.1 switch分支的执行流程

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807035257058.png" alt="image-20230807035257058" style="zoom:50%;" />

switch 分支的作用，是通过比较值来决定执行哪条分支代码。先看一下switch分支的格式和执行流程

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807031645034.png" alt="image-20230807031645034" style="zoom:50%;" />

eg:

```java
/*
需求：做个电子备忘录，在控制台分别输出周一到周五的工作安排
周一：埋头苦干，解决bug
周二： 请求大牛程序员帮忙
周三：今晚啤酒、龙虾、小烧烤
周四：主动帮助新来的女程序解决bug
周五：今晚吃鸡
周六：与王婆介绍的小芳相亲
周日：郁郁寡欢、准备上班。
*/
```



```java
String week = "周三";
switch (week){
case "周一":
System.out.println("埋头苦干，解决bug");
break;
case "周二":
System.out.println("请求大牛程序员帮忙");
break;
case "周三":
System.out.println("今晚啤酒、龙虾、小烧烤");
break;
case "周四":
System.out.println("主动帮助新来的女程序解决bug");
break;
case "周五":
System.out.println("今晚吃鸡");
break;
case "周六":
System.out.println("与王婆介绍的小芳相亲");
break;
case "周日":
System.out.println("郁郁寡欢、准备上班");
break;
default:
System.out.println("您输入的星期信息不存在~~~");
}        
```

**switch** 注意事项:

- 表达式类型只能是byte、short、int、char；JDK5开始支持枚举，JDK7开始支持String，不支持double、float等

- case给出的值不允许重复，且只能是字面量，不能是变量。

- 正常使用switch的时候，不要忘记写break，否则会出现穿透现象。

**switch**语句匹配的数据类型：byte、short、int、char、String。

**case**后面的值，只能是字面量不能是变量。

**case**穿透现象：当switch语句中没有遇到break，就会直接穿透到下一个case语句执行，直到遇到break

为止。

**case**匹配多个值：当多个case语句想要执行同一段代码时，可以利用`,`隔开`case`值后写在一起

```java
public class Demo02 {
public static void main(String[] args) {
String week = "周三";
switch(week) {
case "周一" :
System.out.println("埋头苦干，解决bug");
break;
case "周二", "周三" :
System.out.println("忙忙碌碌不知道在干什么");
break;
case "周四" :
System.out.println("请求大佬程序员帮忙");
break;
case "周五" :
System.out.println("自己整理代码");
break;
case "周六" :
System.out.println("逛街");
break;
case "周日" :
System.out.println("打游戏");
break;
default:
System.out.println("你输入的星期信息不存在");
}
}
}
```

#### 2.2 switch分支新特性

###### 2.2.1 特性**1**：箭头表达式

没有break，必须default

```java
public static void main(String[] args) {
// 先输入年份，在输入一个月份，返回这个月多少天
// 31 30 29 28 31 1,3,5,7,8,10,12 30 4, 6 , 9, 11 2 闰年
29天 平年 28天
Scanner sc = new Scanner(System.in);
System.out.println("请输入一个年份：");
int year = sc.nextInt();
System.out.println("请输入一个月份：");
int month = sc.nextInt();
// int temp = 12;
// switch 新特性 -> 箭头表达式
int days = 0;
switch (month) {
case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
case 4, 6, 9, 11 -> days = 30;
case 2 -> {
// 判断 year 是否是闰年
if (year % 4 == 0 && year % 100 != 0 || year % 400 ==
0) {
days = 29;
} else {
days = 28;
}
}
default -> days = -1;
}
if (days == -1) {
System.out.println("输入的月份不正确");
} else {
System.out.println("这个月" + days + "天");
}
// System.out.println(days == -1 ? "输入的月份不正确" :
"这个月" + days + "天");
}
```

###### 2.2.2 特性**2**：yield

```java
public static void main(String[] args) {
// 先输入年份，在输入一个月份，返回这个月多少天
// 31 30 29 28 31 1,3,5,7,8,10,12 30 4, 6 , 9, 11 2 闰年
29天 平年 28天
Scanner sc = new Scanner(System.in);
System.out.println("请输入一个年份：");
int year = sc.nextInt();
System.out.println("请输入一个月份：");
int month = sc.nextInt();
// int temp = 12;
// switch 新特性 yield 在 {} 中返回某个值给变量
// int days = 0;
int days = switch (month) {
// case temp: 错误使用
case 1, 3, 5, 7, 8, 10, 12 -> 31;
case 4, 6, 9, 11 -> 30;
case 2 -> {
// 判断 year 是否是闰年
if (year % 4 == 0 && year % 100 != 0 || year % 400 ==
0) {
yield 29;
} else {
yield 28;
}
}
default -> -1;
};
if (days == -1) {
System.out.println("输入的月份不正确");
} else {
System.out.println("这个月" + days + "天");
}
// System.out.println(days == -1 ? "输入的月份不正确" :
"这个月" + days + "天");
}    
```

###### **if** 、**switch**如何选择

> \- 如果是对一个范围进行判断，建议使用if分支结构
>
> \- 如果是与一个一个的值比较的时候，建议使用switch分支结构

# *8.3(循环结构与随机数)*

## 1. 循环结构

循环结构可以控制一段代码重复执行。循环结构有for循环、while循环、do-while循环。

一个循环是由四部分构成的，分别是循环变量、循环条件、循环体、改变循环变量的值。

- 循环变量，循环变量用于控制循环次数。

- 循环条件，循环条件用来判断循环是否继续。

- 循环体，循环体是循环条件为true时，要执行的代码段。

- 改变循环变量的值，只有循环变量的值能够改变，循环才有结束的时候，否则是死循环。

#### 1.1 while

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807035326069.png" alt="image-20230807035326069" style="zoom:50%;" />

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807032746592.png" alt="image-20230807032746592" style="zoom:50%;" />

```java
// 需求：打印5行Hello kfm
int a = 0;
while (a < 5) { // a = 0 a = 1 a = 2 a = 3 a = 4 a = 5
System.out.println("hello kfm");
a ++;
}
```

代码的执行流程如下图所示：按照① ②③④ ②③④ ... 的流程执行

如果②步骤为true，才循环执行③④步骤

如果②步骤为false，则循环结束

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807032903890.png" alt="image-20230807032903890" style="zoom: 50%;" />

#### 1.2 for

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807035452794.png" alt="image-20230807035452794" style="zoom:50%;" />

```java
for (表达式1; 表达式2; 表达式3) {
循环体
}
// 表达式1 ： 循环变量的初始化
// 表达式2 ： 循环条件
// 表达式3 ： 改变循环变量的值
// 循环体 ：要重复循环的部分
表达式1 --> 表达式2 --> 循环体 --> 表达式3 --> 表达式2 --> 循环体 --> 表
达式3 --> 表达式2
```

比如：我们想要在控制台打印输出3个HelloWorld

```java
// 需求：打印3行Hello World
for (int i = 0; i < 3; i ++) { // i = 0 i = 1 i = 2 i = 3
System.out.println("hello world");
}
```

如下图所示，是按照下面的① ② ③ ④， ② ③ ④... 的顺序来执行的；

当②条件为true时，再依次执行③④代码，然后回到②继续判断

当②条件为false时，就结束循环

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807033014268.png" alt="image-20230807033014268" style="zoom:67%;" />

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807033034675.png" alt="image-20230807033034675" style="zoom: 50%;" />

```java
// for循环格式：
for (初始化语句; 循环条件; 迭代语句) {
循环体语句(重复执行的代码);
}
```
eg:

```java
需求：世界最高山峰珠穆朗玛峰高度是：8848.86米 = 8848860 毫米，假如我有一张足
够大的它的厚度是0.1毫米。请问：该纸张折叠多少次，可以折成珠穆朗玛峰的高度？
// 0.1 * 2 * 2 * 2 * 2
double paper = 0.1;
int height = 8848860;
int count = 0;
while (paper <= height) {
paper = paper * 2;
count ++;
}
```

#### 1.3 do while

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807035513410.png" alt="image-20230807035513410" style="zoom:50%;" />

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807033320111.png" alt="image-20230807033320111" style="zoom:50%;" />

如下图所示：do-while循环的执行流程，是按照① ②③④ ②③④... 的顺序执行的。

我们会发现，do-while循环的特点是先执行，再判断的。即使条件不成立，也会先执行一次。

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807033357525.png" alt="image-20230807033357525" style="zoom:50%;" />

```java
1. for循环 和 while循环（先判断后执行）;
	do...while （先执行后判断）
2.for循环和while循环的执行流程是一模一样的,功能上无区别，for能做的while也能做，反之亦然。
如果已知循环次数建议使用for循环，如果不清楚要循环多少次建议使用while循环。
3.for循环中控制循环的变量只在循环中使用while循环中，控制循环的变量在循环后还可以继续使用
```

#### for、while如何选择

- 从功能来说：能够用for循环做的，都能用while循环做。
- 使用规范上来说：知道循环几次，建议使用for；不知道循环几次建议使用while

#### 死循环

```java
// for死循环
for ( ; ; ){
System.out.println("Hello World1");
}
// while死循环
while (true) {
System.out.println("Hello World2");
}
// do-while死循环
do {
System.out.println("Hello World3");
}while (true);
```

可以用死循环来做服务器程序， 比如百度的服务器程序就是一直在执行的，你随时都可以通过浏览器去访问百度。

#### 循环嵌套

循环嵌套，就是一个循环中又包含另一个循环（就是同学们常说的套娃），下面我们通过案例代码演示一下。

```java
for (int i = 0; i < 3; i ++) { // i = 0 i = 1 i = 2
for (int j = 0; j < 5; j ++) { // j = 0 j = 1 j = 2 j = 3
System.out.println("我爱你");
}
}
// 外循环次数 * 内循环次数
```

循环嵌套执行流程：外部循环每循环一次，内部循环会全部执行完一轮。

```java
i=0 时; i<3为true; 进入循环
//j的取值从0到5,执行一轮，打印5次"我爱你"
for(int j = 1; j <= 5; j++) {
System.out.println("我爱你：" + i);
}
内层循环执行完之后，执行外层的i++; i的值1
i=1时：i<3为true; 进入循环
//j的取值从0到5,又执行一轮，打印5次"我爱你"
for(int j = 1; j <= 5; j++) {
System.out.println("我爱你：" + i);
}
内层循环执行完之后，执行外层的i++; i的值2
i=2时：i<3为true; 进入循环
//j的取值从0到5,再执行一轮，打印5次"我爱你"
for(int j = 1; j <= 5; j++) {
System.out.println("我爱你：" + i);
}
内层循环执行完之后，执行外层的i++; i的值3
i=3时：i<3为false; 外层循环结束
```



## 2. 跳转语句

#### 2.1 `标签`

标签可以放在for、while或do语句之前，其语法格式为：`标签: 语句;`

#### 2.2 `break`、 `continue`

- break作用：跳出并结束当前所在循环的执行

- continue作用：结束本次循环，进入下一次循环

案例1：演示break的使用，提前终止循环的执行 提前结束当前for循环

```java
// break:跳出并结束当前所在循环的执行。
// 场景：假如你有老婆了，你犯错了，你老婆罚你说：5句我爱你
// 说到第三句的时候心软了，让你别再说了。
for (int i = 0; i < 5; i ++) { // i = 0 i = 1 i = 2 i = 3
if (i == 3) {
break;
}
System.out.println("我爱你");
}

// 我爱你
// 我爱你
// 我爱你
// 我爱你
```

案例2：演示continue的使用，结束循环中的一次，继续下一次循环

```java
// continue:跳出当前循环的当次执行，直接进入循环的下一次执行。
// 场景: 假如你有老婆，你犯错了，你老婆罚你洗碗5天。
// 第三天的时候，你表现很好，第三天不用洗碗，但是不解恨，第四天还是要继续的。
for (int i = 0; i < 5; i ++) { // i = 0 i = 1 i = 2 i = 3 i = 4
if (i == 2) {
continue;
}
System.out.println("洗碗");
}

// 洗碗
// 洗碗
// 洗碗
// 洗碗
```

注意：**break**和**continue**不是任何地方都可以使用的

<img src="https://gitee.com/Yachnee/images/raw/master/images/image-20230807034148571.png" alt="image-20230807034148571" style="zoom:50%;" />

## 3. 随机数

> 如何产生一个随机数

```java
// 目标：掌握使用Random生成随机数的步骤。
// 1、导包。import java.util.Random; (idea会自动完成)
import java.util.Random;
public class RandomDemo1 {
public static void main(String[] args) {
// 2、创建一个Random对象，用于生成随机数。
Random r = new Random();
// 3、调用Random提供的功能：nextInt得到随机数。
for (int i = 1; i <= 20; i++) {
int data = r.nextInt(10); // [0 - 9]
System.out.println(data);
}
}
}
```

猜数字小游戏

```java
需求：
随机生成一个1-100之间的数据，提示用户猜测，猜大提示过大，猜小提示过小，直
到猜中 结束游戏
分析：
1.先随机生成一个1-100之间的数据。
谁可以帮你生成随机数啊？ 是不是要用到Random？
2.定义一个死循环让用户可以一直猜测。
用户猜的数据从哪里来啊？ 是不是要用到Scanner?
3.在死循环里，每次让用户录入的数据和随机数进行比较
如果比随机数大：提示猜大了
如果比随机数小：提示猜小了
如果和随机数相同：提示恭喜你猜中了
```

代码如下：

```java
import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        //随机生成一个1-100之间的数据，提示用户猜测，猜大提示过大，猜小提示过小，直到猜中，结束游戏
        Random r=new Random();
        //[0,99]+1 -> [1,100]
        int ran=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<101;i++){
            System.out.println("请输入你猜测的数字：");
            int a=sc.nextInt();
            if(a>=1&&a<=100){
                if(a==ran){
                    System.out.println("恭喜你，猜对了^n^");
                    break;
                } else if (a<ran) {
                    System.out.println("┗|｀O′|┛ 嗷~~过小了");
                }else{
                    System.out.println("(⊙o⊙)？过大了");
                }
            }else{
                System.out.println("你输入的数字不符合要求!-!");
            }
        }
        sc.close();
    }
}
```





总结：基本数据类型、switch支持的数据类型、自动类型转换、命名规则等小细节得多注意。。