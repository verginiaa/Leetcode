public class ToLowerCase {
    public String toLowerCase(String str) {
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i)))
                str=lower(str,i);
        }
        return str;
    }
    static String lower(String s,int i){
        return s.substring(0,i)+Character.toLowerCase(s.charAt(i))+s.substring(i+1);
    }
}
