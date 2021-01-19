public class NumberOfStudentsDoingHomeworkAtAGivenTime {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int tot=0;
        for(int i=0;i<startTime.length;i++){
            if(queryTime>=startTime[i]&&queryTime<=endTime[i])
                tot++;
        }
        return tot;
    }
}
