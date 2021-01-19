import java.util.HashSet;

public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hashSet.contains(arr[i]*2)||(arr[i]%2==0&&hashSet.contains(arr[i]/2)))
                return true;
            else {
                hashSet.add(arr[i]);
            }
        }
        return false;
    }
}
