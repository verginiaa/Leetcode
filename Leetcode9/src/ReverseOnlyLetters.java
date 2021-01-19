public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        if(S.length()==0)
            return S;
        else {
            int i=0,j=S.length()-1;
            while (i<S.length()&&j>=0&&i<j){
                while (i<S.length()&&!isLetter(S.charAt(i)))
                    i++;
                while (j>0&&!isLetter(S.charAt(j)))
                    j--;
                if(i<S.length()&&j>=0&&i<j)
                    S=swap(S,i,j);
                System.out.println(i);
                System.out.println(j);
                i++;
                j--;
            }

        }
        return S;

    }
    static String swap(String str, int i, int j)
    {
        if (j == str.length() - 1)
            return str.substring(0, i) + str.charAt(j)
                    + str.substring(i + 1, j) + str.charAt(i);

        return str.substring(0, i) + str.charAt(j)
                + str.substring(i + 1, j) + str.charAt(i)
                + str.substring(j + 1, str.length());
    }
    static boolean isLetter(char c){
        if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
            return true;
        return false;
    }
}
