import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOFCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>res=new ArrayList<>();
        int maximum=candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>maximum)
                maximum=candies[i];
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies<maximum)
                res.add(false);
            else
                res.add(true);
        }

        return res;
    }
}
