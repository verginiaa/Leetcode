import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LuckyNumbersInAMatrix {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int min=0;
        Set<Integer> set=new HashSet<>();
        List<Integer>list=new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            min=matrix[i][0];
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i][j]<min) {
                    min = matrix[i][j];
                }
            }
            set.add(min);
        }
        int max=0;
        for(int i=0;i<matrix[0].length;i++){
            max=matrix[i][0];
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]>max) {
                    max = matrix[j][i];
                }
            }
            if(set.contains(max))
                list.add(max);
        }
        return list;


    }
}
