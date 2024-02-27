package trading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Trader {
    private List<Trade> trades=new ArrayList<>();

    public Trader(){
        //create a Trader with a single, randomly-chosen Trade by calling the addRandomTrade function
        addRandomTrade();
    }

    public List<Trade> getTrades(){
        return trades;
    }

    public void addRandomTrade(){
        //gems and amount have the same boundary [1,5]
        int min=1;
        int max=5;
        //random.nextInt generates a random int in [0,x)
        Random random = new Random();
        int x = random.nextInt(max)%(max-min+1) + min;
        int y = random.nextInt(max)%(max-min+1) + min;
        //Goods.values() return a array of the Goods
        Goods[] goods=Goods.values();
        trades.add(new Trade(x,y,goods[random.nextInt(goods.length)] ));
    }
}
