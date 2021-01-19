import java.util.HashMap;

public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int min=Integer.MAX_VALUE;
        String out=new String();
        for(int i=0;i<words.length;i++){
            HashMap<Character,Integer>hashMap=new HashMap<>();
            for(int j=0;j<words[i].length();j++){
                if(hashMap.containsKey(words[i].charAt(j)))
                    hashMap.put(words[i].charAt(j),hashMap.get(words[i].charAt(j))+1);
                else hashMap.put(words[i].charAt(j),1);
            }
            int k=0;
            System.out.println(hashMap);
            for( k=0;k<licensePlate.length();k++){
                char c=Character.toLowerCase(licensePlate.charAt(k));
                if(Character.isLetter(c)) {
                    if (!hashMap.containsKey(c) || hashMap.get(c) == 0)
                        break;
                    else hashMap.put(c, hashMap.get(c) - 1);
                }
            }
            if(k==licensePlate.length()){
                if(words[i].length()<min) {
                    out = words[i];
                    min = words[i].length();
                }
            }

        }
        return out;

    }
}
