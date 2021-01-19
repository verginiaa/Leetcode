public class BullsAndCows {
    public String getHint(String secret, String guess) {
        int bulls=0,cows=0;
        int[]s=new int[10],g=new int[10];
        for (int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i))
                bulls++;
            else{
                s[Integer.parseInt(String.valueOf(secret.charAt(i)))]++;
                g[Integer.parseInt(String.valueOf(guess.charAt(i)))]++;
            }
        }
        System.out.println(bulls);
        for(int j=0;j<g.length;j++){
            if(g[j]!=0){
                if(g[j]!=s[j]){
                    cows+=Math.min(g[j],s[j]);
                }else cows+=g[j];
            }
        }
        System.out.println(cows);
        String outp=String.valueOf(bulls)+"A"+String.valueOf(cows)+"B";
        return outp;

    }
}
