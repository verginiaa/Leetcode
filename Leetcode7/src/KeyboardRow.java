import java.util.ArrayList;
import java.util.HashSet;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        ArrayList<String>arrayList=new ArrayList<>();
        HashSet<Character>row1=new HashSet<>();
        HashSet<Character>row2=new HashSet<>();
        HashSet<Character>row3=new HashSet<>();
        row1.add('Q');
        row1.add('W');
        row1.add('E');
        row1.add('R');
        row1.add('T');
        row1.add('Y');
        row1.add('U');
        row1.add('I');
        row1.add('O');
        row1.add('P');

        row2.add('A');
        row2.add('S');
        row2.add('D');
        row2.add('F');
        row2.add('G');
        row2.add('H');
        row2.add('J');
        row2.add('K');
        row2.add('L');

        row3.add('Z');
        row3.add('X');
        row3.add('C');
        row3.add('V');
        row3.add('B');
        row3.add('N');
        row3.add('M');
        int flag=-1;
        boolean flagg=true;
        for(int i=0;i<words.length;i++){
            flag=-1;
            for(int j=0;j<words[i].length();j++){
                char c=Character.toUpperCase(words[i].charAt(j));

                if((flag==1||flag==-1)&&row1.contains(c)){
                    flag=1;
                }else if((flag==2||flag==-1)&&row2.contains(c)){
                    flag=2;
                }else if((flag==3||flag==-1)&&row3.contains(c)){

                    flag=3;
                }else {
                    flagg = false;
                    break;
                }
            }
            if(flagg)
                arrayList.add(words[i]);
        }
        String[]ans=new String[arrayList.size()];
        for(int i=0;i<arrayList.size();i++)
            ans[i]=arrayList.get(i);

    return ans;
    }
}
