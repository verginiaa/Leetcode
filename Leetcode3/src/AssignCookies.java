import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,sum=0,j=0;
        while (i<g.length&&j<s.length){
            while (j<s.length&&s[j]<g[i])
                j++;
            if(j>=s.length)
                break;
            sum++;
            i++;
            j++;
        }
        return sum;
    }
}
