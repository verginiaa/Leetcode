import java.util.HashSet;

public class PairsOfSongsWithTotalDurationsDivisibleBy60 {
    public int numPairsDivisibleBy60(int[] time) {
        HashSet<Integer>hashSet=new HashSet<>();
        int cnt=0,target=60;
        for(int i=0;i<time.length;i++){
            if(hashSet.contains(target-time[i]))
                cnt++;
            else hashSet.add(time[i]);
        }
        return cnt;

    }
}
