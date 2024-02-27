package trading;

import java.util.Objects;

public class Trade {

    private int gems;   //the number of gems involved in the trade
    private int amount; //the amount of goods involved in the trade
    private Goods good; //the type of goods involved in the trade

    public Trade(int gems,int amount, Goods good){
        this.gems=gems;
        this.amount=amount;
        this.good=good;
    }

    public int getGems() {
        return gems;
    }

    public int getAmount() {
        return amount;
    }

    public Goods getGood() {
        return good;
    }

    @Override
    public boolean equals(Object o) {
        //override equals so that equality should be based on the values of all three fields.
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trade trade = (Trade) o;
        return gems == trade.gems &&
                amount == trade.amount &&
                good == trade.good;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gems, amount, good);
    }

    @Override
    public String toString() {
        return gems+" gem for "+amount+" "+good;
    }

    public void execute(Trader trader, Citizen citizen){
        //contains calls indexOf method which calls equals method, and the above equals function makes this reasonable judging
        if (!trader.getTrades().contains(this)){
            throw new IllegalArgumentException();
        }else{
            if (citizen.executeTrade(this)){
                trader.addRandomTrade();
            }
        }
    }
}
