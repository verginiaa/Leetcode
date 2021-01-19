public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        boolean flag=true;
        while (i<s.length()&&j>0&&i<j){
            char c=s.charAt(i);
            char y=s.charAt(j);
            if(charac(c)&&charac(y)&&c!=' '&&y!=' '){
                if(Character.toLowerCase(c)!=Character.toLowerCase(y))
                    return false;
                else {
                    i++;
                    j--;
                }
            }
            else if(num(c)&&num(y)&&c==y){

            }
            else if(!charac(c))
                i++;
            else if(!charac(y))
                j--;

        }
        return true;

    }
    static boolean charac(char c){
        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            return true;
        return false;
    }
    static boolean num(char c){
        if(c>=48&&c<=57)
            return true;
        return false;
    }

}
