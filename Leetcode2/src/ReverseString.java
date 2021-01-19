public class ReverseString {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while (i<j){
            swap(s,i,j);
            i++;
            j--;
        }
    }
    static char[]swap(char[]array,int i,int j){
        char temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        return array;
    }
}
