package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        int allNines = 0;
        int sumOfNines = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            allNines = allNines * 10 + 9;
            sumOfNines += allNines;
        }

        System.out.println(sumOfNines);
    }
}
