class Solution {
    public static void main(String[]args){
        Solution o =new Solution();
        System.out.println(o.sortArrayByParity(new int[]{0,2,4,1}));

    }
    public int[] sortArrayByParity(int[] A) {
        int i=0;
        int j=A.length-1;
        while (i<A.length&&j>0&&i<j){
            System.out.println(A[i]);
            System.out.println(A[j]);
            if(A[i]%2==1&&A[j]%2==0){
                A=swap(A,i,j);
            }else if(A[i]%2==0&&A[j]%2==0){
                while (i<A.length&&A[i]%2==0)
                    i++;
                if(i>=A.length||i>=j)
                    break;
                A=swap(A,i,j);
            }else if(A[i]%2==1&&A[j]%2==1){
                while (j>0&&A[j]%2==1)
                    j--;
                if(j<0||j<=i)
                    break;
                A=swap(A,i,j);
            }
            i++;
            j--;

        }
        return A;
    }
    static int[]swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
}
