package trading;

import java.util.HashMap;

public class Citizen {
    private int gem;
    /**
     * using hashmap k-v for the inventory , it is easy to understand
     * can also just use a array[10] where each store the number of Goods, in the same order with enum Goods
     * array saves time and space comparing to hashmap
     */
    private HashMap<Goods,Integer> inventory=new HashMap<>();

    public Citizen(int gem){
        this.gem=gem;
    }

    public int getGems() {
        return gem;
    }

    public int getAmount(Goods goods){
        if(!inventory.containsKey(goods)) return 0;
        return inventory.get(goods);
    }

    public boolean executeTrade (Trade trade){
        Goods tr_good=trade.getGood();
        if (gem<trade.getGems()){
            return false;
        }else{
            gem-=trade.getGems();
            if(inventory.containsKey(tr_good)){
                inventory.put(tr_good,trade.getAmount()+inventory.get(tr_good));
            }else{
                inventory.put(tr_good, trade.getAmount());
            }

        }
        return true;
    }

}
