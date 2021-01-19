import jdk.internal.dynalink.ChainedCallSite;

import java.util.ArrayList;
import java.util.List;

public class ReformatTheString {
    public String reformat(String s) {
        List<Character>characters=new ArrayList<>();
        List<Character>integer=new ArrayList<>();
        String out=new String();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i)))
                characters.add(s.charAt(i));
            else integer.add(s.charAt(i));
        }
        if(Math.abs(characters.size()-integer.size())>1)
            return " ";
        else if(characters.size()==integer.size()){
            for(int i=0;i<characters.size();i++){
                out+=characters.get(i);
                out+=integer.get(i);
            }
        }else{
            if(characters.size()>integer.size()) {
                for (int i = 0; i < integer.size(); i++) {
                    out += characters.get(i);
                    out += integer.get(i);
                }
                out += characters.get(characters.size() - 1);
            }
            else {
                for (int i = 0; i < characters.size(); i++) {
                    out += integer.get(i);
                    out += characters.get(i);
                }
                out += characters.get(integer.size() - 1);
            }
        }
        return out;
    }
}
