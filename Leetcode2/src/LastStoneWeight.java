import java.util.*;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
       int n=stones.length;
       Arrays.sort(stones);
       while (stones[n-2]>0){
           int last=stones[n-1];
           int pre=stones[n-2];
           if(last==pre){
               last=0;
               pre=0;
           }else{
               last=Math.abs(last-pre);
               pre=0;
           }
           stones[n-1]=last;
           stones[n-2]=pre;
           Arrays.sort(stones);
       }
       return stones[n-2];
    }
}
