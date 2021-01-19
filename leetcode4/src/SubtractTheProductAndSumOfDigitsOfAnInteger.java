import java.util.ArrayList;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public int subtractProductAndSum(int n) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        if(n==1||n==0)
            return 0;
        while (n>0){
            int digit=n%10;
            n/=10;
            arrayList.add(digit);
        }
        int product=0;
        int add=0;
        for(int i=0;i<arrayList.size()-1;i++){
            product+=(arrayList.get(i)*arrayList.get(i+1));
            add+=(arrayList.get(i)+arrayList.get(i+1));
        }
        return product-add;

    }
}
