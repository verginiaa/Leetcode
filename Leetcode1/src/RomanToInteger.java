import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[]args){
        RomanToInteger o=new RomanToInteger();
        System.out.println(o.romanToInt("IV"));
    }
    public int romanToInt(String s) {
        HashMap<Character,Integer>hashMap=new HashMap<>();
        hashMap.put('I',1);
        hashMap.put('V',5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);
        int outp=0;
        for(int i=0;i<s.length();i++){
            if(i+1<s.length()&&hashMap.get(s.charAt(i+1))>hashMap.get(s.charAt(i))){
                outp+=Math.abs(hashMap.get(s.charAt(i+1))-hashMap.get(s.charAt(i)));
                i++;
            }
            else
                outp+=hashMap.get(s.charAt(i));
        }
        return outp;
    }
}
