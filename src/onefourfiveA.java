import java.util.Scanner;

/**
 * Created by alex on 2015-10-31.
 */
public class onefourfiveA {
    public static void main(String[] args) {
        /**
         * If we have a 7, need a 4, we add 1 to the counter for 7
         * If we have a 4, need a 7, we add 1 to the counter for 4
         * Whichever is the max is our answer
         * Example: 3 4's and 4 7's need to be moved
         * Switch 3, change 1 = 4
         */

        //Input
        Scanner input = new Scanner(System.in);

        //Get input
        String a = input.next();
        String b = input.next();

        //Counters
        int fours = 0;
        int sevens = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                switch (a.charAt(i)) {
                    case '4':
                        fours++;
                        break;
                    case '7':
                        sevens++;
                        break;
                }
            }
        }

        System.out.println(Math.max(fours, sevens));
    }
}
