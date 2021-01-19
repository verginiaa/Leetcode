public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int upper=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i)))
                upper++;
        }
        if(upper==word.length()||upper==0)
            return true;
        else if(upper==1&&Character.isUpperCase(word.charAt(0))==true)
            return true;
        else return false;
    }
}
