import java.util.Arrays;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0,j=people.length-1;
        int totalBoats=0;
        while (i<j){
            totalBoats++;
            if(people[i]+people[j]<=limit)
                i++;
            j--;
        }
return totalBoats;
    }
}
