import java.util.Stack;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++){
            Stack<Integer> stack=new Stack<>();
            for(int j=0;j<A[i].length;j++){
                if(A[i][j]==0)
                    A[i][j]=1;
                else
                    A[i][j]=0;
                stack.push(A[i][j]);
            }
            for(int j=0;j<A[i].length;j++)
                    A[i][j]=stack.pop();

        }
        return A;

    }
}
