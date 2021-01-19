public class IncreasingDecreasingString {
    public String sortString(String s) {
        String str=new String();
        int[]arr=new int[26];
        for(int i=0;i<s.length();i++)
            arr[s.charAt(i)-'a']++;
        while (str.length()!=s.length()){
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    str+=Character.toString((char) (i+'a'));
                    arr[i]--;
                }
            }
            for(int i=arr.length-1;i>=0;i--){
                if(arr[i]!=0){
                    str+=Character.toString((char) (i+'a'));
                    arr[i]--;
                }
            }
        }
        return str;
    }
}
