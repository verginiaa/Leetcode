public class GenerateAStringWithCharactersThatHaveOddCounts {
    public String generateTheString(int n) {
        String res="";
        for(int i=0;i<n-1;i++)
            res+="p";
        if(n%2==1)
            res+="p";
        else
            res+="u";
        return res;

    }
}
