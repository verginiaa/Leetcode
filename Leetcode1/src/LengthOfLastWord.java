public class LengthOfLastWord {
    public static void main(String[]args){
        LengthOfLastWord o =new LengthOfLastWord();
        System.out.println(o.lengthOfLastWord(" "));
    }
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        while (i>=0&&s.charAt(i)==' ')
            i--;
        int x=0;
        while (i>=0&&s.charAt(i)!=' '){
            x++;
            i--;
        }
        return x;
    }
}
