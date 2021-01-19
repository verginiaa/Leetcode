import java.util.HashSet;

public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        HashSet<Integer>hashSet=new HashSet<>();
        for(int i=0;i<candies.length;i++)
            hashSet.add(candies[i]);
        if(hashSet.size()>(candies.length/2))
            return candies.length/2;
        else
            return hashSet.size();
    }
}
