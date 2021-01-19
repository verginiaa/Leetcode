import java.util.ArrayList;

public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        ArrayList<Integer>empty=new ArrayList<>();
        int tot=numBottles;
        empty.add(numBottles);
        while (true){
            int mod=empty.get(0)%numExchange;
            tot+=(empty.get(0)/numExchange);
            empty.add(mod+(empty.get(0)/numExchange));
            empty.remove(0);
            if(empty.get(0)<numExchange)
                break;
        }
        return tot;

    }
}
