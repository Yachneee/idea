```java
import java.util.Random;

// 1 --> 浇水 2 --> 修剪 3 --> 打药  4 --> 生虫
public class Tree{
	
	int grow = 11; // 树初始成长值，当成长值 归零或小于0时，树死亡
	
	public static void main(String[] args){
        // 获取操作次数
		// 生成随机数
		Random rand = new Random();
        int type = rand.nextInt(4) + 1; 【1， 4】
		// 分支 按照type执行不同的方法
        
	}
	
	/**
		浇水，每浇一次水成长值 +10
	*/
	public static void water(){
		
	}
	
	/**
		修剪树，每修剪一次成长值 +5
	*/
	public static void cut(){
		
	}
	
	/**
		打药，每打药一次成长值 +20
	*/
	public static void fertilize(){
		
	}
	
	/**
		生虫，每生虫一次成长值 -10
		连续生虫三次，生长值额外 - 20
	*/
	public static void worms(){
		
	}
}
```

