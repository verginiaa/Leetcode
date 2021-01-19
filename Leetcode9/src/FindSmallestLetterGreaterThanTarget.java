import java.util.Arrays;

public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        int index=binarySearch(letters,target);
        return letters[index];

    }
    static int binarySearch(char[]letters,char target){
        int low=0,high=letters.length-1;
        int o=0;
        while (low<=high){
            int mid=(low+high)/2;
            if(letters[mid]<target||letters[mid]==target)
                low=mid+1;
            else {
                high=mid-1;
                o=mid;
            }
        }
        return o;
    }
}
