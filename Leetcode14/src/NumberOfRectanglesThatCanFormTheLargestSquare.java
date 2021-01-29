import java.util.HashMap;
import java.util.Map;

public class NumberOfRectanglesThatCanFormTheLargestSquare {
    public int countGoodRectangles(int[][] rectangles) {
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int output=0;

        for(int i=0;i<rectangles.length;i++){
            int min=Math.min(rectangles[i][0],rectangles[i][1]);
            if(hashMap.containsKey(min))
                hashMap.put(min,hashMap.get(min)+1);
            else
                hashMap.put(min,1);
        }

        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            if(entry.getKey()>max){
                max=entry.getKey();
                output=entry.getValue();
            }
        }
        return output;
    }
}
