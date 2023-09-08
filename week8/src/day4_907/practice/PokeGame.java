package day4_907.practice;

/**
 * @author Administrator
 */
public class PokeGame {
    public static void main(String[] args) {
        while (true){
            PokeRoom poke=new PokeRoom();
            poke.washCard();
            System.out.println("洗牌完成！");
            poke.distributeCard();
            System.out.println("发牌完成！");
            poke.sortCard();
            System.out.println("捋牌完成！");
            poke.showCard(0);
            poke.showCard(1);
            poke.showCard(2);
            System.out.println("开始抢地主");
            if(poke.getDiZhu()){
                System.out.println("抢地主结束，游戏正式开始！");
                return;
            }
        }
    }
}
