package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {

        int gcd = 1;
        int high;
        int low;


        if (first >= second) {
            high = first;
            low = second;
        } else {
            high = second;
            low = first;
        }

            for (int i = high; i > 0; i--) {
                if (low % i == 0 && high % i == 0) {
                    gcd = i;
                    break;
                }
            }
            System.out.println(gcd);
        }
    }

