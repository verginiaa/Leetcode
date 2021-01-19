import java.util.ArrayList;
import java.util.List;

public class MinimumNumberOfVerticesToReachAllNodes {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer>result=new ArrayList<>();
        int[]arr=new int[n];
        for(int i=0;i<edges.size();i++)
            arr[edges.get(i).get(1)]++;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) result.add(i);
        }
        return result;


    }
}
