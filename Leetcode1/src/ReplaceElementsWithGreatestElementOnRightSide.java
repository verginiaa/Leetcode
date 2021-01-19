public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        int max=arr[0];
        int index=0;
        for(int i=0;i<arr.length-1;i++){
            int currI=i;
            if(currI<index)
                arr[i]=max;
            else{
                max=arr[i+1];
                for(int j=i+2;j<arr.length;j++){
                    if(arr[j]>max) {
                        max = arr[j];
                        index = j;
                    }
                }
                arr[i]=max;
            }
        }
        return arr;
    }
}
