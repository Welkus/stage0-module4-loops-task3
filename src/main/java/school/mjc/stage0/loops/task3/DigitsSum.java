package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String length = t+"";
        int sum =0;

        if(t<0) t*=-1;
        for(int i = 0; i < length.length();i++ ){
            int x = t%10;
            t /= 10;
            sum += x;
        }

        System.out.println(sum);
    }
}
