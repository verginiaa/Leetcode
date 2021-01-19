public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average(int[] salary) {
        double max=0,min=10000000;
        double sum=0;
        for(int i=0;i<salary.length;i++){
            sum+=salary[i];
            if(salary[i]>max)
                max=salary[i];
             if(salary[i]<min)
                min=salary[i];
        }
        sum-=max-min;
        return sum/(salary.length-2);

    }
}
