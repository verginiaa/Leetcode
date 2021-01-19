import java.util.Arrays;

public class CheckIfAStringCanBreakAnotherString {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean res1 = allBigger(arr1, arr2);
        boolean res2 = allBigger(arr2, arr1);
        return res1 || res2;
    }

    private boolean allBigger(char[] arr1, char[] arr2) {
        for (int i =0;i<arr1.length;i++) {
            if (arr1[i] < arr2[i]) return false;
        }
        return true;
    }
}
