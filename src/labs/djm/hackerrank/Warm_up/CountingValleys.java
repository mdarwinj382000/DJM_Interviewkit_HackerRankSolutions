package labs.djm.hackerrank.Warm_up;

import java.util.Scanner;

public class CountingValleys {
    //repeat => U-up , D-down
    //from sea level
    // mountain=> up down (maybe(small mountain(not touch)))
    // or
    // valley=> down up  (maybe(small valleys(not touch)))
    // till sea level
    public static void main(String[] args) {
        int count=0;
        int steps = new Scanner(System.in).nextInt();;
        int up=0,down=0;
        String path = new Scanner(System.in).next();
        boolean mount = false, valley = false;
        for (int i = 0; i < steps; i++) {
            char step = path.charAt(i);
            if (step == 'U') {
                up++;
            } else {
                down++;
            }
            if (!(mount || valley)) {
                //from sea level
                if (step == 'D') {
                    valley = true;
                } else {
                    mount = true;
                }
            }
            if (down != 0 && (up == down)) {
                //reaching sea level
                if (valley) count++;
                valley = mount = false;
                up = down = 0;
            }
        }
        System.out.println(count);
    }
}
