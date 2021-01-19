public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                if(i+1<arr.length){
                    arr=shift(arr,i+1);
                    arr[i+1]=0;
                    i++;
                }else
                    break;
            }
        }
    }
    static int[]shift(int []array,int i){
        for(int j=array.length-1;j>i;j--)
            array[j]=array[j-1];
        return array;
    }
}
