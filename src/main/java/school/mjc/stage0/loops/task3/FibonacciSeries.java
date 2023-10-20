package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {

        int low = 0;
        int high = 1;
        System.out.println(low);

        for (int i = 0; i < lastFibonacci-1; i++){
            int t = high;
           high = high+low;
           low = t;
            System.out.println(low);
        }
    }
}
